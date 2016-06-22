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

    public boolean isOperation(){
        return operator!=null;
    }

    @Override
    public String toASM() {
        String output;
        if(isOperation()) {
            output =
                    op1.toASM() +
                    f1.toASMInEAX() +
                    "\npop ebx" +
                    "\n"+operator.toASM() +
                    "\npush eax";
        } else {
            output = f1.toASM();
        }
        return output;
    }

    public String toASMInEAX() {
        String output;
        if(isOperation()) {
            output = op1.toASM() +
                    f1.toASMInEAX() +
                    "\npop ebx" +
                    "\n"+operator.toASM();
        } else {
            output = f1.toASMInEAX();
        }
        return output;
    }
}
