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
		T__17=18, T__18=19, T__19=20, T__20=21, CONST=22, VAR=23, WS=24;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "T__20", "CONST", "VAR", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'main('", "'){'", "'}'", "','", "';'", "'var'", "':='", "'if('", 
		"'while('", "'for('", "'='", "'>'", "'<'", "'<='", "'>='", "'+'", "'-'", 
		"'*'", "'/'", "'('", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, "CONST", "VAR", 
		"WS"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\32\u0082\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7"+
		"\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\13\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26"+
		"\3\27\6\27s\n\27\r\27\16\27t\3\30\6\30x\n\30\r\30\16\30y\3\31\6\31}\n"+
		"\31\r\31\16\31~\3\31\3\31\2\2\32\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31"+
		"\61\32\3\2\5\3\2\62;\3\2c|\5\2\13\f\17\17\"\"\u0084\2\3\3\2\2\2\2\5\3"+
		"\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2"+
		"\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3"+
		"\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'"+
		"\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\3\63"+
		"\3\2\2\2\59\3\2\2\2\7<\3\2\2\2\t>\3\2\2\2\13@\3\2\2\2\rB\3\2\2\2\17F\3"+
		"\2\2\2\21I\3\2\2\2\23M\3\2\2\2\25T\3\2\2\2\27Y\3\2\2\2\31[\3\2\2\2\33"+
		"]\3\2\2\2\35_\3\2\2\2\37b\3\2\2\2!e\3\2\2\2#g\3\2\2\2%i\3\2\2\2\'k\3\2"+
		"\2\2)m\3\2\2\2+o\3\2\2\2-r\3\2\2\2/w\3\2\2\2\61|\3\2\2\2\63\64\7o\2\2"+
		"\64\65\7c\2\2\65\66\7k\2\2\66\67\7p\2\2\678\7*\2\28\4\3\2\2\29:\7+\2\2"+
		":;\7}\2\2;\6\3\2\2\2<=\7\177\2\2=\b\3\2\2\2>?\7.\2\2?\n\3\2\2\2@A\7=\2"+
		"\2A\f\3\2\2\2BC\7x\2\2CD\7c\2\2DE\7t\2\2E\16\3\2\2\2FG\7<\2\2GH\7?\2\2"+
		"H\20\3\2\2\2IJ\7k\2\2JK\7h\2\2KL\7*\2\2L\22\3\2\2\2MN\7y\2\2NO\7j\2\2"+
		"OP\7k\2\2PQ\7n\2\2QR\7g\2\2RS\7*\2\2S\24\3\2\2\2TU\7h\2\2UV\7q\2\2VW\7"+
		"t\2\2WX\7*\2\2X\26\3\2\2\2YZ\7?\2\2Z\30\3\2\2\2[\\\7@\2\2\\\32\3\2\2\2"+
		"]^\7>\2\2^\34\3\2\2\2_`\7>\2\2`a\7?\2\2a\36\3\2\2\2bc\7@\2\2cd\7?\2\2"+
		"d \3\2\2\2ef\7-\2\2f\"\3\2\2\2gh\7/\2\2h$\3\2\2\2ij\7,\2\2j&\3\2\2\2k"+
		"l\7\61\2\2l(\3\2\2\2mn\7*\2\2n*\3\2\2\2op\7+\2\2p,\3\2\2\2qs\t\2\2\2r"+
		"q\3\2\2\2st\3\2\2\2tr\3\2\2\2tu\3\2\2\2u.\3\2\2\2vx\t\3\2\2wv\3\2\2\2"+
		"xy\3\2\2\2yw\3\2\2\2yz\3\2\2\2z\60\3\2\2\2{}\t\4\2\2|{\3\2\2\2}~\3\2\2"+
		"\2~|\3\2\2\2~\177\3\2\2\2\177\u0080\3\2\2\2\u0080\u0081\b\31\2\2\u0081"+
		"\62\3\2\2\2\6\2ty~\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}