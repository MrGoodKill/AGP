public class Cond extends Node {

    private Op op1;
    private Op op2;

    public Cond(Op op1, Op op2){
        this.op1 = op1;
        this.op2 = op2;
    }
}
