"""Console script for html_formatter."""
import sys

import click
from antlr4 import FileStream, CommonTokenStream

from .antlr.HTMLLexer import HTMLLexer
from .antlr.HTMLParser import HTMLParser
from .html_formatter import HTMLFormatter


def main():
    input_stream = FileStream("bbc.html")
    lexer = HTMLLexer(input_stream)
    stream = CommonTokenStream(lexer)
    parser = HTMLParser(stream)
    tree = parser.htmlDocument()

    # Visitator
    visitor = HTMLFormatter()
    visitor.visit(tree)


if __name__ == "__main__":
    sys.exit(main())  # pragma: no cover
