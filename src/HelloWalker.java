import org.antlr.v4.runtime.tree.ParseTreeListener;


public class HelloWalker extends HelloBaseListener {

    private int indent=0;

    public void enterR(HelloParser.RContext ctx ) {
        System.out.println("DEBUT MAIN (arguments : "+ctx.listvar().getText()+")");
        indent++;
    }

    public void enterInst(HelloParser.InstContext ctx) {
        System.out.print(indent());
    }

    public void enterDecl(HelloParser.DeclContext ctx) {
        System.out.println("DECLARATION de " + ctx.listvar().getText());
    }

    public void enterAffct(HelloParser.AffctContext ctx) {
        if(!ctx.getParent().getStart().getText().equals("var") && !ctx.getParent().getParent().getStart().getText().equals("for("))
            System.out.println("AFFECTATION de " + ctx.VAR().getText() + " <- " + ctx.op().getText());
    }

    public void enterDecaf(HelloParser.DecafContext ctx) {
        if(!ctx.getParent().getStart().getText().equals("for("))
            System.out.print("DECLARATION et AFFECTATION de " + ctx.affct().VAR().getText() + " <- " + ctx.affct().op().getText());
    }

    public void enterIf2(HelloParser.If2Context ctx) {
        System.out.println("CONDITION : (" + ctx.cond().getText() + ")");
        indent++;
    }

    public void enterWhile2(HelloParser.While2Context ctx) {
        System.out.println("TANTQUE : (" + ctx.cond().getText() + ")");
        indent++;
    }

    public void enterFor2(HelloParser.For2Context ctx) {
        System.out.println("POUR : " + ctx.decaf().affct().getText() + " TANTQUE "+ctx.cond().getText() + " (boucle : "+ctx.affct().getText()+")");
        indent++;
    }

    public void exitIf2(HelloParser.If2Context ctx) {
        indent--;
    }

    public void exitWhile2(HelloParser.While2Context ctx) {
        indent--;
    }

    public void exitFor2(HelloParser.For2Context ctx){
        indent--;
    }

    public void exitR(HelloParser.RContext ctx ) {
        System.out.println( "FIN" );
    }

    private String indent(){
        String output="";
        for(int i=0;i<indent;i++){
            output=output+"     ";
        }
        return output;
    }
}
