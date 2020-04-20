"""Console script for html_formatter."""
import sys

import click
from antlr4 import FileStream, CommonTokenStream

from .antlr.HTMLLexer import HTMLLexer
from .antlr.HTMLParser import HTMLParser
from .vsot import format_file


@click.command()
def main():
    output = format_file("bbc.html")
    print(output, end="")


if __name__ == "__main__":
    sys.exit(main())  # pragma: no cover
