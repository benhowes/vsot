import tempfile

from antlr4 import ParserRuleContext

from .parser import parse_string
from .printer import print_to_string
from .utils import diff, dump_to_file


def ast_to_str(tree: ParserRuleContext) -> str:
    """ Antlr4 "lisp" style tree print for comparison. """
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
