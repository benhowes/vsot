"""Top-level package for HTML formatter."""

__author__ = """Ben Howes"""
__email__ = "ben@ben-howes.co.uk"
__version__ = "__version__ = '0.1.3'"


from datetime import datetime
import io
from pathlib import Path
import sys

from .parser import parse_string
from .printer import print_to_string
from .assertions import assert_equivalent, assert_stable
from .settings import Settings, WriteBack
from .utils import decode_bytes, diff
from .exceptions import NothingChanged


def format_string(src: str, settings: Settings) -> str:
    ast = parse_string(src)
    dst = print_to_string(ast, settings)

    if src == dst:
        raise NothingChanged

    assert_equivalent(src, dst)
    assert_stable(src, dst, settings=settings)

    return dst


def format_file_in_place(src: Path, settings: Settings):

    then = datetime.utcfromtimestamp(src.stat().st_mtime)
    with open(src, "rb") as buf:
        src_contents, encoding, newline = decode_bytes(buf.read())

    try:
        dst_contents = format_string(src_contents, settings)
    except NothingChanged:
        return False

    if settings.write_back == WriteBack.YES:
        with open(src, "w", encoding=encoding, newline=newline) as f:
            f.write(dst_contents)
    elif settings.write_back == WriteBack.DIFF:
        now = datetime.utcnow()
        src_name = f"{src}\t{then} +0000"
        dst_name = f"{src}\t{now} +0000"
        diff_contents = diff(src_contents, dst_contents, src_name, dst_name)

        # TODO: if this uses multiprocessing in future, a lock is needed
        # with lock or nullcontext():
        f = io.TextIOWrapper(
            sys.stdout.buffer, encoding=encoding, newline=newline, write_through=True,
        )
        f.write(diff_contents)
        f.detach()

    return True
