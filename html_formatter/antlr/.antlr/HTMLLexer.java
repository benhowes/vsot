// Generated from /home/ben/Code/html_formatter/html_formatter/antlr/HTMLLexer.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HTMLLexer extends Lexer {
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
		TEMPLATE_TAG=1, TAG=2, SCRIPT=3, STYLE=4, ATTVALUE=5;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE", "TEMPLATE_TAG", "TAG", "SCRIPT", "STYLE", "ATTVALUE"
	};

	public static final String[] ruleNames = {
		"TEMPLATE_TAG_OPEN", "TEMPLATE_VARIABLE_OPEN", "TEMPLATE_COMMENT_OPEN", 
		"HTML_COMMENT", "HTML_CONDITIONAL_COMMENT", "XML_DECLARATION", "CDATA", 
		"DTD", "SCRIPTLET", "SEA_WS", "SCRIPT_OPEN", "STYLE_OPEN", "TAG_OPEN", 
		"HTML_TEXT", "TEMPLATE_TAG_CLOSE", "TEMPLATE_CONTENT", "TEMPLATE_WS", 
		"TAG_CLOSE", "TAG_SLASH_CLOSE", "TAG_SLASH", "TAG_EQUALS", "TAG_NAME", 
		"TAG_WHITESPACE", "HEXDIGIT", "DIGIT", "TAG_NameChar", "TAG_NameStartChar", 
		"SCRIPT_BODY", "SCRIPT_SHORT_BODY", "STYLE_BODY", "STYLE_SHORT_BODY", 
		"ATTVALUE_VALUE", "ATTRIBUTE", "ATTCHAR", "ATTCHARS", "HEXCHARS", "DECCHARS", 
		"DOUBLE_QUOTE_STRING", "SINGLE_QUOTE_STRING"
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


	public HTMLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "HTMLLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\37\u01b2\b\1\b\1"+
		"\b\1\b\1\b\1\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t"+
		"\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20"+
		"\t\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27"+
		"\t\27\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36"+
		"\t\36\4\37\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4"+
		"(\t(\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\7\5l\n\5\f\5\16\5o\13\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6"+
		"\3\6\3\6\7\6z\n\6\f\6\16\6}\13\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\7\7\u0089\n\7\f\7\16\7\u008c\13\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\7\b\u009b\n\b\f\b\16\b\u009e\13\b\3\b\3\b\3\b\3\b\3"+
		"\t\3\t\3\t\3\t\7\t\u00a8\n\t\f\t\16\t\u00ab\13\t\3\t\3\t\3\n\3\n\3\n\3"+
		"\n\7\n\u00b3\n\n\f\n\16\n\u00b6\13\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00be"+
		"\n\n\f\n\16\n\u00c1\13\n\3\n\3\n\5\n\u00c5\n\n\3\13\3\13\5\13\u00c9\n"+
		"\13\3\13\6\13\u00cc\n\13\r\13\16\13\u00cd\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\17\5\17\u00ea\n\17\3\17\5\17\u00ed\n\17\3\17\6\17\u00f0\n\17\r"+
		"\17\16\17\u00f1\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00fa\n\20\3\20\3\20"+
		"\3\21\6\21\u00ff\n\21\r\21\16\21\u0100\3\21\6\21\u0104\n\21\r\21\16\21"+
		"\u0105\3\21\6\21\u0109\n\21\r\21\16\21\u010a\3\21\3\21\5\21\u010f\n\21"+
		"\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25"+
		"\3\25\3\26\3\26\3\26\3\26\3\27\3\27\7\27\u0126\n\27\f\27\16\27\u0129\13"+
		"\27\3\30\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\33\5\33\u0137"+
		"\n\33\3\34\5\34\u013a\n\34\3\35\7\35\u013d\n\35\f\35\16\35\u0140\13\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\7\36"+
		"\u014f\n\36\f\36\16\36\u0152\13\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37"+
		"\7\37\u015b\n\37\f\37\16\37\u015e\13\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3 \7 \u016c\n \f \16 \u016f\13 \3 \3 \3 \3 "+
		"\3 \3 \3!\7!\u0178\n!\f!\16!\u017b\13!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\""+
		"\5\"\u0186\n\"\3#\5#\u0189\n#\3$\6$\u018c\n$\r$\16$\u018d\3$\5$\u0191"+
		"\n$\3%\3%\6%\u0195\n%\r%\16%\u0196\3&\6&\u019a\n&\r&\16&\u019b\3&\5&\u019f"+
		"\n&\3\'\3\'\7\'\u01a3\n\'\f\'\16\'\u01a6\13\'\3\'\3\'\3(\3(\7(\u01ac\n"+
		"(\f(\16(\u01af\13(\3(\3(\rm{\u008a\u009c\u00a9\u00b4\u00bf\u013e\u0150"+
		"\u015c\u016d\2)\b\3\n\4\f\5\16\6\20\7\22\b\24\t\26\n\30\13\32\f\34\r\36"+
		"\16 \17\"\20$\21&\22(\23*\24,\25.\26\60\27\62\30\64\31\66\28\2:\2<\2>"+
		"\32@\33B\34D\35F\36H\37J\2L\2N\2P\2R\2T\2\b\2\3\4\5\6\7\22\4\2\13\13\""+
		"\"\4\2>>}}\3\2}}\6\2%%\'\'>>}}\7\2\13\f\17\17\"\"\'\'\177\177\3\2\177"+
		"\177\5\2\13\f\17\17\"\"\5\2\62;CHch\3\2\62;\4\2/\60aa\5\2\u00b9\u00b9"+
		"\u0302\u0371\u2041\u2042\n\2<<C\\c|\u2072\u2191\u2c02\u2ff1\u3003\ud801"+
		"\uf902\ufdd1\ufdf2\uffff\3\2\"\"\t\2%%-=??AAC\\aac|\4\2$$>>\4\2))>>\2"+
		"\u01ca\2\b\3\2\2\2\2\n\3\2\2\2\2\f\3\2\2\2\2\16\3\2\2\2\2\20\3\2\2\2\2"+
		"\22\3\2\2\2\2\24\3\2\2\2\2\26\3\2\2\2\2\30\3\2\2\2\2\32\3\2\2\2\2\34\3"+
		"\2\2\2\2\36\3\2\2\2\2 \3\2\2\2\2\"\3\2\2\2\3$\3\2\2\2\3&\3\2\2\2\3(\3"+
		"\2\2\2\4*\3\2\2\2\4,\3\2\2\2\4.\3\2\2\2\4\60\3\2\2\2\4\62\3\2\2\2\4\64"+
		"\3\2\2\2\5>\3\2\2\2\5@\3\2\2\2\6B\3\2\2\2\6D\3\2\2\2\7F\3\2\2\2\7H\3\2"+
		"\2\2\bV\3\2\2\2\n[\3\2\2\2\f`\3\2\2\2\16e\3\2\2\2\20t\3\2\2\2\22\u0081"+
		"\3\2\2\2\24\u008f\3\2\2\2\26\u00a3\3\2\2\2\30\u00c4\3\2\2\2\32\u00cb\3"+
		"\2\2\2\34\u00cf\3\2\2\2\36\u00da\3\2\2\2 \u00e4\3\2\2\2\"\u00e9\3\2\2"+
		"\2$\u00f9\3\2\2\2&\u010e\3\2\2\2(\u0110\3\2\2\2*\u0114\3\2\2\2,\u0118"+
		"\3\2\2\2.\u011d\3\2\2\2\60\u011f\3\2\2\2\62\u0123\3\2\2\2\64\u012a\3\2"+
		"\2\2\66\u012e\3\2\2\28\u0130\3\2\2\2:\u0136\3\2\2\2<\u0139\3\2\2\2>\u013e"+
		"\3\2\2\2@\u0150\3\2\2\2B\u015c\3\2\2\2D\u016d\3\2\2\2F\u0179\3\2\2\2H"+
		"\u0185\3\2\2\2J\u0188\3\2\2\2L\u018b\3\2\2\2N\u0192\3\2\2\2P\u0199\3\2"+
		"\2\2R\u01a0\3\2\2\2T\u01a9\3\2\2\2VW\7}\2\2WX\7\'\2\2XY\3\2\2\2YZ\b\2"+
		"\2\2Z\t\3\2\2\2[\\\7}\2\2\\]\7}\2\2]^\3\2\2\2^_\b\3\2\2_\13\3\2\2\2`a"+
		"\7}\2\2ab\7%\2\2bc\3\2\2\2cd\b\4\2\2d\r\3\2\2\2ef\7>\2\2fg\7#\2\2gh\7"+
		"/\2\2hi\7/\2\2im\3\2\2\2jl\13\2\2\2kj\3\2\2\2lo\3\2\2\2mn\3\2\2\2mk\3"+
		"\2\2\2np\3\2\2\2om\3\2\2\2pq\7/\2\2qr\7/\2\2rs\7@\2\2s\17\3\2\2\2tu\7"+
		">\2\2uv\7#\2\2vw\7]\2\2w{\3\2\2\2xz\13\2\2\2yx\3\2\2\2z}\3\2\2\2{|\3\2"+
		"\2\2{y\3\2\2\2|~\3\2\2\2}{\3\2\2\2~\177\7_\2\2\177\u0080\7@\2\2\u0080"+
		"\21\3\2\2\2\u0081\u0082\7>\2\2\u0082\u0083\7A\2\2\u0083\u0084\7z\2\2\u0084"+
		"\u0085\7o\2\2\u0085\u0086\7n\2\2\u0086\u008a\3\2\2\2\u0087\u0089\13\2"+
		"\2\2\u0088\u0087\3\2\2\2\u0089\u008c\3\2\2\2\u008a\u008b\3\2\2\2\u008a"+
		"\u0088\3\2\2\2\u008b\u008d\3\2\2\2\u008c\u008a\3\2\2\2\u008d\u008e\7@"+
		"\2\2\u008e\23\3\2\2\2\u008f\u0090\7>\2\2\u0090\u0091\7#\2\2\u0091\u0092"+
		"\7]\2\2\u0092\u0093\7E\2\2\u0093\u0094\7F\2\2\u0094\u0095\7C\2\2\u0095"+
		"\u0096\7V\2\2\u0096\u0097\7C\2\2\u0097\u0098\7]\2\2\u0098\u009c\3\2\2"+
		"\2\u0099\u009b\13\2\2\2\u009a\u0099\3\2\2\2\u009b\u009e\3\2\2\2\u009c"+
		"\u009d\3\2\2\2\u009c\u009a\3\2\2\2\u009d\u009f\3\2\2\2\u009e\u009c\3\2"+
		"\2\2\u009f\u00a0\7_\2\2\u00a0\u00a1\7_\2\2\u00a1\u00a2\7@\2\2\u00a2\25"+
		"\3\2\2\2\u00a3\u00a4\7>\2\2\u00a4\u00a5\7#\2\2\u00a5\u00a9\3\2\2\2\u00a6"+
		"\u00a8\13\2\2\2\u00a7\u00a6\3\2\2\2\u00a8\u00ab\3\2\2\2\u00a9\u00aa\3"+
		"\2\2\2\u00a9\u00a7\3\2\2\2\u00aa\u00ac\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ac"+
		"\u00ad\7@\2\2\u00ad\27\3\2\2\2\u00ae\u00af\7>\2\2\u00af\u00b0\7A\2\2\u00b0"+
		"\u00b4\3\2\2\2\u00b1\u00b3\13\2\2\2\u00b2\u00b1\3\2\2\2\u00b3\u00b6\3"+
		"\2\2\2\u00b4\u00b5\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b5\u00b7\3\2\2\2\u00b6"+
		"\u00b4\3\2\2\2\u00b7\u00b8\7A\2\2\u00b8\u00c5\7@\2\2\u00b9\u00ba\7>\2"+
		"\2\u00ba\u00bb\7\'\2\2\u00bb\u00bf\3\2\2\2\u00bc\u00be\13\2\2\2\u00bd"+
		"\u00bc\3\2\2\2\u00be\u00c1\3\2\2\2\u00bf\u00c0\3\2\2\2\u00bf\u00bd\3\2"+
		"\2\2\u00c0\u00c2\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c2\u00c3\7\'\2\2\u00c3"+
		"\u00c5\7@\2\2\u00c4\u00ae\3\2\2\2\u00c4\u00b9\3\2\2\2\u00c5\31\3\2\2\2"+
		"\u00c6\u00cc\t\2\2\2\u00c7\u00c9\7\17\2\2\u00c8\u00c7\3\2\2\2\u00c8\u00c9"+
		"\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cc\7\f\2\2\u00cb\u00c6\3\2\2\2\u00cb"+
		"\u00c8\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00cb\3\2\2\2\u00cd\u00ce\3\2"+
		"\2\2\u00ce\33\3\2\2\2\u00cf\u00d0\7>\2\2\u00d0\u00d1\7u\2\2\u00d1\u00d2"+
		"\7e\2\2\u00d2\u00d3\7t\2\2\u00d3\u00d4\7k\2\2\u00d4\u00d5\7r\2\2\u00d5"+
		"\u00d6\7v\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d8\b\f\3\2\u00d8\u00d9\b\f"+
		"\4\2\u00d9\35\3\2\2\2\u00da\u00db\7>\2\2\u00db\u00dc\7u\2\2\u00dc\u00dd"+
		"\7v\2\2\u00dd\u00de\7{\2\2\u00de\u00df\7n\2\2\u00df\u00e0\7g\2\2\u00e0"+
		"\u00e1\3\2\2\2\u00e1\u00e2\b\r\5\2\u00e2\u00e3\b\r\4\2\u00e3\37\3\2\2"+
		"\2\u00e4\u00e5\7>\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e7\b\16\4\2\u00e7!"+
		"\3\2\2\2\u00e8\u00ea\n\3\2\2\u00e9\u00e8\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea"+
		"\u00ec\3\2\2\2\u00eb\u00ed\t\4\2\2\u00ec\u00eb\3\2\2\2\u00ec\u00ed\3\2"+
		"\2\2\u00ed\u00ef\3\2\2\2\u00ee\u00f0\n\5\2\2\u00ef\u00ee\3\2\2\2\u00f0"+
		"\u00f1\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2#\3\2\2\2"+
		"\u00f3\u00f4\7\'\2\2\u00f4\u00fa\7\177\2\2\u00f5\u00f6\7\177\2\2\u00f6"+
		"\u00fa\7\177\2\2\u00f7\u00f8\7%\2\2\u00f8\u00fa\7\177\2\2\u00f9\u00f3"+
		"\3\2\2\2\u00f9\u00f5\3\2\2\2\u00f9\u00f7\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb"+
		"\u00fc\b\20\6\2\u00fc%\3\2\2\2\u00fd\u00ff\n\6\2\2\u00fe\u00fd\3\2\2\2"+
		"\u00ff\u0100\3\2\2\2\u0100\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u010f"+
		"\3\2\2\2\u0102\u0104\n\6\2\2\u0103\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105"+
		"\u0103\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0108\3\2\2\2\u0107\u0109\7\'"+
		"\2\2\u0108\u0107\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u0108\3\2\2\2\u010a"+
		"\u010b\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u010d\n\7\2\2\u010d\u010f\n\6"+
		"\2\2\u010e\u00fe\3\2\2\2\u010e\u0103\3\2\2\2\u010f\'\3\2\2\2\u0110\u0111"+
		"\t\b\2\2\u0111\u0112\3\2\2\2\u0112\u0113\b\22\7\2\u0113)\3\2\2\2\u0114"+
		"\u0115\7@\2\2\u0115\u0116\3\2\2\2\u0116\u0117\b\23\6\2\u0117+\3\2\2\2"+
		"\u0118\u0119\7\61\2\2\u0119\u011a\7@\2\2\u011a\u011b\3\2\2\2\u011b\u011c"+
		"\b\24\6\2\u011c-\3\2\2\2\u011d\u011e\7\61\2\2\u011e/\3\2\2\2\u011f\u0120"+
		"\7?\2\2\u0120\u0121\3\2\2\2\u0121\u0122\b\26\b\2\u0122\61\3\2\2\2\u0123"+
		"\u0127\5<\34\2\u0124\u0126\5:\33\2\u0125\u0124\3\2\2\2\u0126\u0129\3\2"+
		"\2\2\u0127\u0125\3\2\2\2\u0127\u0128\3\2\2\2\u0128\63\3\2\2\2\u0129\u0127"+
		"\3\2\2\2\u012a\u012b\t\b\2\2\u012b\u012c\3\2\2\2\u012c\u012d\b\30\7\2"+
		"\u012d\65\3\2\2\2\u012e\u012f\t\t\2\2\u012f\67\3\2\2\2\u0130\u0131\t\n"+
		"\2\2\u01319\3\2\2\2\u0132\u0137\5<\34\2\u0133\u0137\t\13\2\2\u0134\u0137"+
		"\58\32\2\u0135\u0137\t\f\2\2\u0136\u0132\3\2\2\2\u0136\u0133\3\2\2\2\u0136"+
		"\u0134\3\2\2\2\u0136\u0135\3\2\2\2\u0137;\3\2\2\2\u0138\u013a\t\r\2\2"+
		"\u0139\u0138\3\2\2\2\u013a=\3\2\2\2\u013b\u013d\13\2\2\2\u013c\u013b\3"+
		"\2\2\2\u013d\u0140\3\2\2\2\u013e\u013f\3\2\2\2\u013e\u013c\3\2\2\2\u013f"+
		"\u0141\3\2\2\2\u0140\u013e\3\2\2\2\u0141\u0142\7>\2\2\u0142\u0143\7\61"+
		"\2\2\u0143\u0144\7u\2\2\u0144\u0145\7e\2\2\u0145\u0146\7t\2\2\u0146\u0147"+
		"\7k\2\2\u0147\u0148\7r\2\2\u0148\u0149\7v\2\2\u0149\u014a\7@\2\2\u014a"+
		"\u014b\3\2\2\2\u014b\u014c\b\35\6\2\u014c?\3\2\2\2\u014d\u014f\13\2\2"+
		"\2\u014e\u014d\3\2\2\2\u014f\u0152\3\2\2\2\u0150\u0151\3\2\2\2\u0150\u014e"+
		"\3\2\2\2\u0151\u0153\3\2\2\2\u0152\u0150\3\2\2\2\u0153\u0154\7>\2\2\u0154"+
		"\u0155\7\61\2\2\u0155\u0156\7@\2\2\u0156\u0157\3\2\2\2\u0157\u0158\b\36"+
		"\6\2\u0158A\3\2\2\2\u0159\u015b\13\2\2\2\u015a\u0159\3\2\2\2\u015b\u015e"+
		"\3\2\2\2\u015c\u015d\3\2\2\2\u015c\u015a\3\2\2\2\u015d\u015f\3\2\2\2\u015e"+
		"\u015c\3\2\2\2\u015f\u0160\7>\2\2\u0160\u0161\7\61\2\2\u0161\u0162\7u"+
		"\2\2\u0162\u0163\7v\2\2\u0163\u0164\7{\2\2\u0164\u0165\7n\2\2\u0165\u0166"+
		"\7g\2\2\u0166\u0167\7@\2\2\u0167\u0168\3\2\2\2\u0168\u0169\b\37\6\2\u0169"+
		"C\3\2\2\2\u016a\u016c\13\2\2\2\u016b\u016a\3\2\2\2\u016c\u016f\3\2\2\2"+
		"\u016d\u016e\3\2\2\2\u016d\u016b\3\2\2\2\u016e\u0170\3\2\2\2\u016f\u016d"+
		"\3\2\2\2\u0170\u0171\7>\2\2\u0171\u0172\7\61\2\2\u0172\u0173\7@\2\2\u0173"+
		"\u0174\3\2\2\2\u0174\u0175\b \6\2\u0175E\3\2\2\2\u0176\u0178\t\16\2\2"+
		"\u0177\u0176\3\2\2\2\u0178\u017b\3\2\2\2\u0179\u0177\3\2\2\2\u0179\u017a"+
		"\3\2\2\2\u017a\u017c\3\2\2\2\u017b\u0179\3\2\2\2\u017c\u017d\5H\"\2\u017d"+
		"\u017e\3\2\2\2\u017e\u017f\b!\6\2\u017fG\3\2\2\2\u0180\u0186\5R\'\2\u0181"+
		"\u0186\5T(\2\u0182\u0186\5L$\2\u0183\u0186\5N%\2\u0184\u0186\5P&\2\u0185"+
		"\u0180\3\2\2\2\u0185\u0181\3\2\2\2\u0185\u0182\3\2\2\2\u0185\u0183\3\2"+
		"\2\2\u0185\u0184\3\2\2\2\u0186I\3\2\2\2\u0187\u0189\t\17\2\2\u0188\u0187"+
		"\3\2\2\2\u0189K\3\2\2\2\u018a\u018c\5J#\2\u018b\u018a\3\2\2\2\u018c\u018d"+
		"\3\2\2\2\u018d\u018b\3\2\2\2\u018d\u018e\3\2\2\2\u018e\u0190\3\2\2\2\u018f"+
		"\u0191\7\"\2\2\u0190\u018f\3\2\2\2\u0190\u0191\3\2\2\2\u0191M\3\2\2\2"+
		"\u0192\u0194\7%\2\2\u0193\u0195\t\t\2\2\u0194\u0193\3\2\2\2\u0195\u0196"+
		"\3\2\2\2\u0196\u0194\3\2\2\2\u0196\u0197\3\2\2\2\u0197O\3\2\2\2\u0198"+
		"\u019a\t\n\2\2\u0199\u0198\3\2\2\2\u019a\u019b\3\2\2\2\u019b\u0199\3\2"+
		"\2\2\u019b\u019c\3\2\2\2\u019c\u019e\3\2\2\2\u019d\u019f\7\'\2\2\u019e"+
		"\u019d\3\2\2\2\u019e\u019f\3\2\2\2\u019fQ\3\2\2\2\u01a0\u01a4\7$\2\2\u01a1"+
		"\u01a3\n\20\2\2\u01a2\u01a1\3\2\2\2\u01a3\u01a6\3\2\2\2\u01a4\u01a2\3"+
		"\2\2\2\u01a4\u01a5\3\2\2\2\u01a5\u01a7\3\2\2\2\u01a6\u01a4\3\2\2\2\u01a7"+
		"\u01a8\7$\2\2\u01a8S\3\2\2\2\u01a9\u01ad\7)\2\2\u01aa\u01ac\n\21\2\2\u01ab"+
		"\u01aa\3\2\2\2\u01ac\u01af\3\2\2\2\u01ad\u01ab\3\2\2\2\u01ad\u01ae\3\2"+
		"\2\2\u01ae\u01b0\3\2\2\2\u01af\u01ad\3\2\2\2\u01b0\u01b1\7)\2\2\u01b1"+
		"U\3\2\2\2,\2\3\4\5\6\7m{\u008a\u009c\u00a9\u00b4\u00bf\u00c4\u00c8\u00cb"+
		"\u00cd\u00e9\u00ec\u00f1\u00f9\u0100\u0105\u010a\u010e\u0127\u0136\u0139"+
		"\u013e\u0150\u015c\u016d\u0179\u0185\u0188\u018d\u0190\u0196\u019b\u019e"+
		"\u01a4\u01ad\t\7\3\2\7\5\2\7\4\2\7\6\2\6\2\2\b\2\2\7\7\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}