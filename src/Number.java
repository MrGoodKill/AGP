public class Number extends Node {

    private Const2 c;
    private Var v;

    public Number(Const2 c) {
        this.c = c;
    }

    public Number(Var v) {
        this.v = v;
    }
}
