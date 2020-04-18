from functools import partialmethod
from pprint import pformat
from typing import Optional

from .antlr.HTMLParserVisitor import HTMLParserVisitor

from .constants import DJANGO_SCOPE_OPEN_TAGS, DJANGO_SCOPE_CLOSE_OPEN_TAGS


class HTMLFormatter(HTMLParserVisitor):
    def __init__(self):
        # Settings
        self.indent_str = "  "
        self.max_line_len = 88
        # State
        self.indent = 0
        self.current_line_len = 0

    def enter_scope(self):
        self.indent += 1

    def exit_scope(self):
        self.indent -= 1

    def resolve_indent(self):
        return self.indent_str * self.indent

    def output(self, content, is_block=True):
        """
        Output printing either prints a block (content starting and ending with a
        newline) or attempts to continue printing on the current line if the
        content is narrow enough.
        """
        if (self.current_line_len and is_block) or (
            self.current_line_len + len(content) > self.max_line_len
        ):
            # content requires newline, either because it's a block or because
            # it would overflow the desired line length.
            print("\n", end="")  # Newline
            self.current_line_len = 0

        if not self.current_line_len:
            print(f"{self.resolve_indent()}", end="", sep="")
        else:
            print(" ", end="", sep="")

        if is_block:
            end = "\n"
            self.current_line_len = 0
        else:
            end = ""
            self.current_line_len += len(content)

        print(content, end=end, sep="")

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
        parts = text.split()

        while parts:
            # Width looks at the current line width since html text is not
            # printed as a block
            if (
                # is contining a line
                self.current_line_len
                # the first chunk is not too wide
                and self.current_line_len + len(parts[0]) <= self.max_line_len
            ):
                target_width = self.max_line_len - self.current_line_len
            else:
                target_width = self.max_line_len - indent_size

            content_buffer = ""
            current_len = 0

            while current_len < target_width and parts:
                # always consume the first chunk of a line, then
                # append current chunk if it will fit within the `width`
                # or break to yield the line
                if current_len and (current_len + len(parts[0]) + 1) > target_width:
                    break
                content_buffer += " " + parts.pop(0)
                current_len = len(content_buffer)

            yield content_buffer.strip()

    def visitHtmlChardata(self, ctx):
        text = ctx.HTML_TEXT()
        if not text:
            return

        for line in self._reflow_html_text(text.getText()):
            self.output(line, is_block=False)

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

    def visitTemplateTag(self, ctx):
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

    visitTemplateComment = visitTemplateTag

    def visitTemplateVariable(self, ctx):
        parts = [part.getText() for part in ctx.templateContent()]
        self.output(f"{{{{ {' '.join(parts)} }}}}", is_block=False)
