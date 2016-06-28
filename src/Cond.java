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
                op1.toASMInEAX() +		// On met le résultat de la première opération dans eax
                op2.toASM() +			// On met le résultat de la 2ème opération dans la pile
                newLine("pop ebx") +	// On dépile dans ebx
        		newLine("cmp eax,ebx");	// On compare eax à ebx
    	
    	// We jump when the conditions aren't true
        output += operator.toASM(compt);// Operator se charge de trouver le jump adéquat (jle, je etc)

		return output;
    }

    public String toASM(){
        return toASM(-1);
    }
    
    
}
