from functools import partialmethod
from typing import Optional

from .antlr.HTMLParserVisitor import HTMLParserVisitor


class HTMLFormatter(HTMLParserVisitor):
    def __init__(self):
        self.indent = 0
        self.indent_str = "  "
        self.max_line_len = 88

    def enter(self):
        self.indent += 1

    def exit(self):
        self.indent -= 1

    def resolve_indent(self):
        return self.indent_str * self.indent

    def output(self, content):
        print(f"{self.resolve_indent()}{content}")

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
            self.enter()
            join_str = f"\n{self.resolve_indent()}"
            self.exit()
            close_str = f"\n{self.resolve_indent()}{close_str}"

        self.output(f"<{join_str.join(open_tag_parts)}{close_str}")

    def outputClosingTag(self, ctx, tag_name: Optional[str] = None):
        """
            tag_name: If the tag name should not be detected (e.g. for script)
        """
        name = tag_name or ctx.htmlTagName()[1].getText()
        self.output(f"</{name}>")

    # Visitors

    def visitTag(self, ctx):
        # The enter tag
        self.outputOpeningTag(ctx)

        # print the children - might have none
        self.enter()
        self.visitChildren(ctx)
        self.exit()

        # closing tag
        self.outputClosingTag(ctx)

    def visitSelfClosingTag(self, ctx):
        self.outputOpeningTag(ctx)

    def _visitHtmlAttribute(self, ctx):
        return (
            f"{ctx.htmlAttributeName().getText()}={ctx.htmlAttributeValue().getText()}"
        )

    def visitHtmlChardata(self, ctx):
        text = ctx.HTML_TEXT()
        if text:
            self.output(text.getText())

    def visitRaw(self, ctx):
        self.output(ctx.getText())

    visitHtmlComment = visitRaw
    visitXhtmlCDATA = visitRaw
    visitDtd = visitRaw
    visitXml = visitRaw
    visitScriptlet = visitRaw

    def visitOtherLangBlock(self, ctx, tag_name="script", content="scriptBody"):
        """ TODO: format other languages """
        self.outputOpeningTag(ctx, tag_name=tag_name)
        self.enter()
        for line in (
            getattr(ctx, content)()
            .getText()
            .replace(f"</{tag_name}>", "")
            .strip("\n\r")
            .split("\n")
        ):
            self.output(line)
        self.exit()
        self.outputClosingTag(ctx, tag_name=tag_name)

    visitScript = partialmethod(
        visitOtherLangBlock, tag_name="script", content="scriptBody"
    )
    visitStyle = partialmethod(
        visitOtherLangBlock, tag_name="style", content="styleBody"
    )

    def visitTemplate(self, ctx):
        parts = [part.getText() for part in ctx.templateContent()]
        self.output(" ".join(parts))
