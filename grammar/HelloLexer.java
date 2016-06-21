// Generated from Hello.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HelloLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, Const2=27, Var=28, WS=29;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
		"T__25", "Const2", "Var", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'main('", "'){'", "'}'", "','", "';'", "'var'", "':='", "'/*'", 
		"'!'", "'.'", "'?'", "'*'", "'/'", "'*/'", "'if('", "'else{'", "'while('", 
		"'='", "'>'", "'<'", "'<='", "'>='", "'+'", "'-'", "'('", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, "Const2", "Var", "WS"
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


	public HelloLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Hello.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\37\u0099\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b"+
		"\3\b\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17"+
		"\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\27"+
		"\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\6\34\u008a\n\34"+
		"\r\34\16\34\u008b\3\35\6\35\u008f\n\35\r\35\16\35\u0090\3\36\6\36\u0094"+
		"\n\36\r\36\16\36\u0095\3\36\3\36\2\2\37\3\3\5\4\7\5\t\6\13\7\r\b\17\t"+
		"\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27"+
		"-\30/\31\61\32\63\33\65\34\67\359\36;\37\3\2\5\3\2\62;\4\2C\\c|\5\2\13"+
		"\f\17\17\"\"\u009b\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2"+
		"\29\3\2\2\2\2;\3\2\2\2\3=\3\2\2\2\5C\3\2\2\2\7F\3\2\2\2\tH\3\2\2\2\13"+
		"J\3\2\2\2\rL\3\2\2\2\17P\3\2\2\2\21S\3\2\2\2\23V\3\2\2\2\25X\3\2\2\2\27"+
		"Z\3\2\2\2\31\\\3\2\2\2\33^\3\2\2\2\35`\3\2\2\2\37c\3\2\2\2!g\3\2\2\2#"+
		"m\3\2\2\2%t\3\2\2\2\'v\3\2\2\2)x\3\2\2\2+z\3\2\2\2-}\3\2\2\2/\u0080\3"+
		"\2\2\2\61\u0082\3\2\2\2\63\u0084\3\2\2\2\65\u0086\3\2\2\2\67\u0089\3\2"+
		"\2\29\u008e\3\2\2\2;\u0093\3\2\2\2=>\7o\2\2>?\7c\2\2?@\7k\2\2@A\7p\2\2"+
		"AB\7*\2\2B\4\3\2\2\2CD\7+\2\2DE\7}\2\2E\6\3\2\2\2FG\7\177\2\2G\b\3\2\2"+
		"\2HI\7.\2\2I\n\3\2\2\2JK\7=\2\2K\f\3\2\2\2LM\7x\2\2MN\7c\2\2NO\7t\2\2"+
		"O\16\3\2\2\2PQ\7<\2\2QR\7?\2\2R\20\3\2\2\2ST\7\61\2\2TU\7,\2\2U\22\3\2"+
		"\2\2VW\7#\2\2W\24\3\2\2\2XY\7\60\2\2Y\26\3\2\2\2Z[\7A\2\2[\30\3\2\2\2"+
		"\\]\7,\2\2]\32\3\2\2\2^_\7\61\2\2_\34\3\2\2\2`a\7,\2\2ab\7\61\2\2b\36"+
		"\3\2\2\2cd\7k\2\2de\7h\2\2ef\7*\2\2f \3\2\2\2gh\7g\2\2hi\7n\2\2ij\7u\2"+
		"\2jk\7g\2\2kl\7}\2\2l\"\3\2\2\2mn\7y\2\2no\7j\2\2op\7k\2\2pq\7n\2\2qr"+
		"\7g\2\2rs\7*\2\2s$\3\2\2\2tu\7?\2\2u&\3\2\2\2vw\7@\2\2w(\3\2\2\2xy\7>"+
		"\2\2y*\3\2\2\2z{\7>\2\2{|\7?\2\2|,\3\2\2\2}~\7@\2\2~\177\7?\2\2\177.\3"+
		"\2\2\2\u0080\u0081\7-\2\2\u0081\60\3\2\2\2\u0082\u0083\7/\2\2\u0083\62"+
		"\3\2\2\2\u0084\u0085\7*\2\2\u0085\64\3\2\2\2\u0086\u0087\7+\2\2\u0087"+
		"\66\3\2\2\2\u0088\u008a\t\2\2\2\u0089\u0088\3\2\2\2\u008a\u008b\3\2\2"+
		"\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c8\3\2\2\2\u008d\u008f"+
		"\t\3\2\2\u008e\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u008e\3\2\2\2\u0090"+
		"\u0091\3\2\2\2\u0091:\3\2\2\2\u0092\u0094\t\4\2\2\u0093\u0092\3\2\2\2"+
		"\u0094\u0095\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0097"+
		"\3\2\2\2\u0097\u0098\b\36\2\2\u0098<\3\2\2\2\6\2\u008b\u0090\u0095\3\b"+
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