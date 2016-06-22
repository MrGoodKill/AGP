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

    public boolean isOperation(){
        return operator!=null;
    }

    public String toASM() {
        String output;
        if(isOperation()) {
            output = factor.toASMInEAX() +
                    final2.toASM() +
                    "\npop ebx" +
                    "\n"+operator.toASM() +
                    "\npush eax";
        } else {
            output = final2.toASM();
        }
        return output;
    }

    public String toASMInEAX() {
        String output;
        if(isOperation()) {
            output = factor.toASM() +
                    final2.toASMInEAX() +
                    "\npop ebx" +
                    "\n"+operator.toASM();
        } else {
            output = final2.toASMInEAX();
        }
        return output;
    }
}
