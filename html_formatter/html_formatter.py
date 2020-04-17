from functools import partialmethod
from pprint import pformat
from typing import Optional

from .antlr.HTMLParserVisitor import HTMLParserVisitor

from .constants import DJANGO_SCOPE_OPEN_TAGS, DJANGO_SCOPE_CLOSE_OPEN_TAGS


class HTMLFormatter(HTMLParserVisitor):
    def __init__(self):
        self.indent = 0
        self.indent_str = "  "
        self.max_line_len = 88

    def enter_scope(self):
        self.indent += 1

    def exit_scope(self):
        self.indent -= 1

    def resolve_indent(self):
        return self.indent_str * self.indent

    def output(self, content, add_indent=True):
        print(f"{self.resolve_indent() if add_indent else ''}{content}")

    def outputOpeningTag(self, ctx, tag_name: Optional[str] = None):
        """
            tag_name: If the tag name should not be detected (e.g. for script)
        """
        is_self_closing = False

        name = tag_name

        if not name:
            # Tags with a closing tag have 2 instances of htmlTagName
            name = ctx.htmlTagName()
            if isinstance(
                name, list
            ):  # self closing does not have a second occurance of a name2
                name = name[0].getText()
            else:
                is_self_closing = True
                name = name.getText()

        open_tag_parts = [name]
        open_tag_parts += [
            self._visitHtmlAttribute(attr) for attr in ctx.htmlAttribute()
        ]

        join_str = " "
        close_str = "/>" if is_self_closing else ">"

        # Detect if attrs need spliting over lines
        length = (
            sum(len(part) for part in open_tag_parts)  # characters in attrs
            + len(open_tag_parts)  # spaces between attrs
            + len(self.resolve_indent())  # starting indent
        )
        if length > self.max_line_len:
            self.enter_scope()
            join_str = f"\n{self.resolve_indent()}"
            self.exit_scope()
            close_str = f"\n{self.resolve_indent()}{close_str}"

        self.output(f"<{join_str.join(open_tag_parts)}{close_str}")

    def outputClosingTag(self, ctx, tag_name: Optional[str] = None):
        """
            tag_name: If the tag name should not be detected (e.g. for script)
        """
        name = tag_name or ctx.htmlTagName()[1].getText()
        self.output(f"</{name}>")

    def visit_lang_block(self, ctx, tag_name="script", content="scriptBody"):
        # TODO: format other languages - maybe with jsbeautify
        self.outputOpeningTag(ctx, tag_name=tag_name)
        self.enter_scope()
        for line in (
            getattr(ctx, content)()
            .getText()
            .replace(f"</{tag_name}>", "")
            .strip("\n\r")
            .split("\n")
        ):
            self.output(line)
        self.exit_scope()
        self.outputClosingTag(ctx, tag_name=tag_name)

    # Visitors - all named to match HTMLParserVisitor
    def visitTag(self, ctx):
        # The enter tag
        self.outputOpeningTag(ctx)

        # print the children - might have none
        self.enter_scope()
        self.visitChildren(ctx)
        self.exit_scope()

        # closing tag
        self.outputClosingTag(ctx)

    def visitSelfClosingTag(self, ctx):
        self.outputOpeningTag(ctx)

    def _visitHtmlAttribute(self, ctx):
        return (
            f"{ctx.htmlAttributeName().getText()}={ctx.htmlAttributeValue().getText()}"
        )

    def _reflow_html_text(self, text):
        """
        Reflow text, accounting for the required indent for the current scope.
        """
        indent_size = len(self.resolve_indent())
        width = self.max_line_len - indent_size
        parts = text.split()

        while parts:
            # Consume unbroken chunks
            line = ""
            current_length = 0

            while current_length < width and parts:
                # always consume the first chunk of a line, then
                # append current chunk if it will fit within the `width`
                # or break to yield the line
                if current_length and (current_length + len(parts[0]) + 1) > width:
                    break
                line += " " + parts.pop(0)
                current_length = len(line)

            yield line.strip()

    def visitHtmlChardata(self, ctx):
        text = ctx.HTML_TEXT()
        if not text:
            return

        for line in self._reflow_html_text(text.getText()):
            self.output(line)

    def visitRaw(self, ctx):
        self.output(ctx.getText())

    visitHtmlComment = visitRaw
    visitXhtmlCDATA = visitRaw
    visitDtd = visitRaw
    visitXml = visitRaw
    visitScriptlet = visitRaw

    visitScript = partialmethod(
        visit_lang_block, tag_name="script", content="scriptBody"
    )
    visitStyle = partialmethod(visit_lang_block, tag_name="style", content="styleBody")

    def visitTemplate(self, ctx):
        """ Doesn't currently do much other than normalise whitespace """
        parts = [part.getText() for part in ctx.templateContent()]
        command = parts[0]

        # Logic for if this is entering/exiting a scope
        # Unmatched commands are assumed to not affect scope
        enters = False
        if command in DJANGO_SCOPE_OPEN_TAGS:
            enters = True

        exits = False
        if command.startswith("end"):
            exits = True

        if command in DJANGO_SCOPE_CLOSE_OPEN_TAGS:
            exits = True
            enters = True

        if exits:
            self.exit_scope()

        self.output(f"{ctx.openTag.text} {' '.join(parts)} {ctx.closeTag.text}")

        if enters:
            self.enter_scope()
