public class Affct extends Node {

    private Var var;
    private Op op;

    public Affct(Var var, Op op){
        this.var = var;
        this.op = op;
    }
}
