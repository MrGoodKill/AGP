// Generated from Hello.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HelloParser}.
 */
public interface HelloListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HelloParser#r}.
	 * @param ctx the parse tree
	 */
	void enterR(HelloParser.RContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#r}.
	 * @param ctx the parse tree
	 */
	void exitR(HelloParser.RContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#listvar}.
	 * @param ctx the parse tree
	 */
	void enterListvar(HelloParser.ListvarContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#listvar}.
	 * @param ctx the parse tree
	 */
	void exitListvar(HelloParser.ListvarContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#bloc}.
	 * @param ctx the parse tree
	 */
	void enterBloc(HelloParser.BlocContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#bloc}.
	 * @param ctx the parse tree
	 */
	void exitBloc(HelloParser.BlocContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#inst}.
	 * @param ctx the parse tree
	 */
	void enterInst(HelloParser.InstContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#inst}.
	 * @param ctx the parse tree
	 */
	void exitInst(HelloParser.InstContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(HelloParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(HelloParser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#affct}.
	 * @param ctx the parse tree
	 */
	void enterAffct(HelloParser.AffctContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#affct}.
	 * @param ctx the parse tree
	 */
	void exitAffct(HelloParser.AffctContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#boucle}.
	 * @param ctx the parse tree
	 */
	void enterBoucle(HelloParser.BoucleContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#boucle}.
	 * @param ctx the parse tree
	 */
	void exitBoucle(HelloParser.BoucleContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#comment}.
	 * @param ctx the parse tree
	 */
	void enterComment(HelloParser.CommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#comment}.
	 * @param ctx the parse tree
	 */
	void exitComment(HelloParser.CommentContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#decaf}.
	 * @param ctx the parse tree
	 */
	void enterDecaf(HelloParser.DecafContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#decaf}.
	 * @param ctx the parse tree
	 */
	void exitDecaf(HelloParser.DecafContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#if2}.
	 * @param ctx the parse tree
	 */
	void enterIf2(HelloParser.If2Context ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#if2}.
	 * @param ctx the parse tree
	 */
	void exitIf2(HelloParser.If2Context ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#elif}.
	 * @param ctx the parse tree
	 */
	void enterElif(HelloParser.ElifContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#elif}.
	 * @param ctx the parse tree
	 */
	void exitElif(HelloParser.ElifContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#else2}.
	 * @param ctx the parse tree
	 */
	void enterElse2(HelloParser.Else2Context ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#else2}.
	 * @param ctx the parse tree
	 */
	void exitElse2(HelloParser.Else2Context ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#while2}.
	 * @param ctx the parse tree
	 */
	void enterWhile2(HelloParser.While2Context ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#while2}.
	 * @param ctx the parse tree
	 */
	void exitWhile2(HelloParser.While2Context ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#for2}.
	 * @param ctx the parse tree
	 */
	void enterFor2(HelloParser.For2Context ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#for2}.
	 * @param ctx the parse tree
	 */
	void exitFor2(HelloParser.For2Context ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCond(HelloParser.CondContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCond(HelloParser.CondContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#op}.
	 * @param ctx the parse tree
	 */
	void enterOp(HelloParser.OpContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#op}.
	 * @param ctx the parse tree
	 */
	void exitOp(HelloParser.OpContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#terme}.
	 * @param ctx the parse tree
	 */
	void enterTerme(HelloParser.TermeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#terme}.
	 * @param ctx the parse tree
	 */
	void exitTerme(HelloParser.TermeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(HelloParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(HelloParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#nb}.
	 * @param ctx the parse tree
	 */
	void enterNb(HelloParser.NbContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#nb}.
	 * @param ctx the parse tree
	 */
	void exitNb(HelloParser.NbContext ctx);
}