from pathlib import Path
from typing import List, Tuple

import pytest

from vsot import format_string
from vsot.assertions import assert_equivalent, assert_stable
from vsot.settings import Settings

THIS_FILE = Path(__file__)
THIS_DIR = THIS_FILE.parent


def read_data(name: str) -> Tuple[str, str]:
    """
    Attempt to load `{name}.input.html` and `{name}.output.html`.

    If output does not exist, that indicates that the formatted output
    should be identical to the input.
    """
    input_name = f"{name}.input.html"
    output_name = f"{name}.output.html"

    _input: List[str] = []
    _output: List[str] = []
    base_dir = THIS_DIR / "data"

    with open(base_dir / input_name, "r", encoding="utf8") as test:
        _input = test.readlines()

    try:
        with open(base_dir / output_name, "r", encoding="utf8") as test:
            _output = test.readlines()
    except IOError:
        _output = _input[:]

    return "".join(_input).strip() + "\n", "".join(_output).strip() + "\n"


@pytest.fixture
def settings():
    return Settings()


@pytest.mark.parametrize(
    "input_name", ["01_general", "02_base_template", "03_jinja_comments"]
)
def test_formatting(input_name, settings):

    src, expected = read_data(input_name)
    actual = format_string(src, settings)

    assert actual == expected
    assert_equivalent(src, actual)
    assert_stable(src, actual, settings)
