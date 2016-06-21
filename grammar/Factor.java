public class Factor extends Node {

    private Final2 final2;
    private Factor factor;
    private Operator operator;

    public Factor(Factor factor, Final2 final2, String operator){
        this.final2 = final2;
        this.factor = factor;
        this.operator = new Operator(operator);
    }

    public Factor(Final2 final2){
        this.final2 = final2;
    }
}
