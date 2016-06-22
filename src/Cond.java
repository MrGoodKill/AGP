public class Cond extends Node {

    private Op op1;
    private Op op2;
    private Operator operator;

    public Cond(Op op1, Op op2, String operator){
        this.op1 = op1;
        this.op2 = op2;
        this.operator = new Operator(operator);
    }
    
    public String toASM(){
    	String output;
    	
    	output =
                op1.toASMInEAX() +
                op2.toASM() +
                newLine("pop ebx") +
        		newLine("cmp eax,ebx");
    	
    	// We jump when the conditions aren't true
    	
    	switch(operator.getOp()){
		case EQU:
			output += newLine("jne cond"+condCpt);
			break;
		case INF:
			output += newLine("jge cond"+condCpt);
			break;
		case IOE:
			output += newLine("jg cond"+condCpt);
			break;
		case SOE:
			output += newLine("jl cond"+condCpt);
			break;
		case SUP:
			output += newLine("jle cond"+condCpt);
			break;
		default:
			output += newLine("cond failed, was not <,>,=,<=,>= :'(");
			break;
    	}
		return output;
    }
    
    
}
