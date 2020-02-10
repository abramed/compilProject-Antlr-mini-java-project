// Generated from C:/Users/Taleb Faiz/compilProject/src\Gramaire.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GramaireLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, ENTIER=15, AFFECTATION=16, 
		LOGIQUE=17, ARITHME=18, OPerateurL=19, PV=20, VR=21, BIB=22, PAROUVR=23, 
		PARFERM=24, IMPORT=25, MODIFICATEUR=26, CLASS8SJ=27, TYPE=28, MAIN=29, 
		NOMCLASS=30, IDF=31, COMMENT=32, WS=33, WHITESPACE=34, GUIM=35;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "ENTIER", "AFFECTATION", 
			"LOGIQUE", "ARITHME", "OPerateurL", "PV", "VR", "BIB", "PAROUVR", "PARFERM", 
			"IMPORT", "MODIFICATEUR", "CLASS8SJ", "TYPE", "MAIN", "NOMCLASS", "IDF", 
			"COMMENT", "WS", "WHITESPACE", "GUIM"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "'+'", "'-'", "'*'", "'/'", "'si'", "'alors'", "'sinon'", 
			"'In_SJ'", "'%d'", "'%f'", "'%s'", "'Out_SJ'", null, "':='", null, null, 
			null, "';'", "','", null, "'('", "')'", "'import'", null, "'class_SJ'", 
			null, "'main_SJ'", null, null, null, null, null, "'\"'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "ENTIER", "AFFECTATION", "LOGIQUE", "ARITHME", "OPerateurL", 
			"PV", "VR", "BIB", "PAROUVR", "PARFERM", "IMPORT", "MODIFICATEUR", "CLASS8SJ", 
			"TYPE", "MAIN", "NOMCLASS", "IDF", "COMMENT", "WS", "WHITESPACE", "GUIM"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public GramaireLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Gramaire.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2%\u0137\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3"+
		"\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\20\5\20|\n\20\3\20\5\20\177\n\20\3\20\6"+
		"\20\u0082\n\20\r\20\16\20\u0083\3\20\3\20\6\20\u0088\n\20\r\20\16\20\u0089"+
		"\5\20\u008c\n\20\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\5\22\u0099\n\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u00bf\n\27"+
		"\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u00db"+
		"\n\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\5\35\u00fd\n\35\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\37\6\37\u0108\n\37\r\37\16\37\u0109\3\37\7\37\u010d\n\37"+
		"\f\37\16\37\u0110\13\37\3 \6 \u0113\n \r \16 \u0114\3 \7 \u0118\n \f "+
		"\16 \u011b\13 \3!\3!\3!\3!\7!\u0121\n!\f!\16!\u0124\13!\3!\3!\3!\3!\3"+
		"!\3\"\6\"\u012c\n\"\r\"\16\"\u012d\3\"\3\"\3#\3#\3#\3#\3$\3$\3\u0122\2"+
		"%\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20"+
		"\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37"+
		"= ?!A\"C#E$G%\3\2\n\4\2>>@@\5\2,-//\61\61\4\2((~~\3\2C\\\5\2\62;C\\c|"+
		"\4\2C\\c|\5\2\13\f\17\17\"\"\4\2\13\13\"\"\2\u0149\2\3\3\2\2\2\2\5\3\2"+
		"\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3"+
		"\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\3I\3\2\2\2\5K\3\2\2"+
		"\2\7M\3\2\2\2\tO\3\2\2\2\13Q\3\2\2\2\rS\3\2\2\2\17U\3\2\2\2\21X\3\2\2"+
		"\2\23^\3\2\2\2\25d\3\2\2\2\27j\3\2\2\2\31m\3\2\2\2\33p\3\2\2\2\35s\3\2"+
		"\2\2\37{\3\2\2\2!\u008d\3\2\2\2#\u0098\3\2\2\2%\u009a\3\2\2\2\'\u009c"+
		"\3\2\2\2)\u009e\3\2\2\2+\u00a0\3\2\2\2-\u00be\3\2\2\2/\u00c0\3\2\2\2\61"+
		"\u00c2\3\2\2\2\63\u00c4\3\2\2\2\65\u00da\3\2\2\2\67\u00dc\3\2\2\29\u00fc"+
		"\3\2\2\2;\u00fe\3\2\2\2=\u0107\3\2\2\2?\u0112\3\2\2\2A\u011c\3\2\2\2C"+
		"\u012b\3\2\2\2E\u0131\3\2\2\2G\u0135\3\2\2\2IJ\7}\2\2J\4\3\2\2\2KL\7\177"+
		"\2\2L\6\3\2\2\2MN\7-\2\2N\b\3\2\2\2OP\7/\2\2P\n\3\2\2\2QR\7,\2\2R\f\3"+
		"\2\2\2ST\7\61\2\2T\16\3\2\2\2UV\7u\2\2VW\7k\2\2W\20\3\2\2\2XY\7c\2\2Y"+
		"Z\7n\2\2Z[\7q\2\2[\\\7t\2\2\\]\7u\2\2]\22\3\2\2\2^_\7u\2\2_`\7k\2\2`a"+
		"\7p\2\2ab\7q\2\2bc\7p\2\2c\24\3\2\2\2de\7K\2\2ef\7p\2\2fg\7a\2\2gh\7U"+
		"\2\2hi\7L\2\2i\26\3\2\2\2jk\7\'\2\2kl\7f\2\2l\30\3\2\2\2mn\7\'\2\2no\7"+
		"h\2\2o\32\3\2\2\2pq\7\'\2\2qr\7u\2\2r\34\3\2\2\2st\7Q\2\2tu\7w\2\2uv\7"+
		"v\2\2vw\7a\2\2wx\7U\2\2xy\7L\2\2y\36\3\2\2\2z|\7/\2\2{z\3\2\2\2{|\3\2"+
		"\2\2|~\3\2\2\2}\177\4\63;\2~}\3\2\2\2~\177\3\2\2\2\177\u0081\3\2\2\2\u0080"+
		"\u0082\4\62;\2\u0081\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0081\3\2"+
		"\2\2\u0083\u0084\3\2\2\2\u0084\u008b\3\2\2\2\u0085\u0087\7\60\2\2\u0086"+
		"\u0088\4\62;\2\u0087\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u0087\3\2"+
		"\2\2\u0089\u008a\3\2\2\2\u008a\u008c\3\2\2\2\u008b\u0085\3\2\2\2\u008b"+
		"\u008c\3\2\2\2\u008c \3\2\2\2\u008d\u008e\7<\2\2\u008e\u008f\7?\2\2\u008f"+
		"\"\3\2\2\2\u0090\u0099\7?\2\2\u0091\u0092\7#\2\2\u0092\u0099\7?\2\2\u0093"+
		"\u0099\t\2\2\2\u0094\u0095\7>\2\2\u0095\u0099\7?\2\2\u0096\u0097\7@\2"+
		"\2\u0097\u0099\7?\2\2\u0098\u0090\3\2\2\2\u0098\u0091\3\2\2\2\u0098\u0093"+
		"\3\2\2\2\u0098\u0094\3\2\2\2\u0098\u0096\3\2\2\2\u0099$\3\2\2\2\u009a"+
		"\u009b\t\3\2\2\u009b&\3\2\2\2\u009c\u009d\t\4\2\2\u009d(\3\2\2\2\u009e"+
		"\u009f\7=\2\2\u009f*\3\2\2\2\u00a0\u00a1\7.\2\2\u00a1,\3\2\2\2\u00a2\u00a3"+
		"\7U\2\2\u00a3\u00a4\7o\2\2\u00a4\u00a5\7c\2\2\u00a5\u00a6\7n\2\2\u00a6"+
		"\u00a7\7n\2\2\u00a7\u00a8\7a\2\2\u00a8\u00a9\7L\2\2\u00a9\u00aa\7c\2\2"+
		"\u00aa\u00ab\7x\2\2\u00ab\u00ac\7c\2\2\u00ac\u00ad\7\60\2\2\u00ad\u00ae"+
		"\7n\2\2\u00ae\u00af\7c\2\2\u00af\u00b0\7p\2\2\u00b0\u00bf\7i\2\2\u00b1"+
		"\u00b2\7U\2\2\u00b2\u00b3\7o\2\2\u00b3\u00b4\7c\2\2\u00b4\u00b5\7n\2\2"+
		"\u00b5\u00b6\7n\2\2\u00b6\u00b7\7a\2\2\u00b7\u00b8\7L\2\2\u00b8\u00b9"+
		"\7c\2\2\u00b9\u00ba\7x\2\2\u00ba\u00bb\7c\2\2\u00bb\u00bc\7\60\2\2\u00bc"+
		"\u00bd\7k\2\2\u00bd\u00bf\7q\2\2\u00be\u00a2\3\2\2\2\u00be\u00b1\3\2\2"+
		"\2\u00bf.\3\2\2\2\u00c0\u00c1\7*\2\2\u00c1\60\3\2\2\2\u00c2\u00c3\7+\2"+
		"\2\u00c3\62\3\2\2\2\u00c4\u00c5\7k\2\2\u00c5\u00c6\7o\2\2\u00c6\u00c7"+
		"\7r\2\2\u00c7\u00c8\7q\2\2\u00c8\u00c9\7t\2\2\u00c9\u00ca\7v\2\2\u00ca"+
		"\64\3\2\2\2\u00cb\u00cc\7r\2\2\u00cc\u00cd\7w\2\2\u00cd\u00ce\7d\2\2\u00ce"+
		"\u00cf\7n\2\2\u00cf\u00d0\7k\2\2\u00d0\u00db\7e\2\2\u00d1\u00d2\7r\2\2"+
		"\u00d2\u00d3\7t\2\2\u00d3\u00d4\7q\2\2\u00d4\u00d5\7v\2\2\u00d5\u00d6"+
		"\7g\2\2\u00d6\u00d7\7e\2\2\u00d7\u00d8\7v\2\2\u00d8\u00d9\7g\2\2\u00d9"+
		"\u00db\7f\2\2\u00da\u00cb\3\2\2\2\u00da\u00d1\3\2\2\2\u00db\66\3\2\2\2"+
		"\u00dc\u00dd\7e\2\2\u00dd\u00de\7n\2\2\u00de\u00df\7c\2\2\u00df\u00e0"+
		"\7u\2\2\u00e0\u00e1\7u\2\2\u00e1\u00e2\7a\2\2\u00e2\u00e3\7U\2\2\u00e3"+
		"\u00e4\7L\2\2\u00e48\3\2\2\2\u00e5\u00e6\7k\2\2\u00e6\u00e7\7p\2\2\u00e7"+
		"\u00e8\7v\2\2\u00e8\u00e9\7a\2\2\u00e9\u00ea\7U\2\2\u00ea\u00fd\7L\2\2"+
		"\u00eb\u00ec\7h\2\2\u00ec\u00ed\7n\2\2\u00ed\u00ee\7q\2\2\u00ee\u00ef"+
		"\7c\2\2\u00ef\u00f0\7v\2\2\u00f0\u00f1\7a\2\2\u00f1\u00f2\7U\2\2\u00f2"+
		"\u00fd\7L\2\2\u00f3\u00f4\7u\2\2\u00f4\u00f5\7v\2\2\u00f5\u00f6\7t\2\2"+
		"\u00f6\u00f7\7k\2\2\u00f7\u00f8\7p\2\2\u00f8\u00f9\7i\2\2\u00f9\u00fa"+
		"\7a\2\2\u00fa\u00fb\7U\2\2\u00fb\u00fd\7L\2\2\u00fc\u00e5\3\2\2\2\u00fc"+
		"\u00eb\3\2\2\2\u00fc\u00f3\3\2\2\2\u00fd:\3\2\2\2\u00fe\u00ff\7o\2\2\u00ff"+
		"\u0100\7c\2\2\u0100\u0101\7k\2\2\u0101\u0102\7p\2\2\u0102\u0103\7a\2\2"+
		"\u0103\u0104\7U\2\2\u0104\u0105\7L\2\2\u0105<\3\2\2\2\u0106\u0108\t\5"+
		"\2\2\u0107\u0106\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u0107\3\2\2\2\u0109"+
		"\u010a\3\2\2\2\u010a\u010e\3\2\2\2\u010b\u010d\t\6\2\2\u010c\u010b\3\2"+
		"\2\2\u010d\u0110\3\2\2\2\u010e\u010c\3\2\2\2\u010e\u010f\3\2\2\2\u010f"+
		">\3\2\2\2\u0110\u010e\3\2\2\2\u0111\u0113\t\7\2\2\u0112\u0111\3\2\2\2"+
		"\u0113\u0114\3\2\2\2\u0114\u0112\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0119"+
		"\3\2\2\2\u0116\u0118\t\6\2\2\u0117\u0116\3\2\2\2\u0118\u011b\3\2\2\2\u0119"+
		"\u0117\3\2\2\2\u0119\u011a\3\2\2\2\u011a@\3\2\2\2\u011b\u0119\3\2\2\2"+
		"\u011c\u011d\7\61\2\2\u011d\u011e\7,\2\2\u011e\u0122\3\2\2\2\u011f\u0121"+
		"\13\2\2\2\u0120\u011f\3\2\2\2\u0121\u0124\3\2\2\2\u0122\u0123\3\2\2\2"+
		"\u0122\u0120\3\2\2\2\u0123\u0125\3\2\2\2\u0124\u0122\3\2\2\2\u0125\u0126"+
		"\7,\2\2\u0126\u0127\7\61\2\2\u0127\u0128\3\2\2\2\u0128\u0129\b!\2\2\u0129"+
		"B\3\2\2\2\u012a\u012c\t\b\2\2\u012b\u012a\3\2\2\2\u012c\u012d\3\2\2\2"+
		"\u012d\u012b\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u0130"+
		"\b\"\2\2\u0130D\3\2\2\2\u0131\u0132\t\t\2\2\u0132\u0133\3\2\2\2\u0133"+
		"\u0134\b#\2\2\u0134F\3\2\2\2\u0135\u0136\7$\2\2\u0136H\3\2\2\2\22\2{~"+
		"\u0083\u0089\u008b\u0098\u00be\u00da\u00fc\u0109\u010e\u0114\u0119\u0122"+
		"\u012d\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}