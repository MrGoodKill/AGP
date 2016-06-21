package nodes;

public class Op extends Node {

    private Factor f1;
    private Op op1;

    public Op(Factor f1, Op op1) {
        this.f1 = f1;
        this.op1 = op1;
    }

    public Op(Factor f1) {
        this.f1 = f1;
    }
}
