public class Op extends Node {

    private Factor f1;
    private Op op1;
    private Operator operator;

    public Op(Factor f1, Op op1, String operator) {
        this.f1 = f1;
        this.op1 = op1;
        this.operator = new Operator(operator);
    }

    public Op(Factor f1) {
        this.f1 = f1;
    }
}
