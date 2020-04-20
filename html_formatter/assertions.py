import tempfile

from antlr4 import ParserRuleContext

from .parser import parse_string
from .printer import print_to_string


def ast_to_str(tree: ParserRuleContext) -> str:
    tree.toStringTree(None, tree.parser)


def assert_equivalent(src: str, dst: str) -> None:
    """
    The parser should find that the original and the reformatted file
    parse to the same tree.
    """
    input_ast = parse_string(src)
    try:
        output_ast = parse_string(dst)
    except Exception:
        raise AssertionError("VSOT produced invalid markup")

    if ast_to_str(input_ast) != ast_to_str(output_ast):
        raise AssertionError(
            "VSOT produced output which is not syntactically equivalent to the original"
        )


def assert_stable(src: str, dst: str) -> None:
    """
    Reformatting formatted code, should produce identical output

    Largely borrowed from black
    """
    new_ast = parse_string(dst)
    new_dst = print_to_string(new_ast)

    if dst != new_dst:
        log = dump_to_file(
            diff(src, dst, "source", "first pass"),
            diff(dst, new_dst, "first pass", "second pass"),
        )
        raise AssertionError(
            f"INTERNAL ERROR: VSOT produced different markup on the second "
            f"pass of the formatter. See {log} "
        )


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
