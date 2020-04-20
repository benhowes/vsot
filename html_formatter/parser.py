""" This is mostly just a wrapper around the antlr parser/runtime """
import sys

import click
from antlr4 import InputStream, FileStream, CommonTokenStream

from .antlr.HTMLLexer import HTMLLexer
from .antlr.HTMLParser import HTMLParser


def parse_string(src: str):
    return parse_stream(InputStream(src))


def parse_stream(src: InputStream):
    lexer = HTMLLexer(src)
    stream = CommonTokenStream(lexer)
    parser = HTMLParser(stream)
    tree = parser.htmlDocument()

    return tree
