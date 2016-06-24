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
		T__31=32, T__32=33, T__33=34, CONST=35, WORD=36, PCT=37, WS=38, STR=39;
	public static final int
		RULE_r = 0, RULE_prog = 1, RULE_listfunc = 2, RULE_function = 3, RULE_listvar = 4, 
		RULE_bloc = 5, RULE_inst = 6, RULE_return2 = 7, RULE_callFunction = 8, 
		RULE_print = 9, RULE_string2 = 10, RULE_ask = 11, RULE_declaration = 12, 
		RULE_affct = 13, RULE_comment = 14, RULE_declaffct = 15, RULE_if2 = 16, 
		RULE_while2 = 17, RULE_cond = 18, RULE_operation = 19, RULE_factor = 20, 
		RULE_final2 = 21, RULE_numb = 22, RULE_rand = 23;
	public static final String[] ruleNames = {
		"r", "prog", "listfunc", "function", "listvar", "bloc", "inst", "return2", 
		"callFunction", "print", "string2", "ask", "declaration", "affct", "comment", 
		"declaffct", "if2", "while2", "cond", "operation", "factor", "final2", 
		"numb", "rand"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'main('", "'){'", "'}'", "'main(){'", "'('", "','", "';'", "'return '", 
		"')'", "'print('", "'ask('", "'var '", "':='", "'/*'", "'!'", "'.'", "'?'", 
		"'*'", "'/'", "'-'", "'Ã'", "'©'", "'¨'", "'*/'", "'if('", "'else{'", 
		"'while('", "'='", "'>'", "'<'", "'<='", "'>='", "'+'", "'rand('"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, "CONST", 
		"WORD", "PCT", "WS", "STR"
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
			setState(48);
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
			setState(67);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(51);
				((ProgContext)_localctx).l1 = listfunc();
				setState(52);
				match(T__0);
				setState(53);
				((ProgContext)_localctx).l = listvar();
				setState(54);
				match(T__1);
				setState(55);
				((ProgContext)_localctx).b = bloc();
				setState(56);
				match(T__2);
				setState(57);
				((ProgContext)_localctx).l2 = listfunc();
				((ProgContext)_localctx).p =  new Prog(((ProgContext)_localctx).l.lv,((ProgContext)_localctx).b.bc,((ProgContext)_localctx).l1.lf,((ProgContext)_localctx).l2.lf);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(60);
				((ProgContext)_localctx).l1 = listfunc();
				setState(61);
				match(T__3);
				setState(62);
				((ProgContext)_localctx).b = bloc();
				setState(63);
				match(T__2);
				setState(64);
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
			setState(74);
			switch (_input.LA(1)) {
			case WORD:
				enterOuterAlt(_localctx, 1);
				{
				setState(69);
				((ListfuncContext)_localctx).f = function();
				setState(70);
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
			setState(76);
			((FunctionContext)_localctx).v = match(WORD);
			setState(77);
			match(T__4);
			setState(78);
			((FunctionContext)_localctx).l = listvar();
			setState(79);
			match(T__1);
			setState(80);
			((FunctionContext)_localctx).b = bloc();
			setState(81);
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
			setState(91);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(84);
				((ListvarContext)_localctx).v = match(WORD);
				((ListvarContext)_localctx).lv =  new ListVar(new Var(((ListvarContext)_localctx).v.getText()));
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(86);
				((ListvarContext)_localctx).v = match(WORD);
				setState(87);
				match(T__5);
				setState(88);
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
			setState(98);
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
				setState(93);
				((BlocContext)_localctx).i = inst();
				setState(94);
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
			setState(133);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(100);
				((InstContext)_localctx).a = affct();
				setState(101);
				match(T__6);
				((InstContext)_localctx).instruct =  new Inst(((InstContext)_localctx).a.aff);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(104);
				((InstContext)_localctx).d1 = declaration();
				setState(105);
				match(T__6);
				((InstContext)_localctx).instruct =  new Inst(((InstContext)_localctx).d1.decl);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(108);
				((InstContext)_localctx).d2 = declaffct();
				setState(109);
				match(T__6);
				((InstContext)_localctx).instruct =  new Inst(((InstContext)_localctx).d2.decaf);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(112);
				((InstContext)_localctx).c = comment();
				((InstContext)_localctx).instruct =  new Inst(((InstContext)_localctx).c.com);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(115);
				((InstContext)_localctx).i = if2();
				((InstContext)_localctx).instruct =  new Inst(((InstContext)_localctx).i.i);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(118);
				((InstContext)_localctx).w = while2();
				((InstContext)_localctx).instruct =  new Inst(((InstContext)_localctx).w.w);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(121);
				((InstContext)_localctx).as = ask();
				setState(122);
				match(T__6);
				((InstContext)_localctx).instruct =  new Inst(((InstContext)_localctx).as.a);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(125);
				((InstContext)_localctx).p = print();
				setState(126);
				match(T__6);
				((InstContext)_localctx).instruct =  new Inst(((InstContext)_localctx).p.p);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(129);
				((InstContext)_localctx).re = return2();
				setState(130);
				match(T__6);
				((InstContext)_localctx).instruct =  new Inst(((InstContext)_localctx).re.ret);
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
		public Token v;
		public TerminalNode WORD() { return getToken(HelloParser.WORD, 0); }
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
		enterRule(_localctx, 14, RULE_return2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(T__7);
			setState(136);
			((Return2Context)_localctx).v = match(WORD);
			((Return2Context)_localctx).ret =  new Return2(new Var(((Return2Context)_localctx).v.getText()));
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
		enterRule(_localctx, 16, RULE_callFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			((CallFunctionContext)_localctx).v = match(WORD);
			setState(140);
			match(T__4);
			setState(141);
			((CallFunctionContext)_localctx).l = listvar();
			setState(142);
			match(T__8);
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
		enterRule(_localctx, 18, RULE_print);
		try {
			setState(154);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(145);
				match(T__9);
				setState(146);
				((PrintContext)_localctx).v = match(WORD);
				setState(147);
				match(T__8);
				((PrintContext)_localctx).p =  new Print(new Var(((PrintContext)_localctx).v.getText()));
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(149);
				match(T__9);
				setState(150);
				((PrintContext)_localctx).s = string2();
				setState(151);
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
		enterRule(_localctx, 20, RULE_string2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
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
		enterRule(_localctx, 22, RULE_ask);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(T__10);
			setState(160);
			((AskContext)_localctx).v = match(WORD);
			setState(161);
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
		enterRule(_localctx, 24, RULE_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(T__11);
			setState(165);
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
		enterRule(_localctx, 26, RULE_affct);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			((AffctContext)_localctx).v = match(WORD);
			setState(169);
			match(T__12);
			setState(170);
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
		enterRule(_localctx, 28, RULE_comment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			match(T__13);
			setState(188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__33) | (1L << CONST) | (1L << WORD))) != 0)) {
				{
				setState(186);
				switch (_input.LA(1)) {
				case T__33:
				case CONST:
				case WORD:
					{
					setState(174);
					numb();
					}
					break;
				case T__5:
					{
					setState(175);
					match(T__5);
					}
					break;
				case T__6:
					{
					setState(176);
					match(T__6);
					}
					break;
				case T__14:
					{
					setState(177);
					match(T__14);
					}
					break;
				case T__15:
					{
					setState(178);
					match(T__15);
					}
					break;
				case T__16:
					{
					setState(179);
					match(T__16);
					}
					break;
				case T__17:
					{
					setState(180);
					match(T__17);
					}
					break;
				case T__18:
					{
					setState(181);
					match(T__18);
					}
					break;
				case T__19:
					{
					setState(182);
					match(T__19);
					}
					break;
				case T__20:
					{
					setState(183);
					match(T__20);
					}
					break;
				case T__21:
					{
					setState(184);
					match(T__21);
					}
					break;
				case T__22:
					{
					setState(185);
					match(T__22);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(190);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(191);
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
		enterRule(_localctx, 30, RULE_declaffct);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(T__11);
			setState(195);
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
		enterRule(_localctx, 32, RULE_if2);
		try {
			setState(215);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(198);
				match(T__24);
				setState(199);
				((If2Context)_localctx).c = cond();
				setState(200);
				match(T__1);
				setState(201);
				((If2Context)_localctx).b = bloc();
				setState(202);
				match(T__2);
				setState(203);
				match(T__25);
				setState(204);
				((If2Context)_localctx).b2 = bloc();
				setState(205);
				match(T__2);
				((If2Context)_localctx).i =  new If2(((If2Context)_localctx).c.c,((If2Context)_localctx).b.bc,((If2Context)_localctx).b2.bc);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(208);
				match(T__24);
				setState(209);
				((If2Context)_localctx).c = cond();
				setState(210);
				match(T__1);
				setState(211);
				((If2Context)_localctx).b = bloc();
				setState(212);
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
		enterRule(_localctx, 34, RULE_while2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			match(T__26);
			setState(218);
			((While2Context)_localctx).c = cond();
			setState(219);
			match(T__1);
			setState(220);
			((While2Context)_localctx).b = bloc();
			setState(221);
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
		enterRule(_localctx, 36, RULE_cond);
		try {
			setState(249);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(224);
				((CondContext)_localctx).op1 = operation();
				setState(225);
				match(T__27);
				setState(226);
				((CondContext)_localctx).op2 = operation();
				((CondContext)_localctx).c =  new Cond(((CondContext)_localctx).op1.op,((CondContext)_localctx).op2.op,"=");
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(229);
				((CondContext)_localctx).op1 = operation();
				setState(230);
				match(T__28);
				setState(231);
				((CondContext)_localctx).op2 = operation();
				((CondContext)_localctx).c =  new Cond(((CondContext)_localctx).op1.op,((CondContext)_localctx).op2.op,">");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(234);
				((CondContext)_localctx).op1 = operation();
				setState(235);
				match(T__29);
				setState(236);
				((CondContext)_localctx).op2 = operation();
				((CondContext)_localctx).c =  new Cond(((CondContext)_localctx).op1.op,((CondContext)_localctx).op2.op,"<");
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(239);
				((CondContext)_localctx).op1 = operation();
				setState(240);
				match(T__30);
				setState(241);
				((CondContext)_localctx).op2 = operation();
				((CondContext)_localctx).c =  new Cond(((CondContext)_localctx).op1.op,((CondContext)_localctx).op2.op,"<=");
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(244);
				((CondContext)_localctx).op1 = operation();
				setState(245);
				match(T__31);
				setState(246);
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
		enterRule(_localctx, 38, RULE_operation);
		try {
			setState(264);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(251);
				((OperationContext)_localctx).f1 = factor(0);
				setState(252);
				match(T__32);
				setState(253);
				((OperationContext)_localctx).op2 = operation();
				((OperationContext)_localctx).op = new Op(((OperationContext)_localctx).f1.f,((OperationContext)_localctx).op2.op,"+");
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(256);
				((OperationContext)_localctx).f1 = factor(0);
				setState(257);
				match(T__19);
				setState(258);
				((OperationContext)_localctx).op2 = operation();
				((OperationContext)_localctx).op = new Op(((OperationContext)_localctx).f1.f,((OperationContext)_localctx).op2.op,"-");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(261);
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
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_factor, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(267);
			((FactorContext)_localctx).f3 = final2();
			((FactorContext)_localctx).f = new Factor(((FactorContext)_localctx).f3.f);
			}
			_ctx.stop = _input.LT(-1);
			setState(282);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(280);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new FactorContext(_parentctx, _parentState);
						_localctx.f1 = _prevctx;
						_localctx.f1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_factor);
						setState(270);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(271);
						match(T__17);
						setState(272);
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
						setState(275);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(276);
						match(T__18);
						setState(277);
						((FactorContext)_localctx).f2 = final2();
						((FactorContext)_localctx).f = new Factor(((FactorContext)_localctx).f1.f,((FactorContext)_localctx).f2.f,"/");
						}
						break;
					}
					} 
				}
				setState(284);
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
		enterRule(_localctx, 42, RULE_final2);
		try {
			setState(293);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(285);
				match(T__4);
				setState(286);
				((Final2Context)_localctx).op1 = operation();
				setState(287);
				match(T__8);
				((Final2Context)_localctx).f = new Final2(((Final2Context)_localctx).op1.op);
				}
				break;
			case T__33:
			case CONST:
			case WORD:
				enterOuterAlt(_localctx, 2);
				{
				setState(290);
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
		enterRule(_localctx, 44, RULE_numb);
		try {
			setState(305);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(295);
				((NumbContext)_localctx).c = match(CONST);
				((NumbContext)_localctx).nb = new Number(new Const2(((NumbContext)_localctx).c.getText()));
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(297);
				((NumbContext)_localctx).v = match(WORD);
				((NumbContext)_localctx).nb = new Number(new Var(((NumbContext)_localctx).v.getText()));
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(299);
				((NumbContext)_localctx).ra = rand();
				((NumbContext)_localctx).nb = new Number(((NumbContext)_localctx).ra.ra);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(302);
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
		enterRule(_localctx, 46, RULE_rand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			match(T__33);
			setState(308);
			((RandContext)_localctx).n = numb();
			setState(309);
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
		case 20:
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3)\u013b\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\5\3F\n\3\3\4\3\4\3\4\3\4\3\4\5\4M\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6^\n\6\3\7\3\7\3\7\3\7\3\7\5\7e\n"+
		"\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0088"+
		"\n\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\5\13\u009d\n\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3"+
		"\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u00bd\n\20\f\20\16\20\u00c0"+
		"\13\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00da\n\22"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\5\24\u00fc\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u010b\n\25\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\7\26\u011b\n\26\f\26\16"+
		"\26\u011e\13\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u0128\n\27"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u0134\n\30\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\2\3*\32\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*,.\60\2\2\u0148\2\62\3\2\2\2\4E\3\2\2\2\6L\3\2\2\2\bN\3\2\2"+
		"\2\n]\3\2\2\2\fd\3\2\2\2\16\u0087\3\2\2\2\20\u0089\3\2\2\2\22\u008d\3"+
		"\2\2\2\24\u009c\3\2\2\2\26\u009e\3\2\2\2\30\u00a1\3\2\2\2\32\u00a6\3\2"+
		"\2\2\34\u00aa\3\2\2\2\36\u00af\3\2\2\2 \u00c4\3\2\2\2\"\u00d9\3\2\2\2"+
		"$\u00db\3\2\2\2&\u00fb\3\2\2\2(\u010a\3\2\2\2*\u010c\3\2\2\2,\u0127\3"+
		"\2\2\2.\u0133\3\2\2\2\60\u0135\3\2\2\2\62\63\5\4\3\2\63\64\b\2\1\2\64"+
		"\3\3\2\2\2\65\66\5\6\4\2\66\67\7\3\2\2\678\5\n\6\289\7\4\2\29:\5\f\7\2"+
		":;\7\5\2\2;<\5\6\4\2<=\b\3\1\2=F\3\2\2\2>?\5\6\4\2?@\7\6\2\2@A\5\f\7\2"+
		"AB\7\5\2\2BC\5\6\4\2CD\b\3\1\2DF\3\2\2\2E\65\3\2\2\2E>\3\2\2\2F\5\3\2"+
		"\2\2GH\5\b\5\2HI\5\6\4\2IJ\b\4\1\2JM\3\2\2\2KM\b\4\1\2LG\3\2\2\2LK\3\2"+
		"\2\2M\7\3\2\2\2NO\7&\2\2OP\7\7\2\2PQ\5\n\6\2QR\7\4\2\2RS\5\f\7\2ST\7\5"+
		"\2\2TU\b\5\1\2U\t\3\2\2\2VW\7&\2\2W^\b\6\1\2XY\7&\2\2YZ\7\b\2\2Z[\5\n"+
		"\6\2[\\\b\6\1\2\\^\3\2\2\2]V\3\2\2\2]X\3\2\2\2^\13\3\2\2\2_`\5\16\b\2"+
		"`a\5\f\7\2ab\b\7\1\2be\3\2\2\2ce\b\7\1\2d_\3\2\2\2dc\3\2\2\2e\r\3\2\2"+
		"\2fg\5\34\17\2gh\7\t\2\2hi\b\b\1\2i\u0088\3\2\2\2jk\5\32\16\2kl\7\t\2"+
		"\2lm\b\b\1\2m\u0088\3\2\2\2no\5 \21\2op\7\t\2\2pq\b\b\1\2q\u0088\3\2\2"+
		"\2rs\5\36\20\2st\b\b\1\2t\u0088\3\2\2\2uv\5\"\22\2vw\b\b\1\2w\u0088\3"+
		"\2\2\2xy\5$\23\2yz\b\b\1\2z\u0088\3\2\2\2{|\5\30\r\2|}\7\t\2\2}~\b\b\1"+
		"\2~\u0088\3\2\2\2\177\u0080\5\24\13\2\u0080\u0081\7\t\2\2\u0081\u0082"+
		"\b\b\1\2\u0082\u0088\3\2\2\2\u0083\u0084\5\20\t\2\u0084\u0085\7\t\2\2"+
		"\u0085\u0086\b\b\1\2\u0086\u0088\3\2\2\2\u0087f\3\2\2\2\u0087j\3\2\2\2"+
		"\u0087n\3\2\2\2\u0087r\3\2\2\2\u0087u\3\2\2\2\u0087x\3\2\2\2\u0087{\3"+
		"\2\2\2\u0087\177\3\2\2\2\u0087\u0083\3\2\2\2\u0088\17\3\2\2\2\u0089\u008a"+
		"\7\n\2\2\u008a\u008b\7&\2\2\u008b\u008c\b\t\1\2\u008c\21\3\2\2\2\u008d"+
		"\u008e\7&\2\2\u008e\u008f\7\7\2\2\u008f\u0090\5\n\6\2\u0090\u0091\7\13"+
		"\2\2\u0091\u0092\b\n\1\2\u0092\23\3\2\2\2\u0093\u0094\7\f\2\2\u0094\u0095"+
		"\7&\2\2\u0095\u0096\7\13\2\2\u0096\u009d\b\13\1\2\u0097\u0098\7\f\2\2"+
		"\u0098\u0099\5\26\f\2\u0099\u009a\7\13\2\2\u009a\u009b\b\13\1\2\u009b"+
		"\u009d\3\2\2\2\u009c\u0093\3\2\2\2\u009c\u0097\3\2\2\2\u009d\25\3\2\2"+
		"\2\u009e\u009f\7)\2\2\u009f\u00a0\b\f\1\2\u00a0\27\3\2\2\2\u00a1\u00a2"+
		"\7\r\2\2\u00a2\u00a3\7&\2\2\u00a3\u00a4\7\13\2\2\u00a4\u00a5\b\r\1\2\u00a5"+
		"\31\3\2\2\2\u00a6\u00a7\7\16\2\2\u00a7\u00a8\5\n\6\2\u00a8\u00a9\b\16"+
		"\1\2\u00a9\33\3\2\2\2\u00aa\u00ab\7&\2\2\u00ab\u00ac\7\17\2\2\u00ac\u00ad"+
		"\5(\25\2\u00ad\u00ae\b\17\1\2\u00ae\35\3\2\2\2\u00af\u00be\7\20\2\2\u00b0"+
		"\u00bd\5.\30\2\u00b1\u00bd\7\b\2\2\u00b2\u00bd\7\t\2\2\u00b3\u00bd\7\21"+
		"\2\2\u00b4\u00bd\7\22\2\2\u00b5\u00bd\7\23\2\2\u00b6\u00bd\7\24\2\2\u00b7"+
		"\u00bd\7\25\2\2\u00b8\u00bd\7\26\2\2\u00b9\u00bd\7\27\2\2\u00ba\u00bd"+
		"\7\30\2\2\u00bb\u00bd\7\31\2\2\u00bc\u00b0\3\2\2\2\u00bc\u00b1\3\2\2\2"+
		"\u00bc\u00b2\3\2\2\2\u00bc\u00b3\3\2\2\2\u00bc\u00b4\3\2\2\2\u00bc\u00b5"+
		"\3\2\2\2\u00bc\u00b6\3\2\2\2\u00bc\u00b7\3\2\2\2\u00bc\u00b8\3\2\2\2\u00bc"+
		"\u00b9\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bb\3\2\2\2\u00bd\u00c0\3\2"+
		"\2\2\u00be\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c1\3\2\2\2\u00c0"+
		"\u00be\3\2\2\2\u00c1\u00c2\7\32\2\2\u00c2\u00c3\b\20\1\2\u00c3\37\3\2"+
		"\2\2\u00c4\u00c5\7\16\2\2\u00c5\u00c6\5\34\17\2\u00c6\u00c7\b\21\1\2\u00c7"+
		"!\3\2\2\2\u00c8\u00c9\7\33\2\2\u00c9\u00ca\5&\24\2\u00ca\u00cb\7\4\2\2"+
		"\u00cb\u00cc\5\f\7\2\u00cc\u00cd\7\5\2\2\u00cd\u00ce\7\34\2\2\u00ce\u00cf"+
		"\5\f\7\2\u00cf\u00d0\7\5\2\2\u00d0\u00d1\b\22\1\2\u00d1\u00da\3\2\2\2"+
		"\u00d2\u00d3\7\33\2\2\u00d3\u00d4\5&\24\2\u00d4\u00d5\7\4\2\2\u00d5\u00d6"+
		"\5\f\7\2\u00d6\u00d7\7\5\2\2\u00d7\u00d8\b\22\1\2\u00d8\u00da\3\2\2\2"+
		"\u00d9\u00c8\3\2\2\2\u00d9\u00d2\3\2\2\2\u00da#\3\2\2\2\u00db\u00dc\7"+
		"\35\2\2\u00dc\u00dd\5&\24\2\u00dd\u00de\7\4\2\2\u00de\u00df\5\f\7\2\u00df"+
		"\u00e0\7\5\2\2\u00e0\u00e1\b\23\1\2\u00e1%\3\2\2\2\u00e2\u00e3\5(\25\2"+
		"\u00e3\u00e4\7\36\2\2\u00e4\u00e5\5(\25\2\u00e5\u00e6\b\24\1\2\u00e6\u00fc"+
		"\3\2\2\2\u00e7\u00e8\5(\25\2\u00e8\u00e9\7\37\2\2\u00e9\u00ea\5(\25\2"+
		"\u00ea\u00eb\b\24\1\2\u00eb\u00fc\3\2\2\2\u00ec\u00ed\5(\25\2\u00ed\u00ee"+
		"\7 \2\2\u00ee\u00ef\5(\25\2\u00ef\u00f0\b\24\1\2\u00f0\u00fc\3\2\2\2\u00f1"+
		"\u00f2\5(\25\2\u00f2\u00f3\7!\2\2\u00f3\u00f4\5(\25\2\u00f4\u00f5\b\24"+
		"\1\2\u00f5\u00fc\3\2\2\2\u00f6\u00f7\5(\25\2\u00f7\u00f8\7\"\2\2\u00f8"+
		"\u00f9\5(\25\2\u00f9\u00fa\b\24\1\2\u00fa\u00fc\3\2\2\2\u00fb\u00e2\3"+
		"\2\2\2\u00fb\u00e7\3\2\2\2\u00fb\u00ec\3\2\2\2\u00fb\u00f1\3\2\2\2\u00fb"+
		"\u00f6\3\2\2\2\u00fc\'\3\2\2\2\u00fd\u00fe\5*\26\2\u00fe\u00ff\7#\2\2"+
		"\u00ff\u0100\5(\25\2\u0100\u0101\b\25\1\2\u0101\u010b\3\2\2\2\u0102\u0103"+
		"\5*\26\2\u0103\u0104\7\26\2\2\u0104\u0105\5(\25\2\u0105\u0106\b\25\1\2"+
		"\u0106\u010b\3\2\2\2\u0107\u0108\5*\26\2\u0108\u0109\b\25\1\2\u0109\u010b"+
		"\3\2\2\2\u010a\u00fd\3\2\2\2\u010a\u0102\3\2\2\2\u010a\u0107\3\2\2\2\u010b"+
		")\3\2\2\2\u010c\u010d\b\26\1\2\u010d\u010e\5,\27\2\u010e\u010f\b\26\1"+
		"\2\u010f\u011c\3\2\2\2\u0110\u0111\f\5\2\2\u0111\u0112\7\24\2\2\u0112"+
		"\u0113\5,\27\2\u0113\u0114\b\26\1\2\u0114\u011b\3\2\2\2\u0115\u0116\f"+
		"\4\2\2\u0116\u0117\7\25\2\2\u0117\u0118\5,\27\2\u0118\u0119\b\26\1\2\u0119"+
		"\u011b\3\2\2\2\u011a\u0110\3\2\2\2\u011a\u0115\3\2\2\2\u011b\u011e\3\2"+
		"\2\2\u011c\u011a\3\2\2\2\u011c\u011d\3\2\2\2\u011d+\3\2\2\2\u011e\u011c"+
		"\3\2\2\2\u011f\u0120\7\7\2\2\u0120\u0121\5(\25\2\u0121\u0122\7\13\2\2"+
		"\u0122\u0123\b\27\1\2\u0123\u0128\3\2\2\2\u0124\u0125\5.\30\2\u0125\u0126"+
		"\b\27\1\2\u0126\u0128\3\2\2\2\u0127\u011f\3\2\2\2\u0127\u0124\3\2\2\2"+
		"\u0128-\3\2\2\2\u0129\u012a\7%\2\2\u012a\u0134\b\30\1\2\u012b\u012c\7"+
		"&\2\2\u012c\u0134\b\30\1\2\u012d\u012e\5\60\31\2\u012e\u012f\b\30\1\2"+
		"\u012f\u0134\3\2\2\2\u0130\u0131\5\22\n\2\u0131\u0132\b\30\1\2\u0132\u0134"+
		"\3\2\2\2\u0133\u0129\3\2\2\2\u0133\u012b\3\2\2\2\u0133\u012d\3\2\2\2\u0133"+
		"\u0130\3\2\2\2\u0134/\3\2\2\2\u0135\u0136\7$\2\2\u0136\u0137\5.\30\2\u0137"+
		"\u0138\7\13\2\2\u0138\u0139\b\31\1\2\u0139\61\3\2\2\2\21EL]d\u0087\u009c"+
		"\u00bc\u00be\u00d9\u00fb\u010a\u011a\u011c\u0127\u0133";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}