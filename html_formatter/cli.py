"""Console script for html_formatter."""
from functools import partial
from pathlib import Path
import sys
from typing import Pattern, Optional, Tuple, Callable, Set
import re

import click
from antlr4 import FileStream, CommonTokenStream

from . import __version__
from .antlr.HTMLLexer import HTMLLexer
from .antlr.HTMLParser import HTMLParser
from .settings import (
    Settings,
    WriteBack,
    read_pyproject_toml,
    Changed,
    find_project_root,
)
from .vsot import format_file_in_place, format_string
from .utils import Report, gen_html_files_in_dir, get_gitignore

DEFAULT_LINE_LENGTH = 88
DEFAULT_INDENT_SIZE = 2
DEFAULT_EXCLUDES = r"/(\.eggs|\.git|\.hg|\.mypy_cache|\.nox|\.tox|\.venv|\.svn|_build|buck-out|build|dist)/"  # noqa: B950
DEFAULT_INCLUDES = r"/templates/.*?\.html$"

out = partial(click.secho, bold=True, err=True)
err = partial(click.secho, fg="red", err=True)


def re_compile_maybe_verbose(regex: str) -> Pattern[str]:
    """Compile a regular expression string in `regex`.
    If it contains newlines, use verbose mode.
    """
    if "\n" in regex:
        regex = "(?x)" + regex
    compiled: Pattern[str] = re.compile(regex)
    return compiled


@click.command(context_settings=dict(help_option_names=["-h", "--help"]))
@click.option("-c", "--code", type=str, help="Format the code passed in as a string.")
@click.option(
    "-l",
    "--line-length",
    type=int,
    default=DEFAULT_LINE_LENGTH,
    help="How many characters per line to allow.",
    show_default=True,
)
@click.option(
    "-s",
    "--indent-size",
    type=int,
    default=DEFAULT_INDENT_SIZE,
    help="How many spaces to use for each level of indentation.",
    show_default=True,
)
@click.option(
    "--check",
    is_flag=True,
    help=(
        "Don't write the files back, just return the status.  Return code 0 "
        "means nothing would change.  Return code 1 means some files would be "
        "reformatted.  Return code 123 means there was an internal error."
    ),
)
@click.option(
    "--diff",
    is_flag=True,
    help="Don't write the files back, just output a diff for each file on stdout.",
)
@click.option(
    "--include",
    type=str,
    default=DEFAULT_INCLUDES,
    help=(
        "A regular expression that matches files and directories that should be "
        "included on recursive searches.  An empty value means all files are "
        "included regardless of the name.  Use forward slashes for directories on "
        "all platforms (Windows, too).  Exclusions are calculated first, inclusions "
        "later."
    ),
    show_default=True,
)
@click.option(
    "--exclude",
    type=str,
    default=DEFAULT_EXCLUDES,
    help=(
        "A regular expression that matches files and directories that should be "
        "excluded on recursive searches.  An empty value means no paths are excluded. "
        "Use forward slashes for directories on all platforms (Windows, too).  "
        "Exclusions are calculated first, inclusions later."
    ),
    show_default=True,
)
@click.version_option(version=__version__)
@click.argument(
    "src",
    nargs=-1,
    type=click.Path(
        exists=True, file_okay=True, dir_okay=True, readable=True, allow_dash=True
    ),
    is_eager=True,
)
@click.option(
    "--config",
    type=click.Path(
        exists=False, file_okay=True, dir_okay=False, readable=True, allow_dash=False
    ),
    is_eager=True,
    callback=read_pyproject_toml,
    help="Read configuration from PATH.",
)
@click.pass_context
def main(
    ctx: click.Context,
    code: Optional[str],
    line_length: int,
    indent_size: int,
    check: bool,
    diff: bool,
    # quiet: bool,
    # verbose: bool,
    include: str,
    exclude: str,
    src: Tuple[str, ...],
    config: Optional[str],
) -> None:
    quiet = False
    verbose = False

    write_back = WriteBack.from_configuration(check=check, diff=diff)

    settings = Settings(
        line_length=line_length, indent_size=indent_size, write_back=write_back
    )

    if config and verbose:
        out(f"Using configuration from {config}.", bold=False, fg="blue")
    if code is not None:
        print(format_string(code, settings=settings))
        ctx.exit(0)

    try:
        include_regex = re_compile_maybe_verbose(include)
    except re.error:
        err(f"Invalid regular expression for include given: {include!r}")
        ctx.exit(2)
    try:
        exclude_regex = re_compile_maybe_verbose(exclude)
    except re.error:
        err(f"Invalid regular expression for exclude given: {exclude!r}")
        ctx.exit(2)

    report = Report(
        check=check, diff=diff, quiet=quiet, verbose=verbose, out=out, err=err
    )
    root = find_project_root(src)
    sources: Set[Path] = set()

    if not src:
        if verbose or not quiet:
            out("No Path provided. Nothing to do 😴")
        ctx.exit(0)

    for s in src:
        p = Path(s)
        if p.is_dir():
            sources.update(
                gen_html_files_in_dir(
                    p, root, include_regex, exclude_regex, report, get_gitignore(root)
                )
            )
        elif p.is_file() or s == "-":
            # if a file was explicitly given, we don't care about its extension
            sources.add(p)
        else:
            err(f"invalid path: {s}")
    if len(sources) == 0:
        if verbose or not quiet:
            out("No template/html files are present to be formatted. Nothing to do 😴")
        ctx.exit(0)

    for source in sources:
        reformat_one(
            src=source, settings=settings, report=report,
        )

    if verbose or not quiet:
        out("Oh no! 💥 💔 💥" if report.return_code else "All done! ✨ 🍰 ✨")
        click.secho(str(report), err=True)
    ctx.exit(report.return_code)


def reformat_one(src, settings, report):
    try:
        changed = Changed.NO
        if format_file_in_place(src, settings):
            changed = Changed.YES
        report.done(src, changed)
    except Exception as exc:
        report.failed(src, exc)
        raise exc


if __name__ == "__main__":
    sys.exit(main())  # pragma: no cover
