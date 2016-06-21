package nodes;

public class Final2 extends Node {

    private Op op;
    private Number nb;

    public Final2(Op op){
        this.op = op;
    }

    public Final2(Number nb){
        this.nb = nb;
    }
}
