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
		T__24=25, T__25=26, Const2=27, Var=28, WS=29;
	public static final int
		RULE_r = 0, RULE_listvar = 1, RULE_bloc = 2, RULE_inst = 3, RULE_decl = 4, 
		RULE_affct = 5, RULE_boucle = 6, RULE_comment = 7, RULE_decaf = 8, RULE_if2 = 9, 
		RULE_else2 = 10, RULE_while2 = 11, RULE_cond = 12, RULE_op = 13, RULE_factor = 14, 
		RULE_final2 = 15, RULE_nb = 16;
	public static final String[] ruleNames = {
		"r", "listvar", "bloc", "inst", "decl", "affct", "boucle", "comment", 
		"decaf", "if2", "else2", "while2", "cond", "op", "factor", "final2", "nb"
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
		public ListvarContext l;
		public BlocContext b;
		public ListvarContext listvar() {
			return getRuleContext(ListvarContext.class,0);
		}
		public BlocContext bloc() {
			return getRuleContext(BlocContext.class,0);
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
			setState(34);
			match(T__0);
			setState(35);
			((RContext)_localctx).l = listvar();
			setState(36);
			match(T__1);
			setState(37);
			((RContext)_localctx).b = bloc();
			setState(38);
			match(T__2);
			((RContext)_localctx).root =  new Root(((RContext)_localctx).l.lv,((RContext)_localctx).b.bl);
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
		public Listvar lv;
		public Token v;
		public ListvarContext l;
		public TerminalNode Var() { return getToken(HelloParser.Var, 0); }
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
		enterRule(_localctx, 2, RULE_listvar);
		try {
			setState(48);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(41);
				((ListvarContext)_localctx).v = match(Var);
				((ListvarContext)_localctx).lv =  new Listvar(new Var(((ListvarContext)_localctx).v.getText()));
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(43);
				((ListvarContext)_localctx).v = match(Var);
				setState(44);
				match(T__3);
				setState(45);
				((ListvarContext)_localctx).l = listvar();
				((ListvarContext)_localctx).lv =  new Listvar(new Var(((ListvarContext)_localctx).v.getText()),((ListvarContext)_localctx).l.lv);
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
		public Bloc bl;
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
		enterRule(_localctx, 4, RULE_bloc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			((BlocContext)_localctx).i = inst();
			setState(51);
			((BlocContext)_localctx).b = bloc();
			((BlocContext)_localctx).bl =  new Bloc(((BlocContext)_localctx).i.in,((BlocContext)_localctx).b.bl);
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
		public Inst in;
		public AffctContext a;
		public DeclContext d;
		public BoucleContext b;
		public AffctContext affct() {
			return getRuleContext(AffctContext.class,0);
		}
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public DecafContext decaf() {
			return getRuleContext(DecafContext.class,0);
		}
		public BoucleContext boucle() {
			return getRuleContext(BoucleContext.class,0);
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
		enterRule(_localctx, 6, RULE_inst);
		try {
			setState(69);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(54);
				((InstContext)_localctx).a = affct();
				setState(55);
				match(T__4);
				((InstContext)_localctx).in =  new Inst(((InstContext)_localctx).a.af);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(58);
				((InstContext)_localctx).d = decl();
				setState(59);
				match(T__4);
				((InstContext)_localctx).in =  new Inst(((InstContext)_localctx).d.de);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(62);
				((InstContext)_localctx).d = decaf();
				setState(63);
				match(T__4);
				((InstContext)_localctx).in =  new Inst(((InstContext)_localctx).d.de);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(66);
				((InstContext)_localctx).b = boucle();
				((InstContext)_localctx).in =  new Inst(((InstContext)_localctx).b.bo);
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

	public static class DeclContext extends ParserRuleContext {
		public Decl de;
		public ListvarContext l;
		public ListvarContext listvar() {
			return getRuleContext(ListvarContext.class,0);
		}
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitDecl(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(T__5);
			setState(72);
			((DeclContext)_localctx).l = listvar();
			((DeclContext)_localctx).de =  new Decl(((DeclContext)_localctx).l.lv);
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
		public Affct af;
		public Token v;
		public OpContext o1;
		public TerminalNode Var() { return getToken(HelloParser.Var, 0); }
		public OpContext op() {
			return getRuleContext(OpContext.class,0);
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
		enterRule(_localctx, 10, RULE_affct);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			((AffctContext)_localctx).v = match(Var);
			setState(76);
			match(T__6);
			setState(77);
			((AffctContext)_localctx).o1 = op();
			((AffctContext)_localctx).af = new Affct(new Var(((AffctContext)_localctx).v.getText()),,((AffctContext)_localctx).o1.o);
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

	public static class BoucleContext extends ParserRuleContext {
		public Boucle bo;
		public If2Context i;
		public While2Context w;
		public If2Context if2() {
			return getRuleContext(If2Context.class,0);
		}
		public While2Context while2() {
			return getRuleContext(While2Context.class,0);
		}
		public BoucleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boucle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterBoucle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitBoucle(this);
		}
	}

	public final BoucleContext boucle() throws RecognitionException {
		BoucleContext _localctx = new BoucleContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_boucle);
		try {
			setState(86);
			switch (_input.LA(1)) {
			case T__14:
				enterOuterAlt(_localctx, 1);
				{
				setState(80);
				((BoucleContext)_localctx).i = if2();
				((BoucleContext)_localctx).bo =  new Boucle(((BoucleContext)_localctx).i.if);
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 2);
				{
				setState(83);
				((BoucleContext)_localctx).w = while2();
				((BoucleContext)_localctx).bo =  new Boucle(((BoucleContext)_localctx).w.wh);
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

	public static class CommentContext extends ParserRuleContext {
		public List<NbContext> nb() {
			return getRuleContexts(NbContext.class);
		}
		public NbContext nb(int i) {
			return getRuleContext(NbContext.class,i);
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
		enterRule(_localctx, 14, RULE_comment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(T__7);
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << Const2) | (1L << Var))) != 0)) {
				{
				setState(97);
				switch (_input.LA(1)) {
				case Const2:
				case Var:
					{
					setState(89);
					nb();
					}
					break;
				case T__3:
					{
					setState(90);
					match(T__3);
					}
					break;
				case T__4:
					{
					setState(91);
					match(T__4);
					}
					break;
				case T__8:
					{
					setState(92);
					match(T__8);
					}
					break;
				case T__9:
					{
					setState(93);
					match(T__9);
					}
					break;
				case T__10:
					{
					setState(94);
					match(T__10);
					}
					break;
				case T__11:
					{
					setState(95);
					match(T__11);
					}
					break;
				case T__12:
					{
					setState(96);
					match(T__12);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(102);
			match(T__13);
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

	public static class DecafContext extends ParserRuleContext {
		public Decaf de;
		public AffctContext a;
		public AffctContext affct() {
			return getRuleContext(AffctContext.class,0);
		}
		public DecafContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decaf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterDecaf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitDecaf(this);
		}
	}

	public final DecafContext decaf() throws RecognitionException {
		DecafContext _localctx = new DecafContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_decaf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(T__5);
			setState(105);
			((DecafContext)_localctx).a = affct();
			((DecafContext)_localctx).de =  new Decaf(((DecafContext)_localctx).a.af);
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
		public If2 if;
		public CondContext c;
		public BlocContext b;
		public Else2Context e;
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public BlocContext bloc() {
			return getRuleContext(BlocContext.class,0);
		}
		public Else2Context else2() {
			return getRuleContext(Else2Context.class,0);
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
		enterRule(_localctx, 18, RULE_if2);
		try {
			setState(123);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(108);
				match(T__14);
				setState(109);
				((If2Context)_localctx).c = cond();
				setState(110);
				match(T__1);
				setState(111);
				((If2Context)_localctx).b = bloc();
				setState(112);
				match(T__2);
				setState(113);
				((If2Context)_localctx).e = else2();
				((If2Context)_localctx).if =  new If2(((If2Context)_localctx).c.co,((If2Context)_localctx).b.bl,((If2Context)_localctx).e.el);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(116);
				match(T__14);
				setState(117);
				((If2Context)_localctx).c = cond();
				setState(118);
				match(T__1);
				setState(119);
				((If2Context)_localctx).b = bloc();
				setState(120);
				match(T__2);
				((If2Context)_localctx).if =  new If2(((If2Context)_localctx).c.co,((If2Context)_localctx).b.bl);
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

	public static class Else2Context extends ParserRuleContext {
		public Else2 el;
		public BlocContext b;
		public BlocContext bloc() {
			return getRuleContext(BlocContext.class,0);
		}
		public Else2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterElse2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitElse2(this);
		}
	}

	public final Else2Context else2() throws RecognitionException {
		Else2Context _localctx = new Else2Context(_ctx, getState());
		enterRule(_localctx, 20, RULE_else2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(T__15);
			setState(126);
			((Else2Context)_localctx).b = bloc();
			setState(127);
			match(T__2);
			((Else2Context)_localctx).el =  new Else2(((Else2Context)_localctx).b.bl);
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
		public While2 wh;
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
		enterRule(_localctx, 22, RULE_while2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(T__16);
			setState(131);
			((While2Context)_localctx).c = cond();
			setState(132);
			match(T__1);
			setState(133);
			((While2Context)_localctx).b = bloc();
			setState(134);
			match(T__2);
			((While2Context)_localctx).wh =  new While2(((While2Context)_localctx).c.co,((While2Context)_localctx).b.bl);
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
		public Cond co;
		public OpContext o1;
		public OpContext o2;
		public List<OpContext> op() {
			return getRuleContexts(OpContext.class);
		}
		public OpContext op(int i) {
			return getRuleContext(OpContext.class,i);
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
		enterRule(_localctx, 24, RULE_cond);
		try {
			setState(162);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(137);
				((CondContext)_localctx).o1 = op();
				setState(138);
				match(T__17);
				setState(139);
				((CondContext)_localctx).o2 = op();
				((CondContext)_localctx).co =  new Cond(((CondContext)_localctx).o1.o,((CondContext)_localctx).o2.o,"=");
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(142);
				((CondContext)_localctx).o1 = op();
				setState(143);
				match(T__18);
				setState(144);
				((CondContext)_localctx).o2 = op();
				((CondContext)_localctx).co =  new Cond(((CondContext)_localctx).o1.o,((CondContext)_localctx).o2.o,">");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(147);
				((CondContext)_localctx).o1 = op();
				setState(148);
				match(T__19);
				setState(149);
				((CondContext)_localctx).o2 = op();
				((CondContext)_localctx).co =  new Cond(((CondContext)_localctx).o1.o,((CondContext)_localctx).o2.o,"<");
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(152);
				((CondContext)_localctx).o1 = op();
				setState(153);
				match(T__20);
				setState(154);
				((CondContext)_localctx).o2 = op();
				((CondContext)_localctx).co =  new Cond(((CondContext)_localctx).o1.o,((CondContext)_localctx).o2.o,"<=");
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(157);
				((CondContext)_localctx).o1 = op();
				setState(158);
				match(T__21);
				setState(159);
				((CondContext)_localctx).o2 = op();
				((CondContext)_localctx).co =  new Cond(((CondContext)_localctx).o1.o,((CondContext)_localctx).o2.o,">=");
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

	public static class OpContext extends ParserRuleContext {
		public Op o;
		public FactorContext f;
		public OpContext o1;
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public OpContext op() {
			return getRuleContext(OpContext.class,0);
		}
		public OpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitOp(this);
		}
	}

	public final OpContext op() throws RecognitionException {
		OpContext _localctx = new OpContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_op);
		try {
			setState(177);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(164);
				((OpContext)_localctx).f = factor(0);
				setState(165);
				match(T__22);
				setState(166);
				((OpContext)_localctx).o1 = op();
				((OpContext)_localctx).o = new Op(((OpContext)_localctx).f.fac,((OpContext)_localctx).o1.o,"+");
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(169);
				((OpContext)_localctx).f = factor(0);
				setState(170);
				match(T__23);
				setState(171);
				((OpContext)_localctx).o1 = op();
				((OpContext)_localctx).o = new Op(((OpContext)_localctx).f.fac,((OpContext)_localctx).o1.o,"-");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(174);
				((OpContext)_localctx).f = factor(0);
				((OpContext)_localctx).o = new Op(((OpContext)_localctx).f.fac);
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
		public Factor fac;
		public FactorContext fa;
		public Final2Context f;
		public Final2Context fi;
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
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_factor, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(180);
			((FactorContext)_localctx).f = final2();
			((FactorContext)_localctx).fac = new Factor(((FactorContext)_localctx).f.fi);
			}
			_ctx.stop = _input.LT(-1);
			setState(195);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(193);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new FactorContext(_parentctx, _parentState);
						_localctx.fa = _prevctx;
						_localctx.fa = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_factor);
						setState(183);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(184);
						match(T__11);
						setState(185);
						((FactorContext)_localctx).fi = final2();
						((FactorContext)_localctx).fac = new Factor(((FactorContext)_localctx).fa.fac,((FactorContext)_localctx).fi.fi,"*");
						}
						break;
					case 2:
						{
						_localctx = new FactorContext(_parentctx, _parentState);
						_localctx.fa = _prevctx;
						_localctx.fa = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_factor);
						setState(188);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(189);
						match(T__12);
						setState(190);
						((FactorContext)_localctx).fi = final2();
						((FactorContext)_localctx).fac = new Factor(((FactorContext)_localctx).fa.fac,((FactorContext)_localctx).fi.fi,"/");
						}
						break;
					}
					} 
				}
				setState(197);
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
		public Final2 fi;
		public OpContext o1;
		public NbContext n1;
		public OpContext op() {
			return getRuleContext(OpContext.class,0);
		}
		public NbContext nb() {
			return getRuleContext(NbContext.class,0);
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
		enterRule(_localctx, 30, RULE_final2);
		try {
			setState(206);
			switch (_input.LA(1)) {
			case T__24:
				enterOuterAlt(_localctx, 1);
				{
				setState(198);
				match(T__24);
				setState(199);
				((Final2Context)_localctx).o1 = op();
				setState(200);
				match(T__25);
				((Final2Context)_localctx).fi = new Final2(((Final2Context)_localctx).o1.o);
				}
				break;
			case Const2:
			case Var:
				enterOuterAlt(_localctx, 2);
				{
				setState(203);
				((Final2Context)_localctx).n1 = nb();
				((Final2Context)_localctx).fi = new Final2(((Final2Context)_localctx).n1.n);
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

	public static class NbContext extends ParserRuleContext {
		public Nb n;
		public Token c;
		public Token v;
		public TerminalNode Const2() { return getToken(HelloParser.Const2, 0); }
		public TerminalNode Var() { return getToken(HelloParser.Var, 0); }
		public NbContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nb; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterNb(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitNb(this);
		}
	}

	public final NbContext nb() throws RecognitionException {
		NbContext _localctx = new NbContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_nb);
		try {
			setState(212);
			switch (_input.LA(1)) {
			case Const2:
				enterOuterAlt(_localctx, 1);
				{
				setState(208);
				((NbContext)_localctx).c = match(Const2);
				((NbContext)_localctx).n = new Nb(new Const2(((NbContext)_localctx).c.getText()));
				}
				break;
			case Var:
				enterOuterAlt(_localctx, 2);
				{
				setState(210);
				((NbContext)_localctx).v = match(Var);
				((NbContext)_localctx).n = new Nb(new Var(((NbContext)_localctx).v.getText()));
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 14:
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\37\u00d9\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\63\n\3\3"+
		"\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\5\5H\n\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\5\bY\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\td\n\t\f\t\16\tg\13"+
		"\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\5\13~\n\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\5\16\u00a5\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\5\17\u00b4\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u00c4\n\20\f\20\16\20\u00c7\13\20"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00d1\n\21\3\22\3\22\3\22"+
		"\3\22\5\22\u00d7\n\22\3\22\2\3\36\23\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"\2\2\u00df\2$\3\2\2\2\4\62\3\2\2\2\6\64\3\2\2\2\bG\3\2\2\2\n"+
		"I\3\2\2\2\fM\3\2\2\2\16X\3\2\2\2\20Z\3\2\2\2\22j\3\2\2\2\24}\3\2\2\2\26"+
		"\177\3\2\2\2\30\u0084\3\2\2\2\32\u00a4\3\2\2\2\34\u00b3\3\2\2\2\36\u00b5"+
		"\3\2\2\2 \u00d0\3\2\2\2\"\u00d6\3\2\2\2$%\7\3\2\2%&\5\4\3\2&\'\7\4\2\2"+
		"\'(\5\6\4\2()\7\5\2\2)*\b\2\1\2*\3\3\2\2\2+,\7\36\2\2,\63\b\3\1\2-.\7"+
		"\36\2\2./\7\6\2\2/\60\5\4\3\2\60\61\b\3\1\2\61\63\3\2\2\2\62+\3\2\2\2"+
		"\62-\3\2\2\2\63\5\3\2\2\2\64\65\5\b\5\2\65\66\5\6\4\2\66\67\b\4\1\2\67"+
		"\7\3\2\2\289\5\f\7\29:\7\7\2\2:;\b\5\1\2;H\3\2\2\2<=\5\n\6\2=>\7\7\2\2"+
		">?\b\5\1\2?H\3\2\2\2@A\5\22\n\2AB\7\7\2\2BC\b\5\1\2CH\3\2\2\2DE\5\16\b"+
		"\2EF\b\5\1\2FH\3\2\2\2G8\3\2\2\2G<\3\2\2\2G@\3\2\2\2GD\3\2\2\2H\t\3\2"+
		"\2\2IJ\7\b\2\2JK\5\4\3\2KL\b\6\1\2L\13\3\2\2\2MN\7\36\2\2NO\7\t\2\2OP"+
		"\5\34\17\2PQ\b\7\1\2Q\r\3\2\2\2RS\5\24\13\2ST\b\b\1\2TY\3\2\2\2UV\5\30"+
		"\r\2VW\b\b\1\2WY\3\2\2\2XR\3\2\2\2XU\3\2\2\2Y\17\3\2\2\2Ze\7\n\2\2[d\5"+
		"\"\22\2\\d\7\6\2\2]d\7\7\2\2^d\7\13\2\2_d\7\f\2\2`d\7\r\2\2ad\7\16\2\2"+
		"bd\7\17\2\2c[\3\2\2\2c\\\3\2\2\2c]\3\2\2\2c^\3\2\2\2c_\3\2\2\2c`\3\2\2"+
		"\2ca\3\2\2\2cb\3\2\2\2dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2fh\3\2\2\2ge\3\2\2"+
		"\2hi\7\20\2\2i\21\3\2\2\2jk\7\b\2\2kl\5\f\7\2lm\b\n\1\2m\23\3\2\2\2no"+
		"\7\21\2\2op\5\32\16\2pq\7\4\2\2qr\5\6\4\2rs\7\5\2\2st\5\26\f\2tu\b\13"+
		"\1\2u~\3\2\2\2vw\7\21\2\2wx\5\32\16\2xy\7\4\2\2yz\5\6\4\2z{\7\5\2\2{|"+
		"\b\13\1\2|~\3\2\2\2}n\3\2\2\2}v\3\2\2\2~\25\3\2\2\2\177\u0080\7\22\2\2"+
		"\u0080\u0081\5\6\4\2\u0081\u0082\7\5\2\2\u0082\u0083\b\f\1\2\u0083\27"+
		"\3\2\2\2\u0084\u0085\7\23\2\2\u0085\u0086\5\32\16\2\u0086\u0087\7\4\2"+
		"\2\u0087\u0088\5\6\4\2\u0088\u0089\7\5\2\2\u0089\u008a\b\r\1\2\u008a\31"+
		"\3\2\2\2\u008b\u008c\5\34\17\2\u008c\u008d\7\24\2\2\u008d\u008e\5\34\17"+
		"\2\u008e\u008f\b\16\1\2\u008f\u00a5\3\2\2\2\u0090\u0091\5\34\17\2\u0091"+
		"\u0092\7\25\2\2\u0092\u0093\5\34\17\2\u0093\u0094\b\16\1\2\u0094\u00a5"+
		"\3\2\2\2\u0095\u0096\5\34\17\2\u0096\u0097\7\26\2\2\u0097\u0098\5\34\17"+
		"\2\u0098\u0099\b\16\1\2\u0099\u00a5\3\2\2\2\u009a\u009b\5\34\17\2\u009b"+
		"\u009c\7\27\2\2\u009c\u009d\5\34\17\2\u009d\u009e\b\16\1\2\u009e\u00a5"+
		"\3\2\2\2\u009f\u00a0\5\34\17\2\u00a0\u00a1\7\30\2\2\u00a1\u00a2\5\34\17"+
		"\2\u00a2\u00a3\b\16\1\2\u00a3\u00a5\3\2\2\2\u00a4\u008b\3\2\2\2\u00a4"+
		"\u0090\3\2\2\2\u00a4\u0095\3\2\2\2\u00a4\u009a\3\2\2\2\u00a4\u009f\3\2"+
		"\2\2\u00a5\33\3\2\2\2\u00a6\u00a7\5\36\20\2\u00a7\u00a8\7\31\2\2\u00a8"+
		"\u00a9\5\34\17\2\u00a9\u00aa\b\17\1\2\u00aa\u00b4\3\2\2\2\u00ab\u00ac"+
		"\5\36\20\2\u00ac\u00ad\7\32\2\2\u00ad\u00ae\5\34\17\2\u00ae\u00af\b\17"+
		"\1\2\u00af\u00b4\3\2\2\2\u00b0\u00b1\5\36\20\2\u00b1\u00b2\b\17\1\2\u00b2"+
		"\u00b4\3\2\2\2\u00b3\u00a6\3\2\2\2\u00b3\u00ab\3\2\2\2\u00b3\u00b0\3\2"+
		"\2\2\u00b4\35\3\2\2\2\u00b5\u00b6\b\20\1\2\u00b6\u00b7\5 \21\2\u00b7\u00b8"+
		"\b\20\1\2\u00b8\u00c5\3\2\2\2\u00b9\u00ba\f\5\2\2\u00ba\u00bb\7\16\2\2"+
		"\u00bb\u00bc\5 \21\2\u00bc\u00bd\b\20\1\2\u00bd\u00c4\3\2\2\2\u00be\u00bf"+
		"\f\4\2\2\u00bf\u00c0\7\17\2\2\u00c0\u00c1\5 \21\2\u00c1\u00c2\b\20\1\2"+
		"\u00c2\u00c4\3\2\2\2\u00c3\u00b9\3\2\2\2\u00c3\u00be\3\2\2\2\u00c4\u00c7"+
		"\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\37\3\2\2\2\u00c7"+
		"\u00c5\3\2\2\2\u00c8\u00c9\7\33\2\2\u00c9\u00ca\5\34\17\2\u00ca\u00cb"+
		"\7\34\2\2\u00cb\u00cc\b\21\1\2\u00cc\u00d1\3\2\2\2\u00cd\u00ce\5\"\22"+
		"\2\u00ce\u00cf\b\21\1\2\u00cf\u00d1\3\2\2\2\u00d0\u00c8\3\2\2\2\u00d0"+
		"\u00cd\3\2\2\2\u00d1!\3\2\2\2\u00d2\u00d3\7\35\2\2\u00d3\u00d7\b\22\1"+
		"\2\u00d4\u00d5\7\36\2\2\u00d5\u00d7\b\22\1\2\u00d6\u00d2\3\2\2\2\u00d6"+
		"\u00d4\3\2\2\2\u00d7#\3\2\2\2\16\62GXce}\u00a4\u00b3\u00c3\u00c5\u00d0"+
		"\u00d6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}