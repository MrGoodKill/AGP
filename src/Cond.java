public class Cond extends Node {

    private Op op1;
    private Op op2;
    //Operateur entre les deux membres : >,<,<= ou >=)
    private Operator operator;
    private ListCond lc;

    //Constructeur dans le cas d'une condition type "operation1 > operation2"
    public Cond(Op op1, Op op2, String operator){
        this.op1 = op1;
        this.op2 = op2;
        this.operator = new Operator(operator);
        children.add(op1);
        children.add(op2);
    }

    //Constructeur dans le cas où la condition est une liste de condition entre parenthèses
    //Exemple : (c>a et b<2 ou a=3)
    public Cond(ListCond lc) {
        this.lc = lc;
        children.add(lc);
    }

    public String toASM(int compt){
    	String output;
        if(lc==null) {
            output = op2.toASM() +					// On met le résultat de la première opération dans eax
                            op1.toASMInEAX() +		// On met le résultat de la 2ème opération dans la pile
                            newLine("pop ebx") +	// On dépile dans ebx
                            newLine("cmp eax,ebx");	// On compare eax à ebx

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
