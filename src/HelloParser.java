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
		T__24=25, T__25=26, T__26=27, T__27=28, CONST=29, VAR=30, WS=31;
	public static final int
		RULE_r = 0, RULE_listvar = 1, RULE_bloc = 2, RULE_inst = 3, RULE_decl = 4, 
		RULE_affct = 5, RULE_boucle = 6, RULE_comment = 7, RULE_decaf = 8, RULE_if2 = 9, 
		RULE_elif = 10, RULE_else2 = 11, RULE_while2 = 12, RULE_for2 = 13, RULE_cond = 14, 
		RULE_op = 15, RULE_terme = 16, RULE_factor = 17, RULE_nb = 18;
	public static final String[] ruleNames = {
		"r", "listvar", "bloc", "inst", "decl", "affct", "boucle", "comment", 
		"decaf", "if2", "elif", "else2", "while2", "for2", "cond", "op", "terme", 
		"factor", "nb"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'main('", "'){'", "'}'", "','", "';'", "'var'", "':='", "'/*'", 
		"'!'", "'.'", "'?'", "'*'", "'/'", "'*/'", "'if('", "'elif('", "'else{'", 
		"'while('", "'for('", "'='", "'>'", "'<'", "'<='", "'>='", "'+'", "'-'", 
		"'('", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, "CONST", "VAR", "WS"
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
			setState(38);
			match(T__0);
			setState(39);
			listvar();
			setState(40);
			match(T__1);
			setState(41);
			bloc();
			setState(42);
			match(T__2);
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
		public TerminalNode VAR() { return getToken(HelloParser.VAR, 0); }
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
				setState(44);
				match(VAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(45);
				match(VAR);
				setState(46);
				match(T__3);
				setState(47);
				listvar();
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
			setState(54);
			switch (_input.LA(1)) {
			case T__5:
			case T__7:
			case T__14:
			case T__17:
			case T__18:
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(50);
				inst();
				setState(51);
				bloc();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
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
		public AffctContext affct() {
			return getRuleContext(AffctContext.class,0);
		}
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public DecafContext decaf() {
			return getRuleContext(DecafContext.class,0);
		}
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
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
			setState(67);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(56);
				affct();
				setState(57);
				match(T__4);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(59);
				decl();
				setState(60);
				match(T__4);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(62);
				decaf();
				setState(63);
				match(T__4);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(65);
				comment();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(66);
				boucle();
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
			setState(69);
			match(T__5);
			setState(70);
			listvar();
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
		public TerminalNode VAR() { return getToken(HelloParser.VAR, 0); }
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
			setState(72);
			match(VAR);
			setState(73);
			match(T__6);
			setState(74);
			op();
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
		public If2Context if2() {
			return getRuleContext(If2Context.class,0);
		}
		public While2Context while2() {
			return getRuleContext(While2Context.class,0);
		}
		public For2Context for2() {
			return getRuleContext(For2Context.class,0);
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
			setState(79);
			switch (_input.LA(1)) {
			case T__14:
				enterOuterAlt(_localctx, 1);
				{
				setState(76);
				if2();
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 2);
				{
				setState(77);
				while2();
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 3);
				{
				setState(78);
				for2();
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
			setState(81);
			match(T__7);
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << CONST) | (1L << VAR))) != 0)) {
				{
				setState(90);
				switch (_input.LA(1)) {
				case CONST:
				case VAR:
					{
					setState(82);
					nb();
					}
					break;
				case T__3:
					{
					setState(83);
					match(T__3);
					}
					break;
				case T__4:
					{
					setState(84);
					match(T__4);
					}
					break;
				case T__8:
					{
					setState(85);
					match(T__8);
					}
					break;
				case T__9:
					{
					setState(86);
					match(T__9);
					}
					break;
				case T__10:
					{
					setState(87);
					match(T__10);
					}
					break;
				case T__11:
					{
					setState(88);
					match(T__11);
					}
					break;
				case T__12:
					{
					setState(89);
					match(T__12);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(94);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(95);
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
			setState(97);
			match(T__5);
			setState(98);
			affct();
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
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public BlocContext bloc() {
			return getRuleContext(BlocContext.class,0);
		}
		public Else2Context else2() {
			return getRuleContext(Else2Context.class,0);
		}
		public List<ElifContext> elif() {
			return getRuleContexts(ElifContext.class);
		}
		public ElifContext elif(int i) {
			return getRuleContext(ElifContext.class,i);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(T__14);
			setState(101);
			cond();
			setState(102);
			match(T__1);
			setState(103);
			bloc();
			setState(104);
			match(T__2);
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__15) {
				{
				{
				setState(105);
				elif();
				}
				}
				setState(110);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(113);
			switch (_input.LA(1)) {
			case T__16:
				{
				setState(111);
				else2();
				}
				break;
			case T__2:
			case T__5:
			case T__7:
			case T__14:
			case T__17:
			case T__18:
			case VAR:
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
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

	public static class ElifContext extends ParserRuleContext {
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public BlocContext bloc() {
			return getRuleContext(BlocContext.class,0);
		}
		public ElifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elif; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterElif(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitElif(this);
		}
	}

	public final ElifContext elif() throws RecognitionException {
		ElifContext _localctx = new ElifContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_elif);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(T__15);
			setState(116);
			cond();
			setState(117);
			match(T__1);
			setState(118);
			bloc();
			setState(119);
			match(T__2);
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
		enterRule(_localctx, 22, RULE_else2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(T__16);
			setState(122);
			bloc();
			setState(123);
			match(T__2);
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
			setState(125);
			match(T__17);
			setState(126);
			cond();
			setState(127);
			match(T__1);
			setState(128);
			bloc();
			setState(129);
			match(T__2);
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

	public static class For2Context extends ParserRuleContext {
		public DecafContext decaf() {
			return getRuleContext(DecafContext.class,0);
		}
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public AffctContext affct() {
			return getRuleContext(AffctContext.class,0);
		}
		public BlocContext bloc() {
			return getRuleContext(BlocContext.class,0);
		}
		public For2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterFor2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitFor2(this);
		}
	}

	public final For2Context for2() throws RecognitionException {
		For2Context _localctx = new For2Context(_ctx, getState());
		enterRule(_localctx, 26, RULE_for2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(T__18);
			setState(132);
			decaf();
			setState(133);
			match(T__4);
			setState(134);
			cond();
			setState(135);
			match(T__4);
			setState(136);
			affct();
			setState(137);
			match(T__1);
			setState(138);
			bloc();
			setState(139);
			match(T__2);
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
		enterRule(_localctx, 28, RULE_cond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(141);
				op();
				setState(142);
				match(T__19);
				setState(143);
				op();
				}
				break;
			case 2:
				{
				setState(145);
				op();
				setState(146);
				match(T__20);
				setState(147);
				op();
				}
				break;
			case 3:
				{
				setState(149);
				op();
				setState(150);
				match(T__21);
				setState(151);
				op();
				}
				break;
			case 4:
				{
				setState(153);
				op();
				setState(154);
				match(T__22);
				setState(155);
				op();
				}
				break;
			case 5:
				{
				setState(157);
				op();
				setState(158);
				match(T__23);
				setState(159);
				op();
				}
				break;
			}
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
		public List<TermeContext> terme() {
			return getRuleContexts(TermeContext.class);
		}
		public TermeContext terme(int i) {
			return getRuleContext(TermeContext.class,i);
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
		enterRule(_localctx, 30, RULE_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			terme();
			setState(170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__24 || _la==T__25) {
				{
				setState(168);
				switch (_input.LA(1)) {
				case T__24:
					{
					setState(164);
					match(T__24);
					setState(165);
					terme();
					}
					break;
				case T__25:
					{
					setState(166);
					match(T__25);
					setState(167);
					terme();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(172);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class TermeContext extends ParserRuleContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public TermeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_terme; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterTerme(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitTerme(this);
		}
	}

	public final TermeContext terme() throws RecognitionException {
		TermeContext _localctx = new TermeContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_terme);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			factor();
			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__11 || _la==T__12) {
				{
				setState(178);
				switch (_input.LA(1)) {
				case T__11:
					{
					setState(174);
					match(T__11);
					setState(175);
					factor();
					}
					break;
				case T__12:
					{
					setState(176);
					match(T__12);
					setState(177);
					factor();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(182);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public NbContext nb() {
			return getRuleContext(NbContext.class,0);
		}
		public OpContext op() {
			return getRuleContext(OpContext.class,0);
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
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_factor);
		try {
			setState(190);
			switch (_input.LA(1)) {
			case T__25:
				enterOuterAlt(_localctx, 1);
				{
				setState(183);
				match(T__25);
				setState(184);
				factor();
				}
				break;
			case CONST:
			case VAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(185);
				nb();
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 3);
				{
				setState(186);
				match(T__26);
				setState(187);
				op();
				setState(188);
				match(T__27);
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
		public TerminalNode CONST() { return getToken(HelloParser.CONST, 0); }
		public TerminalNode VAR() { return getToken(HelloParser.VAR, 0); }
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
		enterRule(_localctx, 36, RULE_nb);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			_la = _input.LA(1);
			if ( !(_la==CONST || _la==VAR) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3!\u00c5\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\5\3\63\n"+
		"\3\3\4\3\4\3\4\3\4\5\49\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\5\5F\n\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\5\bR\n\b\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t]\n\t\f\t\16\t`\13\t\3\t\3\t\3\n\3\n\3\n"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\7\13m\n\13\f\13\16\13p\13\13\3\13\3\13"+
		"\5\13t\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\5\20\u00a4\n\20\3\21\3\21\3\21\3\21\3\21\7\21\u00ab"+
		"\n\21\f\21\16\21\u00ae\13\21\3\22\3\22\3\22\3\22\3\22\7\22\u00b5\n\22"+
		"\f\22\16\22\u00b8\13\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00c1"+
		"\n\23\3\24\3\24\3\24\2\2\25\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \""+
		"$&\2\3\3\2\37 \u00cd\2(\3\2\2\2\4\62\3\2\2\2\68\3\2\2\2\bE\3\2\2\2\nG"+
		"\3\2\2\2\fJ\3\2\2\2\16Q\3\2\2\2\20S\3\2\2\2\22c\3\2\2\2\24f\3\2\2\2\26"+
		"u\3\2\2\2\30{\3\2\2\2\32\177\3\2\2\2\34\u0085\3\2\2\2\36\u00a3\3\2\2\2"+
		" \u00a5\3\2\2\2\"\u00af\3\2\2\2$\u00c0\3\2\2\2&\u00c2\3\2\2\2()\7\3\2"+
		"\2)*\5\4\3\2*+\7\4\2\2+,\5\6\4\2,-\7\5\2\2-\3\3\2\2\2.\63\7 \2\2/\60\7"+
		" \2\2\60\61\7\6\2\2\61\63\5\4\3\2\62.\3\2\2\2\62/\3\2\2\2\63\5\3\2\2\2"+
		"\64\65\5\b\5\2\65\66\5\6\4\2\669\3\2\2\2\679\3\2\2\28\64\3\2\2\28\67\3"+
		"\2\2\29\7\3\2\2\2:;\5\f\7\2;<\7\7\2\2<F\3\2\2\2=>\5\n\6\2>?\7\7\2\2?F"+
		"\3\2\2\2@A\5\22\n\2AB\7\7\2\2BF\3\2\2\2CF\5\20\t\2DF\5\16\b\2E:\3\2\2"+
		"\2E=\3\2\2\2E@\3\2\2\2EC\3\2\2\2ED\3\2\2\2F\t\3\2\2\2GH\7\b\2\2HI\5\4"+
		"\3\2I\13\3\2\2\2JK\7 \2\2KL\7\t\2\2LM\5 \21\2M\r\3\2\2\2NR\5\24\13\2O"+
		"R\5\32\16\2PR\5\34\17\2QN\3\2\2\2QO\3\2\2\2QP\3\2\2\2R\17\3\2\2\2S^\7"+
		"\n\2\2T]\5&\24\2U]\7\6\2\2V]\7\7\2\2W]\7\13\2\2X]\7\f\2\2Y]\7\r\2\2Z]"+
		"\7\16\2\2[]\7\17\2\2\\T\3\2\2\2\\U\3\2\2\2\\V\3\2\2\2\\W\3\2\2\2\\X\3"+
		"\2\2\2\\Y\3\2\2\2\\Z\3\2\2\2\\[\3\2\2\2]`\3\2\2\2^\\\3\2\2\2^_\3\2\2\2"+
		"_a\3\2\2\2`^\3\2\2\2ab\7\20\2\2b\21\3\2\2\2cd\7\b\2\2de\5\f\7\2e\23\3"+
		"\2\2\2fg\7\21\2\2gh\5\36\20\2hi\7\4\2\2ij\5\6\4\2jn\7\5\2\2km\5\26\f\2"+
		"lk\3\2\2\2mp\3\2\2\2nl\3\2\2\2no\3\2\2\2os\3\2\2\2pn\3\2\2\2qt\5\30\r"+
		"\2rt\3\2\2\2sq\3\2\2\2sr\3\2\2\2t\25\3\2\2\2uv\7\22\2\2vw\5\36\20\2wx"+
		"\7\4\2\2xy\5\6\4\2yz\7\5\2\2z\27\3\2\2\2{|\7\23\2\2|}\5\6\4\2}~\7\5\2"+
		"\2~\31\3\2\2\2\177\u0080\7\24\2\2\u0080\u0081\5\36\20\2\u0081\u0082\7"+
		"\4\2\2\u0082\u0083\5\6\4\2\u0083\u0084\7\5\2\2\u0084\33\3\2\2\2\u0085"+
		"\u0086\7\25\2\2\u0086\u0087\5\22\n\2\u0087\u0088\7\7\2\2\u0088\u0089\5"+
		"\36\20\2\u0089\u008a\7\7\2\2\u008a\u008b\5\f\7\2\u008b\u008c\7\4\2\2\u008c"+
		"\u008d\5\6\4\2\u008d\u008e\7\5\2\2\u008e\35\3\2\2\2\u008f\u0090\5 \21"+
		"\2\u0090\u0091\7\26\2\2\u0091\u0092\5 \21\2\u0092\u00a4\3\2\2\2\u0093"+
		"\u0094\5 \21\2\u0094\u0095\7\27\2\2\u0095\u0096\5 \21\2\u0096\u00a4\3"+
		"\2\2\2\u0097\u0098\5 \21\2\u0098\u0099\7\30\2\2\u0099\u009a\5 \21\2\u009a"+
		"\u00a4\3\2\2\2\u009b\u009c\5 \21\2\u009c\u009d\7\31\2\2\u009d\u009e\5"+
		" \21\2\u009e\u00a4\3\2\2\2\u009f\u00a0\5 \21\2\u00a0\u00a1\7\32\2\2\u00a1"+
		"\u00a2\5 \21\2\u00a2\u00a4\3\2\2\2\u00a3\u008f\3\2\2\2\u00a3\u0093\3\2"+
		"\2\2\u00a3\u0097\3\2\2\2\u00a3\u009b\3\2\2\2\u00a3\u009f\3\2\2\2\u00a4"+
		"\37\3\2\2\2\u00a5\u00ac\5\"\22\2\u00a6\u00a7\7\33\2\2\u00a7\u00ab\5\""+
		"\22\2\u00a8\u00a9\7\34\2\2\u00a9\u00ab\5\"\22\2\u00aa\u00a6\3\2\2\2\u00aa"+
		"\u00a8\3\2\2\2\u00ab\u00ae\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ad\3\2"+
		"\2\2\u00ad!\3\2\2\2\u00ae\u00ac\3\2\2\2\u00af\u00b6\5$\23\2\u00b0\u00b1"+
		"\7\16\2\2\u00b1\u00b5\5$\23\2\u00b2\u00b3\7\17\2\2\u00b3\u00b5\5$\23\2"+
		"\u00b4\u00b0\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b5\u00b8\3\2\2\2\u00b6\u00b4"+
		"\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7#\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b9"+
		"\u00ba\7\34\2\2\u00ba\u00c1\5$\23\2\u00bb\u00c1\5&\24\2\u00bc\u00bd\7"+
		"\35\2\2\u00bd\u00be\5 \21\2\u00be\u00bf\7\36\2\2\u00bf\u00c1\3\2\2\2\u00c0"+
		"\u00b9\3\2\2\2\u00c0\u00bb\3\2\2\2\u00c0\u00bc\3\2\2\2\u00c1%\3\2\2\2"+
		"\u00c2\u00c3\t\2\2\2\u00c3\'\3\2\2\2\20\628EQ\\^ns\u00a3\u00aa\u00ac\u00b4"+
		"\u00b6\u00c0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}