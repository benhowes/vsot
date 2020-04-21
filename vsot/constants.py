TEMPLATE_SCOPE_OPEN_TAGS = (
    "autoescape",
    "block",
    "comment",
    "filter",
    "for",
    "if",
    "ifchanged",
    "while",
    "with",
    # Jinja only
    "macro",
    "call",
    # "set" - this is context dependent, so would need a special case :(
)

TEMPLATE_SCOPE_CLOSE_OPEN_TAGS = ("elif", "empty")

DEFAULT_LINE_LENGTH = 88
DEFAULT_INDENT_SIZE = 2
DEFAULT_EXCLUDES = r"/(\.eggs|\.git|\.hg|\.mypy_cache|\.nox|\.tox|\.venv|\.svn|_build|buck-out|build|dist)/"  # noqa: B950
DEFAULT_INCLUDES = r"/templates/.*?\.html$"
