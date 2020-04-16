// Generated from /home/ben/Code/html_formatter/html_formatter/antlr/HTMLParser.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HTMLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TEMPLATE_TAG_OPEN=1, TEMPLATE_VARIABLE_OPEN=2, TEMPLATE_COMMENT_OPEN=3, 
		HTML_COMMENT=4, HTML_CONDITIONAL_COMMENT=5, XML_DECLARATION=6, CDATA=7, 
		DTD=8, SCRIPTLET=9, SEA_WS=10, SCRIPT_OPEN=11, STYLE_OPEN=12, TAG_OPEN=13, 
		HTML_TEXT=14, TEMPLATE_TAG_CLOSE=15, TEMPLATE_CONTENT=16, TEMPLATE_WS=17, 
		TAG_CLOSE=18, TAG_SLASH_CLOSE=19, TAG_SLASH=20, TAG_EQUALS=21, TAG_NAME=22, 
		TAG_WHITESPACE=23, SCRIPT_BODY=24, SCRIPT_SHORT_BODY=25, STYLE_BODY=26, 
		STYLE_SHORT_BODY=27, ATTVALUE_VALUE=28, ATTRIBUTE=29;
	public static final int
		RULE_template = 0, RULE_templateContent = 1, RULE_htmlDocument = 2, RULE_htmlElements = 3, 
		RULE_htmlElement = 4, RULE_htmlContent = 5, RULE_htmlAttribute = 6, RULE_htmlAttributeName = 7, 
		RULE_htmlAttributeValue = 8, RULE_htmlTagName = 9, RULE_htmlChardata = 10, 
		RULE_htmlMisc = 11, RULE_htmlComment = 12, RULE_xhtmlCDATA = 13, RULE_dtd = 14, 
		RULE_xml = 15, RULE_scriptlet = 16, RULE_script = 17, RULE_scriptBody = 18, 
		RULE_style = 19, RULE_styleBody = 20;
	public static final String[] ruleNames = {
		"template", "templateContent", "htmlDocument", "htmlElements", "htmlElement", 
		"htmlContent", "htmlAttribute", "htmlAttributeName", "htmlAttributeValue", 
		"htmlTagName", "htmlChardata", "htmlMisc", "htmlComment", "xhtmlCDATA", 
		"dtd", "xml", "scriptlet", "script", "scriptBody", "style", "styleBody"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{%'", "'{{'", "'{#'", null, null, null, null, null, null, null, 
		null, null, "'<'", null, null, null, null, "'>'", "'/>'", "'/'", "'='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "TEMPLATE_TAG_OPEN", "TEMPLATE_VARIABLE_OPEN", "TEMPLATE_COMMENT_OPEN", 
		"HTML_COMMENT", "HTML_CONDITIONAL_COMMENT", "XML_DECLARATION", "CDATA", 
		"DTD", "SCRIPTLET", "SEA_WS", "SCRIPT_OPEN", "STYLE_OPEN", "TAG_OPEN", 
		"HTML_TEXT", "TEMPLATE_TAG_CLOSE", "TEMPLATE_CONTENT", "TEMPLATE_WS", 
		"TAG_CLOSE", "TAG_SLASH_CLOSE", "TAG_SLASH", "TAG_EQUALS", "TAG_NAME", 
		"TAG_WHITESPACE", "SCRIPT_BODY", "SCRIPT_SHORT_BODY", "STYLE_BODY", "STYLE_SHORT_BODY", 
		"ATTVALUE_VALUE", "ATTRIBUTE"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "HTMLParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public HTMLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class TemplateContext extends ParserRuleContext {
		public TerminalNode TEMPLATE_TAG_CLOSE() { return getToken(HTMLParser.TEMPLATE_TAG_CLOSE, 0); }
		public TerminalNode TEMPLATE_TAG_OPEN() { return getToken(HTMLParser.TEMPLATE_TAG_OPEN, 0); }
		public TerminalNode TEMPLATE_VARIABLE_OPEN() { return getToken(HTMLParser.TEMPLATE_VARIABLE_OPEN, 0); }
		public TerminalNode TEMPLATE_COMMENT_OPEN() { return getToken(HTMLParser.TEMPLATE_COMMENT_OPEN, 0); }
		public List<TemplateContentContext> templateContent() {
			return getRuleContexts(TemplateContentContext.class);
		}
		public TemplateContentContext templateContent(int i) {
			return getRuleContext(TemplateContentContext.class,i);
		}
		public TemplateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_template; }
	}

	public final TemplateContext template() throws RecognitionException {
		TemplateContext _localctx = new TemplateContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_template);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TEMPLATE_TAG_OPEN) | (1L << TEMPLATE_VARIABLE_OPEN) | (1L << TEMPLATE_COMMENT_OPEN))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(44); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(43);
				templateContent();
				}
				}
				setState(46); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TEMPLATE_CONTENT );
			setState(48);
			match(TEMPLATE_TAG_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TemplateContentContext extends ParserRuleContext {
		public TerminalNode TEMPLATE_CONTENT() { return getToken(HTMLParser.TEMPLATE_CONTENT, 0); }
		public TemplateContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateContent; }
	}

	public final TemplateContentContext templateContent() throws RecognitionException {
		TemplateContentContext _localctx = new TemplateContentContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_templateContent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(TEMPLATE_CONTENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HtmlDocumentContext extends ParserRuleContext {
		public List<ScriptletContext> scriptlet() {
			return getRuleContexts(ScriptletContext.class);
		}
		public ScriptletContext scriptlet(int i) {
			return getRuleContext(ScriptletContext.class,i);
		}
		public List<TerminalNode> SEA_WS() { return getTokens(HTMLParser.SEA_WS); }
		public TerminalNode SEA_WS(int i) {
			return getToken(HTMLParser.SEA_WS, i);
		}
		public XmlContext xml() {
			return getRuleContext(XmlContext.class,0);
		}
		public DtdContext dtd() {
			return getRuleContext(DtdContext.class,0);
		}
		public List<HtmlElementsContext> htmlElements() {
			return getRuleContexts(HtmlElementsContext.class);
		}
		public HtmlElementsContext htmlElements(int i) {
			return getRuleContext(HtmlElementsContext.class,i);
		}
		public HtmlDocumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlDocument; }
	}

	public final HtmlDocumentContext htmlDocument() throws RecognitionException {
		HtmlDocumentContext _localctx = new HtmlDocumentContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_htmlDocument);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(54);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case SCRIPTLET:
						{
						setState(52);
						scriptlet();
						}
						break;
					case SEA_WS:
						{
						setState(53);
						match(SEA_WS);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(58);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==XML_DECLARATION) {
				{
				setState(59);
				xml();
				}
			}

			setState(66);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(64);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case SCRIPTLET:
						{
						setState(62);
						scriptlet();
						}
						break;
					case SEA_WS:
						{
						setState(63);
						match(SEA_WS);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(68);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DTD) {
				{
				setState(69);
				dtd();
				}
			}

			setState(76);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(74);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case SCRIPTLET:
						{
						setState(72);
						scriptlet();
						}
						break;
					case SEA_WS:
						{
						setState(73);
						match(SEA_WS);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(78);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TEMPLATE_TAG_OPEN) | (1L << TEMPLATE_VARIABLE_OPEN) | (1L << TEMPLATE_COMMENT_OPEN) | (1L << HTML_COMMENT) | (1L << HTML_CONDITIONAL_COMMENT) | (1L << SCRIPTLET) | (1L << SEA_WS) | (1L << SCRIPT_OPEN) | (1L << STYLE_OPEN) | (1L << TAG_OPEN))) != 0)) {
				{
				{
				setState(79);
				htmlElements();
				}
				}
				setState(84);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HtmlElementsContext extends ParserRuleContext {
		public HtmlElementContext htmlElement() {
			return getRuleContext(HtmlElementContext.class,0);
		}
		public TemplateContext template() {
			return getRuleContext(TemplateContext.class,0);
		}
		public List<HtmlMiscContext> htmlMisc() {
			return getRuleContexts(HtmlMiscContext.class);
		}
		public HtmlMiscContext htmlMisc(int i) {
			return getRuleContext(HtmlMiscContext.class,i);
		}
		public HtmlElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlElements; }
	}

	public final HtmlElementsContext htmlElements() throws RecognitionException {
		HtmlElementsContext _localctx = new HtmlElementsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_htmlElements);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << HTML_COMMENT) | (1L << HTML_CONDITIONAL_COMMENT) | (1L << SEA_WS))) != 0)) {
				{
				{
				setState(85);
				htmlMisc();
				}
				}
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(93);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SCRIPTLET:
			case SCRIPT_OPEN:
			case STYLE_OPEN:
			case TAG_OPEN:
				{
				setState(91);
				htmlElement();
				}
				break;
			case TEMPLATE_TAG_OPEN:
			case TEMPLATE_VARIABLE_OPEN:
			case TEMPLATE_COMMENT_OPEN:
				{
				setState(92);
				template();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(98);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(95);
					htmlMisc();
					}
					} 
				}
				setState(100);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HtmlElementContext extends ParserRuleContext {
		public HtmlElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlElement; }
	 
		public HtmlElementContext() { }
		public void copyFrom(HtmlElementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DummyContext extends HtmlElementContext {
		public ScriptContext script() {
			return getRuleContext(ScriptContext.class,0);
		}
		public DummyContext(HtmlElementContext ctx) { copyFrom(ctx); }
	}
	public static class RawTagContext extends HtmlElementContext {
		public ScriptletContext scriptlet() {
			return getRuleContext(ScriptletContext.class,0);
		}
		public StyleContext style() {
			return getRuleContext(StyleContext.class,0);
		}
		public RawTagContext(HtmlElementContext ctx) { copyFrom(ctx); }
	}
	public static class TagContext extends HtmlElementContext {
		public List<TerminalNode> TAG_OPEN() { return getTokens(HTMLParser.TAG_OPEN); }
		public TerminalNode TAG_OPEN(int i) {
			return getToken(HTMLParser.TAG_OPEN, i);
		}
		public List<HtmlTagNameContext> htmlTagName() {
			return getRuleContexts(HtmlTagNameContext.class);
		}
		public HtmlTagNameContext htmlTagName(int i) {
			return getRuleContext(HtmlTagNameContext.class,i);
		}
		public List<TerminalNode> TAG_CLOSE() { return getTokens(HTMLParser.TAG_CLOSE); }
		public TerminalNode TAG_CLOSE(int i) {
			return getToken(HTMLParser.TAG_CLOSE, i);
		}
		public HtmlContentContext htmlContent() {
			return getRuleContext(HtmlContentContext.class,0);
		}
		public TerminalNode TAG_SLASH() { return getToken(HTMLParser.TAG_SLASH, 0); }
		public List<HtmlAttributeContext> htmlAttribute() {
			return getRuleContexts(HtmlAttributeContext.class);
		}
		public HtmlAttributeContext htmlAttribute(int i) {
			return getRuleContext(HtmlAttributeContext.class,i);
		}
		public TagContext(HtmlElementContext ctx) { copyFrom(ctx); }
	}
	public static class SelfClosingTagContext extends HtmlElementContext {
		public TerminalNode TAG_OPEN() { return getToken(HTMLParser.TAG_OPEN, 0); }
		public HtmlTagNameContext htmlTagName() {
			return getRuleContext(HtmlTagNameContext.class,0);
		}
		public TerminalNode TAG_SLASH_CLOSE() { return getToken(HTMLParser.TAG_SLASH_CLOSE, 0); }
		public List<HtmlAttributeContext> htmlAttribute() {
			return getRuleContexts(HtmlAttributeContext.class);
		}
		public HtmlAttributeContext htmlAttribute(int i) {
			return getRuleContext(HtmlAttributeContext.class,i);
		}
		public TerminalNode TAG_CLOSE() { return getToken(HTMLParser.TAG_CLOSE, 0); }
		public SelfClosingTagContext(HtmlElementContext ctx) { copyFrom(ctx); }
	}

	public final HtmlElementContext htmlElement() throws RecognitionException {
		HtmlElementContext _localctx = new HtmlElementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_htmlElement);
		int _la;
		try {
			setState(139);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				_localctx = new TagContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(101);
				match(TAG_OPEN);
				setState(102);
				htmlTagName();
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TAG_NAME) {
					{
					{
					setState(103);
					htmlAttribute();
					}
					}
					setState(108);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(109);
				match(TAG_CLOSE);
				setState(110);
				htmlContent();
				setState(111);
				match(TAG_OPEN);
				setState(112);
				match(TAG_SLASH);
				setState(113);
				htmlTagName();
				setState(114);
				match(TAG_CLOSE);
				}
				break;
			case 2:
				_localctx = new SelfClosingTagContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(116);
				match(TAG_OPEN);
				setState(117);
				htmlTagName();
				setState(121);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TAG_NAME) {
					{
					{
					setState(118);
					htmlAttribute();
					}
					}
					setState(123);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(124);
				match(TAG_SLASH_CLOSE);
				}
				break;
			case 3:
				_localctx = new SelfClosingTagContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(126);
				match(TAG_OPEN);
				setState(127);
				htmlTagName();
				setState(131);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TAG_NAME) {
					{
					{
					setState(128);
					htmlAttribute();
					}
					}
					setState(133);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(134);
				match(TAG_CLOSE);
				}
				break;
			case 4:
				_localctx = new RawTagContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(136);
				scriptlet();
				}
				break;
			case 5:
				_localctx = new DummyContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(137);
				script();
				}
				break;
			case 6:
				_localctx = new RawTagContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(138);
				style();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HtmlContentContext extends ParserRuleContext {
		public List<HtmlChardataContext> htmlChardata() {
			return getRuleContexts(HtmlChardataContext.class);
		}
		public HtmlChardataContext htmlChardata(int i) {
			return getRuleContext(HtmlChardataContext.class,i);
		}
		public List<HtmlElementContext> htmlElement() {
			return getRuleContexts(HtmlElementContext.class);
		}
		public HtmlElementContext htmlElement(int i) {
			return getRuleContext(HtmlElementContext.class,i);
		}
		public List<XhtmlCDATAContext> xhtmlCDATA() {
			return getRuleContexts(XhtmlCDATAContext.class);
		}
		public XhtmlCDATAContext xhtmlCDATA(int i) {
			return getRuleContext(XhtmlCDATAContext.class,i);
		}
		public List<HtmlCommentContext> htmlComment() {
			return getRuleContexts(HtmlCommentContext.class);
		}
		public HtmlCommentContext htmlComment(int i) {
			return getRuleContext(HtmlCommentContext.class,i);
		}
		public HtmlContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlContent; }
	}

	public final HtmlContentContext htmlContent() throws RecognitionException {
		HtmlContentContext _localctx = new HtmlContentContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_htmlContent);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEA_WS || _la==HTML_TEXT) {
				{
				setState(141);
				htmlChardata();
				}
			}

			setState(154);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(147);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case SCRIPTLET:
					case SCRIPT_OPEN:
					case STYLE_OPEN:
					case TAG_OPEN:
						{
						setState(144);
						htmlElement();
						}
						break;
					case CDATA:
						{
						setState(145);
						xhtmlCDATA();
						}
						break;
					case HTML_COMMENT:
					case HTML_CONDITIONAL_COMMENT:
						{
						setState(146);
						htmlComment();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(150);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEA_WS || _la==HTML_TEXT) {
						{
						setState(149);
						htmlChardata();
						}
					}

					}
					} 
				}
				setState(156);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HtmlAttributeContext extends ParserRuleContext {
		public HtmlAttributeNameContext htmlAttributeName() {
			return getRuleContext(HtmlAttributeNameContext.class,0);
		}
		public TerminalNode TAG_EQUALS() { return getToken(HTMLParser.TAG_EQUALS, 0); }
		public HtmlAttributeValueContext htmlAttributeValue() {
			return getRuleContext(HtmlAttributeValueContext.class,0);
		}
		public HtmlAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlAttribute; }
	}

	public final HtmlAttributeContext htmlAttribute() throws RecognitionException {
		HtmlAttributeContext _localctx = new HtmlAttributeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_htmlAttribute);
		try {
			setState(162);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(157);
				htmlAttributeName();
				setState(158);
				match(TAG_EQUALS);
				setState(159);
				htmlAttributeValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(161);
				htmlAttributeName();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HtmlAttributeNameContext extends ParserRuleContext {
		public TerminalNode TAG_NAME() { return getToken(HTMLParser.TAG_NAME, 0); }
		public HtmlAttributeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlAttributeName; }
	}

	public final HtmlAttributeNameContext htmlAttributeName() throws RecognitionException {
		HtmlAttributeNameContext _localctx = new HtmlAttributeNameContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_htmlAttributeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(TAG_NAME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HtmlAttributeValueContext extends ParserRuleContext {
		public TerminalNode ATTVALUE_VALUE() { return getToken(HTMLParser.ATTVALUE_VALUE, 0); }
		public HtmlAttributeValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlAttributeValue; }
	}

	public final HtmlAttributeValueContext htmlAttributeValue() throws RecognitionException {
		HtmlAttributeValueContext _localctx = new HtmlAttributeValueContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_htmlAttributeValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(ATTVALUE_VALUE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HtmlTagNameContext extends ParserRuleContext {
		public TerminalNode TAG_NAME() { return getToken(HTMLParser.TAG_NAME, 0); }
		public HtmlTagNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlTagName; }
	}

	public final HtmlTagNameContext htmlTagName() throws RecognitionException {
		HtmlTagNameContext _localctx = new HtmlTagNameContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_htmlTagName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(TAG_NAME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HtmlChardataContext extends ParserRuleContext {
		public TerminalNode HTML_TEXT() { return getToken(HTMLParser.HTML_TEXT, 0); }
		public TerminalNode SEA_WS() { return getToken(HTMLParser.SEA_WS, 0); }
		public HtmlChardataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlChardata; }
	}

	public final HtmlChardataContext htmlChardata() throws RecognitionException {
		HtmlChardataContext _localctx = new HtmlChardataContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_htmlChardata);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			_la = _input.LA(1);
			if ( !(_la==SEA_WS || _la==HTML_TEXT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HtmlMiscContext extends ParserRuleContext {
		public HtmlCommentContext htmlComment() {
			return getRuleContext(HtmlCommentContext.class,0);
		}
		public TerminalNode SEA_WS() { return getToken(HTMLParser.SEA_WS, 0); }
		public HtmlMiscContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlMisc; }
	}

	public final HtmlMiscContext htmlMisc() throws RecognitionException {
		HtmlMiscContext _localctx = new HtmlMiscContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_htmlMisc);
		try {
			setState(174);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HTML_COMMENT:
			case HTML_CONDITIONAL_COMMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(172);
				htmlComment();
				}
				break;
			case SEA_WS:
				enterOuterAlt(_localctx, 2);
				{
				setState(173);
				match(SEA_WS);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HtmlCommentContext extends ParserRuleContext {
		public TerminalNode HTML_COMMENT() { return getToken(HTMLParser.HTML_COMMENT, 0); }
		public TerminalNode HTML_CONDITIONAL_COMMENT() { return getToken(HTMLParser.HTML_CONDITIONAL_COMMENT, 0); }
		public HtmlCommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlComment; }
	}

	public final HtmlCommentContext htmlComment() throws RecognitionException {
		HtmlCommentContext _localctx = new HtmlCommentContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_htmlComment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			_la = _input.LA(1);
			if ( !(_la==HTML_COMMENT || _la==HTML_CONDITIONAL_COMMENT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class XhtmlCDATAContext extends ParserRuleContext {
		public TerminalNode CDATA() { return getToken(HTMLParser.CDATA, 0); }
		public XhtmlCDATAContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xhtmlCDATA; }
	}

	public final XhtmlCDATAContext xhtmlCDATA() throws RecognitionException {
		XhtmlCDATAContext _localctx = new XhtmlCDATAContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_xhtmlCDATA);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			match(CDATA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DtdContext extends ParserRuleContext {
		public TerminalNode DTD() { return getToken(HTMLParser.DTD, 0); }
		public DtdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dtd; }
	}

	public final DtdContext dtd() throws RecognitionException {
		DtdContext _localctx = new DtdContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_dtd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(DTD);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class XmlContext extends ParserRuleContext {
		public TerminalNode XML_DECLARATION() { return getToken(HTMLParser.XML_DECLARATION, 0); }
		public XmlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xml; }
	}

	public final XmlContext xml() throws RecognitionException {
		XmlContext _localctx = new XmlContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_xml);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			match(XML_DECLARATION);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ScriptletContext extends ParserRuleContext {
		public TerminalNode SCRIPTLET() { return getToken(HTMLParser.SCRIPTLET, 0); }
		public ScriptletContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scriptlet; }
	}

	public final ScriptletContext scriptlet() throws RecognitionException {
		ScriptletContext _localctx = new ScriptletContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_scriptlet);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			match(SCRIPTLET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ScriptContext extends ParserRuleContext {
		public TerminalNode SCRIPT_OPEN() { return getToken(HTMLParser.SCRIPT_OPEN, 0); }
		public TerminalNode TAG_CLOSE() { return getToken(HTMLParser.TAG_CLOSE, 0); }
		public ScriptBodyContext scriptBody() {
			return getRuleContext(ScriptBodyContext.class,0);
		}
		public List<HtmlAttributeContext> htmlAttribute() {
			return getRuleContexts(HtmlAttributeContext.class);
		}
		public HtmlAttributeContext htmlAttribute(int i) {
			return getRuleContext(HtmlAttributeContext.class,i);
		}
		public ScriptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_script; }
	}

	public final ScriptContext script() throws RecognitionException {
		ScriptContext _localctx = new ScriptContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_script);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(SCRIPT_OPEN);
			setState(190);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TAG_NAME) {
				{
				{
				setState(187);
				htmlAttribute();
				}
				}
				setState(192);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(193);
			match(TAG_CLOSE);
			setState(194);
			scriptBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ScriptBodyContext extends ParserRuleContext {
		public TerminalNode SCRIPT_BODY() { return getToken(HTMLParser.SCRIPT_BODY, 0); }
		public TerminalNode SCRIPT_SHORT_BODY() { return getToken(HTMLParser.SCRIPT_SHORT_BODY, 0); }
		public ScriptBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scriptBody; }
	}

	public final ScriptBodyContext scriptBody() throws RecognitionException {
		ScriptBodyContext _localctx = new ScriptBodyContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_scriptBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			_la = _input.LA(1);
			if ( !(_la==SCRIPT_BODY || _la==SCRIPT_SHORT_BODY) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StyleContext extends ParserRuleContext {
		public TerminalNode STYLE_OPEN() { return getToken(HTMLParser.STYLE_OPEN, 0); }
		public TerminalNode TAG_CLOSE() { return getToken(HTMLParser.TAG_CLOSE, 0); }
		public StyleBodyContext styleBody() {
			return getRuleContext(StyleBodyContext.class,0);
		}
		public List<HtmlAttributeContext> htmlAttribute() {
			return getRuleContexts(HtmlAttributeContext.class);
		}
		public HtmlAttributeContext htmlAttribute(int i) {
			return getRuleContext(HtmlAttributeContext.class,i);
		}
		public StyleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_style; }
	}

	public final StyleContext style() throws RecognitionException {
		StyleContext _localctx = new StyleContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_style);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			match(STYLE_OPEN);
			setState(202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TAG_NAME) {
				{
				{
				setState(199);
				htmlAttribute();
				}
				}
				setState(204);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(205);
			match(TAG_CLOSE);
			setState(206);
			styleBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StyleBodyContext extends ParserRuleContext {
		public TerminalNode STYLE_BODY() { return getToken(HTMLParser.STYLE_BODY, 0); }
		public TerminalNode STYLE_SHORT_BODY() { return getToken(HTMLParser.STYLE_SHORT_BODY, 0); }
		public StyleBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_styleBody; }
	}

	public final StyleBodyContext styleBody() throws RecognitionException {
		StyleBodyContext _localctx = new StyleBodyContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_styleBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			_la = _input.LA(1);
			if ( !(_la==STYLE_BODY || _la==STYLE_SHORT_BODY) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\37\u00d5\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\6\2/\n\2\r\2\16\2\60"+
		"\3\2\3\2\3\3\3\3\3\4\3\4\7\49\n\4\f\4\16\4<\13\4\3\4\5\4?\n\4\3\4\3\4"+
		"\7\4C\n\4\f\4\16\4F\13\4\3\4\5\4I\n\4\3\4\3\4\7\4M\n\4\f\4\16\4P\13\4"+
		"\3\4\7\4S\n\4\f\4\16\4V\13\4\3\5\7\5Y\n\5\f\5\16\5\\\13\5\3\5\3\5\5\5"+
		"`\n\5\3\5\7\5c\n\5\f\5\16\5f\13\5\3\6\3\6\3\6\7\6k\n\6\f\6\16\6n\13\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6z\n\6\f\6\16\6}\13\6\3\6\3"+
		"\6\3\6\3\6\3\6\7\6\u0084\n\6\f\6\16\6\u0087\13\6\3\6\3\6\3\6\3\6\3\6\5"+
		"\6\u008e\n\6\3\7\5\7\u0091\n\7\3\7\3\7\3\7\5\7\u0096\n\7\3\7\5\7\u0099"+
		"\n\7\7\7\u009b\n\7\f\7\16\7\u009e\13\7\3\b\3\b\3\b\3\b\3\b\5\b\u00a5\n"+
		"\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\5\r\u00b1\n\r\3\16\3\16\3"+
		"\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\7\23\u00bf\n\23\f\23"+
		"\16\23\u00c2\13\23\3\23\3\23\3\23\3\24\3\24\3\25\3\25\7\25\u00cb\n\25"+
		"\f\25\16\25\u00ce\13\25\3\25\3\25\3\25\3\26\3\26\3\26\2\2\27\2\4\6\b\n"+
		"\f\16\20\22\24\26\30\32\34\36 \"$&(*\2\7\3\2\3\5\4\2\f\f\20\20\3\2\6\7"+
		"\3\2\32\33\3\2\34\35\2\u00dd\2,\3\2\2\2\4\64\3\2\2\2\6:\3\2\2\2\bZ\3\2"+
		"\2\2\n\u008d\3\2\2\2\f\u0090\3\2\2\2\16\u00a4\3\2\2\2\20\u00a6\3\2\2\2"+
		"\22\u00a8\3\2\2\2\24\u00aa\3\2\2\2\26\u00ac\3\2\2\2\30\u00b0\3\2\2\2\32"+
		"\u00b2\3\2\2\2\34\u00b4\3\2\2\2\36\u00b6\3\2\2\2 \u00b8\3\2\2\2\"\u00ba"+
		"\3\2\2\2$\u00bc\3\2\2\2&\u00c6\3\2\2\2(\u00c8\3\2\2\2*\u00d2\3\2\2\2,"+
		".\t\2\2\2-/\5\4\3\2.-\3\2\2\2/\60\3\2\2\2\60.\3\2\2\2\60\61\3\2\2\2\61"+
		"\62\3\2\2\2\62\63\7\21\2\2\63\3\3\2\2\2\64\65\7\22\2\2\65\5\3\2\2\2\66"+
		"9\5\"\22\2\679\7\f\2\28\66\3\2\2\28\67\3\2\2\29<\3\2\2\2:8\3\2\2\2:;\3"+
		"\2\2\2;>\3\2\2\2<:\3\2\2\2=?\5 \21\2>=\3\2\2\2>?\3\2\2\2?D\3\2\2\2@C\5"+
		"\"\22\2AC\7\f\2\2B@\3\2\2\2BA\3\2\2\2CF\3\2\2\2DB\3\2\2\2DE\3\2\2\2EH"+
		"\3\2\2\2FD\3\2\2\2GI\5\36\20\2HG\3\2\2\2HI\3\2\2\2IN\3\2\2\2JM\5\"\22"+
		"\2KM\7\f\2\2LJ\3\2\2\2LK\3\2\2\2MP\3\2\2\2NL\3\2\2\2NO\3\2\2\2OT\3\2\2"+
		"\2PN\3\2\2\2QS\5\b\5\2RQ\3\2\2\2SV\3\2\2\2TR\3\2\2\2TU\3\2\2\2U\7\3\2"+
		"\2\2VT\3\2\2\2WY\5\30\r\2XW\3\2\2\2Y\\\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[_\3"+
		"\2\2\2\\Z\3\2\2\2]`\5\n\6\2^`\5\2\2\2_]\3\2\2\2_^\3\2\2\2`d\3\2\2\2ac"+
		"\5\30\r\2ba\3\2\2\2cf\3\2\2\2db\3\2\2\2de\3\2\2\2e\t\3\2\2\2fd\3\2\2\2"+
		"gh\7\17\2\2hl\5\24\13\2ik\5\16\b\2ji\3\2\2\2kn\3\2\2\2lj\3\2\2\2lm\3\2"+
		"\2\2mo\3\2\2\2nl\3\2\2\2op\7\24\2\2pq\5\f\7\2qr\7\17\2\2rs\7\26\2\2st"+
		"\5\24\13\2tu\7\24\2\2u\u008e\3\2\2\2vw\7\17\2\2w{\5\24\13\2xz\5\16\b\2"+
		"yx\3\2\2\2z}\3\2\2\2{y\3\2\2\2{|\3\2\2\2|~\3\2\2\2}{\3\2\2\2~\177\7\25"+
		"\2\2\177\u008e\3\2\2\2\u0080\u0081\7\17\2\2\u0081\u0085\5\24\13\2\u0082"+
		"\u0084\5\16\b\2\u0083\u0082\3\2\2\2\u0084\u0087\3\2\2\2\u0085\u0083\3"+
		"\2\2\2\u0085\u0086\3\2\2\2\u0086\u0088\3\2\2\2\u0087\u0085\3\2\2\2\u0088"+
		"\u0089\7\24\2\2\u0089\u008e\3\2\2\2\u008a\u008e\5\"\22\2\u008b\u008e\5"+
		"$\23\2\u008c\u008e\5(\25\2\u008dg\3\2\2\2\u008dv\3\2\2\2\u008d\u0080\3"+
		"\2\2\2\u008d\u008a\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008c\3\2\2\2\u008e"+
		"\13\3\2\2\2\u008f\u0091\5\26\f\2\u0090\u008f\3\2\2\2\u0090\u0091\3\2\2"+
		"\2\u0091\u009c\3\2\2\2\u0092\u0096\5\n\6\2\u0093\u0096\5\34\17\2\u0094"+
		"\u0096\5\32\16\2\u0095\u0092\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0094\3"+
		"\2\2\2\u0096\u0098\3\2\2\2\u0097\u0099\5\26\f\2\u0098\u0097\3\2\2\2\u0098"+
		"\u0099\3\2\2\2\u0099\u009b\3\2\2\2\u009a\u0095\3\2\2\2\u009b\u009e\3\2"+
		"\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\r\3\2\2\2\u009e\u009c"+
		"\3\2\2\2\u009f\u00a0\5\20\t\2\u00a0\u00a1\7\27\2\2\u00a1\u00a2\5\22\n"+
		"\2\u00a2\u00a5\3\2\2\2\u00a3\u00a5\5\20\t\2\u00a4\u009f\3\2\2\2\u00a4"+
		"\u00a3\3\2\2\2\u00a5\17\3\2\2\2\u00a6\u00a7\7\30\2\2\u00a7\21\3\2\2\2"+
		"\u00a8\u00a9\7\36\2\2\u00a9\23\3\2\2\2\u00aa\u00ab\7\30\2\2\u00ab\25\3"+
		"\2\2\2\u00ac\u00ad\t\3\2\2\u00ad\27\3\2\2\2\u00ae\u00b1\5\32\16\2\u00af"+
		"\u00b1\7\f\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00af\3\2\2\2\u00b1\31\3\2\2"+
		"\2\u00b2\u00b3\t\4\2\2\u00b3\33\3\2\2\2\u00b4\u00b5\7\t\2\2\u00b5\35\3"+
		"\2\2\2\u00b6\u00b7\7\n\2\2\u00b7\37\3\2\2\2\u00b8\u00b9\7\b\2\2\u00b9"+
		"!\3\2\2\2\u00ba\u00bb\7\13\2\2\u00bb#\3\2\2\2\u00bc\u00c0\7\r\2\2\u00bd"+
		"\u00bf\5\16\b\2\u00be\u00bd\3\2\2\2\u00bf\u00c2\3\2\2\2\u00c0\u00be\3"+
		"\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c3\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c3"+
		"\u00c4\7\24\2\2\u00c4\u00c5\5&\24\2\u00c5%\3\2\2\2\u00c6\u00c7\t\5\2\2"+
		"\u00c7\'\3\2\2\2\u00c8\u00cc\7\16\2\2\u00c9\u00cb\5\16\b\2\u00ca\u00c9"+
		"\3\2\2\2\u00cb\u00ce\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd"+
		"\u00cf\3\2\2\2\u00ce\u00cc\3\2\2\2\u00cf\u00d0\7\24\2\2\u00d0\u00d1\5"+
		"*\26\2\u00d1)\3\2\2\2\u00d2\u00d3\t\6\2\2\u00d3+\3\2\2\2\33\608:>BDHL"+
		"NTZ_dl{\u0085\u008d\u0090\u0095\u0098\u009c\u00a4\u00b0\u00c0\u00cc";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}