public class Factor extends Node {

    private Final2 final2;		// opérande de droite dans une multiplication / division
    private Factor factor;		// opérande de gauche dans une multiplication / division
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

    // Un factor peut n'être qu'un nombre et non une opération
    public boolean isOperation(){
        return operator!=null;
    }

    public String toASM() {
        String output;
        if(isOperation()) {
            output = factor.toASMInEAX() +		// On calcule le membre de gauche qu'on met dans eax
                    final2.toASM() +			// On calcule le membre de droite qu'on met dans la pile
                    newLine("pop ebx") +		// puis dans ebx
                    operator.toASM() +			// On met le code relatif à l'opérateur
                    newLine("push eax");		// On met le résultat dans la pile 
        } else {
            output = final2.toASM();
        }
        return output;
    }
    
    
    // Comme la fonction précédent mais avec le résultat dans eax
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
