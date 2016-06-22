public class Cond extends Node {

    private Op op1;
    private Op op2;
    private Operator operator;
    private static int compt = 0;

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
                "\npop ebx" +
                "\ncmp eax,ebx";
    	
    	switch(operator.getOp()){
		case EQU:
			output += "\nje cond"+condCpt;
			break;
		case INF:
			output += "\njl cond"+condCpt;
			break;
		case IOE:
			output += "\njle cond"+condCpt;
			break;
		case SOE:
			output += "\njge cond"+condCpt;
			break;
		case SUP:
			output += "\njg cond"+condCpt;
			break;
		default:
			output += "\ncond failed, was not <,>,=,<=,>= :'(";
			break;
    	}
		return output;
    }
    
    
}
