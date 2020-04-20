import io
import tempfile
import tokenize
from typing import Callable, Tuple, List, Pattern, Iterator
from dataclasses import dataclass
from pathlib import Path
from functools import lru_cache

import click
from pathspec import PathSpec

from .settings import Changed

FileContent = str
Encoding = str
NewLine = str


def decode_bytes(src: bytes) -> Tuple[FileContent, Encoding, NewLine]:
    """Return a tuple of (decoded_contents, encoding, newline).
    `newline` is either CRLF or LF but `decoded_contents` is decoded with
    universal newlines (i.e. only contains LF).
    """
    srcbuf = io.BytesIO(src)
    encoding, lines = tokenize.detect_encoding(srcbuf.readline)
    if not lines:
        return "", encoding, "\n"

    newline = "\r\n" if b"\r\n" == lines[0][-2:] else "\n"
    srcbuf.seek(0)
    with io.TextIOWrapper(srcbuf, encoding) as tiow:
        return tiow.read(), encoding, newline


def diff(a: str, b: str, a_name: str, b_name: str) -> str:
    """
    Return a unified diff string between strings `a` and `b`.

    Borrowed from black
    """
    import difflib

    a_lines = [line + "\n" for line in a.splitlines()]
    b_lines = [line + "\n" for line in b.splitlines()]
    return "".join(
        difflib.unified_diff(a_lines, b_lines, fromfile=a_name, tofile=b_name, n=5)
    )


def dump_to_file(*output: str) -> str:
    """
    Dump `output` to a temporary file. Return path to the file.

    borrowed from black
    """
    with tempfile.NamedTemporaryFile(
        mode="w", prefix="blk_", suffix=".log", delete=False, encoding="utf8"
    ) as f:
        for lines in output:
            f.write(lines)
            if lines and lines[-1] != "\n":
                f.write("\n")
    return f.name


@dataclass
class Report:
    """Provides a reformatting counter. Can be rendered with `str(report)`."""

    check: bool = False
    diff: bool = False
    quiet: bool = False
    verbose: bool = False
    change_count: int = 0
    same_count: int = 0
    failure_count: int = 0

    out: Callable[[str], None] = print
    err: Callable[[str], None] = print

    def done(self, src: Path, changed: Changed) -> None:
        """Increment the counter for successful reformatting. Write out a message."""
        if changed is Changed.YES:
            reformatted = "would reformat" if self.check or self.diff else "reformatted"
            if self.verbose or not self.quiet:
                self.out(f"{reformatted} {src}")
            self.change_count += 1
        else:
            if self.verbose:
                if changed is Changed.NO:
                    msg = f"{src} already well formatted, good job."
                else:
                    msg = f"{src} wasn't modified on disk since last run."
                self.out(msg, bold=False)
            self.same_count += 1

    def failed(self, src: Path, message: str) -> None:
        """Increment the counter for failed reformatting. Write out a message."""
        self.err(f"error: cannot format {src}: {message}")
        self.failure_count += 1

    def path_ignored(self, path: Path, message: str) -> None:
        if self.verbose:
            self.out(f"{path} ignored: {message}", bold=False)

    @property
    def return_code(self) -> int:
        """Return the exit code that the app should use.
        This considers the current state of changed files and failures:
        - if there were any failures, return 123;
        - if any files were changed and --check is being used, return 1;
        - otherwise return 0.
        """
        # According to http://tldp.org/LDP/abs/html/exitcodes.html starting with
        # 126 we have special return codes reserved by the shell.
        if self.failure_count:
            return 123

        elif self.change_count and self.check:
            return 1

        return 0

    def __str__(self) -> str:
        """Render a color report of the current state.
        Use `click.unstyle` to remove colors.
        """
        if self.check or self.diff:
            reformatted = "would be reformatted"
            unchanged = "would be left unchanged"
            failed = "would fail to reformat"
        else:
            reformatted = "reformatted"
            unchanged = "left unchanged"
            failed = "failed to reformat"
        report = []
        if self.change_count:
            s = "s" if self.change_count > 1 else ""
            report.append(
                click.style(f"{self.change_count} file{s} {reformatted}", bold=True)
            )
        if self.same_count:
            s = "s" if self.same_count > 1 else ""
            report.append(f"{self.same_count} file{s} {unchanged}")
        if self.failure_count:
            s = "s" if self.failure_count > 1 else ""
            report.append(
                click.style(f"{self.failure_count} file{s} {failed}", fg="red")
            )
        return ", ".join(report) + "."


@lru_cache()
def get_gitignore(root: Path) -> PathSpec:
    """ Return a PathSpec matching gitignore content if present."""
    gitignore = root / ".gitignore"
    lines: List[str] = []
    if gitignore.is_file():
        with gitignore.open() as gf:
            lines = gf.readlines()
    return PathSpec.from_lines("gitwildmatch", lines)


def gen_html_files_in_dir(
    path: Path,
    root: Path,
    include: Pattern[str],
    exclude: Pattern[str],
    report: "Report",
    gitignore: PathSpec,
) -> Iterator[Path]:
    """Generate all files under `path` whose paths are not excluded by the
    `exclude` regex, but are included by the `include` regex.
    Symbolic links pointing outside of the `root` directory are ignored.
    `report` is where output about exclusions goes.
    """
    assert root.is_absolute(), f"INTERNAL ERROR: `root` must be absolute but is {root}"
    for child in path.iterdir():
        # First ignore files matching .gitignore
        if gitignore.match_file(child.as_posix()):
            report.path_ignored(child, "matches the .gitignore file content")
            continue

        # Then ignore with `exclude` option.
        try:
            normalized_path = "/" + child.resolve().relative_to(root).as_posix()
        except OSError as e:
            report.path_ignored(child, f"cannot be read because {e}")
            continue

        except ValueError:
            if child.is_symlink():
                report.path_ignored(
                    child, f"is a symbolic link that points outside {root}"
                )
                continue

            raise

        if child.is_dir():
            normalized_path += "/"

        exclude_match = exclude.search(normalized_path)
        if exclude_match and exclude_match.group(0):
            report.path_ignored(child, "matches the --exclude regular expression")
            continue

        if child.is_dir():
            yield from gen_html_files_in_dir(
                child, root, include, exclude, report, gitignore
            )

        elif child.is_file():
            include_match = include.search(normalized_path)
            if include_match:
                yield child
