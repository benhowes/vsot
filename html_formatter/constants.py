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
