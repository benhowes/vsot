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
		HTML_COMMENT=1, HTML_CONDITIONAL_COMMENT=2, XML_DECLARATION=3, CDATA=4, 
		DTD=5, SCRIPTLET=6, SEA_WS=7, SCRIPT_OPEN=8, STYLE_OPEN=9, TAG_OPEN=10, 
		HTML_TEXT=11, TAG_CLOSE=12, TAG_SLASH_CLOSE=13, TAG_SLASH=14, TAG_EQUALS=15, 
		TAG_NAME=16, TAG_WHITESPACE=17, SCRIPT_OPEN_TAG_CLOSE=18, SCRIPT_BODY=19, 
		SCRIPT_SHORT_BODY=20, STYLE_BODY=21, STYLE_SHORT_BODY=22, ATTVALUE_VALUE=23, 
		ATTRIBUTE=24;
	public static final int
		TAG=1, SCRIPT_OPEN_MODE=2, SCRIPT=3, STYLE=4, ATTVALUE=5;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE", "TAG", "SCRIPT_OPEN_MODE", "SCRIPT", "STYLE", "ATTVALUE"
	};

	public static final String[] ruleNames = {
		"HTML_COMMENT", "HTML_CONDITIONAL_COMMENT", "XML_DECLARATION", "CDATA", 
		"DTD", "SCRIPTLET", "SEA_WS", "SCRIPT_OPEN", "STYLE_OPEN", "TAG_OPEN", 
		"HTML_TEXT", "TAG_CLOSE", "TAG_SLASH_CLOSE", "TAG_SLASH", "TAG_EQUALS", 
		"TAG_NAME", "TAG_WHITESPACE", "HEXDIGIT", "DIGIT", "TAG_NameChar", "TAG_NameStartChar", 
		"SCRIPT_OPEN_TAG_CLOSE", "SCRIPT_BODY", "SCRIPT_SHORT_BODY", "STYLE_BODY", 
		"STYLE_SHORT_BODY", "ATTVALUE_VALUE", "ATTRIBUTE", "ATTCHAR", "ATTCHARS", 
		"HEXCHARS", "DECCHARS", "DOUBLE_QUOTE_STRING", "SINGLE_QUOTE_STRING"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, "'<script'", null, "'<'", 
		null, null, "'/>'", "'/'", "'='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "HTML_COMMENT", "HTML_CONDITIONAL_COMMENT", "XML_DECLARATION", "CDATA", 
		"DTD", "SCRIPTLET", "SEA_WS", "SCRIPT_OPEN", "STYLE_OPEN", "TAG_OPEN", 
		"HTML_TEXT", "TAG_CLOSE", "TAG_SLASH_CLOSE", "TAG_SLASH", "TAG_EQUALS", 
		"TAG_NAME", "TAG_WHITESPACE", "SCRIPT_OPEN_TAG_CLOSE", "SCRIPT_BODY", 
		"SCRIPT_SHORT_BODY", "STYLE_BODY", "STYLE_SHORT_BODY", "ATTVALUE_VALUE", 
		"ATTRIBUTE"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\32\u017e\b\1\b\1"+
		"\b\1\b\1\b\1\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t"+
		"\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20"+
		"\t\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27"+
		"\t\27\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36"+
		"\t\36\4\37\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\3\2\3\2\3\2\3\2\3\2\3\2\7\2"+
		"S\n\2\f\2\16\2V\13\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\7\3a\n\3\f\3"+
		"\16\3d\13\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4p\n\4\f\4\16\4"+
		"s\13\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5\u0082\n"+
		"\5\f\5\16\5\u0085\13\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\7\6\u008f\n\6\f"+
		"\6\16\6\u0092\13\6\3\6\3\6\3\7\3\7\3\7\3\7\7\7\u009a\n\7\f\7\16\7\u009d"+
		"\13\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u00a5\n\7\f\7\16\7\u00a8\13\7\3\7\3"+
		"\7\5\7\u00ac\n\7\3\b\3\b\5\b\u00b0\n\b\3\b\6\b\u00b3\n\b\r\b\16\b\u00b4"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\7\n\u00c9\n\n\f\n\16\n\u00cc\13\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3"+
		"\13\3\f\6\f\u00d7\n\f\r\f\16\f\u00d8\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3"+
		"\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\7\21\u00ec\n\21\f\21"+
		"\16\21\u00ef\13\21\3\22\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3"+
		"\25\3\25\5\25\u00fd\n\25\3\26\5\26\u0100\n\26\3\27\3\27\3\27\3\27\3\30"+
		"\7\30\u0107\n\30\f\30\16\30\u010a\13\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\7\31\u011a\n\31\f\31\16\31\u011d"+
		"\13\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\7\32\u0127\n\32\f\32\16"+
		"\32\u012a\13\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\33\7\33\u0138\n\33\f\33\16\33\u013b\13\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\34\7\34\u0144\n\34\f\34\16\34\u0147\13\34\3\34\3\34\3\34\3\34"+
		"\3\35\3\35\3\35\3\35\3\35\5\35\u0152\n\35\3\36\5\36\u0155\n\36\3\37\6"+
		"\37\u0158\n\37\r\37\16\37\u0159\3\37\5\37\u015d\n\37\3 \3 \6 \u0161\n"+
		" \r \16 \u0162\3!\6!\u0166\n!\r!\16!\u0167\3!\5!\u016b\n!\3\"\3\"\7\""+
		"\u016f\n\"\f\"\16\"\u0172\13\"\3\"\3\"\3#\3#\7#\u0178\n#\f#\16#\u017b"+
		"\13#\3#\3#\16Tbq\u0083\u0090\u009b\u00a6\u00ca\u0108\u011b\u0128\u0139"+
		"\2$\b\3\n\4\f\5\16\6\20\7\22\b\24\t\26\n\30\13\32\f\34\r\36\16 \17\"\20"+
		"$\21&\22(\23*\2,\2.\2\60\2\62\24\64\25\66\268\27:\30<\31>\32@\2B\2D\2"+
		"F\2H\2J\2\b\2\3\4\5\6\7\16\4\2\13\13\"\"\3\2>>\5\2\13\f\17\17\"\"\5\2"+
		"\62;CHch\3\2\62;\4\2/\60aa\5\2\u00b9\u00b9\u0302\u0371\u2041\u2042\n\2"+
		"<<C\\c|\u2072\u2191\u2c02\u2ff1\u3003\ud801\uf902\ufdd1\ufdf2\uffff\3"+
		"\2\"\"\t\2%%-=??AAC\\aac|\4\2$$>>\4\2))>>\2\u018f\2\b\3\2\2\2\2\n\3\2"+
		"\2\2\2\f\3\2\2\2\2\16\3\2\2\2\2\20\3\2\2\2\2\22\3\2\2\2\2\24\3\2\2\2\2"+
		"\26\3\2\2\2\2\30\3\2\2\2\2\32\3\2\2\2\2\34\3\2\2\2\3\36\3\2\2\2\3 \3\2"+
		"\2\2\3\"\3\2\2\2\3$\3\2\2\2\3&\3\2\2\2\3(\3\2\2\2\4\62\3\2\2\2\5\64\3"+
		"\2\2\2\5\66\3\2\2\2\68\3\2\2\2\6:\3\2\2\2\7<\3\2\2\2\7>\3\2\2\2\bL\3\2"+
		"\2\2\n[\3\2\2\2\fh\3\2\2\2\16v\3\2\2\2\20\u008a\3\2\2\2\22\u00ab\3\2\2"+
		"\2\24\u00b2\3\2\2\2\26\u00b6\3\2\2\2\30\u00c0\3\2\2\2\32\u00d1\3\2\2\2"+
		"\34\u00d6\3\2\2\2\36\u00da\3\2\2\2 \u00de\3\2\2\2\"\u00e3\3\2\2\2$\u00e5"+
		"\3\2\2\2&\u00e9\3\2\2\2(\u00f0\3\2\2\2*\u00f4\3\2\2\2,\u00f6\3\2\2\2."+
		"\u00fc\3\2\2\2\60\u00ff\3\2\2\2\62\u0101\3\2\2\2\64\u0108\3\2\2\2\66\u011b"+
		"\3\2\2\28\u0128\3\2\2\2:\u0139\3\2\2\2<\u0145\3\2\2\2>\u0151\3\2\2\2@"+
		"\u0154\3\2\2\2B\u0157\3\2\2\2D\u015e\3\2\2\2F\u0165\3\2\2\2H\u016c\3\2"+
		"\2\2J\u0175\3\2\2\2LM\7>\2\2MN\7#\2\2NO\7/\2\2OP\7/\2\2PT\3\2\2\2QS\13"+
		"\2\2\2RQ\3\2\2\2SV\3\2\2\2TU\3\2\2\2TR\3\2\2\2UW\3\2\2\2VT\3\2\2\2WX\7"+
		"/\2\2XY\7/\2\2YZ\7@\2\2Z\t\3\2\2\2[\\\7>\2\2\\]\7#\2\2]^\7]\2\2^b\3\2"+
		"\2\2_a\13\2\2\2`_\3\2\2\2ad\3\2\2\2bc\3\2\2\2b`\3\2\2\2ce\3\2\2\2db\3"+
		"\2\2\2ef\7_\2\2fg\7@\2\2g\13\3\2\2\2hi\7>\2\2ij\7A\2\2jk\7z\2\2kl\7o\2"+
		"\2lm\7n\2\2mq\3\2\2\2np\13\2\2\2on\3\2\2\2ps\3\2\2\2qr\3\2\2\2qo\3\2\2"+
		"\2rt\3\2\2\2sq\3\2\2\2tu\7@\2\2u\r\3\2\2\2vw\7>\2\2wx\7#\2\2xy\7]\2\2"+
		"yz\7E\2\2z{\7F\2\2{|\7C\2\2|}\7V\2\2}~\7C\2\2~\177\7]\2\2\177\u0083\3"+
		"\2\2\2\u0080\u0082\13\2\2\2\u0081\u0080\3\2\2\2\u0082\u0085\3\2\2\2\u0083"+
		"\u0084\3\2\2\2\u0083\u0081\3\2\2\2\u0084\u0086\3\2\2\2\u0085\u0083\3\2"+
		"\2\2\u0086\u0087\7_\2\2\u0087\u0088\7_\2\2\u0088\u0089\7@\2\2\u0089\17"+
		"\3\2\2\2\u008a\u008b\7>\2\2\u008b\u008c\7#\2\2\u008c\u0090\3\2\2\2\u008d"+
		"\u008f\13\2\2\2\u008e\u008d\3\2\2\2\u008f\u0092\3\2\2\2\u0090\u0091\3"+
		"\2\2\2\u0090\u008e\3\2\2\2\u0091\u0093\3\2\2\2\u0092\u0090\3\2\2\2\u0093"+
		"\u0094\7@\2\2\u0094\21\3\2\2\2\u0095\u0096\7>\2\2\u0096\u0097\7A\2\2\u0097"+
		"\u009b\3\2\2\2\u0098\u009a\13\2\2\2\u0099\u0098\3\2\2\2\u009a\u009d\3"+
		"\2\2\2\u009b\u009c\3\2\2\2\u009b\u0099\3\2\2\2\u009c\u009e\3\2\2\2\u009d"+
		"\u009b\3\2\2\2\u009e\u009f\7A\2\2\u009f\u00ac\7@\2\2\u00a0\u00a1\7>\2"+
		"\2\u00a1\u00a2\7\'\2\2\u00a2\u00a6\3\2\2\2\u00a3\u00a5\13\2\2\2\u00a4"+
		"\u00a3\3\2\2\2\u00a5\u00a8\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a6\u00a4\3\2"+
		"\2\2\u00a7\u00a9\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a9\u00aa\7\'\2\2\u00aa"+
		"\u00ac\7@\2\2\u00ab\u0095\3\2\2\2\u00ab\u00a0\3\2\2\2\u00ac\23\3\2\2\2"+
		"\u00ad\u00b3\t\2\2\2\u00ae\u00b0\7\17\2\2\u00af\u00ae\3\2\2\2\u00af\u00b0"+
		"\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b3\7\f\2\2\u00b2\u00ad\3\2\2\2\u00b2"+
		"\u00af\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b5\3\2"+
		"\2\2\u00b5\25\3\2\2\2\u00b6\u00b7\7>\2\2\u00b7\u00b8\7u\2\2\u00b8\u00b9"+
		"\7e\2\2\u00b9\u00ba\7t\2\2\u00ba\u00bb\7k\2\2\u00bb\u00bc\7r\2\2\u00bc"+
		"\u00bd\7v\2\2\u00bd\u00be\3\2\2\2\u00be\u00bf\b\t\2\2\u00bf\27\3\2\2\2"+
		"\u00c0\u00c1\7>\2\2\u00c1\u00c2\7u\2\2\u00c2\u00c3\7v\2\2\u00c3\u00c4"+
		"\7{\2\2\u00c4\u00c5\7n\2\2\u00c5\u00c6\7g\2\2\u00c6\u00ca\3\2\2\2\u00c7"+
		"\u00c9\13\2\2\2\u00c8\u00c7\3\2\2\2\u00c9\u00cc\3\2\2\2\u00ca\u00cb\3"+
		"\2\2\2\u00ca\u00c8\3\2\2\2\u00cb\u00cd\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cd"+
		"\u00ce\7@\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d0\b\n\3\2\u00d0\31\3\2\2\2"+
		"\u00d1\u00d2\7>\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d4\b\13\4\2\u00d4\33"+
		"\3\2\2\2\u00d5\u00d7\n\3\2\2\u00d6\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8"+
		"\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\35\3\2\2\2\u00da\u00db\7@\2\2"+
		"\u00db\u00dc\3\2\2\2\u00dc\u00dd\b\r\5\2\u00dd\37\3\2\2\2\u00de\u00df"+
		"\7\61\2\2\u00df\u00e0\7@\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e2\b\16\5\2"+
		"\u00e2!\3\2\2\2\u00e3\u00e4\7\61\2\2\u00e4#\3\2\2\2\u00e5\u00e6\7?\2\2"+
		"\u00e6\u00e7\3\2\2\2\u00e7\u00e8\b\20\6\2\u00e8%\3\2\2\2\u00e9\u00ed\5"+
		"\60\26\2\u00ea\u00ec\5.\25\2\u00eb\u00ea\3\2\2\2\u00ec\u00ef\3\2\2\2\u00ed"+
		"\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\'\3\2\2\2\u00ef\u00ed\3\2\2\2"+
		"\u00f0\u00f1\t\4\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f3\b\22\7\2\u00f3)\3"+
		"\2\2\2\u00f4\u00f5\t\5\2\2\u00f5+\3\2\2\2\u00f6\u00f7\t\6\2\2\u00f7-\3"+
		"\2\2\2\u00f8\u00fd\5\60\26\2\u00f9\u00fd\t\7\2\2\u00fa\u00fd\5,\24\2\u00fb"+
		"\u00fd\t\b\2\2\u00fc\u00f8\3\2\2\2\u00fc\u00f9\3\2\2\2\u00fc\u00fa\3\2"+
		"\2\2\u00fc\u00fb\3\2\2\2\u00fd/\3\2\2\2\u00fe\u0100\t\t\2\2\u00ff\u00fe"+
		"\3\2\2\2\u0100\61\3\2\2\2\u0101\u0102\7@\2\2\u0102\u0103\3\2\2\2\u0103"+
		"\u0104\b\27\b\2\u0104\63\3\2\2\2\u0105\u0107\13\2\2\2\u0106\u0105\3\2"+
		"\2\2\u0107\u010a\3\2\2\2\u0108\u0109\3\2\2\2\u0108\u0106\3\2\2\2\u0109"+
		"\u010b\3\2\2\2\u010a\u0108\3\2\2\2\u010b\u010c\7>\2\2\u010c\u010d\7\61"+
		"\2\2\u010d\u010e\7u\2\2\u010e\u010f\7e\2\2\u010f\u0110\7t\2\2\u0110\u0111"+
		"\7k\2\2\u0111\u0112\7r\2\2\u0112\u0113\7v\2\2\u0113\u0114\7@\2\2\u0114"+
		"\u0115\3\2\2\2\u0115\u0116\b\30\5\2\u0116\u0117\b\30\5\2\u0117\65\3\2"+
		"\2\2\u0118\u011a\13\2\2\2\u0119\u0118\3\2\2\2\u011a\u011d\3\2\2\2\u011b"+
		"\u011c\3\2\2\2\u011b\u0119\3\2\2\2\u011c\u011e\3\2\2\2\u011d\u011b\3\2"+
		"\2\2\u011e\u011f\7>\2\2\u011f\u0120\7\61\2\2\u0120\u0121\7@\2\2\u0121"+
		"\u0122\3\2\2\2\u0122\u0123\b\31\5\2\u0123\u0124\b\31\5\2\u0124\67\3\2"+
		"\2\2\u0125\u0127\13\2\2\2\u0126\u0125\3\2\2\2\u0127\u012a\3\2\2\2\u0128"+
		"\u0129\3\2\2\2\u0128\u0126\3\2\2\2\u0129\u012b\3\2\2\2\u012a\u0128\3\2"+
		"\2\2\u012b\u012c\7>\2\2\u012c\u012d\7\61\2\2\u012d\u012e\7u\2\2\u012e"+
		"\u012f\7v\2\2\u012f\u0130\7{\2\2\u0130\u0131\7n\2\2\u0131\u0132\7g\2\2"+
		"\u0132\u0133\7@\2\2\u0133\u0134\3\2\2\2\u0134\u0135\b\32\5\2\u01359\3"+
		"\2\2\2\u0136\u0138\13\2\2\2\u0137\u0136\3\2\2\2\u0138\u013b\3\2\2\2\u0139"+
		"\u013a\3\2\2\2\u0139\u0137\3\2\2\2\u013a\u013c\3\2\2\2\u013b\u0139\3\2"+
		"\2\2\u013c\u013d\7>\2\2\u013d\u013e\7\61\2\2\u013e\u013f\7@\2\2\u013f"+
		"\u0140\3\2\2\2\u0140\u0141\b\33\5\2\u0141;\3\2\2\2\u0142\u0144\t\n\2\2"+
		"\u0143\u0142\3\2\2\2\u0144\u0147\3\2\2\2\u0145\u0143\3\2\2\2\u0145\u0146"+
		"\3\2\2\2\u0146\u0148\3\2\2\2\u0147\u0145\3\2\2\2\u0148\u0149\5>\35\2\u0149"+
		"\u014a\3\2\2\2\u014a\u014b\b\34\5\2\u014b=\3\2\2\2\u014c\u0152\5H\"\2"+
		"\u014d\u0152\5J#\2\u014e\u0152\5B\37\2\u014f\u0152\5D \2\u0150\u0152\5"+
		"F!\2\u0151\u014c\3\2\2\2\u0151\u014d\3\2\2\2\u0151\u014e\3\2\2\2\u0151"+
		"\u014f\3\2\2\2\u0151\u0150\3\2\2\2\u0152?\3\2\2\2\u0153\u0155\t\13\2\2"+
		"\u0154\u0153\3\2\2\2\u0155A\3\2\2\2\u0156\u0158\5@\36\2\u0157\u0156\3"+
		"\2\2\2\u0158\u0159\3\2\2\2\u0159\u0157\3\2\2\2\u0159\u015a\3\2\2\2\u015a"+
		"\u015c\3\2\2\2\u015b\u015d\7\"\2\2\u015c\u015b\3\2\2\2\u015c\u015d\3\2"+
		"\2\2\u015dC\3\2\2\2\u015e\u0160\7%\2\2\u015f\u0161\t\5\2\2\u0160\u015f"+
		"\3\2\2\2\u0161\u0162\3\2\2\2\u0162\u0160\3\2\2\2\u0162\u0163\3\2\2\2\u0163"+
		"E\3\2\2\2\u0164\u0166\t\6\2\2\u0165\u0164\3\2\2\2\u0166\u0167\3\2\2\2"+
		"\u0167\u0165\3\2\2\2\u0167\u0168\3\2\2\2\u0168\u016a\3\2\2\2\u0169\u016b"+
		"\7\'\2\2\u016a\u0169\3\2\2\2\u016a\u016b\3\2\2\2\u016bG\3\2\2\2\u016c"+
		"\u0170\7$\2\2\u016d\u016f\n\f\2\2\u016e\u016d\3\2\2\2\u016f\u0172\3\2"+
		"\2\2\u0170\u016e\3\2\2\2\u0170\u0171\3\2\2\2\u0171\u0173\3\2\2\2\u0172"+
		"\u0170\3\2\2\2\u0173\u0174\7$\2\2\u0174I\3\2\2\2\u0175\u0179\7)\2\2\u0176"+
		"\u0178\n\r\2\2\u0177\u0176\3\2\2\2\u0178\u017b\3\2\2\2\u0179\u0177\3\2"+
		"\2\2\u0179\u017a\3\2\2\2\u017a\u017c\3\2\2\2\u017b\u0179\3\2\2\2\u017c"+
		"\u017d\7)\2\2\u017dK\3\2\2\2&\2\3\4\5\6\7Tbq\u0083\u0090\u009b\u00a6\u00ab"+
		"\u00af\u00b2\u00b4\u00ca\u00d8\u00ed\u00fc\u00ff\u0108\u011b\u0128\u0139"+
		"\u0145\u0151\u0154\u0159\u015c\u0162\u0167\u016a\u0170\u0179\t\7\4\2\7"+
		"\6\2\7\3\2\6\2\2\7\7\2\b\2\2\7\5\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}