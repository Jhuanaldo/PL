// Generated from Ruby.g4 by ANTLR 4.6
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RubyLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ESCAPED_QUOTE=1, LITERAL=2, COMMA=3, DOT=4, SEMICOLON=5, CRLF=6, REQUIRE=7, 
		DO=8, END=9, DEF=10, RETURN=11, IF=12, CASE=13, CLASS=14, WHEN=15, ATTR=16, 
		THEN=17, ELSE=18, ELSIF=19, UNLESS=20, WHILE=21, RETRY=22, BREAK=23, FOR=24, 
		TRUE=25, FALSE=26, PLUS=27, MINUS=28, MUL=29, DIV=30, MOD=31, EXP=32, 
		EQUAL=33, NOT_EQUAL=34, GREATER=35, LESS=36, LESS_EQUAL=37, GREATER_EQUAL=38, 
		ASSIGN=39, PLUS_ASSIGN=40, MINUS_ASSIGN=41, MUL_ASSIGN=42, DIV_ASSIGN=43, 
		MOD_ASSIGN=44, EXP_ASSIGN=45, BIT_AND=46, BIT_OR=47, BIT_XOR=48, BIT_NOT=49, 
		BIT_SHL=50, BIT_SHR=51, AND=52, OR=53, NOT=54, LEFT_RBRACKET=55, RIGHT_RBRACKET=56, 
		LEFT_SBRACKET=57, RIGHT_SBRACKET=58, NIL=59, SL_COMMENT=60, ML_COMMENT=61, 
		WS=62, INT=63, FLOAT=64, ID_ITER=65, ID_ATTR=66, ID_GLOBAL=67, ID_FUNCTION=68, 
		DOLLAR=69, LEFT_BRACE=70, RIGHT_BRACE=71, ID=72;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"ESCAPED_QUOTE", "LITERAL", "COMMA", "DOT", "SEMICOLON", "CRLF", "REQUIRE", 
		"DO", "END", "DEF", "RETURN", "IF", "CASE", "CLASS", "WHEN", "ATTR", "THEN", 
		"ELSE", "ELSIF", "UNLESS", "WHILE", "RETRY", "BREAK", "FOR", "TRUE", "FALSE", 
		"PLUS", "MINUS", "MUL", "DIV", "MOD", "EXP", "EQUAL", "NOT_EQUAL", "GREATER", 
		"LESS", "LESS_EQUAL", "GREATER_EQUAL", "ASSIGN", "PLUS_ASSIGN", "MINUS_ASSIGN", 
		"MUL_ASSIGN", "DIV_ASSIGN", "MOD_ASSIGN", "EXP_ASSIGN", "BIT_AND", "BIT_OR", 
		"BIT_XOR", "BIT_NOT", "BIT_SHL", "BIT_SHR", "AND", "OR", "NOT", "LEFT_RBRACKET", 
		"RIGHT_RBRACKET", "LEFT_SBRACKET", "RIGHT_SBRACKET", "NIL", "SL_COMMENT", 
		"ML_COMMENT", "WS", "INT", "FLOAT", "ID_ITER", "ID_ATTR", "ID_GLOBAL", 
		"ID_FUNCTION", "DOLLAR", "LEFT_BRACE", "RIGHT_BRACE", "ID"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'\\\"'", null, "','", "'.'", "';'", "'\n'", "'require'", "'do'", 
		"'end'", "'def'", "'return'", "'if'", "'case'", "'class'", "'when'", "'attr_accessor'", 
		"'then'", "'else'", "'elsif'", "'unless'", "'while'", "'retry'", "'break'", 
		"'for'", "'true'", "'false'", "'+'", "'-'", "'*'", "'/'", "'%'", "'**'", 
		"'=='", "'!='", "'>'", "'<'", "'<='", "'>='", "'='", "'+='", "'-='", "'*='", 
		"'/='", "'%='", "'**='", "'&'", "'|'", "'^'", "'~'", "'<<'", "'>>'", null, 
		null, null, "'('", "')'", "'['", "']'", "'nil'", null, null, null, null, 
		null, null, null, null, null, "'$'", "'{'", "'}'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "ESCAPED_QUOTE", "LITERAL", "COMMA", "DOT", "SEMICOLON", "CRLF", 
		"REQUIRE", "DO", "END", "DEF", "RETURN", "IF", "CASE", "CLASS", "WHEN", 
		"ATTR", "THEN", "ELSE", "ELSIF", "UNLESS", "WHILE", "RETRY", "BREAK", 
		"FOR", "TRUE", "FALSE", "PLUS", "MINUS", "MUL", "DIV", "MOD", "EXP", "EQUAL", 
		"NOT_EQUAL", "GREATER", "LESS", "LESS_EQUAL", "GREATER_EQUAL", "ASSIGN", 
		"PLUS_ASSIGN", "MINUS_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", "MOD_ASSIGN", 
		"EXP_ASSIGN", "BIT_AND", "BIT_OR", "BIT_XOR", "BIT_NOT", "BIT_SHL", "BIT_SHR", 
		"AND", "OR", "NOT", "LEFT_RBRACKET", "RIGHT_RBRACKET", "LEFT_SBRACKET", 
		"RIGHT_SBRACKET", "NIL", "SL_COMMENT", "ML_COMMENT", "WS", "INT", "FLOAT", 
		"ID_ITER", "ID_ATTR", "ID_GLOBAL", "ID_FUNCTION", "DOLLAR", "LEFT_BRACE", 
		"RIGHT_BRACE", "ID"
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


	public RubyLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Ruby.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2J\u01e0\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\3\2\3\2\3\2\3\3\3\3\3\3\7\3\u009a\n\3\f\3\16\3\u009d\13\3\3\3\3\3"+
		"\3\3\3\3\7\3\u00a3\n\3\f\3\16\3\u00a6\13\3\3\3\5\3\u00a9\n\3\3\4\3\4\3"+
		"\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n"+
		"\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3"+
		"\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3"+
		"\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3"+
		"\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3"+
		"\33\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3!\3"+
		"\"\3\"\3\"\3#\3#\3#\3$\3$\3%\3%\3&\3&\3&\3\'\3\'\3\'\3(\3(\3)\3)\3)\3"+
		"*\3*\3*\3+\3+\3+\3,\3,\3,\3-\3-\3-\3.\3.\3.\3.\3/\3/\3\60\3\60\3\61\3"+
		"\61\3\62\3\62\3\63\3\63\3\63\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\5"+
		"\65\u016b\n\65\3\66\3\66\3\66\3\66\5\66\u0171\n\66\3\67\3\67\3\67\3\67"+
		"\5\67\u0177\n\67\38\38\39\39\3:\3:\3;\3;\3<\3<\3<\3<\3=\3=\7=\u0187\n"+
		"=\f=\16=\u018a\13=\3=\3=\3=\3=\3>\3>\3>\3>\3>\3>\3>\3>\7>\u0198\n>\f>"+
		"\16>\u019b\13>\3>\3>\3>\3>\3>\3>\3>\3>\3?\6?\u01a6\n?\r?\16?\u01a7\3?"+
		"\3?\3@\6@\u01ad\n@\r@\16@\u01ae\3A\6A\u01b2\nA\rA\16A\u01b3\3A\3A\6A\u01b8"+
		"\nA\rA\16A\u01b9\3B\3B\3B\3B\3C\3C\3C\7C\u01c3\nC\fC\16C\u01c6\13C\3D"+
		"\3D\3D\3E\3E\3E\3F\3F\3G\3G\3H\3H\3I\3I\3I\3I\5I\u01d8\nI\3I\3I\7I\u01dc"+
		"\nI\fI\16I\u01df\13I\5\u009b\u00a4\u0199\2J\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+"+
		"\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+"+
		"U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081"+
		"B\u0083C\u0085D\u0087E\u0089F\u008bG\u008dH\u008fI\u0091J\3\2\t\4\2\13"+
		"\f\17\17\4\2\f\f\17\17\4\2\13\13\"\"\3\2\62;\5\2C\\aac|\6\2\62;C\\aac"+
		"|\4\2##AA\u01f1\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3"+
		"\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2"+
		"\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\2"+
		"9\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3"+
		"\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2"+
		"\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2"+
		"_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3"+
		"\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2"+
		"\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083"+
		"\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2"+
		"\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\3\u0093\3\2\2\2\5\u00a8"+
		"\3\2\2\2\7\u00aa\3\2\2\2\t\u00ac\3\2\2\2\13\u00ae\3\2\2\2\r\u00b0\3\2"+
		"\2\2\17\u00b2\3\2\2\2\21\u00ba\3\2\2\2\23\u00bd\3\2\2\2\25\u00c1\3\2\2"+
		"\2\27\u00c5\3\2\2\2\31\u00cc\3\2\2\2\33\u00cf\3\2\2\2\35\u00d4\3\2\2\2"+
		"\37\u00da\3\2\2\2!\u00df\3\2\2\2#\u00ed\3\2\2\2%\u00f2\3\2\2\2\'\u00f7"+
		"\3\2\2\2)\u00fd\3\2\2\2+\u0104\3\2\2\2-\u010a\3\2\2\2/\u0110\3\2\2\2\61"+
		"\u0116\3\2\2\2\63\u011a\3\2\2\2\65\u011f\3\2\2\2\67\u0125\3\2\2\29\u0127"+
		"\3\2\2\2;\u0129\3\2\2\2=\u012b\3\2\2\2?\u012d\3\2\2\2A\u012f\3\2\2\2C"+
		"\u0132\3\2\2\2E\u0135\3\2\2\2G\u0138\3\2\2\2I\u013a\3\2\2\2K\u013c\3\2"+
		"\2\2M\u013f\3\2\2\2O\u0142\3\2\2\2Q\u0144\3\2\2\2S\u0147\3\2\2\2U\u014a"+
		"\3\2\2\2W\u014d\3\2\2\2Y\u0150\3\2\2\2[\u0153\3\2\2\2]\u0157\3\2\2\2_"+
		"\u0159\3\2\2\2a\u015b\3\2\2\2c\u015d\3\2\2\2e\u015f\3\2\2\2g\u0162\3\2"+
		"\2\2i\u016a\3\2\2\2k\u0170\3\2\2\2m\u0176\3\2\2\2o\u0178\3\2\2\2q\u017a"+
		"\3\2\2\2s\u017c\3\2\2\2u\u017e\3\2\2\2w\u0180\3\2\2\2y\u0184\3\2\2\2{"+
		"\u018f\3\2\2\2}\u01a5\3\2\2\2\177\u01ac\3\2\2\2\u0081\u01b1\3\2\2\2\u0083"+
		"\u01bb\3\2\2\2\u0085\u01bf\3\2\2\2\u0087\u01c7\3\2\2\2\u0089\u01ca\3\2"+
		"\2\2\u008b\u01cd\3\2\2\2\u008d\u01cf\3\2\2\2\u008f\u01d1\3\2\2\2\u0091"+
		"\u01d7\3\2\2\2\u0093\u0094\7^\2\2\u0094\u0095\7$\2\2\u0095\4\3\2\2\2\u0096"+
		"\u009b\7$\2\2\u0097\u009a\5\3\2\2\u0098\u009a\n\2\2\2\u0099\u0097\3\2"+
		"\2\2\u0099\u0098\3\2\2\2\u009a\u009d\3\2\2\2\u009b\u009c\3\2\2\2\u009b"+
		"\u0099\3\2\2\2\u009c\u009e\3\2\2\2\u009d\u009b\3\2\2\2\u009e\u00a9\7$"+
		"\2\2\u009f\u00a4\7)\2\2\u00a0\u00a3\5\3\2\2\u00a1\u00a3\n\2\2\2\u00a2"+
		"\u00a0\3\2\2\2\u00a2\u00a1\3\2\2\2\u00a3\u00a6\3\2\2\2\u00a4\u00a5\3\2"+
		"\2\2\u00a4\u00a2\3\2\2\2\u00a5\u00a7\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a7"+
		"\u00a9\7)\2\2\u00a8\u0096\3\2\2\2\u00a8\u009f\3\2\2\2\u00a9\6\3\2\2\2"+
		"\u00aa\u00ab\7.\2\2\u00ab\b\3\2\2\2\u00ac\u00ad\7\60\2\2\u00ad\n\3\2\2"+
		"\2\u00ae\u00af\7=\2\2\u00af\f\3\2\2\2\u00b0\u00b1\7\f\2\2\u00b1\16\3\2"+
		"\2\2\u00b2\u00b3\7t\2\2\u00b3\u00b4\7g\2\2\u00b4\u00b5\7s\2\2\u00b5\u00b6"+
		"\7w\2\2\u00b6\u00b7\7k\2\2\u00b7\u00b8\7t\2\2\u00b8\u00b9\7g\2\2\u00b9"+
		"\20\3\2\2\2\u00ba\u00bb\7f\2\2\u00bb\u00bc\7q\2\2\u00bc\22\3\2\2\2\u00bd"+
		"\u00be\7g\2\2\u00be\u00bf\7p\2\2\u00bf\u00c0\7f\2\2\u00c0\24\3\2\2\2\u00c1"+
		"\u00c2\7f\2\2\u00c2\u00c3\7g\2\2\u00c3\u00c4\7h\2\2\u00c4\26\3\2\2\2\u00c5"+
		"\u00c6\7t\2\2\u00c6\u00c7\7g\2\2\u00c7\u00c8\7v\2\2\u00c8\u00c9\7w\2\2"+
		"\u00c9\u00ca\7t\2\2\u00ca\u00cb\7p\2\2\u00cb\30\3\2\2\2\u00cc\u00cd\7"+
		"k\2\2\u00cd\u00ce\7h\2\2\u00ce\32\3\2\2\2\u00cf\u00d0\7e\2\2\u00d0\u00d1"+
		"\7c\2\2\u00d1\u00d2\7u\2\2\u00d2\u00d3\7g\2\2\u00d3\34\3\2\2\2\u00d4\u00d5"+
		"\7e\2\2\u00d5\u00d6\7n\2\2\u00d6\u00d7\7c\2\2\u00d7\u00d8\7u\2\2\u00d8"+
		"\u00d9\7u\2\2\u00d9\36\3\2\2\2\u00da\u00db\7y\2\2\u00db\u00dc\7j\2\2\u00dc"+
		"\u00dd\7g\2\2\u00dd\u00de\7p\2\2\u00de \3\2\2\2\u00df\u00e0\7c\2\2\u00e0"+
		"\u00e1\7v\2\2\u00e1\u00e2\7v\2\2\u00e2\u00e3\7t\2\2\u00e3\u00e4\7a\2\2"+
		"\u00e4\u00e5\7c\2\2\u00e5\u00e6\7e\2\2\u00e6\u00e7\7e\2\2\u00e7\u00e8"+
		"\7g\2\2\u00e8\u00e9\7u\2\2\u00e9\u00ea\7u\2\2\u00ea\u00eb\7q\2\2\u00eb"+
		"\u00ec\7t\2\2\u00ec\"\3\2\2\2\u00ed\u00ee\7v\2\2\u00ee\u00ef\7j\2\2\u00ef"+
		"\u00f0\7g\2\2\u00f0\u00f1\7p\2\2\u00f1$\3\2\2\2\u00f2\u00f3\7g\2\2\u00f3"+
		"\u00f4\7n\2\2\u00f4\u00f5\7u\2\2\u00f5\u00f6\7g\2\2\u00f6&\3\2\2\2\u00f7"+
		"\u00f8\7g\2\2\u00f8\u00f9\7n\2\2\u00f9\u00fa\7u\2\2\u00fa\u00fb\7k\2\2"+
		"\u00fb\u00fc\7h\2\2\u00fc(\3\2\2\2\u00fd\u00fe\7w\2\2\u00fe\u00ff\7p\2"+
		"\2\u00ff\u0100\7n\2\2\u0100\u0101\7g\2\2\u0101\u0102\7u\2\2\u0102\u0103"+
		"\7u\2\2\u0103*\3\2\2\2\u0104\u0105\7y\2\2\u0105\u0106\7j\2\2\u0106\u0107"+
		"\7k\2\2\u0107\u0108\7n\2\2\u0108\u0109\7g\2\2\u0109,\3\2\2\2\u010a\u010b"+
		"\7t\2\2\u010b\u010c\7g\2\2\u010c\u010d\7v\2\2\u010d\u010e\7t\2\2\u010e"+
		"\u010f\7{\2\2\u010f.\3\2\2\2\u0110\u0111\7d\2\2\u0111\u0112\7t\2\2\u0112"+
		"\u0113\7g\2\2\u0113\u0114\7c\2\2\u0114\u0115\7m\2\2\u0115\60\3\2\2\2\u0116"+
		"\u0117\7h\2\2\u0117\u0118\7q\2\2\u0118\u0119\7t\2\2\u0119\62\3\2\2\2\u011a"+
		"\u011b\7v\2\2\u011b\u011c\7t\2\2\u011c\u011d\7w\2\2\u011d\u011e\7g\2\2"+
		"\u011e\64\3\2\2\2\u011f\u0120\7h\2\2\u0120\u0121\7c\2\2\u0121\u0122\7"+
		"n\2\2\u0122\u0123\7u\2\2\u0123\u0124\7g\2\2\u0124\66\3\2\2\2\u0125\u0126"+
		"\7-\2\2\u01268\3\2\2\2\u0127\u0128\7/\2\2\u0128:\3\2\2\2\u0129\u012a\7"+
		",\2\2\u012a<\3\2\2\2\u012b\u012c\7\61\2\2\u012c>\3\2\2\2\u012d\u012e\7"+
		"\'\2\2\u012e@\3\2\2\2\u012f\u0130\7,\2\2\u0130\u0131\7,\2\2\u0131B\3\2"+
		"\2\2\u0132\u0133\7?\2\2\u0133\u0134\7?\2\2\u0134D\3\2\2\2\u0135\u0136"+
		"\7#\2\2\u0136\u0137\7?\2\2\u0137F\3\2\2\2\u0138\u0139\7@\2\2\u0139H\3"+
		"\2\2\2\u013a\u013b\7>\2\2\u013bJ\3\2\2\2\u013c\u013d\7>\2\2\u013d\u013e"+
		"\7?\2\2\u013eL\3\2\2\2\u013f\u0140\7@\2\2\u0140\u0141\7?\2\2\u0141N\3"+
		"\2\2\2\u0142\u0143\7?\2\2\u0143P\3\2\2\2\u0144\u0145\7-\2\2\u0145\u0146"+
		"\7?\2\2\u0146R\3\2\2\2\u0147\u0148\7/\2\2\u0148\u0149\7?\2\2\u0149T\3"+
		"\2\2\2\u014a\u014b\7,\2\2\u014b\u014c\7?\2\2\u014cV\3\2\2\2\u014d\u014e"+
		"\7\61\2\2\u014e\u014f\7?\2\2\u014fX\3\2\2\2\u0150\u0151\7\'\2\2\u0151"+
		"\u0152\7?\2\2\u0152Z\3\2\2\2\u0153\u0154\7,\2\2\u0154\u0155\7,\2\2\u0155"+
		"\u0156\7?\2\2\u0156\\\3\2\2\2\u0157\u0158\7(\2\2\u0158^\3\2\2\2\u0159"+
		"\u015a\7~\2\2\u015a`\3\2\2\2\u015b\u015c\7`\2\2\u015cb\3\2\2\2\u015d\u015e"+
		"\7\u0080\2\2\u015ed\3\2\2\2\u015f\u0160\7>\2\2\u0160\u0161\7>\2\2\u0161"+
		"f\3\2\2\2\u0162\u0163\7@\2\2\u0163\u0164\7@\2\2\u0164h\3\2\2\2\u0165\u0166"+
		"\7c\2\2\u0166\u0167\7p\2\2\u0167\u016b\7f\2\2\u0168\u0169\7(\2\2\u0169"+
		"\u016b\7(\2\2\u016a\u0165\3\2\2\2\u016a\u0168\3\2\2\2\u016bj\3\2\2\2\u016c"+
		"\u016d\7q\2\2\u016d\u0171\7t\2\2\u016e\u016f\7~\2\2\u016f\u0171\7~\2\2"+
		"\u0170\u016c\3\2\2\2\u0170\u016e\3\2\2\2\u0171l\3\2\2\2\u0172\u0173\7"+
		"p\2\2\u0173\u0174\7q\2\2\u0174\u0177\7v\2\2\u0175\u0177\7#\2\2\u0176\u0172"+
		"\3\2\2\2\u0176\u0175\3\2\2\2\u0177n\3\2\2\2\u0178\u0179\7*\2\2\u0179p"+
		"\3\2\2\2\u017a\u017b\7+\2\2\u017br\3\2\2\2\u017c\u017d\7]\2\2\u017dt\3"+
		"\2\2\2\u017e\u017f\7_\2\2\u017fv\3\2\2\2\u0180\u0181\7p\2\2\u0181\u0182"+
		"\7k\2\2\u0182\u0183\7n\2\2\u0183x\3\2\2\2\u0184\u0188\7%\2\2\u0185\u0187"+
		"\n\3\2\2\u0186\u0185\3\2\2\2\u0187\u018a\3\2\2\2\u0188\u0186\3\2\2\2\u0188"+
		"\u0189\3\2\2\2\u0189\u018b\3\2\2\2\u018a\u0188\3\2\2\2\u018b\u018c\7\f"+
		"\2\2\u018c\u018d\3\2\2\2\u018d\u018e\b=\2\2\u018ez\3\2\2\2\u018f\u0190"+
		"\7?\2\2\u0190\u0191\7d\2\2\u0191\u0192\7g\2\2\u0192\u0193\7i\2\2\u0193"+
		"\u0194\7k\2\2\u0194\u0195\7p\2\2\u0195\u0199\3\2\2\2\u0196\u0198\13\2"+
		"\2\2\u0197\u0196\3\2\2\2\u0198\u019b\3\2\2\2\u0199\u019a\3\2\2\2\u0199"+
		"\u0197\3\2\2\2\u019a\u019c\3\2\2\2\u019b\u0199\3\2\2\2\u019c\u019d\7?"+
		"\2\2\u019d\u019e\7g\2\2\u019e\u019f\7p\2\2\u019f\u01a0\7f\2\2\u01a0\u01a1"+
		"\7\f\2\2\u01a1\u01a2\3\2\2\2\u01a2\u01a3\b>\2\2\u01a3|\3\2\2\2\u01a4\u01a6"+
		"\t\4\2\2\u01a5\u01a4\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a7\u01a5\3\2\2\2\u01a7"+
		"\u01a8\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9\u01aa\b?\2\2\u01aa~\3\2\2\2\u01ab"+
		"\u01ad\t\5\2\2\u01ac\u01ab\3\2\2\2\u01ad\u01ae\3\2\2\2\u01ae\u01ac\3\2"+
		"\2\2\u01ae\u01af\3\2\2\2\u01af\u0080\3\2\2\2\u01b0\u01b2\t\5\2\2\u01b1"+
		"\u01b0\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3\u01b1\3\2\2\2\u01b3\u01b4\3\2"+
		"\2\2\u01b4\u01b5\3\2\2\2\u01b5\u01b7\7\60\2\2\u01b6\u01b8\t\5\2\2\u01b7"+
		"\u01b6\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9\u01b7\3\2\2\2\u01b9\u01ba\3\2"+
		"\2\2\u01ba\u0082\3\2\2\2\u01bb\u01bc\7~\2\2\u01bc\u01bd\5\u0091I\2\u01bd"+
		"\u01be\7~\2\2\u01be\u0084\3\2\2\2\u01bf\u01c0\7<\2\2\u01c0\u01c4\t\6\2"+
		"\2\u01c1\u01c3\t\7\2\2\u01c2\u01c1\3\2\2\2\u01c3\u01c6\3\2\2\2\u01c4\u01c2"+
		"\3\2\2\2\u01c4\u01c5\3\2\2\2\u01c5\u0086\3\2\2\2\u01c6\u01c4\3\2\2\2\u01c7"+
		"\u01c8\5\u008bF\2\u01c8\u01c9\5\u0091I\2\u01c9\u0088\3\2\2\2\u01ca\u01cb"+
		"\5\u0091I\2\u01cb\u01cc\t\b\2\2\u01cc\u008a\3\2\2\2\u01cd\u01ce\7&\2\2"+
		"\u01ce\u008c\3\2\2\2\u01cf\u01d0\7}\2\2\u01d0\u008e\3\2\2\2\u01d1\u01d2"+
		"\7\177\2\2\u01d2\u0090\3\2\2\2\u01d3\u01d8\7B\2\2\u01d4\u01d5\7B\2\2\u01d5"+
		"\u01d8\7B\2\2\u01d6\u01d8\3\2\2\2\u01d7\u01d3\3\2\2\2\u01d7\u01d4\3\2"+
		"\2\2\u01d7\u01d6\3\2\2\2\u01d8\u01d9\3\2\2\2\u01d9\u01dd\t\6\2\2\u01da"+
		"\u01dc\t\7\2\2\u01db\u01da\3\2\2\2\u01dc\u01df\3\2\2\2\u01dd\u01db\3\2"+
		"\2\2\u01dd\u01de\3\2\2\2\u01de\u0092\3\2\2\2\u01df\u01dd\3\2\2\2\24\2"+
		"\u0099\u009b\u00a2\u00a4\u00a8\u016a\u0170\u0176\u0188\u0199\u01a7\u01ae"+
		"\u01b3\u01b9\u01c4\u01d7\u01dd\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}