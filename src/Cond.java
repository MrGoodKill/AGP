public class Cond extends Node {

    private Op op1;
    private Op op2;
    private Operator operator;
    private ListCond lc;

    public Cond(Op op1, Op op2, String operator){
        this.op1 = op1;
        this.op2 = op2;
        this.operator = new Operator(operator);
    }

    public Cond(ListCond lc) {
        this.lc = lc;
    }

    public String toASM(int compt){
    	String output;
        if(lc==null) {
            output = op2.toASM() +
                            op1.toASMInEAX() +
                            newLine("pop ebx") +
                            newLine("cmp eax,ebx");

            // We jump when the conditions aren't true
            output += operator.toASM(compt);
        } else {
            output = lc.toASM(compt);
        }
		return output;
    }

    public String toASMOR(String label){
        String output;
        if(lc==null){
            output = op2.toASM() +
                            op1.toASMInEAX() +
                            newLine("pop ebx") +
                            newLine("cmp eax,ebx");
            // We jump when the conditions aren't true
            output += operator.toASMNEG(label);
        } else {
            output = lc.toASM();
        }
        return output;
    }

    public String toASM(){
        return toASM(-1);
    }
}
