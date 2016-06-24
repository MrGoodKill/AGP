// Generated from Hello.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HelloParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, CONST=34, WORD=35, PCT=36, WS=37, STR=38;
	public static final int
		RULE_r = 0, RULE_prog = 1, RULE_listfunc = 2, RULE_function = 3, RULE_listvar = 4, 
		RULE_bloc = 5, RULE_inst = 6, RULE_callFunction = 7, RULE_print = 8, RULE_string2 = 9, 
		RULE_ask = 10, RULE_declaration = 11, RULE_affct = 12, RULE_comment = 13, 
		RULE_declaffct = 14, RULE_if2 = 15, RULE_while2 = 16, RULE_cond = 17, 
		RULE_operation = 18, RULE_factor = 19, RULE_final2 = 20, RULE_numb = 21, 
		RULE_rand = 22;
	public static final String[] ruleNames = {
		"r", "prog", "listfunc", "function", "listvar", "bloc", "inst", "callFunction", 
		"print", "string2", "ask", "declaration", "affct", "comment", "declaffct", 
		"if2", "while2", "cond", "operation", "factor", "final2", "numb", "rand"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'main('", "'){'", "'}'", "'main(){'", "'('", "','", "';'", "')'", 
		"'print('", "'ask('", "'var '", "':='", "'/*'", "'!'", "'.'", "'?'", "'*'", 
		"'/'", "'-'", "'Ã'", "'©'", "'¨'", "'*/'", "'if('", "'else{'", "'while('", 
		"'='", "'>'", "'<'", "'<='", "'>='", "'+'", "'rand('"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, "CONST", "WORD", 
		"PCT", "WS", "STR"
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
	public String getGrammarFileName() { return "Hello.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public HelloParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class RContext extends ParserRuleContext {
		public Root root;
		public ProgContext p;
		public ProgContext prog() {
			return getRuleContext(ProgContext.class,0);
		}
		public RContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_r; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitR(this);
		}
	}

	public final RContext r() throws RecognitionException {
		RContext _localctx = new RContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_r);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			((RContext)_localctx).p = prog();
			((RContext)_localctx).root =  new Root(((RContext)_localctx).p.p);
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

	public static class ProgContext extends ParserRuleContext {
		public Prog p;
		public ListfuncContext l1;
		public ListvarContext l;
		public BlocContext b;
		public ListfuncContext l2;
		public List<ListfuncContext> listfunc() {
			return getRuleContexts(ListfuncContext.class);
		}
		public ListfuncContext listfunc(int i) {
			return getRuleContext(ListfuncContext.class,i);
		}
		public ListvarContext listvar() {
			return getRuleContext(ListvarContext.class,0);
		}
		public BlocContext bloc() {
			return getRuleContext(BlocContext.class,0);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_prog);
		try {
			setState(65);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(49);
				((ProgContext)_localctx).l1 = listfunc();
				setState(50);
				match(T__0);
				setState(51);
				((ProgContext)_localctx).l = listvar();
				setState(52);
				match(T__1);
				setState(53);
				((ProgContext)_localctx).b = bloc();
				setState(54);
				match(T__2);
				setState(55);
				((ProgContext)_localctx).l2 = listfunc();
				((ProgContext)_localctx).p =  new Prog(((ProgContext)_localctx).l.lv,((ProgContext)_localctx).b.bc,((ProgContext)_localctx).l1.lf,((ProgContext)_localctx).l2.lf);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(58);
				((ProgContext)_localctx).l1 = listfunc();
				setState(59);
				match(T__3);
				setState(60);
				((ProgContext)_localctx).b = bloc();
				setState(61);
				match(T__2);
				setState(62);
				((ProgContext)_localctx).l2 = listfunc();
				((ProgContext)_localctx).p =  new Prog(((ProgContext)_localctx).b.bc,((ProgContext)_localctx).l1.lf,((ProgContext)_localctx).l2.lf);
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

	public static class ListfuncContext extends ParserRuleContext {
		public ListFunc lf;
		public FunctionContext f;
		public ListfuncContext l;
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public ListfuncContext listfunc() {
			return getRuleContext(ListfuncContext.class,0);
		}
		public ListfuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listfunc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterListfunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitListfunc(this);
		}
	}

	public final ListfuncContext listfunc() throws RecognitionException {
		ListfuncContext _localctx = new ListfuncContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_listfunc);
		try {
			setState(72);
			switch (_input.LA(1)) {
			case WORD:
				enterOuterAlt(_localctx, 1);
				{
				setState(67);
				((ListfuncContext)_localctx).f = function();
				setState(68);
				((ListfuncContext)_localctx).l = listfunc();
				((ListfuncContext)_localctx).lf = new ListFunc(((ListfuncContext)_localctx).f.fct, ((ListfuncContext)_localctx).l.lf);
				}
				break;
			case EOF:
			case T__0:
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				((ListfuncContext)_localctx).lf =  new ListFunc();
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

	public static class FunctionContext extends ParserRuleContext {
		public Func fct;
		public Token v;
		public ListvarContext l;
		public BlocContext b;
		public TerminalNode WORD() { return getToken(HelloParser.WORD, 0); }
		public ListvarContext listvar() {
			return getRuleContext(ListvarContext.class,0);
		}
		public BlocContext bloc() {
			return getRuleContext(BlocContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitFunction(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			((FunctionContext)_localctx).v = match(WORD);
			setState(75);
			match(T__4);
			setState(76);
			((FunctionContext)_localctx).l = listvar();
			setState(77);
			match(T__1);
			setState(78);
			((FunctionContext)_localctx).b = bloc();
			setState(79);
			match(T__2);
			((FunctionContext)_localctx).fct =  new Func(((FunctionContext)_localctx).l.lv,((FunctionContext)_localctx).b.bc,new Var(((FunctionContext)_localctx).v.getText()));
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

	public static class ListvarContext extends ParserRuleContext {
		public ListVar lv;
		public Token v;
		public ListvarContext l;
		public TerminalNode WORD() { return getToken(HelloParser.WORD, 0); }
		public ListvarContext listvar() {
			return getRuleContext(ListvarContext.class,0);
		}
		public ListvarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listvar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterListvar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitListvar(this);
		}
	}

	public final ListvarContext listvar() throws RecognitionException {
		ListvarContext _localctx = new ListvarContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_listvar);
		try {
			setState(89);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(82);
				((ListvarContext)_localctx).v = match(WORD);
				((ListvarContext)_localctx).lv =  new ListVar(new Var(((ListvarContext)_localctx).v.getText()));
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(84);
				((ListvarContext)_localctx).v = match(WORD);
				setState(85);
				match(T__5);
				setState(86);
				((ListvarContext)_localctx).l = listvar();
				((ListvarContext)_localctx).lv =  new ListVar(new Var(((ListvarContext)_localctx).v.getText()),((ListvarContext)_localctx).l.lv);
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

	public static class BlocContext extends ParserRuleContext {
		public Bloc bc;
		public InstContext i;
		public BlocContext b;
		public InstContext inst() {
			return getRuleContext(InstContext.class,0);
		}
		public BlocContext bloc() {
			return getRuleContext(BlocContext.class,0);
		}
		public BlocContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterBloc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitBloc(this);
		}
	}

	public final BlocContext bloc() throws RecognitionException {
		BlocContext _localctx = new BlocContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_bloc);
		try {
			setState(96);
			switch (_input.LA(1)) {
			case T__8:
			case T__9:
			case T__10:
			case T__12:
			case T__23:
			case T__25:
			case WORD:
				enterOuterAlt(_localctx, 1);
				{
				setState(91);
				((BlocContext)_localctx).i = inst();
				setState(92);
				((BlocContext)_localctx).b = bloc();
				((BlocContext)_localctx).bc =  new Bloc(((BlocContext)_localctx).i.instruct,((BlocContext)_localctx).b.bc);
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				((BlocContext)_localctx).bc =  new Bloc();
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

	public static class InstContext extends ParserRuleContext {
		public Inst instruct;
		public AffctContext a;
		public DeclarationContext d1;
		public DeclaffctContext d2;
		public CommentContext c;
		public If2Context i;
		public While2Context w;
		public AskContext as;
		public PrintContext p;
		public AffctContext affct() {
			return getRuleContext(AffctContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public DeclaffctContext declaffct() {
			return getRuleContext(DeclaffctContext.class,0);
		}
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public If2Context if2() {
			return getRuleContext(If2Context.class,0);
		}
		public While2Context while2() {
			return getRuleContext(While2Context.class,0);
		}
		public AskContext ask() {
			return getRuleContext(AskContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public InstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inst; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterInst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitInst(this);
		}
	}

	public final InstContext inst() throws RecognitionException {
		InstContext _localctx = new InstContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_inst);
		try {
			setState(127);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(98);
				((InstContext)_localctx).a = affct();
				setState(99);
				match(T__6);
				((InstContext)_localctx).instruct =  new Inst(((InstContext)_localctx).a.aff);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(102);
				((InstContext)_localctx).d1 = declaration();
				setState(103);
				match(T__6);
				((InstContext)_localctx).instruct =  new Inst(((InstContext)_localctx).d1.decl);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(106);
				((InstContext)_localctx).d2 = declaffct();
				setState(107);
				match(T__6);
				((InstContext)_localctx).instruct =  new Inst(((InstContext)_localctx).d2.decaf);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(110);
				((InstContext)_localctx).c = comment();
				((InstContext)_localctx).instruct =  new Inst(((InstContext)_localctx).c.com);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(113);
				((InstContext)_localctx).i = if2();
				((InstContext)_localctx).instruct =  new Inst(((InstContext)_localctx).i.i);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(116);
				((InstContext)_localctx).w = while2();
				((InstContext)_localctx).instruct =  new Inst(((InstContext)_localctx).w.w);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(119);
				((InstContext)_localctx).as = ask();
				setState(120);
				match(T__6);
				((InstContext)_localctx).instruct =  new Inst(((InstContext)_localctx).as.a);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(123);
				((InstContext)_localctx).p = print();
				setState(124);
				match(T__6);
				((InstContext)_localctx).instruct =  new Inst(((InstContext)_localctx).p.p);
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

	public static class CallFunctionContext extends ParserRuleContext {
		public CallFunction call;
		public Token v;
		public ListvarContext l;
		public TerminalNode WORD() { return getToken(HelloParser.WORD, 0); }
		public ListvarContext listvar() {
			return getRuleContext(ListvarContext.class,0);
		}
		public CallFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterCallFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitCallFunction(this);
		}
	}

	public final CallFunctionContext callFunction() throws RecognitionException {
		CallFunctionContext _localctx = new CallFunctionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_callFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			((CallFunctionContext)_localctx).v = match(WORD);
			setState(130);
			match(T__4);
			setState(131);
			((CallFunctionContext)_localctx).l = listvar();
			setState(132);
			match(T__7);
			((CallFunctionContext)_localctx).call =  new CallFunction(new Var(((CallFunctionContext)_localctx).v.getText()),((CallFunctionContext)_localctx).l.lv);
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

	public static class PrintContext extends ParserRuleContext {
		public Print p;
		public Token v;
		public String2Context s;
		public TerminalNode WORD() { return getToken(HelloParser.WORD, 0); }
		public String2Context string2() {
			return getRuleContext(String2Context.class,0);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitPrint(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_print);
		try {
			setState(144);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(135);
				match(T__8);
				setState(136);
				((PrintContext)_localctx).v = match(WORD);
				setState(137);
				match(T__7);
				((PrintContext)_localctx).p =  new Print(new Var(((PrintContext)_localctx).v.getText()));
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(139);
				match(T__8);
				setState(140);
				((PrintContext)_localctx).s = string2();
				setState(141);
				match(T__7);
				((PrintContext)_localctx).p =  new Print(((PrintContext)_localctx).s.s);
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

	public static class String2Context extends ParserRuleContext {
		public String2 s;
		public Token w;
		public TerminalNode STR() { return getToken(HelloParser.STR, 0); }
		public String2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterString2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitString2(this);
		}
	}

	public final String2Context string2() throws RecognitionException {
		String2Context _localctx = new String2Context(_ctx, getState());
		enterRule(_localctx, 18, RULE_string2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			((String2Context)_localctx).w = match(STR);
			((String2Context)_localctx).s =  new String2(new Txt(((String2Context)_localctx).w.getText()));
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

	public static class AskContext extends ParserRuleContext {
		public Ask a;
		public Token v;
		public TerminalNode WORD() { return getToken(HelloParser.WORD, 0); }
		public AskContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ask; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterAsk(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitAsk(this);
		}
	}

	public final AskContext ask() throws RecognitionException {
		AskContext _localctx = new AskContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_ask);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(T__9);
			setState(150);
			((AskContext)_localctx).v = match(WORD);
			setState(151);
			match(T__7);
			((AskContext)_localctx).a =  new Ask(new Var(((AskContext)_localctx).v.getText()));
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

	public static class DeclarationContext extends ParserRuleContext {
		public Decl decl;
		public ListvarContext l;
		public ListvarContext listvar() {
			return getRuleContext(ListvarContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitDeclaration(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(T__10);
			setState(155);
			((DeclarationContext)_localctx).l = listvar();
			((DeclarationContext)_localctx).decl =  new Decl(((DeclarationContext)_localctx).l.lv);
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

	public static class AffctContext extends ParserRuleContext {
		public Affct aff;
		public Token v;
		public OperationContext o;
		public TerminalNode WORD() { return getToken(HelloParser.WORD, 0); }
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public AffctContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_affct; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterAffct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitAffct(this);
		}
	}

	public final AffctContext affct() throws RecognitionException {
		AffctContext _localctx = new AffctContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_affct);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			((AffctContext)_localctx).v = match(WORD);
			setState(159);
			match(T__11);
			setState(160);
			((AffctContext)_localctx).o = operation();
			((AffctContext)_localctx).aff =  new Affct(new Var(((AffctContext)_localctx).v.getText()),((AffctContext)_localctx).o.op);
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

	public static class CommentContext extends ParserRuleContext {
		public Comment com;
		public List<NumbContext> numb() {
			return getRuleContexts(NumbContext.class);
		}
		public NumbContext numb(int i) {
			return getRuleContext(NumbContext.class,i);
		}
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitComment(this);
		}
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_comment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(T__12);
			setState(178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__32) | (1L << CONST) | (1L << WORD))) != 0)) {
				{
				setState(176);
				switch (_input.LA(1)) {
				case T__32:
				case CONST:
				case WORD:
					{
					setState(164);
					numb();
					}
					break;
				case T__5:
					{
					setState(165);
					match(T__5);
					}
					break;
				case T__6:
					{
					setState(166);
					match(T__6);
					}
					break;
				case T__13:
					{
					setState(167);
					match(T__13);
					}
					break;
				case T__14:
					{
					setState(168);
					match(T__14);
					}
					break;
				case T__15:
					{
					setState(169);
					match(T__15);
					}
					break;
				case T__16:
					{
					setState(170);
					match(T__16);
					}
					break;
				case T__17:
					{
					setState(171);
					match(T__17);
					}
					break;
				case T__18:
					{
					setState(172);
					match(T__18);
					}
					break;
				case T__19:
					{
					setState(173);
					match(T__19);
					}
					break;
				case T__20:
					{
					setState(174);
					match(T__20);
					}
					break;
				case T__21:
					{
					setState(175);
					match(T__21);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(180);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(181);
			match(T__22);
			((CommentContext)_localctx).com =  new Comment();
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

	public static class DeclaffctContext extends ParserRuleContext {
		public Decaf decaf;
		public AffctContext a;
		public AffctContext affct() {
			return getRuleContext(AffctContext.class,0);
		}
		public DeclaffctContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaffct; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterDeclaffct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitDeclaffct(this);
		}
	}

	public final DeclaffctContext declaffct() throws RecognitionException {
		DeclaffctContext _localctx = new DeclaffctContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_declaffct);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			match(T__10);
			setState(185);
			((DeclaffctContext)_localctx).a = affct();
			((DeclaffctContext)_localctx).decaf =  new Decaf(((DeclaffctContext)_localctx).a.aff);
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

	public static class If2Context extends ParserRuleContext {
		public If2 i;
		public CondContext c;
		public BlocContext b;
		public BlocContext b2;
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public List<BlocContext> bloc() {
			return getRuleContexts(BlocContext.class);
		}
		public BlocContext bloc(int i) {
			return getRuleContext(BlocContext.class,i);
		}
		public If2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterIf2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitIf2(this);
		}
	}

	public final If2Context if2() throws RecognitionException {
		If2Context _localctx = new If2Context(_ctx, getState());
		enterRule(_localctx, 30, RULE_if2);
		try {
			setState(205);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(188);
				match(T__23);
				setState(189);
				((If2Context)_localctx).c = cond();
				setState(190);
				match(T__1);
				setState(191);
				((If2Context)_localctx).b = bloc();
				setState(192);
				match(T__2);
				setState(193);
				match(T__24);
				setState(194);
				((If2Context)_localctx).b2 = bloc();
				setState(195);
				match(T__2);
				((If2Context)_localctx).i =  new If2(((If2Context)_localctx).c.c,((If2Context)_localctx).b.bc,((If2Context)_localctx).b2.bc);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(198);
				match(T__23);
				setState(199);
				((If2Context)_localctx).c = cond();
				setState(200);
				match(T__1);
				setState(201);
				((If2Context)_localctx).b = bloc();
				setState(202);
				match(T__2);
				((If2Context)_localctx).i =  new If2(((If2Context)_localctx).c.c,((If2Context)_localctx).b.bc);
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

	public static class While2Context extends ParserRuleContext {
		public While2 w;
		public CondContext c;
		public BlocContext b;
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public BlocContext bloc() {
			return getRuleContext(BlocContext.class,0);
		}
		public While2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterWhile2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitWhile2(this);
		}
	}

	public final While2Context while2() throws RecognitionException {
		While2Context _localctx = new While2Context(_ctx, getState());
		enterRule(_localctx, 32, RULE_while2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			match(T__25);
			setState(208);
			((While2Context)_localctx).c = cond();
			setState(209);
			match(T__1);
			setState(210);
			((While2Context)_localctx).b = bloc();
			setState(211);
			match(T__2);
			((While2Context)_localctx).w =  new While2(((While2Context)_localctx).c.c,((While2Context)_localctx).b.bc);
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

	public static class CondContext extends ParserRuleContext {
		public Cond c;
		public OperationContext op1;
		public OperationContext op2;
		public List<OperationContext> operation() {
			return getRuleContexts(OperationContext.class);
		}
		public OperationContext operation(int i) {
			return getRuleContext(OperationContext.class,i);
		}
		public CondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitCond(this);
		}
	}

	public final CondContext cond() throws RecognitionException {
		CondContext _localctx = new CondContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_cond);
		try {
			setState(239);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(214);
				((CondContext)_localctx).op1 = operation();
				setState(215);
				match(T__26);
				setState(216);
				((CondContext)_localctx).op2 = operation();
				((CondContext)_localctx).c =  new Cond(((CondContext)_localctx).op1.op,((CondContext)_localctx).op2.op,"=");
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(219);
				((CondContext)_localctx).op1 = operation();
				setState(220);
				match(T__27);
				setState(221);
				((CondContext)_localctx).op2 = operation();
				((CondContext)_localctx).c =  new Cond(((CondContext)_localctx).op1.op,((CondContext)_localctx).op2.op,">");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(224);
				((CondContext)_localctx).op1 = operation();
				setState(225);
				match(T__28);
				setState(226);
				((CondContext)_localctx).op2 = operation();
				((CondContext)_localctx).c =  new Cond(((CondContext)_localctx).op1.op,((CondContext)_localctx).op2.op,"<");
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(229);
				((CondContext)_localctx).op1 = operation();
				setState(230);
				match(T__29);
				setState(231);
				((CondContext)_localctx).op2 = operation();
				((CondContext)_localctx).c =  new Cond(((CondContext)_localctx).op1.op,((CondContext)_localctx).op2.op,"<=");
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(234);
				((CondContext)_localctx).op1 = operation();
				setState(235);
				match(T__30);
				setState(236);
				((CondContext)_localctx).op2 = operation();
				((CondContext)_localctx).c =  new Cond(((CondContext)_localctx).op1.op,((CondContext)_localctx).op2.op,">=");
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

	public static class OperationContext extends ParserRuleContext {
		public Op op;
		public FactorContext f1;
		public OperationContext op2;
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public OperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitOperation(this);
		}
	}

	public final OperationContext operation() throws RecognitionException {
		OperationContext _localctx = new OperationContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_operation);
		try {
			setState(254);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(241);
				((OperationContext)_localctx).f1 = factor(0);
				setState(242);
				match(T__31);
				setState(243);
				((OperationContext)_localctx).op2 = operation();
				((OperationContext)_localctx).op = new Op(((OperationContext)_localctx).f1.f,((OperationContext)_localctx).op2.op,"+");
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(246);
				((OperationContext)_localctx).f1 = factor(0);
				setState(247);
				match(T__18);
				setState(248);
				((OperationContext)_localctx).op2 = operation();
				((OperationContext)_localctx).op = new Op(((OperationContext)_localctx).f1.f,((OperationContext)_localctx).op2.op,"-");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(251);
				((OperationContext)_localctx).f1 = factor(0);
				((OperationContext)_localctx).op = new Op(((OperationContext)_localctx).f1.f);
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

	public static class FactorContext extends ParserRuleContext {
		public Factor f;
		public FactorContext f1;
		public Final2Context f3;
		public Final2Context f2;
		public Final2Context final2() {
			return getRuleContext(Final2Context.class,0);
		}
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitFactor(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		return factor(0);
	}

	private FactorContext factor(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		FactorContext _localctx = new FactorContext(_ctx, _parentState);
		FactorContext _prevctx = _localctx;
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_factor, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(257);
			((FactorContext)_localctx).f3 = final2();
			((FactorContext)_localctx).f = new Factor(((FactorContext)_localctx).f3.f);
			}
			_ctx.stop = _input.LT(-1);
			setState(272);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(270);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new FactorContext(_parentctx, _parentState);
						_localctx.f1 = _prevctx;
						_localctx.f1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_factor);
						setState(260);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(261);
						match(T__16);
						setState(262);
						((FactorContext)_localctx).f2 = final2();
						((FactorContext)_localctx).f = new Factor(((FactorContext)_localctx).f1.f,((FactorContext)_localctx).f2.f,"*");
						}
						break;
					case 2:
						{
						_localctx = new FactorContext(_parentctx, _parentState);
						_localctx.f1 = _prevctx;
						_localctx.f1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_factor);
						setState(265);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(266);
						match(T__17);
						setState(267);
						((FactorContext)_localctx).f2 = final2();
						((FactorContext)_localctx).f = new Factor(((FactorContext)_localctx).f1.f,((FactorContext)_localctx).f2.f,"/");
						}
						break;
					}
					} 
				}
				setState(274);
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
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Final2Context extends ParserRuleContext {
		public Final2 f;
		public OperationContext op1;
		public NumbContext nb1;
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public NumbContext numb() {
			return getRuleContext(NumbContext.class,0);
		}
		public Final2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_final2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterFinal2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitFinal2(this);
		}
	}

	public final Final2Context final2() throws RecognitionException {
		Final2Context _localctx = new Final2Context(_ctx, getState());
		enterRule(_localctx, 40, RULE_final2);
		try {
			setState(283);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(275);
				match(T__4);
				setState(276);
				((Final2Context)_localctx).op1 = operation();
				setState(277);
				match(T__7);
				((Final2Context)_localctx).f = new Final2(((Final2Context)_localctx).op1.op);
				}
				break;
			case T__32:
			case CONST:
			case WORD:
				enterOuterAlt(_localctx, 2);
				{
				setState(280);
				((Final2Context)_localctx).nb1 = numb();
				((Final2Context)_localctx).f = new Final2(((Final2Context)_localctx).nb1.nb);
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

	public static class NumbContext extends ParserRuleContext {
		public Number nb;
		public Token c;
		public Token v;
		public RandContext ra;
		public CallFunctionContext ca;
		public TerminalNode CONST() { return getToken(HelloParser.CONST, 0); }
		public TerminalNode WORD() { return getToken(HelloParser.WORD, 0); }
		public RandContext rand() {
			return getRuleContext(RandContext.class,0);
		}
		public CallFunctionContext callFunction() {
			return getRuleContext(CallFunctionContext.class,0);
		}
		public NumbContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numb; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterNumb(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitNumb(this);
		}
	}

	public final NumbContext numb() throws RecognitionException {
		NumbContext _localctx = new NumbContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_numb);
		try {
			setState(295);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(285);
				((NumbContext)_localctx).c = match(CONST);
				((NumbContext)_localctx).nb = new Number(new Const2(((NumbContext)_localctx).c.getText()));
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(287);
				((NumbContext)_localctx).v = match(WORD);
				((NumbContext)_localctx).nb = new Number(new Var(((NumbContext)_localctx).v.getText()));
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(289);
				((NumbContext)_localctx).ra = rand();
				((NumbContext)_localctx).nb = new Number(((NumbContext)_localctx).ra.ra);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(292);
				((NumbContext)_localctx).ca = callFunction();
				((NumbContext)_localctx).nb =  new Number(((NumbContext)_localctx).ca.call);
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

	public static class RandContext extends ParserRuleContext {
		public Random ra;
		public NumbContext n;
		public NumbContext numb() {
			return getRuleContext(NumbContext.class,0);
		}
		public RandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterRand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitRand(this);
		}
	}

	public final RandContext rand() throws RecognitionException {
		RandContext _localctx = new RandContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_rand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			match(T__32);
			setState(298);
			((RandContext)_localctx).n = numb();
			setState(299);
			match(T__7);
			((RandContext)_localctx).ra = new Random(((RandContext)_localctx).n.nb);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 19:
			return factor_sempred((FactorContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean factor_sempred(FactorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3(\u0131\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\3\2\3"+
		"\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3"+
		"D\n\3\3\4\3\4\3\4\3\4\3\4\5\4K\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\5\6\\\n\6\3\7\3\7\3\7\3\7\3\7\5\7c\n\7\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0082\n\b\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0093\n\n\3\13\3\13\3"+
		"\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u00b3"+
		"\n\17\f\17\16\17\u00b6\13\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\5\21\u00d0\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00f2\n\23\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u0101\n\24"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\7\25\u0111\n\25\f\25\16\25\u0114\13\25\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\5\26\u011e\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\5\27\u012a\n\27\3\30\3\30\3\30\3\30\3\30\3\30\2\3(\31\2\4\6\b\n"+
		"\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\2\2\u013e\2\60\3\2\2\2\4C\3\2\2"+
		"\2\6J\3\2\2\2\bL\3\2\2\2\n[\3\2\2\2\fb\3\2\2\2\16\u0081\3\2\2\2\20\u0083"+
		"\3\2\2\2\22\u0092\3\2\2\2\24\u0094\3\2\2\2\26\u0097\3\2\2\2\30\u009c\3"+
		"\2\2\2\32\u00a0\3\2\2\2\34\u00a5\3\2\2\2\36\u00ba\3\2\2\2 \u00cf\3\2\2"+
		"\2\"\u00d1\3\2\2\2$\u00f1\3\2\2\2&\u0100\3\2\2\2(\u0102\3\2\2\2*\u011d"+
		"\3\2\2\2,\u0129\3\2\2\2.\u012b\3\2\2\2\60\61\5\4\3\2\61\62\b\2\1\2\62"+
		"\3\3\2\2\2\63\64\5\6\4\2\64\65\7\3\2\2\65\66\5\n\6\2\66\67\7\4\2\2\67"+
		"8\5\f\7\289\7\5\2\29:\5\6\4\2:;\b\3\1\2;D\3\2\2\2<=\5\6\4\2=>\7\6\2\2"+
		">?\5\f\7\2?@\7\5\2\2@A\5\6\4\2AB\b\3\1\2BD\3\2\2\2C\63\3\2\2\2C<\3\2\2"+
		"\2D\5\3\2\2\2EF\5\b\5\2FG\5\6\4\2GH\b\4\1\2HK\3\2\2\2IK\b\4\1\2JE\3\2"+
		"\2\2JI\3\2\2\2K\7\3\2\2\2LM\7%\2\2MN\7\7\2\2NO\5\n\6\2OP\7\4\2\2PQ\5\f"+
		"\7\2QR\7\5\2\2RS\b\5\1\2S\t\3\2\2\2TU\7%\2\2U\\\b\6\1\2VW\7%\2\2WX\7\b"+
		"\2\2XY\5\n\6\2YZ\b\6\1\2Z\\\3\2\2\2[T\3\2\2\2[V\3\2\2\2\\\13\3\2\2\2]"+
		"^\5\16\b\2^_\5\f\7\2_`\b\7\1\2`c\3\2\2\2ac\b\7\1\2b]\3\2\2\2ba\3\2\2\2"+
		"c\r\3\2\2\2de\5\32\16\2ef\7\t\2\2fg\b\b\1\2g\u0082\3\2\2\2hi\5\30\r\2"+
		"ij\7\t\2\2jk\b\b\1\2k\u0082\3\2\2\2lm\5\36\20\2mn\7\t\2\2no\b\b\1\2o\u0082"+
		"\3\2\2\2pq\5\34\17\2qr\b\b\1\2r\u0082\3\2\2\2st\5 \21\2tu\b\b\1\2u\u0082"+
		"\3\2\2\2vw\5\"\22\2wx\b\b\1\2x\u0082\3\2\2\2yz\5\26\f\2z{\7\t\2\2{|\b"+
		"\b\1\2|\u0082\3\2\2\2}~\5\22\n\2~\177\7\t\2\2\177\u0080\b\b\1\2\u0080"+
		"\u0082\3\2\2\2\u0081d\3\2\2\2\u0081h\3\2\2\2\u0081l\3\2\2\2\u0081p\3\2"+
		"\2\2\u0081s\3\2\2\2\u0081v\3\2\2\2\u0081y\3\2\2\2\u0081}\3\2\2\2\u0082"+
		"\17\3\2\2\2\u0083\u0084\7%\2\2\u0084\u0085\7\7\2\2\u0085\u0086\5\n\6\2"+
		"\u0086\u0087\7\n\2\2\u0087\u0088\b\t\1\2\u0088\21\3\2\2\2\u0089\u008a"+
		"\7\13\2\2\u008a\u008b\7%\2\2\u008b\u008c\7\n\2\2\u008c\u0093\b\n\1\2\u008d"+
		"\u008e\7\13\2\2\u008e\u008f\5\24\13\2\u008f\u0090\7\n\2\2\u0090\u0091"+
		"\b\n\1\2\u0091\u0093\3\2\2\2\u0092\u0089\3\2\2\2\u0092\u008d\3\2\2\2\u0093"+
		"\23\3\2\2\2\u0094\u0095\7(\2\2\u0095\u0096\b\13\1\2\u0096\25\3\2\2\2\u0097"+
		"\u0098\7\f\2\2\u0098\u0099\7%\2\2\u0099\u009a\7\n\2\2\u009a\u009b\b\f"+
		"\1\2\u009b\27\3\2\2\2\u009c\u009d\7\r\2\2\u009d\u009e\5\n\6\2\u009e\u009f"+
		"\b\r\1\2\u009f\31\3\2\2\2\u00a0\u00a1\7%\2\2\u00a1\u00a2\7\16\2\2\u00a2"+
		"\u00a3\5&\24\2\u00a3\u00a4\b\16\1\2\u00a4\33\3\2\2\2\u00a5\u00b4\7\17"+
		"\2\2\u00a6\u00b3\5,\27\2\u00a7\u00b3\7\b\2\2\u00a8\u00b3\7\t\2\2\u00a9"+
		"\u00b3\7\20\2\2\u00aa\u00b3\7\21\2\2\u00ab\u00b3\7\22\2\2\u00ac\u00b3"+
		"\7\23\2\2\u00ad\u00b3\7\24\2\2\u00ae\u00b3\7\25\2\2\u00af\u00b3\7\26\2"+
		"\2\u00b0\u00b3\7\27\2\2\u00b1\u00b3\7\30\2\2\u00b2\u00a6\3\2\2\2\u00b2"+
		"\u00a7\3\2\2\2\u00b2\u00a8\3\2\2\2\u00b2\u00a9\3\2\2\2\u00b2\u00aa\3\2"+
		"\2\2\u00b2\u00ab\3\2\2\2\u00b2\u00ac\3\2\2\2\u00b2\u00ad\3\2\2\2\u00b2"+
		"\u00ae\3\2\2\2\u00b2\u00af\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b1\3\2"+
		"\2\2\u00b3\u00b6\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5"+
		"\u00b7\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b7\u00b8\7\31\2\2\u00b8\u00b9\b"+
		"\17\1\2\u00b9\35\3\2\2\2\u00ba\u00bb\7\r\2\2\u00bb\u00bc\5\32\16\2\u00bc"+
		"\u00bd\b\20\1\2\u00bd\37\3\2\2\2\u00be\u00bf\7\32\2\2\u00bf\u00c0\5$\23"+
		"\2\u00c0\u00c1\7\4\2\2\u00c1\u00c2\5\f\7\2\u00c2\u00c3\7\5\2\2\u00c3\u00c4"+
		"\7\33\2\2\u00c4\u00c5\5\f\7\2\u00c5\u00c6\7\5\2\2\u00c6\u00c7\b\21\1\2"+
		"\u00c7\u00d0\3\2\2\2\u00c8\u00c9\7\32\2\2\u00c9\u00ca\5$\23\2\u00ca\u00cb"+
		"\7\4\2\2\u00cb\u00cc\5\f\7\2\u00cc\u00cd\7\5\2\2\u00cd\u00ce\b\21\1\2"+
		"\u00ce\u00d0\3\2\2\2\u00cf\u00be\3\2\2\2\u00cf\u00c8\3\2\2\2\u00d0!\3"+
		"\2\2\2\u00d1\u00d2\7\34\2\2\u00d2\u00d3\5$\23\2\u00d3\u00d4\7\4\2\2\u00d4"+
		"\u00d5\5\f\7\2\u00d5\u00d6\7\5\2\2\u00d6\u00d7\b\22\1\2\u00d7#\3\2\2\2"+
		"\u00d8\u00d9\5&\24\2\u00d9\u00da\7\35\2\2\u00da\u00db\5&\24\2\u00db\u00dc"+
		"\b\23\1\2\u00dc\u00f2\3\2\2\2\u00dd\u00de\5&\24\2\u00de\u00df\7\36\2\2"+
		"\u00df\u00e0\5&\24\2\u00e0\u00e1\b\23\1\2\u00e1\u00f2\3\2\2\2\u00e2\u00e3"+
		"\5&\24\2\u00e3\u00e4\7\37\2\2\u00e4\u00e5\5&\24\2\u00e5\u00e6\b\23\1\2"+
		"\u00e6\u00f2\3\2\2\2\u00e7\u00e8\5&\24\2\u00e8\u00e9\7 \2\2\u00e9\u00ea"+
		"\5&\24\2\u00ea\u00eb\b\23\1\2\u00eb\u00f2\3\2\2\2\u00ec\u00ed\5&\24\2"+
		"\u00ed\u00ee\7!\2\2\u00ee\u00ef\5&\24\2\u00ef\u00f0\b\23\1\2\u00f0\u00f2"+
		"\3\2\2\2\u00f1\u00d8\3\2\2\2\u00f1\u00dd\3\2\2\2\u00f1\u00e2\3\2\2\2\u00f1"+
		"\u00e7\3\2\2\2\u00f1\u00ec\3\2\2\2\u00f2%\3\2\2\2\u00f3\u00f4\5(\25\2"+
		"\u00f4\u00f5\7\"\2\2\u00f5\u00f6\5&\24\2\u00f6\u00f7\b\24\1\2\u00f7\u0101"+
		"\3\2\2\2\u00f8\u00f9\5(\25\2\u00f9\u00fa\7\25\2\2\u00fa\u00fb\5&\24\2"+
		"\u00fb\u00fc\b\24\1\2\u00fc\u0101\3\2\2\2\u00fd\u00fe\5(\25\2\u00fe\u00ff"+
		"\b\24\1\2\u00ff\u0101\3\2\2\2\u0100\u00f3\3\2\2\2\u0100\u00f8\3\2\2\2"+
		"\u0100\u00fd\3\2\2\2\u0101\'\3\2\2\2\u0102\u0103\b\25\1\2\u0103\u0104"+
		"\5*\26\2\u0104\u0105\b\25\1\2\u0105\u0112\3\2\2\2\u0106\u0107\f\5\2\2"+
		"\u0107\u0108\7\23\2\2\u0108\u0109\5*\26\2\u0109\u010a\b\25\1\2\u010a\u0111"+
		"\3\2\2\2\u010b\u010c\f\4\2\2\u010c\u010d\7\24\2\2\u010d\u010e\5*\26\2"+
		"\u010e\u010f\b\25\1\2\u010f\u0111\3\2\2\2\u0110\u0106\3\2\2\2\u0110\u010b"+
		"\3\2\2\2\u0111\u0114\3\2\2\2\u0112\u0110\3\2\2\2\u0112\u0113\3\2\2\2\u0113"+
		")\3\2\2\2\u0114\u0112\3\2\2\2\u0115\u0116\7\7\2\2\u0116\u0117\5&\24\2"+
		"\u0117\u0118\7\n\2\2\u0118\u0119\b\26\1\2\u0119\u011e\3\2\2\2\u011a\u011b"+
		"\5,\27\2\u011b\u011c\b\26\1\2\u011c\u011e\3\2\2\2\u011d\u0115\3\2\2\2"+
		"\u011d\u011a\3\2\2\2\u011e+\3\2\2\2\u011f\u0120\7$\2\2\u0120\u012a\b\27"+
		"\1\2\u0121\u0122\7%\2\2\u0122\u012a\b\27\1\2\u0123\u0124\5.\30\2\u0124"+
		"\u0125\b\27\1\2\u0125\u012a\3\2\2\2\u0126\u0127\5\20\t\2\u0127\u0128\b"+
		"\27\1\2\u0128\u012a\3\2\2\2\u0129\u011f\3\2\2\2\u0129\u0121\3\2\2\2\u0129"+
		"\u0123\3\2\2\2\u0129\u0126\3\2\2\2\u012a-\3\2\2\2\u012b\u012c\7#\2\2\u012c"+
		"\u012d\5,\27\2\u012d\u012e\7\n\2\2\u012e\u012f\b\30\1\2\u012f/\3\2\2\2"+
		"\21CJ[b\u0081\u0092\u00b2\u00b4\u00cf\u00f1\u0100\u0110\u0112\u011d\u0129";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}