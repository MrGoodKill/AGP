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
		T__24=25, CONST=26, WORD=27, PCT=28, WS=29, STR=30;
	public static final int
		RULE_r = 0, RULE_prog = 1, RULE_listvar = 2, RULE_bloc = 3, RULE_inst = 4, 
		RULE_print = 5, RULE_string2 = 6, RULE_ask = 7, RULE_declaration = 8, 
		RULE_affct = 9, RULE_declaffct = 10, RULE_if2 = 11, RULE_while2 = 12, 
		RULE_cond = 13, RULE_operation = 14, RULE_factor = 15, RULE_final2 = 16, 
		RULE_numb = 17, RULE_rand = 18;
	public static final String[] ruleNames = {
		"r", "prog", "listvar", "bloc", "inst", "print", "string2", "ask", "declaration", 
		"affct", "declaffct", "if2", "while2", "cond", "operation", "factor", 
		"final2", "numb", "rand"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'main('", "'){'", "'}'", "'main(){'", "','", "';'", "'print('", 
		"')'", "'ask('", "'var '", "':='", "'if('", "'else{'", "'while('", "'='", 
		"'>'", "'<'", "'<='", "'>='", "'+'", "'-'", "'*'", "'/'", "'('", "'rand('"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, "CONST", "WORD", "PCT", "WS", "STR"
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
			setState(38);
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
		public ListvarContext l;
		public BlocContext b;
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
			setState(53);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(41);
				match(T__0);
				setState(42);
				((ProgContext)_localctx).l = listvar();
				setState(43);
				match(T__1);
				setState(44);
				((ProgContext)_localctx).b = bloc();
				setState(45);
				match(T__2);
				((ProgContext)_localctx).p =  new Prog(((ProgContext)_localctx).l.lv,((ProgContext)_localctx).b.bc);
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(48);
				match(T__3);
				setState(49);
				((ProgContext)_localctx).b = bloc();
				setState(50);
				match(T__2);
				((ProgContext)_localctx).p =  new Prog(((ProgContext)_localctx).b.bc);
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
		enterRule(_localctx, 4, RULE_listvar);
		try {
			setState(62);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(55);
				((ListvarContext)_localctx).v = match(WORD);
				((ListvarContext)_localctx).lv =  new ListVar(new Var(((ListvarContext)_localctx).v.getText()));
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(57);
				((ListvarContext)_localctx).v = match(WORD);
				setState(58);
				match(T__4);
				setState(59);
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
		enterRule(_localctx, 6, RULE_bloc);
		try {
			setState(69);
			switch (_input.LA(1)) {
			case T__6:
			case T__8:
			case T__9:
			case T__11:
			case T__13:
			case WORD:
				enterOuterAlt(_localctx, 1);
				{
				setState(64);
				((BlocContext)_localctx).i = inst();
				setState(65);
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
		enterRule(_localctx, 8, RULE_inst);
		try {
			setState(97);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(71);
				((InstContext)_localctx).a = affct();
				setState(72);
				match(T__5);
				((InstContext)_localctx).instruct =  new Inst(((InstContext)_localctx).a.aff);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(75);
				((InstContext)_localctx).d1 = declaration();
				setState(76);
				match(T__5);
				((InstContext)_localctx).instruct =  new Inst(((InstContext)_localctx).d1.decl);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(79);
				((InstContext)_localctx).d2 = declaffct();
				setState(80);
				match(T__5);
				((InstContext)_localctx).instruct =  new Inst(((InstContext)_localctx).d2.decaf);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(83);
				((InstContext)_localctx).i = if2();
				((InstContext)_localctx).instruct =  new Inst(((InstContext)_localctx).i.i);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(86);
				((InstContext)_localctx).w = while2();
				((InstContext)_localctx).instruct =  new Inst(((InstContext)_localctx).w.w);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(89);
				((InstContext)_localctx).as = ask();
				setState(90);
				match(T__5);
				((InstContext)_localctx).instruct =  new Inst(((InstContext)_localctx).as.a);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(93);
				((InstContext)_localctx).p = print();
				setState(94);
				match(T__5);
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
		enterRule(_localctx, 10, RULE_print);
		try {
			setState(108);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(99);
				match(T__6);
				setState(100);
				((PrintContext)_localctx).v = match(WORD);
				setState(101);
				match(T__7);
				((PrintContext)_localctx).p =  new Print(new Var(((PrintContext)_localctx).v.getText()));
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(103);
				match(T__6);
				setState(104);
				((PrintContext)_localctx).s = string2();
				setState(105);
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
		enterRule(_localctx, 12, RULE_string2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
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
		enterRule(_localctx, 14, RULE_ask);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(T__8);
			setState(114);
			((AskContext)_localctx).v = match(WORD);
			setState(115);
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
		enterRule(_localctx, 16, RULE_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(T__9);
			setState(119);
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
		enterRule(_localctx, 18, RULE_affct);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			((AffctContext)_localctx).v = match(WORD);
			setState(123);
			match(T__10);
			setState(124);
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
		enterRule(_localctx, 20, RULE_declaffct);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(T__9);
			setState(128);
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
		enterRule(_localctx, 22, RULE_if2);
		try {
			setState(148);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(131);
				match(T__11);
				setState(132);
				((If2Context)_localctx).c = cond();
				setState(133);
				match(T__1);
				setState(134);
				((If2Context)_localctx).b = bloc();
				setState(135);
				match(T__2);
				setState(136);
				match(T__12);
				setState(137);
				((If2Context)_localctx).b2 = bloc();
				setState(138);
				match(T__2);
				((If2Context)_localctx).i =  new If2(((If2Context)_localctx).c.c,((If2Context)_localctx).b.bc,((If2Context)_localctx).b2.bc);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(141);
				match(T__11);
				setState(142);
				((If2Context)_localctx).c = cond();
				setState(143);
				match(T__1);
				setState(144);
				((If2Context)_localctx).b = bloc();
				setState(145);
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
		enterRule(_localctx, 24, RULE_while2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(T__13);
			setState(151);
			((While2Context)_localctx).c = cond();
			setState(152);
			match(T__1);
			setState(153);
			((While2Context)_localctx).b = bloc();
			setState(154);
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
		enterRule(_localctx, 26, RULE_cond);
		try {
			setState(182);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(157);
				((CondContext)_localctx).op1 = operation();
				setState(158);
				match(T__14);
				setState(159);
				((CondContext)_localctx).op2 = operation();
				((CondContext)_localctx).c =  new Cond(((CondContext)_localctx).op1.op,((CondContext)_localctx).op2.op,"=");
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(162);
				((CondContext)_localctx).op1 = operation();
				setState(163);
				match(T__15);
				setState(164);
				((CondContext)_localctx).op2 = operation();
				((CondContext)_localctx).c =  new Cond(((CondContext)_localctx).op1.op,((CondContext)_localctx).op2.op,">");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(167);
				((CondContext)_localctx).op1 = operation();
				setState(168);
				match(T__16);
				setState(169);
				((CondContext)_localctx).op2 = operation();
				((CondContext)_localctx).c =  new Cond(((CondContext)_localctx).op1.op,((CondContext)_localctx).op2.op,"<");
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(172);
				((CondContext)_localctx).op1 = operation();
				setState(173);
				match(T__17);
				setState(174);
				((CondContext)_localctx).op2 = operation();
				((CondContext)_localctx).c =  new Cond(((CondContext)_localctx).op1.op,((CondContext)_localctx).op2.op,"<=");
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(177);
				((CondContext)_localctx).op1 = operation();
				setState(178);
				match(T__18);
				setState(179);
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
		enterRule(_localctx, 28, RULE_operation);
		try {
			setState(197);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(184);
				((OperationContext)_localctx).f1 = factor(0);
				setState(185);
				match(T__19);
				setState(186);
				((OperationContext)_localctx).op2 = operation();
				((OperationContext)_localctx).op = new Op(((OperationContext)_localctx).f1.f,((OperationContext)_localctx).op2.op,"+");
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(189);
				((OperationContext)_localctx).f1 = factor(0);
				setState(190);
				match(T__20);
				setState(191);
				((OperationContext)_localctx).op2 = operation();
				((OperationContext)_localctx).op = new Op(((OperationContext)_localctx).f1.f,((OperationContext)_localctx).op2.op,"-");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(194);
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
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_factor, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(200);
			((FactorContext)_localctx).f3 = final2();
			((FactorContext)_localctx).f = new Factor(((FactorContext)_localctx).f3.f);
			}
			_ctx.stop = _input.LT(-1);
			setState(215);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(213);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new FactorContext(_parentctx, _parentState);
						_localctx.f1 = _prevctx;
						_localctx.f1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_factor);
						setState(203);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(204);
						match(T__21);
						setState(205);
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
						setState(208);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(209);
						match(T__22);
						setState(210);
						((FactorContext)_localctx).f2 = final2();
						((FactorContext)_localctx).f = new Factor(((FactorContext)_localctx).f1.f,((FactorContext)_localctx).f2.f,"/");
						}
						break;
					}
					} 
				}
				setState(217);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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
		enterRule(_localctx, 32, RULE_final2);
		try {
			setState(226);
			switch (_input.LA(1)) {
			case T__23:
				enterOuterAlt(_localctx, 1);
				{
				setState(218);
				match(T__23);
				setState(219);
				((Final2Context)_localctx).op1 = operation();
				setState(220);
				match(T__7);
				((Final2Context)_localctx).f = new Final2(((Final2Context)_localctx).op1.op);
				}
				break;
			case T__24:
			case CONST:
			case WORD:
				enterOuterAlt(_localctx, 2);
				{
				setState(223);
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
		public TerminalNode CONST() { return getToken(HelloParser.CONST, 0); }
		public TerminalNode WORD() { return getToken(HelloParser.WORD, 0); }
		public RandContext rand() {
			return getRuleContext(RandContext.class,0);
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
		enterRule(_localctx, 34, RULE_numb);
		try {
			setState(235);
			switch (_input.LA(1)) {
			case CONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(228);
				((NumbContext)_localctx).c = match(CONST);
				((NumbContext)_localctx).nb = new Number(new Const2(((NumbContext)_localctx).c.getText()));
				}
				break;
			case WORD:
				enterOuterAlt(_localctx, 2);
				{
				setState(230);
				((NumbContext)_localctx).v = match(WORD);
				((NumbContext)_localctx).nb = new Number(new Var(((NumbContext)_localctx).v.getText()));
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 3);
				{
				setState(232);
				((NumbContext)_localctx).ra = rand();
				((NumbContext)_localctx).nb = new Number(((NumbContext)_localctx).ra.ra);
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
		enterRule(_localctx, 36, RULE_rand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			match(T__24);
			setState(238);
			((RandContext)_localctx).n = numb();
			setState(239);
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
		case 15:
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3 \u00f5\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\5\38\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4A\n\4\3\5\3\5\3\5\3"+
		"\5\3\5\5\5H\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6d\n\6\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7o\n\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3"+
		"\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0097\n\r\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\5\17\u00b9\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00c8\n\20\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u00d8\n\21\f\21\16"+
		"\21\u00db\13\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00e5\n\22"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00ee\n\23\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\2\3 \25\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&\2\2\u00f7"+
		"\2(\3\2\2\2\4\67\3\2\2\2\6@\3\2\2\2\bG\3\2\2\2\nc\3\2\2\2\fn\3\2\2\2\16"+
		"p\3\2\2\2\20s\3\2\2\2\22x\3\2\2\2\24|\3\2\2\2\26\u0081\3\2\2\2\30\u0096"+
		"\3\2\2\2\32\u0098\3\2\2\2\34\u00b8\3\2\2\2\36\u00c7\3\2\2\2 \u00c9\3\2"+
		"\2\2\"\u00e4\3\2\2\2$\u00ed\3\2\2\2&\u00ef\3\2\2\2()\5\4\3\2)*\b\2\1\2"+
		"*\3\3\2\2\2+,\7\3\2\2,-\5\6\4\2-.\7\4\2\2./\5\b\5\2/\60\7\5\2\2\60\61"+
		"\b\3\1\2\618\3\2\2\2\62\63\7\6\2\2\63\64\5\b\5\2\64\65\7\5\2\2\65\66\b"+
		"\3\1\2\668\3\2\2\2\67+\3\2\2\2\67\62\3\2\2\28\5\3\2\2\29:\7\35\2\2:A\b"+
		"\4\1\2;<\7\35\2\2<=\7\7\2\2=>\5\6\4\2>?\b\4\1\2?A\3\2\2\2@9\3\2\2\2@;"+
		"\3\2\2\2A\7\3\2\2\2BC\5\n\6\2CD\5\b\5\2DE\b\5\1\2EH\3\2\2\2FH\b\5\1\2"+
		"GB\3\2\2\2GF\3\2\2\2H\t\3\2\2\2IJ\5\24\13\2JK\7\b\2\2KL\b\6\1\2Ld\3\2"+
		"\2\2MN\5\22\n\2NO\7\b\2\2OP\b\6\1\2Pd\3\2\2\2QR\5\26\f\2RS\7\b\2\2ST\b"+
		"\6\1\2Td\3\2\2\2UV\5\30\r\2VW\b\6\1\2Wd\3\2\2\2XY\5\32\16\2YZ\b\6\1\2"+
		"Zd\3\2\2\2[\\\5\20\t\2\\]\7\b\2\2]^\b\6\1\2^d\3\2\2\2_`\5\f\7\2`a\7\b"+
		"\2\2ab\b\6\1\2bd\3\2\2\2cI\3\2\2\2cM\3\2\2\2cQ\3\2\2\2cU\3\2\2\2cX\3\2"+
		"\2\2c[\3\2\2\2c_\3\2\2\2d\13\3\2\2\2ef\7\t\2\2fg\7\35\2\2gh\7\n\2\2ho"+
		"\b\7\1\2ij\7\t\2\2jk\5\16\b\2kl\7\n\2\2lm\b\7\1\2mo\3\2\2\2ne\3\2\2\2"+
		"ni\3\2\2\2o\r\3\2\2\2pq\7 \2\2qr\b\b\1\2r\17\3\2\2\2st\7\13\2\2tu\7\35"+
		"\2\2uv\7\n\2\2vw\b\t\1\2w\21\3\2\2\2xy\7\f\2\2yz\5\6\4\2z{\b\n\1\2{\23"+
		"\3\2\2\2|}\7\35\2\2}~\7\r\2\2~\177\5\36\20\2\177\u0080\b\13\1\2\u0080"+
		"\25\3\2\2\2\u0081\u0082\7\f\2\2\u0082\u0083\5\24\13\2\u0083\u0084\b\f"+
		"\1\2\u0084\27\3\2\2\2\u0085\u0086\7\16\2\2\u0086\u0087\5\34\17\2\u0087"+
		"\u0088\7\4\2\2\u0088\u0089\5\b\5\2\u0089\u008a\7\5\2\2\u008a\u008b\7\17"+
		"\2\2\u008b\u008c\5\b\5\2\u008c\u008d\7\5\2\2\u008d\u008e\b\r\1\2\u008e"+
		"\u0097\3\2\2\2\u008f\u0090\7\16\2\2\u0090\u0091\5\34\17\2\u0091\u0092"+
		"\7\4\2\2\u0092\u0093\5\b\5\2\u0093\u0094\7\5\2\2\u0094\u0095\b\r\1\2\u0095"+
		"\u0097\3\2\2\2\u0096\u0085\3\2\2\2\u0096\u008f\3\2\2\2\u0097\31\3\2\2"+
		"\2\u0098\u0099\7\20\2\2\u0099\u009a\5\34\17\2\u009a\u009b\7\4\2\2\u009b"+
		"\u009c\5\b\5\2\u009c\u009d\7\5\2\2\u009d\u009e\b\16\1\2\u009e\33\3\2\2"+
		"\2\u009f\u00a0\5\36\20\2\u00a0\u00a1\7\21\2\2\u00a1\u00a2\5\36\20\2\u00a2"+
		"\u00a3\b\17\1\2\u00a3\u00b9\3\2\2\2\u00a4\u00a5\5\36\20\2\u00a5\u00a6"+
		"\7\22\2\2\u00a6\u00a7\5\36\20\2\u00a7\u00a8\b\17\1\2\u00a8\u00b9\3\2\2"+
		"\2\u00a9\u00aa\5\36\20\2\u00aa\u00ab\7\23\2\2\u00ab\u00ac\5\36\20\2\u00ac"+
		"\u00ad\b\17\1\2\u00ad\u00b9\3\2\2\2\u00ae\u00af\5\36\20\2\u00af\u00b0"+
		"\7\24\2\2\u00b0\u00b1\5\36\20\2\u00b1\u00b2\b\17\1\2\u00b2\u00b9\3\2\2"+
		"\2\u00b3\u00b4\5\36\20\2\u00b4\u00b5\7\25\2\2\u00b5\u00b6\5\36\20\2\u00b6"+
		"\u00b7\b\17\1\2\u00b7\u00b9\3\2\2\2\u00b8\u009f\3\2\2\2\u00b8\u00a4\3"+
		"\2\2\2\u00b8\u00a9\3\2\2\2\u00b8\u00ae\3\2\2\2\u00b8\u00b3\3\2\2\2\u00b9"+
		"\35\3\2\2\2\u00ba\u00bb\5 \21\2\u00bb\u00bc\7\26\2\2\u00bc\u00bd\5\36"+
		"\20\2\u00bd\u00be\b\20\1\2\u00be\u00c8\3\2\2\2\u00bf\u00c0\5 \21\2\u00c0"+
		"\u00c1\7\27\2\2\u00c1\u00c2\5\36\20\2\u00c2\u00c3\b\20\1\2\u00c3\u00c8"+
		"\3\2\2\2\u00c4\u00c5\5 \21\2\u00c5\u00c6\b\20\1\2\u00c6\u00c8\3\2\2\2"+
		"\u00c7\u00ba\3\2\2\2\u00c7\u00bf\3\2\2\2\u00c7\u00c4\3\2\2\2\u00c8\37"+
		"\3\2\2\2\u00c9\u00ca\b\21\1\2\u00ca\u00cb\5\"\22\2\u00cb\u00cc\b\21\1"+
		"\2\u00cc\u00d9\3\2\2\2\u00cd\u00ce\f\5\2\2\u00ce\u00cf\7\30\2\2\u00cf"+
		"\u00d0\5\"\22\2\u00d0\u00d1\b\21\1\2\u00d1\u00d8\3\2\2\2\u00d2\u00d3\f"+
		"\4\2\2\u00d3\u00d4\7\31\2\2\u00d4\u00d5\5\"\22\2\u00d5\u00d6\b\21\1\2"+
		"\u00d6\u00d8\3\2\2\2\u00d7\u00cd\3\2\2\2\u00d7\u00d2\3\2\2\2\u00d8\u00db"+
		"\3\2\2\2\u00d9\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da!\3\2\2\2\u00db"+
		"\u00d9\3\2\2\2\u00dc\u00dd\7\32\2\2\u00dd\u00de\5\36\20\2\u00de\u00df"+
		"\7\n\2\2\u00df\u00e0\b\22\1\2\u00e0\u00e5\3\2\2\2\u00e1\u00e2\5$\23\2"+
		"\u00e2\u00e3\b\22\1\2\u00e3\u00e5\3\2\2\2\u00e4\u00dc\3\2\2\2\u00e4\u00e1"+
		"\3\2\2\2\u00e5#\3\2\2\2\u00e6\u00e7\7\34\2\2\u00e7\u00ee\b\23\1\2\u00e8"+
		"\u00e9\7\35\2\2\u00e9\u00ee\b\23\1\2\u00ea\u00eb\5&\24\2\u00eb\u00ec\b"+
		"\23\1\2\u00ec\u00ee\3\2\2\2\u00ed\u00e6\3\2\2\2\u00ed\u00e8\3\2\2\2\u00ed"+
		"\u00ea\3\2\2\2\u00ee%\3\2\2\2\u00ef\u00f0\7\33\2\2\u00f0\u00f1\5$\23\2"+
		"\u00f1\u00f2\7\n\2\2\u00f2\u00f3\b\24\1\2\u00f3\'\3\2\2\2\16\67@Gcn\u0096"+
		"\u00b8\u00c7\u00d7\u00d9\u00e4\u00ed";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}