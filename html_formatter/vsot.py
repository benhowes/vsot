from .parser import parse_string
from .printer import print_to_string
from .assertions import assert_equivalent, assert_stable
from .utils import decode_bytes


def format_file(src) -> str:
    with open(src, "rb") as buf:
        src_contents, encoding, newline = decode_bytes(buf.read())

    return format_string(src_contents)


def format_string(src: str) -> str:
    ast = parse_string(src)
    dst = format_ast(ast)

    assert_equivalent(src, dst)
    assert_stable(src, dst)

    return dst


def format_ast(ast) -> str:
    output = print_to_string(ast)
    return output
