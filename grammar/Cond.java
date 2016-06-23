public class Cond extends Node {

    private Op op1;
    private Op op2;
    private Operator operator;

    public Cond(Op op1, Op op2, String operator){
        this.op1 = op1;
        this.op2 = op2;
        this.operator = new Operator(operator);
    }
    
    public String toASM(int compt){
    	String output;
    	
    	output =
                op1.toASMInEAX() +
                op2.toASM() +
                newLine("pop ebx") +
        		newLine("cmp eax,ebx");
    	
    	// We jump when the conditions aren't true
        output += operator.toASM(compt);

		return output;
    }

    public String toASM(){
        return toASM(-1);
    }
    
    
}
