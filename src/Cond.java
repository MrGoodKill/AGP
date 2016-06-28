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
                op1.toASMInEAX() +		// On met le r�sultat de la premi�re op�ration dans eax
                op2.toASM() +			// On met le r�sultat de la 2�me op�ration dans la pile
                newLine("pop ebx") +	// On d�pile dans ebx
        		newLine("cmp eax,ebx");	// On compare eax � ebx
    	
    	// We jump when the conditions aren't true
        output += operator.toASM(compt);// Operator se charge de trouver le jump ad�quat (jle, je etc)

		return output;
    }

    public String toASM(){
        return toASM(-1);
    }
    
    
}
