package nodes;

public class Factor extends Node {

    private Final2 final2;
    private Factor factor;

    public Factor(Factor factor, Final2 final2){
        this.final2 = final2;
        this.factor = factor;
    }

    public Factor(Final2 final2){
        this.final2 = final2;
    }
}
