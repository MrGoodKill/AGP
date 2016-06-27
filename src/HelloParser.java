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
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, CONST=37, WORD=38, PCT=39, 
		WS=40, STR=41;
	public static final int
		RULE_r = 0, RULE_prog = 1, RULE_listfunc = 2, RULE_function = 3, RULE_listvar = 4, 
		RULE_listop = 5, RULE_bloc = 6, RULE_inst = 7, RULE_return2 = 8, RULE_callFunction = 9, 
		RULE_print = 10, RULE_string2 = 11, RULE_ask = 12, RULE_declaration = 13, 
		RULE_affct = 14, RULE_comment = 15, RULE_declaffct = 16, RULE_if2 = 17, 
		RULE_while2 = 18, RULE_cond = 19, RULE_condlist = 20, RULE_operation = 21, 
		RULE_factor = 22, RULE_final2 = 23, RULE_numb = 24, RULE_rand = 25;
	public static final String[] ruleNames = {
		"r", "prog", "listfunc", "function", "listvar", "listop", "bloc", "inst", 
		"return2", "callFunction", "print", "string2", "ask", "declaration", "affct", 
		"comment", "declaffct", "if2", "while2", "cond", "condlist", "operation", 
		"factor", "final2", "numb", "rand"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'main('", "'){'", "'}'", "'main(){'", "'('", "','", "';'", "'return '", 
		"')'", "'print('", "'ask('", "'var '", "':='", "'/*'", "'!'", "'.'", "'?'", 
		"'*'", "'/'", "'-'", "'Ã'", "'©'", "'¨'", "'*/'", "'if('", "'else{'", 
		"'while('", "'='", "'>'", "'<'", "'<='", "'>='", "'et'", "'ou'", "'+'", 
		"'rand('"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "CONST", "WORD", "PCT", "WS", "STR"
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
			setState(52);
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
			setState(71);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(55);
				((ProgContext)_localctx).l1 = listfunc();
				setState(56);
				match(T__0);
				setState(57);
				((ProgContext)_localctx).l = listvar();
				setState(58);
				match(T__1);
				setState(59);
				((ProgContext)_localctx).b = bloc();
				setState(60);
				match(T__2);
				setState(61);
				((ProgContext)_localctx).l2 = listfunc();
				((ProgContext)_localctx).p =  new Prog(((ProgContext)_localctx).l.lv,((ProgContext)_localctx).b.bc,((ProgContext)_localctx).l1.lf,((ProgContext)_localctx).l2.lf);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(64);
				((ProgContext)_localctx).l1 = listfunc();
				setState(65);
				match(T__3);
				setState(66);
				((ProgContext)_localctx).b = bloc();
				setState(67);
				match(T__2);
				setState(68);
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
			setState(78);
			switch (_input.LA(1)) {
			case WORD:
				enterOuterAlt(_localctx, 1);
				{
				setState(73);
				((ListfuncContext)_localctx).f = function();
				setState(74);
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
			setState(80);
			((FunctionContext)_localctx).v = match(WORD);
			setState(81);
			match(T__4);
			setState(82);
			((FunctionContext)_localctx).l = listvar();
			setState(83);
			match(T__1);
			setState(84);
			((FunctionContext)_localctx).b = bloc();
			setState(85);
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
			setState(95);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(88);
				((ListvarContext)_localctx).v = match(WORD);
				((ListvarContext)_localctx).lv =  new ListVar(new Var(((ListvarContext)_localctx).v.getText()));
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(90);
				((ListvarContext)_localctx).v = match(WORD);
				setState(91);
				match(T__5);
				setState(92);
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

	public static class ListopContext extends ParserRuleContext {
		public ListOp lo;
		public OperationContext o;
		public ListopContext l;
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public ListopContext listop() {
			return getRuleContext(ListopContext.class,0);
		}
		public ListopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterListop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitListop(this);
		}
	}

	public final ListopContext listop() throws RecognitionException {
		ListopContext _localctx = new ListopContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_listop);
		try {
			setState(105);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(97);
				((ListopContext)_localctx).o = operation();
				((ListopContext)_localctx).lo =  new ListOp(((ListopContext)_localctx).o.op);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(100);
				((ListopContext)_localctx).o = operation();
				setState(101);
				match(T__5);
				setState(102);
				((ListopContext)_localctx).l = listop();
				((ListopContext)_localctx).lo =  new ListOp(((ListopContext)_localctx).o.op,((ListopContext)_localctx).l.lo);
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
		enterRule(_localctx, 12, RULE_bloc);
		try {
			setState(112);
			switch (_input.LA(1)) {
			case T__7:
			case T__9:
			case T__10:
			case T__11:
			case T__13:
			case T__24:
			case T__26:
			case WORD:
				enterOuterAlt(_localctx, 1);
				{
				setState(107);
				((BlocContext)_localctx).i = inst();
				setState(108);
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
		public Return2Context re;
		public CallFunctionContext ca;
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
		public Return2Context return2() {
			return getRuleContext(Return2Context.class,0);
		}
		public CallFunctionContext callFunction() {
			return getRuleContext(CallFunctionContext.class,0);
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
		enterRule(_localctx, 14, RULE_inst);
		try {
			setState(151);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(114);
				((InstContext)_localctx).a = affct();
				setState(115);
				match(T__6);
				((InstContext)_localctx).instruct =  new Inst(((InstContext)_localctx).a.aff);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(118);
				((InstContext)_localctx).d1 = declaration();
				setState(119);
				match(T__6);
				((InstContext)_localctx).instruct =  new Inst(((InstContext)_localctx).d1.decl);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(122);
				((InstContext)_localctx).d2 = declaffct();
				setState(123);
				match(T__6);
				((InstContext)_localctx).instruct =  new Inst(((InstContext)_localctx).d2.decaf);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(126);
				((InstContext)_localctx).c = comment();
				((InstContext)_localctx).instruct =  new Inst(((InstContext)_localctx).c.com);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(129);
				((InstContext)_localctx).i = if2();
				((InstContext)_localctx).instruct =  new Inst(((InstContext)_localctx).i.i);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(132);
				((InstContext)_localctx).w = while2();
				((InstContext)_localctx).instruct =  new Inst(((InstContext)_localctx).w.w);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(135);
				((InstContext)_localctx).as = ask();
				setState(136);
				match(T__6);
				((InstContext)_localctx).instruct =  new Inst(((InstContext)_localctx).as.a);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(139);
				((InstContext)_localctx).p = print();
				setState(140);
				match(T__6);
				((InstContext)_localctx).instruct =  new Inst(((InstContext)_localctx).p.p);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(143);
				((InstContext)_localctx).re = return2();
				setState(144);
				match(T__6);
				((InstContext)_localctx).instruct =  new Inst(((InstContext)_localctx).re.ret);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(147);
				((InstContext)_localctx).ca = callFunction();
				setState(148);
				match(T__6);
				((InstContext)_localctx).instruct =  new Inst(((InstContext)_localctx).ca.call);
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

	public static class Return2Context extends ParserRuleContext {
		public Return2 ret;
		public OperationContext o;
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public Return2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterReturn2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitReturn2(this);
		}
	}

	public final Return2Context return2() throws RecognitionException {
		Return2Context _localctx = new Return2Context(_ctx, getState());
		enterRule(_localctx, 16, RULE_return2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(T__7);
			setState(154);
			((Return2Context)_localctx).o = operation();
			((Return2Context)_localctx).ret =  new Return2(((Return2Context)_localctx).o.op);
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
		public ListopContext lo;
		public TerminalNode WORD() { return getToken(HelloParser.WORD, 0); }
		public ListopContext listop() {
			return getRuleContext(ListopContext.class,0);
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
		enterRule(_localctx, 18, RULE_callFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			((CallFunctionContext)_localctx).v = match(WORD);
			setState(158);
			match(T__4);
			setState(159);
			((CallFunctionContext)_localctx).lo = listop();
			setState(160);
			match(T__8);
			((CallFunctionContext)_localctx).call =  new CallFunction(new Var(((CallFunctionContext)_localctx).v.getText()),((CallFunctionContext)_localctx).lo.lo);
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
		enterRule(_localctx, 20, RULE_print);
		try {
			setState(172);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(163);
				match(T__9);
				setState(164);
				((PrintContext)_localctx).v = match(WORD);
				setState(165);
				match(T__8);
				((PrintContext)_localctx).p =  new Print(new Var(((PrintContext)_localctx).v.getText()));
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(167);
				match(T__9);
				setState(168);
				((PrintContext)_localctx).s = string2();
				setState(169);
				match(T__8);
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
		enterRule(_localctx, 22, RULE_string2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
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
		enterRule(_localctx, 24, RULE_ask);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(T__10);
			setState(178);
			((AskContext)_localctx).v = match(WORD);
			setState(179);
			match(T__8);
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
		enterRule(_localctx, 26, RULE_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			match(T__11);
			setState(183);
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
		enterRule(_localctx, 28, RULE_affct);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			((AffctContext)_localctx).v = match(WORD);
			setState(187);
			match(T__12);
			setState(188);
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
		enterRule(_localctx, 30, RULE_comment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(T__13);
			setState(206);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__35) | (1L << CONST) | (1L << WORD))) != 0)) {
				{
				setState(204);
				switch (_input.LA(1)) {
				case T__35:
				case CONST:
				case WORD:
					{
					setState(192);
					numb();
					}
					break;
				case T__5:
					{
					setState(193);
					match(T__5);
					}
					break;
				case T__6:
					{
					setState(194);
					match(T__6);
					}
					break;
				case T__14:
					{
					setState(195);
					match(T__14);
					}
					break;
				case T__15:
					{
					setState(196);
					match(T__15);
					}
					break;
				case T__16:
					{
					setState(197);
					match(T__16);
					}
					break;
				case T__17:
					{
					setState(198);
					match(T__17);
					}
					break;
				case T__18:
					{
					setState(199);
					match(T__18);
					}
					break;
				case T__19:
					{
					setState(200);
					match(T__19);
					}
					break;
				case T__20:
					{
					setState(201);
					match(T__20);
					}
					break;
				case T__21:
					{
					setState(202);
					match(T__21);
					}
					break;
				case T__22:
					{
					setState(203);
					match(T__22);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(208);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(209);
			match(T__23);
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
		enterRule(_localctx, 32, RULE_declaffct);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			match(T__11);
			setState(213);
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
		public CondlistContext lc;
		public BlocContext b;
		public BlocContext b2;
		public CondlistContext condlist() {
			return getRuleContext(CondlistContext.class,0);
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
		enterRule(_localctx, 34, RULE_if2);
		try {
			setState(233);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(216);
				match(T__24);
				setState(217);
				((If2Context)_localctx).lc = condlist();
				setState(218);
				match(T__1);
				setState(219);
				((If2Context)_localctx).b = bloc();
				setState(220);
				match(T__2);
				setState(221);
				match(T__25);
				setState(222);
				((If2Context)_localctx).b2 = bloc();
				setState(223);
				match(T__2);
				((If2Context)_localctx).i =  new If2(((If2Context)_localctx).lc.lc,((If2Context)_localctx).b.bc,((If2Context)_localctx).b2.bc);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(226);
				match(T__24);
				setState(227);
				((If2Context)_localctx).lc = condlist();
				setState(228);
				match(T__1);
				setState(229);
				((If2Context)_localctx).b = bloc();
				setState(230);
				match(T__2);
				((If2Context)_localctx).i =  new If2(((If2Context)_localctx).lc.lc,((If2Context)_localctx).b.bc);
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
		public CondlistContext lc;
		public BlocContext b;
		public CondlistContext condlist() {
			return getRuleContext(CondlistContext.class,0);
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
		enterRule(_localctx, 36, RULE_while2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			match(T__26);
			setState(236);
			((While2Context)_localctx).lc = condlist();
			setState(237);
			match(T__1);
			setState(238);
			((While2Context)_localctx).b = bloc();
			setState(239);
			match(T__2);
			((While2Context)_localctx).w =  new While2(((While2Context)_localctx).lc.lc,((While2Context)_localctx).b.bc);
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
		public CondlistContext lc;
		public OperationContext op1;
		public OperationContext op2;
		public CondlistContext condlist() {
			return getRuleContext(CondlistContext.class,0);
		}
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
		enterRule(_localctx, 38, RULE_cond);
		try {
			setState(272);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(242);
				match(T__4);
				setState(243);
				((CondContext)_localctx).lc = condlist();
				setState(244);
				match(T__8);
				((CondContext)_localctx).c =  new Cond(((CondContext)_localctx).lc.lc);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(247);
				((CondContext)_localctx).op1 = operation();
				setState(248);
				match(T__27);
				setState(249);
				((CondContext)_localctx).op2 = operation();
				((CondContext)_localctx).c =  new Cond(((CondContext)_localctx).op1.op,((CondContext)_localctx).op2.op,"=");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(252);
				((CondContext)_localctx).op1 = operation();
				setState(253);
				match(T__28);
				setState(254);
				((CondContext)_localctx).op2 = operation();
				((CondContext)_localctx).c =  new Cond(((CondContext)_localctx).op1.op,((CondContext)_localctx).op2.op,">");
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(257);
				((CondContext)_localctx).op1 = operation();
				setState(258);
				match(T__29);
				setState(259);
				((CondContext)_localctx).op2 = operation();
				((CondContext)_localctx).c =  new Cond(((CondContext)_localctx).op1.op,((CondContext)_localctx).op2.op,"<");
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(262);
				((CondContext)_localctx).op1 = operation();
				setState(263);
				match(T__30);
				setState(264);
				((CondContext)_localctx).op2 = operation();
				((CondContext)_localctx).c =  new Cond(((CondContext)_localctx).op1.op,((CondContext)_localctx).op2.op,"<=");
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(267);
				((CondContext)_localctx).op1 = operation();
				setState(268);
				match(T__31);
				setState(269);
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

	public static class CondlistContext extends ParserRuleContext {
		public ListCond lc;
		public CondContext c;
		public CondlistContext l;
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public CondlistContext condlist() {
			return getRuleContext(CondlistContext.class,0);
		}
		public CondlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterCondlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitCondlist(this);
		}
	}

	public final CondlistContext condlist() throws RecognitionException {
		CondlistContext _localctx = new CondlistContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_condlist);
		try {
			setState(287);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(274);
				((CondlistContext)_localctx).c = cond();
				setState(275);
				match(T__32);
				setState(276);
				((CondlistContext)_localctx).l = condlist();
				((CondlistContext)_localctx).lc =  new ListCond(((CondlistContext)_localctx).c.c,((CondlistContext)_localctx).l.lc,"et");
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(279);
				((CondlistContext)_localctx).c = cond();
				setState(280);
				match(T__33);
				setState(281);
				((CondlistContext)_localctx).l = condlist();
				((CondlistContext)_localctx).lc =  new ListCond(((CondlistContext)_localctx).c.c,((CondlistContext)_localctx).l.lc,"ou");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(284);
				((CondlistContext)_localctx).c = cond();
				((CondlistContext)_localctx).lc =  new ListCond(((CondlistContext)_localctx).c.c);
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
		enterRule(_localctx, 42, RULE_operation);
		try {
			setState(302);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(289);
				((OperationContext)_localctx).f1 = factor(0);
				setState(290);
				match(T__34);
				setState(291);
				((OperationContext)_localctx).op2 = operation();
				((OperationContext)_localctx).op = new Op(((OperationContext)_localctx).f1.f,((OperationContext)_localctx).op2.op,"+");
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(294);
				((OperationContext)_localctx).f1 = factor(0);
				setState(295);
				match(T__19);
				setState(296);
				((OperationContext)_localctx).op2 = operation();
				((OperationContext)_localctx).op = new Op(((OperationContext)_localctx).f1.f,((OperationContext)_localctx).op2.op,"-");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(299);
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
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_factor, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(305);
			((FactorContext)_localctx).f3 = final2();
			((FactorContext)_localctx).f = new Factor(((FactorContext)_localctx).f3.f);
			}
			_ctx.stop = _input.LT(-1);
			setState(320);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(318);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new FactorContext(_parentctx, _parentState);
						_localctx.f1 = _prevctx;
						_localctx.f1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_factor);
						setState(308);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(309);
						match(T__17);
						setState(310);
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
						setState(313);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(314);
						match(T__18);
						setState(315);
						((FactorContext)_localctx).f2 = final2();
						((FactorContext)_localctx).f = new Factor(((FactorContext)_localctx).f1.f,((FactorContext)_localctx).f2.f,"/");
						}
						break;
					}
					} 
				}
				setState(322);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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
		enterRule(_localctx, 46, RULE_final2);
		try {
			setState(331);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(323);
				match(T__4);
				setState(324);
				((Final2Context)_localctx).op1 = operation();
				setState(325);
				match(T__8);
				((Final2Context)_localctx).f = new Final2(((Final2Context)_localctx).op1.op);
				}
				break;
			case T__35:
			case CONST:
			case WORD:
				enterOuterAlt(_localctx, 2);
				{
				setState(328);
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
		enterRule(_localctx, 48, RULE_numb);
		try {
			setState(343);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(333);
				((NumbContext)_localctx).c = match(CONST);
				((NumbContext)_localctx).nb = new Number(new Const2(((NumbContext)_localctx).c.getText()));
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(335);
				((NumbContext)_localctx).v = match(WORD);
				((NumbContext)_localctx).nb = new Number(new Var(((NumbContext)_localctx).v.getText()));
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(337);
				((NumbContext)_localctx).ra = rand();
				((NumbContext)_localctx).nb = new Number(((NumbContext)_localctx).ra.ra);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(340);
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
		enterRule(_localctx, 50, RULE_rand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			match(T__35);
			setState(346);
			((RandContext)_localctx).n = numb();
			setState(347);
			match(T__8);
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
		case 22:
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3+\u0161\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3J\n\3\3\4\3\4\3\4\3\4\3\4\5\4Q\n\4\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6b\n\6\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7l\n\7\3\b\3\b\3\b\3\b\3\b\5\bs\n\b\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\5\t\u009a\n\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00af\n\f\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u00cf\n\21\f\21"+
		"\16\21\u00d2\13\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5"+
		"\23\u00ec\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0113"+
		"\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\5\26\u0122\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\5\27\u0131\n\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\7\30\u0141\n\30\f\30\16\30\u0144\13\30\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u014e\n\31\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u015a\n\32\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\2\3.\34\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64"+
		"\2\2\u0171\2\66\3\2\2\2\4I\3\2\2\2\6P\3\2\2\2\bR\3\2\2\2\na\3\2\2\2\f"+
		"k\3\2\2\2\16r\3\2\2\2\20\u0099\3\2\2\2\22\u009b\3\2\2\2\24\u009f\3\2\2"+
		"\2\26\u00ae\3\2\2\2\30\u00b0\3\2\2\2\32\u00b3\3\2\2\2\34\u00b8\3\2\2\2"+
		"\36\u00bc\3\2\2\2 \u00c1\3\2\2\2\"\u00d6\3\2\2\2$\u00eb\3\2\2\2&\u00ed"+
		"\3\2\2\2(\u0112\3\2\2\2*\u0121\3\2\2\2,\u0130\3\2\2\2.\u0132\3\2\2\2\60"+
		"\u014d\3\2\2\2\62\u0159\3\2\2\2\64\u015b\3\2\2\2\66\67\5\4\3\2\678\b\2"+
		"\1\28\3\3\2\2\29:\5\6\4\2:;\7\3\2\2;<\5\n\6\2<=\7\4\2\2=>\5\16\b\2>?\7"+
		"\5\2\2?@\5\6\4\2@A\b\3\1\2AJ\3\2\2\2BC\5\6\4\2CD\7\6\2\2DE\5\16\b\2EF"+
		"\7\5\2\2FG\5\6\4\2GH\b\3\1\2HJ\3\2\2\2I9\3\2\2\2IB\3\2\2\2J\5\3\2\2\2"+
		"KL\5\b\5\2LM\5\6\4\2MN\b\4\1\2NQ\3\2\2\2OQ\b\4\1\2PK\3\2\2\2PO\3\2\2\2"+
		"Q\7\3\2\2\2RS\7(\2\2ST\7\7\2\2TU\5\n\6\2UV\7\4\2\2VW\5\16\b\2WX\7\5\2"+
		"\2XY\b\5\1\2Y\t\3\2\2\2Z[\7(\2\2[b\b\6\1\2\\]\7(\2\2]^\7\b\2\2^_\5\n\6"+
		"\2_`\b\6\1\2`b\3\2\2\2aZ\3\2\2\2a\\\3\2\2\2b\13\3\2\2\2cd\5,\27\2de\b"+
		"\7\1\2el\3\2\2\2fg\5,\27\2gh\7\b\2\2hi\5\f\7\2ij\b\7\1\2jl\3\2\2\2kc\3"+
		"\2\2\2kf\3\2\2\2l\r\3\2\2\2mn\5\20\t\2no\5\16\b\2op\b\b\1\2ps\3\2\2\2"+
		"qs\b\b\1\2rm\3\2\2\2rq\3\2\2\2s\17\3\2\2\2tu\5\36\20\2uv\7\t\2\2vw\b\t"+
		"\1\2w\u009a\3\2\2\2xy\5\34\17\2yz\7\t\2\2z{\b\t\1\2{\u009a\3\2\2\2|}\5"+
		"\"\22\2}~\7\t\2\2~\177\b\t\1\2\177\u009a\3\2\2\2\u0080\u0081\5 \21\2\u0081"+
		"\u0082\b\t\1\2\u0082\u009a\3\2\2\2\u0083\u0084\5$\23\2\u0084\u0085\b\t"+
		"\1\2\u0085\u009a\3\2\2\2\u0086\u0087\5&\24\2\u0087\u0088\b\t\1\2\u0088"+
		"\u009a\3\2\2\2\u0089\u008a\5\32\16\2\u008a\u008b\7\t\2\2\u008b\u008c\b"+
		"\t\1\2\u008c\u009a\3\2\2\2\u008d\u008e\5\26\f\2\u008e\u008f\7\t\2\2\u008f"+
		"\u0090\b\t\1\2\u0090\u009a\3\2\2\2\u0091\u0092\5\22\n\2\u0092\u0093\7"+
		"\t\2\2\u0093\u0094\b\t\1\2\u0094\u009a\3\2\2\2\u0095\u0096\5\24\13\2\u0096"+
		"\u0097\7\t\2\2\u0097\u0098\b\t\1\2\u0098\u009a\3\2\2\2\u0099t\3\2\2\2"+
		"\u0099x\3\2\2\2\u0099|\3\2\2\2\u0099\u0080\3\2\2\2\u0099\u0083\3\2\2\2"+
		"\u0099\u0086\3\2\2\2\u0099\u0089\3\2\2\2\u0099\u008d\3\2\2\2\u0099\u0091"+
		"\3\2\2\2\u0099\u0095\3\2\2\2\u009a\21\3\2\2\2\u009b\u009c\7\n\2\2\u009c"+
		"\u009d\5,\27\2\u009d\u009e\b\n\1\2\u009e\23\3\2\2\2\u009f\u00a0\7(\2\2"+
		"\u00a0\u00a1\7\7\2\2\u00a1\u00a2\5\f\7\2\u00a2\u00a3\7\13\2\2\u00a3\u00a4"+
		"\b\13\1\2\u00a4\25\3\2\2\2\u00a5\u00a6\7\f\2\2\u00a6\u00a7\7(\2\2\u00a7"+
		"\u00a8\7\13\2\2\u00a8\u00af\b\f\1\2\u00a9\u00aa\7\f\2\2\u00aa\u00ab\5"+
		"\30\r\2\u00ab\u00ac\7\13\2\2\u00ac\u00ad\b\f\1\2\u00ad\u00af\3\2\2\2\u00ae"+
		"\u00a5\3\2\2\2\u00ae\u00a9\3\2\2\2\u00af\27\3\2\2\2\u00b0\u00b1\7+\2\2"+
		"\u00b1\u00b2\b\r\1\2\u00b2\31\3\2\2\2\u00b3\u00b4\7\r\2\2\u00b4\u00b5"+
		"\7(\2\2\u00b5\u00b6\7\13\2\2\u00b6\u00b7\b\16\1\2\u00b7\33\3\2\2\2\u00b8"+
		"\u00b9\7\16\2\2\u00b9\u00ba\5\n\6\2\u00ba\u00bb\b\17\1\2\u00bb\35\3\2"+
		"\2\2\u00bc\u00bd\7(\2\2\u00bd\u00be\7\17\2\2\u00be\u00bf\5,\27\2\u00bf"+
		"\u00c0\b\20\1\2\u00c0\37\3\2\2\2\u00c1\u00d0\7\20\2\2\u00c2\u00cf\5\62"+
		"\32\2\u00c3\u00cf\7\b\2\2\u00c4\u00cf\7\t\2\2\u00c5\u00cf\7\21\2\2\u00c6"+
		"\u00cf\7\22\2\2\u00c7\u00cf\7\23\2\2\u00c8\u00cf\7\24\2\2\u00c9\u00cf"+
		"\7\25\2\2\u00ca\u00cf\7\26\2\2\u00cb\u00cf\7\27\2\2\u00cc\u00cf\7\30\2"+
		"\2\u00cd\u00cf\7\31\2\2\u00ce\u00c2\3\2\2\2\u00ce\u00c3\3\2\2\2\u00ce"+
		"\u00c4\3\2\2\2\u00ce\u00c5\3\2\2\2\u00ce\u00c6\3\2\2\2\u00ce\u00c7\3\2"+
		"\2\2\u00ce\u00c8\3\2\2\2\u00ce\u00c9\3\2\2\2\u00ce\u00ca\3\2\2\2\u00ce"+
		"\u00cb\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cd\3\2\2\2\u00cf\u00d2\3\2"+
		"\2\2\u00d0\u00ce\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d3\3\2\2\2\u00d2"+
		"\u00d0\3\2\2\2\u00d3\u00d4\7\32\2\2\u00d4\u00d5\b\21\1\2\u00d5!\3\2\2"+
		"\2\u00d6\u00d7\7\16\2\2\u00d7\u00d8\5\36\20\2\u00d8\u00d9\b\22\1\2\u00d9"+
		"#\3\2\2\2\u00da\u00db\7\33\2\2\u00db\u00dc\5*\26\2\u00dc\u00dd\7\4\2\2"+
		"\u00dd\u00de\5\16\b\2\u00de\u00df\7\5\2\2\u00df\u00e0\7\34\2\2\u00e0\u00e1"+
		"\5\16\b\2\u00e1\u00e2\7\5\2\2\u00e2\u00e3\b\23\1\2\u00e3\u00ec\3\2\2\2"+
		"\u00e4\u00e5\7\33\2\2\u00e5\u00e6\5*\26\2\u00e6\u00e7\7\4\2\2\u00e7\u00e8"+
		"\5\16\b\2\u00e8\u00e9\7\5\2\2\u00e9\u00ea\b\23\1\2\u00ea\u00ec\3\2\2\2"+
		"\u00eb\u00da\3\2\2\2\u00eb\u00e4\3\2\2\2\u00ec%\3\2\2\2\u00ed\u00ee\7"+
		"\35\2\2\u00ee\u00ef\5*\26\2\u00ef\u00f0\7\4\2\2\u00f0\u00f1\5\16\b\2\u00f1"+
		"\u00f2\7\5\2\2\u00f2\u00f3\b\24\1\2\u00f3\'\3\2\2\2\u00f4\u00f5\7\7\2"+
		"\2\u00f5\u00f6\5*\26\2\u00f6\u00f7\7\13\2\2\u00f7\u00f8\b\25\1\2\u00f8"+
		"\u0113\3\2\2\2\u00f9\u00fa\5,\27\2\u00fa\u00fb\7\36\2\2\u00fb\u00fc\5"+
		",\27\2\u00fc\u00fd\b\25\1\2\u00fd\u0113\3\2\2\2\u00fe\u00ff\5,\27\2\u00ff"+
		"\u0100\7\37\2\2\u0100\u0101\5,\27\2\u0101\u0102\b\25\1\2\u0102\u0113\3"+
		"\2\2\2\u0103\u0104\5,\27\2\u0104\u0105\7 \2\2\u0105\u0106\5,\27\2\u0106"+
		"\u0107\b\25\1\2\u0107\u0113\3\2\2\2\u0108\u0109\5,\27\2\u0109\u010a\7"+
		"!\2\2\u010a\u010b\5,\27\2\u010b\u010c\b\25\1\2\u010c\u0113\3\2\2\2\u010d"+
		"\u010e\5,\27\2\u010e\u010f\7\"\2\2\u010f\u0110\5,\27\2\u0110\u0111\b\25"+
		"\1\2\u0111\u0113\3\2\2\2\u0112\u00f4\3\2\2\2\u0112\u00f9\3\2\2\2\u0112"+
		"\u00fe\3\2\2\2\u0112\u0103\3\2\2\2\u0112\u0108\3\2\2\2\u0112\u010d\3\2"+
		"\2\2\u0113)\3\2\2\2\u0114\u0115\5(\25\2\u0115\u0116\7#\2\2\u0116\u0117"+
		"\5*\26\2\u0117\u0118\b\26\1\2\u0118\u0122\3\2\2\2\u0119\u011a\5(\25\2"+
		"\u011a\u011b\7$\2\2\u011b\u011c\5*\26\2\u011c\u011d\b\26\1\2\u011d\u0122"+
		"\3\2\2\2\u011e\u011f\5(\25\2\u011f\u0120\b\26\1\2\u0120\u0122\3\2\2\2"+
		"\u0121\u0114\3\2\2\2\u0121\u0119\3\2\2\2\u0121\u011e\3\2\2\2\u0122+\3"+
		"\2\2\2\u0123\u0124\5.\30\2\u0124\u0125\7%\2\2\u0125\u0126\5,\27\2\u0126"+
		"\u0127\b\27\1\2\u0127\u0131\3\2\2\2\u0128\u0129\5.\30\2\u0129\u012a\7"+
		"\26\2\2\u012a\u012b\5,\27\2\u012b\u012c\b\27\1\2\u012c\u0131\3\2\2\2\u012d"+
		"\u012e\5.\30\2\u012e\u012f\b\27\1\2\u012f\u0131\3\2\2\2\u0130\u0123\3"+
		"\2\2\2\u0130\u0128\3\2\2\2\u0130\u012d\3\2\2\2\u0131-\3\2\2\2\u0132\u0133"+
		"\b\30\1\2\u0133\u0134\5\60\31\2\u0134\u0135\b\30\1\2\u0135\u0142\3\2\2"+
		"\2\u0136\u0137\f\5\2\2\u0137\u0138\7\24\2\2\u0138\u0139\5\60\31\2\u0139"+
		"\u013a\b\30\1\2\u013a\u0141\3\2\2\2\u013b\u013c\f\4\2\2\u013c\u013d\7"+
		"\25\2\2\u013d\u013e\5\60\31\2\u013e\u013f\b\30\1\2\u013f\u0141\3\2\2\2"+
		"\u0140\u0136\3\2\2\2\u0140\u013b\3\2\2\2\u0141\u0144\3\2\2\2\u0142\u0140"+
		"\3\2\2\2\u0142\u0143\3\2\2\2\u0143/\3\2\2\2\u0144\u0142\3\2\2\2\u0145"+
		"\u0146\7\7\2\2\u0146\u0147\5,\27\2\u0147\u0148\7\13\2\2\u0148\u0149\b"+
		"\31\1\2\u0149\u014e\3\2\2\2\u014a\u014b\5\62\32\2\u014b\u014c\b\31\1\2"+
		"\u014c\u014e\3\2\2\2\u014d\u0145\3\2\2\2\u014d\u014a\3\2\2\2\u014e\61"+
		"\3\2\2\2\u014f\u0150\7\'\2\2\u0150\u015a\b\32\1\2\u0151\u0152\7(\2\2\u0152"+
		"\u015a\b\32\1\2\u0153\u0154\5\64\33\2\u0154\u0155\b\32\1\2\u0155\u015a"+
		"\3\2\2\2\u0156\u0157\5\24\13\2\u0157\u0158\b\32\1\2\u0158\u015a\3\2\2"+
		"\2\u0159\u014f\3\2\2\2\u0159\u0151\3\2\2\2\u0159\u0153\3\2\2\2\u0159\u0156"+
		"\3\2\2\2\u015a\63\3\2\2\2\u015b\u015c\7&\2\2\u015c\u015d\5\62\32\2\u015d"+
		"\u015e\7\13\2\2\u015e\u015f\b\33\1\2\u015f\65\3\2\2\2\23IPakr\u0099\u00ae"+
		"\u00ce\u00d0\u00eb\u0112\u0121\u0130\u0140\u0142\u014d\u0159";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}