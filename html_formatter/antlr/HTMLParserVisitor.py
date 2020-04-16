# Generated from html_formatter/antlr/HTMLParser.g4 by ANTLR 4.7.2
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .HTMLParser import HTMLParser
else:
    from HTMLParser import HTMLParser

# This class defines a complete generic visitor for a parse tree produced by HTMLParser.

class HTMLParserVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by HTMLParser#template.
    def visitTemplate(self, ctx:HTMLParser.TemplateContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by HTMLParser#templateContent.
    def visitTemplateContent(self, ctx:HTMLParser.TemplateContentContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by HTMLParser#htmlDocument.
    def visitHtmlDocument(self, ctx:HTMLParser.HtmlDocumentContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by HTMLParser#htmlElements.
    def visitHtmlElements(self, ctx:HTMLParser.HtmlElementsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by HTMLParser#Tag.
    def visitTag(self, ctx:HTMLParser.TagContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by HTMLParser#SelfClosingTag.
    def visitSelfClosingTag(self, ctx:HTMLParser.SelfClosingTagContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by HTMLParser#RawTag.
    def visitRawTag(self, ctx:HTMLParser.RawTagContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by HTMLParser#dummy.
    def visitDummy(self, ctx:HTMLParser.DummyContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by HTMLParser#htmlContent.
    def visitHtmlContent(self, ctx:HTMLParser.HtmlContentContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by HTMLParser#htmlAttribute.
    def visitHtmlAttribute(self, ctx:HTMLParser.HtmlAttributeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by HTMLParser#htmlAttributeName.
    def visitHtmlAttributeName(self, ctx:HTMLParser.HtmlAttributeNameContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by HTMLParser#htmlAttributeValue.
    def visitHtmlAttributeValue(self, ctx:HTMLParser.HtmlAttributeValueContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by HTMLParser#htmlTagName.
    def visitHtmlTagName(self, ctx:HTMLParser.HtmlTagNameContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by HTMLParser#htmlChardata.
    def visitHtmlChardata(self, ctx:HTMLParser.HtmlChardataContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by HTMLParser#htmlMisc.
    def visitHtmlMisc(self, ctx:HTMLParser.HtmlMiscContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by HTMLParser#htmlComment.
    def visitHtmlComment(self, ctx:HTMLParser.HtmlCommentContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by HTMLParser#xhtmlCDATA.
    def visitXhtmlCDATA(self, ctx:HTMLParser.XhtmlCDATAContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by HTMLParser#dtd.
    def visitDtd(self, ctx:HTMLParser.DtdContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by HTMLParser#xml.
    def visitXml(self, ctx:HTMLParser.XmlContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by HTMLParser#scriptlet.
    def visitScriptlet(self, ctx:HTMLParser.ScriptletContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by HTMLParser#script.
    def visitScript(self, ctx:HTMLParser.ScriptContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by HTMLParser#scriptBody.
    def visitScriptBody(self, ctx:HTMLParser.ScriptBodyContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by HTMLParser#style.
    def visitStyle(self, ctx:HTMLParser.StyleContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by HTMLParser#styleBody.
    def visitStyleBody(self, ctx:HTMLParser.StyleBodyContext):
        return self.visitChildren(ctx)



del HTMLParser