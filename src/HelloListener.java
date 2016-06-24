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
	 * Enter a parse tree produced by {@link HelloParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(HelloParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(HelloParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#listfunc}.
	 * @param ctx the parse tree
	 */
	void enterListfunc(HelloParser.ListfuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#listfunc}.
	 * @param ctx the parse tree
	 */
	void exitListfunc(HelloParser.ListfuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(HelloParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(HelloParser.FunctionContext ctx);
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
	 * Enter a parse tree produced by {@link HelloParser#return2}.
	 * @param ctx the parse tree
	 */
	void enterReturn2(HelloParser.Return2Context ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#return2}.
	 * @param ctx the parse tree
	 */
	void exitReturn2(HelloParser.Return2Context ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#callFunction}.
	 * @param ctx the parse tree
	 */
	void enterCallFunction(HelloParser.CallFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#callFunction}.
	 * @param ctx the parse tree
	 */
	void exitCallFunction(HelloParser.CallFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(HelloParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(HelloParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#string2}.
	 * @param ctx the parse tree
	 */
	void enterString2(HelloParser.String2Context ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#string2}.
	 * @param ctx the parse tree
	 */
	void exitString2(HelloParser.String2Context ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#ask}.
	 * @param ctx the parse tree
	 */
	void enterAsk(HelloParser.AskContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#ask}.
	 * @param ctx the parse tree
	 */
	void exitAsk(HelloParser.AskContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(HelloParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(HelloParser.DeclarationContext ctx);
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
	 * Enter a parse tree produced by {@link HelloParser#declaffct}.
	 * @param ctx the parse tree
	 */
	void enterDeclaffct(HelloParser.DeclaffctContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#declaffct}.
	 * @param ctx the parse tree
	 */
	void exitDeclaffct(HelloParser.DeclaffctContext ctx);
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
	 * Enter a parse tree produced by {@link HelloParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterOperation(HelloParser.OperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitOperation(HelloParser.OperationContext ctx);
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
	 * Enter a parse tree produced by {@link HelloParser#final2}.
	 * @param ctx the parse tree
	 */
	void enterFinal2(HelloParser.Final2Context ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#final2}.
	 * @param ctx the parse tree
	 */
	void exitFinal2(HelloParser.Final2Context ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#numb}.
	 * @param ctx the parse tree
	 */
	void enterNumb(HelloParser.NumbContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#numb}.
	 * @param ctx the parse tree
	 */
	void exitNumb(HelloParser.NumbContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#rand}.
	 * @param ctx the parse tree
	 */
	void enterRand(HelloParser.RandContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#rand}.
	 * @param ctx the parse tree
	 */
	void exitRand(HelloParser.RandContext ctx);
}