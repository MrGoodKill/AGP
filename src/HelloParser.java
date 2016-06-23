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
		RULE_r = 0, RULE_prog = 1, RULE_listvar = 2, RULE_bloc = 3, RULE_inst = 4, 
		RULE_print = 5, RULE_string2 = 6, RULE_ask = 7, RULE_declaration = 8, 
		RULE_affct = 9, RULE_comment = 10, RULE_declaffct = 11, RULE_if2 = 12, 
		RULE_while2 = 13, RULE_cond = 14, RULE_operation = 15, RULE_factor = 16, 
		RULE_final2 = 17, RULE_numb = 18, RULE_rand = 19;
	public static final String[] ruleNames = {
		"r", "prog", "listvar", "bloc", "inst", "print", "string2", "ask", "declaration", 
		"affct", "comment", "declaffct", "if2", "while2", "cond", "operation", 
		"factor", "final2", "numb", "rand"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'main('", "'){'", "'}'", "'main(){'", "','", "';'", "'print('", 
		"')'", "'ask('", "'var '", "':='", "'/*'", "'!'", "'.'", "'?'", "'*'", 
		"'/'", "'-'", "'Ã'", "'©'", "'¨'", "'*/'", "'if('", "'else{'", "'while('", 
		"'='", "'>'", "'<'", "'<='", "'>='", "'+'", "'('", "'rand('"
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
			setState(40);
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
			setState(55);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(43);
				match(T__0);
				setState(44);
				((ProgContext)_localctx).l = listvar();
				setState(45);
				match(T__1);
				setState(46);
				((ProgContext)_localctx).b = bloc();
				setState(47);
				match(T__2);
				((ProgContext)_localctx).p =  new Prog(((ProgContext)_localctx).l.lv,((ProgContext)_localctx).b.bc);
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(50);
				match(T__3);
				setState(51);
				((ProgContext)_localctx).b = bloc();
				setState(52);
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
			setState(64);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(57);
				((ListvarContext)_localctx).v = match(WORD);
				((ListvarContext)_localctx).lv =  new ListVar(new Var(((ListvarContext)_localctx).v.getText()));
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(59);
				((ListvarContext)_localctx).v = match(WORD);
				setState(60);
				match(T__4);
				setState(61);
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
			setState(71);
			switch (_input.LA(1)) {
			case T__6:
			case T__8:
			case T__9:
			case T__11:
			case T__22:
			case T__24:
			case WORD:
				enterOuterAlt(_localctx, 1);
				{
				setState(66);
				((BlocContext)_localctx).i = inst();
				setState(67);
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
		enterRule(_localctx, 8, RULE_inst);
		try {
			setState(102);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(73);
				((InstContext)_localctx).a = affct();
				setState(74);
				match(T__5);
				((InstContext)_localctx).instruct =  new Inst(((InstContext)_localctx).a.aff);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(77);
				((InstContext)_localctx).d1 = declaration();
				setState(78);
				match(T__5);
				((InstContext)_localctx).instruct =  new Inst(((InstContext)_localctx).d1.decl);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(81);
				((InstContext)_localctx).d2 = declaffct();
				setState(82);
				match(T__5);
				((InstContext)_localctx).instruct =  new Inst(((InstContext)_localctx).d2.decaf);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(85);
				((InstContext)_localctx).c = comment();
				((InstContext)_localctx).instruct =  new Inst(((InstContext)_localctx).c.com);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(88);
				((InstContext)_localctx).i = if2();
				((InstContext)_localctx).instruct =  new Inst(((InstContext)_localctx).i.i);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(91);
				((InstContext)_localctx).w = while2();
				((InstContext)_localctx).instruct =  new Inst(((InstContext)_localctx).w.w);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(94);
				((InstContext)_localctx).as = ask();
				setState(95);
				match(T__5);
				((InstContext)_localctx).instruct =  new Inst(((InstContext)_localctx).as.a);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(98);
				((InstContext)_localctx).p = print();
				setState(99);
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
			setState(113);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(104);
				match(T__6);
				setState(105);
				((PrintContext)_localctx).v = match(WORD);
				setState(106);
				match(T__7);
				((PrintContext)_localctx).p =  new Print(new Var(((PrintContext)_localctx).v.getText()));
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(108);
				match(T__6);
				setState(109);
				((PrintContext)_localctx).s = string2();
				setState(110);
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
			setState(115);
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
			setState(118);
			match(T__8);
			setState(119);
			((AskContext)_localctx).v = match(WORD);
			setState(120);
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
			setState(123);
			match(T__9);
			setState(124);
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
			setState(127);
			((AffctContext)_localctx).v = match(WORD);
			setState(128);
			match(T__10);
			setState(129);
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
		enterRule(_localctx, 20, RULE_comment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(T__11);
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__32) | (1L << CONST) | (1L << WORD))) != 0)) {
				{
				setState(145);
				switch (_input.LA(1)) {
				case T__32:
				case CONST:
				case WORD:
					{
					setState(133);
					numb();
					}
					break;
				case T__4:
					{
					setState(134);
					match(T__4);
					}
					break;
				case T__5:
					{
					setState(135);
					match(T__5);
					}
					break;
				case T__12:
					{
					setState(136);
					match(T__12);
					}
					break;
				case T__13:
					{
					setState(137);
					match(T__13);
					}
					break;
				case T__14:
					{
					setState(138);
					match(T__14);
					}
					break;
				case T__15:
					{
					setState(139);
					match(T__15);
					}
					break;
				case T__16:
					{
					setState(140);
					match(T__16);
					}
					break;
				case T__17:
					{
					setState(141);
					match(T__17);
					}
					break;
				case T__18:
					{
					setState(142);
					match(T__18);
					}
					break;
				case T__19:
					{
					setState(143);
					match(T__19);
					}
					break;
				case T__20:
					{
					setState(144);
					match(T__20);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(149);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(150);
			match(T__21);
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
		enterRule(_localctx, 22, RULE_declaffct);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(T__9);
			setState(154);
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
		enterRule(_localctx, 24, RULE_if2);
		try {
			setState(174);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(157);
				match(T__22);
				setState(158);
				((If2Context)_localctx).c = cond();
				setState(159);
				match(T__1);
				setState(160);
				((If2Context)_localctx).b = bloc();
				setState(161);
				match(T__2);
				setState(162);
				match(T__23);
				setState(163);
				((If2Context)_localctx).b2 = bloc();
				setState(164);
				match(T__2);
				((If2Context)_localctx).i =  new If2(((If2Context)_localctx).c.c,((If2Context)_localctx).b.bc,((If2Context)_localctx).b2.bc);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(167);
				match(T__22);
				setState(168);
				((If2Context)_localctx).c = cond();
				setState(169);
				match(T__1);
				setState(170);
				((If2Context)_localctx).b = bloc();
				setState(171);
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
		enterRule(_localctx, 26, RULE_while2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			match(T__24);
			setState(177);
			((While2Context)_localctx).c = cond();
			setState(178);
			match(T__1);
			setState(179);
			((While2Context)_localctx).b = bloc();
			setState(180);
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
		enterRule(_localctx, 28, RULE_cond);
		try {
			setState(208);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(183);
				((CondContext)_localctx).op1 = operation();
				setState(184);
				match(T__25);
				setState(185);
				((CondContext)_localctx).op2 = operation();
				((CondContext)_localctx).c =  new Cond(((CondContext)_localctx).op1.op,((CondContext)_localctx).op2.op,"=");
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(188);
				((CondContext)_localctx).op1 = operation();
				setState(189);
				match(T__26);
				setState(190);
				((CondContext)_localctx).op2 = operation();
				((CondContext)_localctx).c =  new Cond(((CondContext)_localctx).op1.op,((CondContext)_localctx).op2.op,">");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(193);
				((CondContext)_localctx).op1 = operation();
				setState(194);
				match(T__27);
				setState(195);
				((CondContext)_localctx).op2 = operation();
				((CondContext)_localctx).c =  new Cond(((CondContext)_localctx).op1.op,((CondContext)_localctx).op2.op,"<");
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(198);
				((CondContext)_localctx).op1 = operation();
				setState(199);
				match(T__28);
				setState(200);
				((CondContext)_localctx).op2 = operation();
				((CondContext)_localctx).c =  new Cond(((CondContext)_localctx).op1.op,((CondContext)_localctx).op2.op,"<=");
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(203);
				((CondContext)_localctx).op1 = operation();
				setState(204);
				match(T__29);
				setState(205);
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
		enterRule(_localctx, 30, RULE_operation);
		try {
			setState(223);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(210);
				((OperationContext)_localctx).f1 = factor(0);
				setState(211);
				match(T__30);
				setState(212);
				((OperationContext)_localctx).op2 = operation();
				((OperationContext)_localctx).op = new Op(((OperationContext)_localctx).f1.f,((OperationContext)_localctx).op2.op,"+");
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(215);
				((OperationContext)_localctx).f1 = factor(0);
				setState(216);
				match(T__17);
				setState(217);
				((OperationContext)_localctx).op2 = operation();
				((OperationContext)_localctx).op = new Op(((OperationContext)_localctx).f1.f,((OperationContext)_localctx).op2.op,"-");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(220);
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
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_factor, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(226);
			((FactorContext)_localctx).f3 = final2();
			((FactorContext)_localctx).f = new Factor(((FactorContext)_localctx).f3.f);
			}
			_ctx.stop = _input.LT(-1);
			setState(241);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(239);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new FactorContext(_parentctx, _parentState);
						_localctx.f1 = _prevctx;
						_localctx.f1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_factor);
						setState(229);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(230);
						match(T__15);
						setState(231);
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
						setState(234);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(235);
						match(T__16);
						setState(236);
						((FactorContext)_localctx).f2 = final2();
						((FactorContext)_localctx).f = new Factor(((FactorContext)_localctx).f1.f,((FactorContext)_localctx).f2.f,"/");
						}
						break;
					}
					} 
				}
				setState(243);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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
		enterRule(_localctx, 34, RULE_final2);
		try {
			setState(252);
			switch (_input.LA(1)) {
			case T__31:
				enterOuterAlt(_localctx, 1);
				{
				setState(244);
				match(T__31);
				setState(245);
				((Final2Context)_localctx).op1 = operation();
				setState(246);
				match(T__7);
				((Final2Context)_localctx).f = new Final2(((Final2Context)_localctx).op1.op);
				}
				break;
			case T__32:
			case CONST:
			case WORD:
				enterOuterAlt(_localctx, 2);
				{
				setState(249);
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
		enterRule(_localctx, 36, RULE_numb);
		try {
			setState(261);
			switch (_input.LA(1)) {
			case CONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(254);
				((NumbContext)_localctx).c = match(CONST);
				((NumbContext)_localctx).nb = new Number(new Const2(((NumbContext)_localctx).c.getText()));
				}
				break;
			case WORD:
				enterOuterAlt(_localctx, 2);
				{
				setState(256);
				((NumbContext)_localctx).v = match(WORD);
				((NumbContext)_localctx).nb = new Number(new Var(((NumbContext)_localctx).v.getText()));
				}
				break;
			case T__32:
				enterOuterAlt(_localctx, 3);
				{
				setState(258);
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
		enterRule(_localctx, 38, RULE_rand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			match(T__32);
			setState(264);
			((RandContext)_localctx).n = numb();
			setState(265);
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
		case 16:
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3(\u010f\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\5\3:\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4C\n\4\3\5"+
		"\3\5\3\5\3\5\3\5\5\5J\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\5\6i\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7t\n\7\3\b\3\b\3\b\3"+
		"\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u0094\n\f\f\f\16\f\u0097"+
		"\13\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00b1\n\16\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\5\20\u00d3\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\5\21\u00e2\n\21\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u00f2\n\22\f\22\16\22\u00f5"+
		"\13\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00ff\n\23\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\5\24\u0108\n\24\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\2\3\"\26\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(\2\2\u011d"+
		"\2*\3\2\2\2\49\3\2\2\2\6B\3\2\2\2\bI\3\2\2\2\nh\3\2\2\2\fs\3\2\2\2\16"+
		"u\3\2\2\2\20x\3\2\2\2\22}\3\2\2\2\24\u0081\3\2\2\2\26\u0086\3\2\2\2\30"+
		"\u009b\3\2\2\2\32\u00b0\3\2\2\2\34\u00b2\3\2\2\2\36\u00d2\3\2\2\2 \u00e1"+
		"\3\2\2\2\"\u00e3\3\2\2\2$\u00fe\3\2\2\2&\u0107\3\2\2\2(\u0109\3\2\2\2"+
		"*+\5\4\3\2+,\b\2\1\2,\3\3\2\2\2-.\7\3\2\2./\5\6\4\2/\60\7\4\2\2\60\61"+
		"\5\b\5\2\61\62\7\5\2\2\62\63\b\3\1\2\63:\3\2\2\2\64\65\7\6\2\2\65\66\5"+
		"\b\5\2\66\67\7\5\2\2\678\b\3\1\28:\3\2\2\29-\3\2\2\29\64\3\2\2\2:\5\3"+
		"\2\2\2;<\7%\2\2<C\b\4\1\2=>\7%\2\2>?\7\7\2\2?@\5\6\4\2@A\b\4\1\2AC\3\2"+
		"\2\2B;\3\2\2\2B=\3\2\2\2C\7\3\2\2\2DE\5\n\6\2EF\5\b\5\2FG\b\5\1\2GJ\3"+
		"\2\2\2HJ\b\5\1\2ID\3\2\2\2IH\3\2\2\2J\t\3\2\2\2KL\5\24\13\2LM\7\b\2\2"+
		"MN\b\6\1\2Ni\3\2\2\2OP\5\22\n\2PQ\7\b\2\2QR\b\6\1\2Ri\3\2\2\2ST\5\30\r"+
		"\2TU\7\b\2\2UV\b\6\1\2Vi\3\2\2\2WX\5\26\f\2XY\b\6\1\2Yi\3\2\2\2Z[\5\32"+
		"\16\2[\\\b\6\1\2\\i\3\2\2\2]^\5\34\17\2^_\b\6\1\2_i\3\2\2\2`a\5\20\t\2"+
		"ab\7\b\2\2bc\b\6\1\2ci\3\2\2\2de\5\f\7\2ef\7\b\2\2fg\b\6\1\2gi\3\2\2\2"+
		"hK\3\2\2\2hO\3\2\2\2hS\3\2\2\2hW\3\2\2\2hZ\3\2\2\2h]\3\2\2\2h`\3\2\2\2"+
		"hd\3\2\2\2i\13\3\2\2\2jk\7\t\2\2kl\7%\2\2lm\7\n\2\2mt\b\7\1\2no\7\t\2"+
		"\2op\5\16\b\2pq\7\n\2\2qr\b\7\1\2rt\3\2\2\2sj\3\2\2\2sn\3\2\2\2t\r\3\2"+
		"\2\2uv\7(\2\2vw\b\b\1\2w\17\3\2\2\2xy\7\13\2\2yz\7%\2\2z{\7\n\2\2{|\b"+
		"\t\1\2|\21\3\2\2\2}~\7\f\2\2~\177\5\6\4\2\177\u0080\b\n\1\2\u0080\23\3"+
		"\2\2\2\u0081\u0082\7%\2\2\u0082\u0083\7\r\2\2\u0083\u0084\5 \21\2\u0084"+
		"\u0085\b\13\1\2\u0085\25\3\2\2\2\u0086\u0095\7\16\2\2\u0087\u0094\5&\24"+
		"\2\u0088\u0094\7\7\2\2\u0089\u0094\7\b\2\2\u008a\u0094\7\17\2\2\u008b"+
		"\u0094\7\20\2\2\u008c\u0094\7\21\2\2\u008d\u0094\7\22\2\2\u008e\u0094"+
		"\7\23\2\2\u008f\u0094\7\24\2\2\u0090\u0094\7\25\2\2\u0091\u0094\7\26\2"+
		"\2\u0092\u0094\7\27\2\2\u0093\u0087\3\2\2\2\u0093\u0088\3\2\2\2\u0093"+
		"\u0089\3\2\2\2\u0093\u008a\3\2\2\2\u0093\u008b\3\2\2\2\u0093\u008c\3\2"+
		"\2\2\u0093\u008d\3\2\2\2\u0093\u008e\3\2\2\2\u0093\u008f\3\2\2\2\u0093"+
		"\u0090\3\2\2\2\u0093\u0091\3\2\2\2\u0093\u0092\3\2\2\2\u0094\u0097\3\2"+
		"\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0098\3\2\2\2\u0097"+
		"\u0095\3\2\2\2\u0098\u0099\7\30\2\2\u0099\u009a\b\f\1\2\u009a\27\3\2\2"+
		"\2\u009b\u009c\7\f\2\2\u009c\u009d\5\24\13\2\u009d\u009e\b\r\1\2\u009e"+
		"\31\3\2\2\2\u009f\u00a0\7\31\2\2\u00a0\u00a1\5\36\20\2\u00a1\u00a2\7\4"+
		"\2\2\u00a2\u00a3\5\b\5\2\u00a3\u00a4\7\5\2\2\u00a4\u00a5\7\32\2\2\u00a5"+
		"\u00a6\5\b\5\2\u00a6\u00a7\7\5\2\2\u00a7\u00a8\b\16\1\2\u00a8\u00b1\3"+
		"\2\2\2\u00a9\u00aa\7\31\2\2\u00aa\u00ab\5\36\20\2\u00ab\u00ac\7\4\2\2"+
		"\u00ac\u00ad\5\b\5\2\u00ad\u00ae\7\5\2\2\u00ae\u00af\b\16\1\2\u00af\u00b1"+
		"\3\2\2\2\u00b0\u009f\3\2\2\2\u00b0\u00a9\3\2\2\2\u00b1\33\3\2\2\2\u00b2"+
		"\u00b3\7\33\2\2\u00b3\u00b4\5\36\20\2\u00b4\u00b5\7\4\2\2\u00b5\u00b6"+
		"\5\b\5\2\u00b6\u00b7\7\5\2\2\u00b7\u00b8\b\17\1\2\u00b8\35\3\2\2\2\u00b9"+
		"\u00ba\5 \21\2\u00ba\u00bb\7\34\2\2\u00bb\u00bc\5 \21\2\u00bc\u00bd\b"+
		"\20\1\2\u00bd\u00d3\3\2\2\2\u00be\u00bf\5 \21\2\u00bf\u00c0\7\35\2\2\u00c0"+
		"\u00c1\5 \21\2\u00c1\u00c2\b\20\1\2\u00c2\u00d3\3\2\2\2\u00c3\u00c4\5"+
		" \21\2\u00c4\u00c5\7\36\2\2\u00c5\u00c6\5 \21\2\u00c6\u00c7\b\20\1\2\u00c7"+
		"\u00d3\3\2\2\2\u00c8\u00c9\5 \21\2\u00c9\u00ca\7\37\2\2\u00ca\u00cb\5"+
		" \21\2\u00cb\u00cc\b\20\1\2\u00cc\u00d3\3\2\2\2\u00cd\u00ce\5 \21\2\u00ce"+
		"\u00cf\7 \2\2\u00cf\u00d0\5 \21\2\u00d0\u00d1\b\20\1\2\u00d1\u00d3\3\2"+
		"\2\2\u00d2\u00b9\3\2\2\2\u00d2\u00be\3\2\2\2\u00d2\u00c3\3\2\2\2\u00d2"+
		"\u00c8\3\2\2\2\u00d2\u00cd\3\2\2\2\u00d3\37\3\2\2\2\u00d4\u00d5\5\"\22"+
		"\2\u00d5\u00d6\7!\2\2\u00d6\u00d7\5 \21\2\u00d7\u00d8\b\21\1\2\u00d8\u00e2"+
		"\3\2\2\2\u00d9\u00da\5\"\22\2\u00da\u00db\7\24\2\2\u00db\u00dc\5 \21\2"+
		"\u00dc\u00dd\b\21\1\2\u00dd\u00e2\3\2\2\2\u00de\u00df\5\"\22\2\u00df\u00e0"+
		"\b\21\1\2\u00e0\u00e2\3\2\2\2\u00e1\u00d4\3\2\2\2\u00e1\u00d9\3\2\2\2"+
		"\u00e1\u00de\3\2\2\2\u00e2!\3\2\2\2\u00e3\u00e4\b\22\1\2\u00e4\u00e5\5"+
		"$\23\2\u00e5\u00e6\b\22\1\2\u00e6\u00f3\3\2\2\2\u00e7\u00e8\f\5\2\2\u00e8"+
		"\u00e9\7\22\2\2\u00e9\u00ea\5$\23\2\u00ea\u00eb\b\22\1\2\u00eb\u00f2\3"+
		"\2\2\2\u00ec\u00ed\f\4\2\2\u00ed\u00ee\7\23\2\2\u00ee\u00ef\5$\23\2\u00ef"+
		"\u00f0\b\22\1\2\u00f0\u00f2\3\2\2\2\u00f1\u00e7\3\2\2\2\u00f1\u00ec\3"+
		"\2\2\2\u00f2\u00f5\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4"+
		"#\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f6\u00f7\7\"\2\2\u00f7\u00f8\5 \21\2"+
		"\u00f8\u00f9\7\n\2\2\u00f9\u00fa\b\23\1\2\u00fa\u00ff\3\2\2\2\u00fb\u00fc"+
		"\5&\24\2\u00fc\u00fd\b\23\1\2\u00fd\u00ff\3\2\2\2\u00fe\u00f6\3\2\2\2"+
		"\u00fe\u00fb\3\2\2\2\u00ff%\3\2\2\2\u0100\u0101\7$\2\2\u0101\u0108\b\24"+
		"\1\2\u0102\u0103\7%\2\2\u0103\u0108\b\24\1\2\u0104\u0105\5(\25\2\u0105"+
		"\u0106\b\24\1\2\u0106\u0108\3\2\2\2\u0107\u0100\3\2\2\2\u0107\u0102\3"+
		"\2\2\2\u0107\u0104\3\2\2\2\u0108\'\3\2\2\2\u0109\u010a\7#\2\2\u010a\u010b"+
		"\5&\24\2\u010b\u010c\7\n\2\2\u010c\u010d\b\25\1\2\u010d)\3\2\2\2\209B"+
		"Ihs\u0093\u0095\u00b0\u00d2\u00e1\u00f1\u00f3\u00fe\u0107";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}