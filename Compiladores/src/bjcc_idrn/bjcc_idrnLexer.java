// Generated from bjcc_idrn.g4 by ANTLR 4.4
package bjcc_idrn;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class bjcc_idrnLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__34=1, T__33=2, T__32=3, T__31=4, T__30=5, T__29=6, T__28=7, T__27=8, 
		T__26=9, T__25=10, T__24=11, T__23=12, T__22=13, T__21=14, T__20=15, T__19=16, 
		T__18=17, T__17=18, T__16=19, T__15=20, T__14=21, T__13=22, T__12=23, 
		T__11=24, T__10=25, T__9=26, T__8=27, T__7=28, T__6=29, T__5=30, T__4=31, 
		T__3=32, T__2=33, T__1=34, T__0=35, Identifier=36, IntegerLiteral=37, 
		DecimalIntegerLiteral=38, IntegertypeSuffix=39, DecimalNumeral=40, Digits=41, 
		Digit=42, DigitOrUnderscore=43, WS=44, MULTILINE_COMMENT=45, LINE_COMMENT=46;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'", "'\\u001A'", "'\\u001B'", "'\\u001C'", "'\\u001D'", "'\\u001E'", 
		"'\\u001F'", "' '", "'!'", "'\"'", "'#'", "'$'", "'%'", "'&'", "'''", 
		"'('", "')'", "'*'", "'+'", "','", "'-'", "'.'"
	};
	public static final String[] ruleNames = {
		"T__34", "T__33", "T__32", "T__31", "T__30", "T__29", "T__28", "T__27", 
		"T__26", "T__25", "T__24", "T__23", "T__22", "T__21", "T__20", "T__19", 
		"T__18", "T__17", "T__16", "T__15", "T__14", "T__13", "T__12", "T__11", 
		"T__10", "T__9", "T__8", "T__7", "T__6", "T__5", "T__4", "T__3", "T__2", 
		"T__1", "T__0", "Identifier", "IntegerLiteral", "DecimalIntegerLiteral", 
		"IntegertypeSuffix", "DecimalNumeral", "Digits", "Digit", "DigitOrUnderscore", 
		"WS", "MULTILINE_COMMENT", "LINE_COMMENT"
	};


	public bjcc_idrnLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "bjcc_idrn.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\60\u014f\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4"+
		"\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\13"+
		"\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\23"+
		"\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3!"+
		"\3!\3!\3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\7%\u0100\n%\f%\16%\u0103\13%\3"+
		"&\3&\3\'\3\'\5\'\u0109\n\'\3(\3(\3)\3)\3)\5)\u0110\n)\3)\6)\u0113\n)\r"+
		")\16)\u0114\3)\5)\u0118\n)\5)\u011a\n)\3*\3*\6*\u011e\n*\r*\16*\u011f"+
		"\5*\u0122\n*\3*\5*\u0125\n*\3+\5+\u0128\n+\3,\3,\5,\u012c\n,\3-\6-\u012f"+
		"\n-\r-\16-\u0130\3-\3-\3.\3.\3.\3.\7.\u0139\n.\f.\16.\u013c\13.\3.\3."+
		"\3.\3.\3.\3/\3/\3/\3/\7/\u0147\n/\f/\16/\u014a\13/\3/\3/\3/\3/\4\u013a"+
		"\u0148\2\60\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67"+
		"\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60\3\2\7\6\2&&C\\aac|\7"+
		"\2&&\62;C\\aac|\4\2NNnn\3\2\63;\5\2\13\f\17\17\"\"\u015b\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"+
		"\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2"+
		"\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2"+
		"\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2"+
		"\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2"+
		"\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2"+
		"K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3"+
		"\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\3_\3\2\2\2\5d\3\2\2\2\7h\3\2\2"+
		"\2\tm\3\2\2\2\13t\3\2\2\2\rz\3\2\2\2\17\u0080\3\2\2\2\21\u0082\3\2\2\2"+
		"\23\u0087\3\2\2\2\25\u0089\3\2\2\2\27\u008c\3\2\2\2\31\u008e\3\2\2\2\33"+
		"\u0096\3\2\2\2\35\u0098\3\2\2\2\37\u009b\3\2\2\2!\u009f\3\2\2\2#\u00a7"+
		"\3\2\2\2%\u00a9\3\2\2\2\'\u00ab\3\2\2\2)\u00b0\3\2\2\2+\u00b2\3\2\2\2"+
		"-\u00b8\3\2\2\2/\u00ba\3\2\2\2\61\u00c2\3\2\2\2\63\u00d5\3\2\2\2\65\u00d7"+
		"\3\2\2\2\67\u00d9\3\2\2\29\u00e0\3\2\2\2;\u00e2\3\2\2\2=\u00e9\3\2\2\2"+
		"?\u00eb\3\2\2\2A\u00f2\3\2\2\2C\u00f7\3\2\2\2E\u00f9\3\2\2\2G\u00fb\3"+
		"\2\2\2I\u00fd\3\2\2\2K\u0104\3\2\2\2M\u0106\3\2\2\2O\u010a\3\2\2\2Q\u0119"+
		"\3\2\2\2S\u011b\3\2\2\2U\u0127\3\2\2\2W\u012b\3\2\2\2Y\u012e\3\2\2\2["+
		"\u0134\3\2\2\2]\u0142\3\2\2\2_`\7o\2\2`a\7c\2\2ab\7k\2\2bc\7p\2\2c\4\3"+
		"\2\2\2de\7p\2\2ef\7g\2\2fg\7y\2\2g\6\3\2\2\2hi\7v\2\2ij\7t\2\2jk\7w\2"+
		"\2kl\7g\2\2l\b\3\2\2\2mn\7t\2\2no\7g\2\2op\7v\2\2pq\7w\2\2qr\7t\2\2rs"+
		"\7p\2\2s\n\3\2\2\2tu\7e\2\2uv\7n\2\2vw\7c\2\2wx\7u\2\2xy\7u\2\2y\f\3\2"+
		"\2\2z{\7y\2\2{|\7j\2\2|}\7k\2\2}~\7n\2\2~\177\7g\2\2\177\16\3\2\2\2\u0080"+
		"\u0081\7=\2\2\u0081\20\3\2\2\2\u0082\u0083\7x\2\2\u0083\u0084\7q\2\2\u0084"+
		"\u0085\7k\2\2\u0085\u0086\7f\2\2\u0086\22\3\2\2\2\u0087\u0088\7}\2\2\u0088"+
		"\24\3\2\2\2\u0089\u008a\7(\2\2\u008a\u008b\7(\2\2\u008b\26\3\2\2\2\u008c"+
		"\u008d\7?\2\2\u008d\30\3\2\2\2\u008e\u008f\7g\2\2\u008f\u0090\7z\2\2\u0090"+
		"\u0091\7v\2\2\u0091\u0092\7g\2\2\u0092\u0093\7p\2\2\u0093\u0094\7f\2\2"+
		"\u0094\u0095\7u\2\2\u0095\32\3\2\2\2\u0096\u0097\7\177\2\2\u0097\34\3"+
		"\2\2\2\u0098\u0099\7k\2\2\u0099\u009a\7h\2\2\u009a\36\3\2\2\2\u009b\u009c"+
		"\7k\2\2\u009c\u009d\7p\2\2\u009d\u009e\7v\2\2\u009e \3\2\2\2\u009f\u00a0"+
		"\7\60\2\2\u00a0\u00a1\7n\2\2\u00a1\u00a2\7g\2\2\u00a2\u00a3\7p\2\2\u00a3"+
		"\u00a4\7i\2\2\u00a4\u00a5\7v\2\2\u00a5\u00a6\7j\2\2\u00a6\"\3\2\2\2\u00a7"+
		"\u00a8\7*\2\2\u00a8$\3\2\2\2\u00a9\u00aa\7,\2\2\u00aa&\3\2\2\2\u00ab\u00ac"+
		"\7v\2\2\u00ac\u00ad\7j\2\2\u00ad\u00ae\7k\2\2\u00ae\u00af\7u\2\2\u00af"+
		"(\3\2\2\2\u00b0\u00b1\7.\2\2\u00b1*\3\2\2\2\u00b2\u00b3\7h\2\2\u00b3\u00b4"+
		"\7c\2\2\u00b4\u00b5\7n\2\2\u00b5\u00b6\7u\2\2\u00b6\u00b7\7g\2\2\u00b7"+
		",\3\2\2\2\u00b8\u00b9\7\60\2\2\u00b9.\3\2\2\2\u00ba\u00bb\7d\2\2\u00bb"+
		"\u00bc\7q\2\2\u00bc\u00bd\7q\2\2\u00bd\u00be\7n\2\2\u00be\u00bf\7g\2\2"+
		"\u00bf\u00c0\7c\2\2\u00c0\u00c1\7p\2\2\u00c1\60\3\2\2\2\u00c2\u00c3\7"+
		"U\2\2\u00c3\u00c4\7{\2\2\u00c4\u00c5\7u\2\2\u00c5\u00c6\7v\2\2\u00c6\u00c7"+
		"\7g\2\2\u00c7\u00c8\7o\2\2\u00c8\u00c9\7\60\2\2\u00c9\u00ca\7q\2\2\u00ca"+
		"\u00cb\7w\2\2\u00cb\u00cc\7v\2\2\u00cc\u00cd\7\60\2\2\u00cd\u00ce\7r\2"+
		"\2\u00ce\u00cf\7t\2\2\u00cf\u00d0\7k\2\2\u00d0\u00d1\7p\2\2\u00d1\u00d2"+
		"\7v\2\2\u00d2\u00d3\7n\2\2\u00d3\u00d4\7p\2\2\u00d4\62\3\2\2\2\u00d5\u00d6"+
		"\7]\2\2\u00d6\64\3\2\2\2\u00d7\u00d8\7>\2\2\u00d8\66\3\2\2\2\u00d9\u00da"+
		"\7U\2\2\u00da\u00db\7v\2\2\u00db\u00dc\7t\2\2\u00dc\u00dd\7k\2\2\u00dd"+
		"\u00de\7p\2\2\u00de\u00df\7i\2\2\u00df8\3\2\2\2\u00e0\u00e1\7_\2\2\u00e1"+
		":\3\2\2\2\u00e2\u00e3\7r\2\2\u00e3\u00e4\7w\2\2\u00e4\u00e5\7d\2\2\u00e5"+
		"\u00e6\7n\2\2\u00e6\u00e7\7k\2\2\u00e7\u00e8\7e\2\2\u00e8<\3\2\2\2\u00e9"+
		"\u00ea\7#\2\2\u00ea>\3\2\2\2\u00eb\u00ec\7u\2\2\u00ec\u00ed\7v\2\2\u00ed"+
		"\u00ee\7c\2\2\u00ee\u00ef\7v\2\2\u00ef\u00f0\7k\2\2\u00f0\u00f1\7e\2\2"+
		"\u00f1@\3\2\2\2\u00f2\u00f3\7g\2\2\u00f3\u00f4\7n\2\2\u00f4\u00f5\7u\2"+
		"\2\u00f5\u00f6\7g\2\2\u00f6B\3\2\2\2\u00f7\u00f8\7+\2\2\u00f8D\3\2\2\2"+
		"\u00f9\u00fa\7-\2\2\u00faF\3\2\2\2\u00fb\u00fc\7/\2\2\u00fcH\3\2\2\2\u00fd"+
		"\u0101\t\2\2\2\u00fe\u0100\t\3\2\2\u00ff\u00fe\3\2\2\2\u0100\u0103\3\2"+
		"\2\2\u0101\u00ff\3\2\2\2\u0101\u0102\3\2\2\2\u0102J\3\2\2\2\u0103\u0101"+
		"\3\2\2\2\u0104\u0105\5M\'\2\u0105L\3\2\2\2\u0106\u0108\5Q)\2\u0107\u0109"+
		"\5O(\2\u0108\u0107\3\2\2\2\u0108\u0109\3\2\2\2\u0109N\3\2\2\2\u010a\u010b"+
		"\t\4\2\2\u010bP\3\2\2\2\u010c\u011a\7\62\2\2\u010d\u0117\t\5\2\2\u010e"+
		"\u0110\5S*\2\u010f\u010e\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u0118\3\2\2"+
		"\2\u0111\u0113\7a\2\2\u0112\u0111\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0112"+
		"\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0118\5S*\2\u0117"+
		"\u010f\3\2\2\2\u0117\u0112\3\2\2\2\u0118\u011a\3\2\2\2\u0119\u010c\3\2"+
		"\2\2\u0119\u010d\3\2\2\2\u011aR\3\2\2\2\u011b\u0124\5U+\2\u011c\u011e"+
		"\5W,\2\u011d\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u011d\3\2\2\2\u011f"+
		"\u0120\3\2\2\2\u0120\u0122\3\2\2\2\u0121\u011d\3\2\2\2\u0121\u0122\3\2"+
		"\2\2\u0122\u0123\3\2\2\2\u0123\u0125\5U+\2\u0124\u0121\3\2\2\2\u0124\u0125"+
		"\3\2\2\2\u0125T\3\2\2\2\u0126\u0128\4\62;\2\u0127\u0126\3\2\2\2\u0128"+
		"V\3\2\2\2\u0129\u012c\5U+\2\u012a\u012c\7a\2\2\u012b\u0129\3\2\2\2\u012b"+
		"\u012a\3\2\2\2\u012cX\3\2\2\2\u012d\u012f\t\6\2\2\u012e\u012d\3\2\2\2"+
		"\u012f\u0130\3\2\2\2\u0130\u012e\3\2\2\2\u0130\u0131\3\2\2\2\u0131\u0132"+
		"\3\2\2\2\u0132\u0133\b-\2\2\u0133Z\3\2\2\2\u0134\u0135\7\61\2\2\u0135"+
		"\u0136\7,\2\2\u0136\u013a\3\2\2\2\u0137\u0139\13\2\2\2\u0138\u0137\3\2"+
		"\2\2\u0139\u013c\3\2\2\2\u013a\u013b\3\2\2\2\u013a\u0138\3\2\2\2\u013b"+
		"\u013d\3\2\2\2\u013c\u013a\3\2\2\2\u013d\u013e\7,\2\2\u013e\u013f\7\61"+
		"\2\2\u013f\u0140\3\2\2\2\u0140\u0141\b.\2\2\u0141\\\3\2\2\2\u0142\u0143"+
		"\7\61\2\2\u0143\u0144\7\61\2\2\u0144\u0148\3\2\2\2\u0145\u0147\13\2\2"+
		"\2\u0146\u0145\3\2\2\2\u0147\u014a\3\2\2\2\u0148\u0149\3\2\2\2\u0148\u0146"+
		"\3\2\2\2\u0149\u014b\3\2\2\2\u014a\u0148\3\2\2\2\u014b\u014c\7\f\2\2\u014c"+
		"\u014d\3\2\2\2\u014d\u014e\b/\2\2\u014e^\3\2\2\2\21\2\u0101\u0108\u010f"+
		"\u0114\u0117\u0119\u011f\u0121\u0124\u0127\u012b\u0130\u013a\u0148\3\b"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}