#!/usr/bin/env python

"""Tests for `html_formatter` package."""

import pytest
from click.testing import CliRunner

from html_formatter import cli


def test_command_line_interface():
    """Test the CLI."""
    runner = CliRunner()
    help_result = runner.invoke(cli.main, ["--help"])
    assert help_result.exit_code == 0
    assert "Show this message and exit." in help_result.output
