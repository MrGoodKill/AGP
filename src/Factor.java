public class Factor extends Node {

    private Final2 final2;
    private Factor factor;
    private Operator operator;

    public Factor(Factor factor, Final2 final2, String operator){
        this.final2 = final2;
        this.factor = factor;
        this.operator = new Operator(operator);
        children.add(final2);
        children.add(factor);
    }

    public Factor(Final2 final2){
        this.final2 = final2;
        children.add(final2);
    }

    public boolean isOperation(){
        return operator!=null;
    }

    public String toASM() {
        String output;
        if(isOperation()) {
            output = factor.toASMInEAX() +
                    final2.toASM() +
                    newLine("pop ebx") +
                    operator.toASM() +
                    newLine("push eax");
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
                    newLine("pop ebx") +
                    operator.toASM();
        } else {
            output = final2.toASMInEAX();
        }
        return output;
    }
}
