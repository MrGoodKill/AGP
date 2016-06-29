
public class Operator extends Node{
	
	public enum Op{
		ADD,SUB,MULT,DIV,EQU,SOE,SUP,INF,IOE,AND,OR;
	}
	
	private Op op;
	
	public Op getOp() {
		return op;
	}

	public Operator(String op){
		switch(op){
		case "+":
			this.op = Op.ADD;
			break;
		case "-":
			this.op = Op.SUB;	
			break;
		case "*":
			this.op = Op.MULT;
			break;
		case "/":
			this.op = Op.DIV;
			break;
		case "=":
			this.op = Op.EQU;
			break;
		case ">=":
			this.op = Op.SOE;
			break;
		case ">":
			this.op = Op.SUP;
			break;
		case "<":
			this.op = Op.INF;
			break;
		case "<=":
			this.op = Op.IOE;
			break;
        case "et":
            this.op = Op.AND;
            break;
        case "ou":
            this.op = Op.OR;
            break;
		}
	}

    public String toASM(){
        return toASM(-1);
    }

    // Attention les conditions sont inversées: on jump si la condition est fausse!
    public String toASM(int compt){
        switch(op) {
            case ADD:
                return newLine("add eax,ebx");
            case SUB:
                return newLine("sub eax,ebx");
            case MULT:
                return newLine("imul ebx");
            case DIV:
                // idiv utilise le registre edx comme poids fort, on le met donc à 0 pour éviter toute erreur
            	return 	newLine("mov edx,0") +
                		newLine("mov ecx,eax") +
                		newLine("mov eax,ebx") +
                		newLine("idiv ecx");
            case EQU:
                return newLine("jne cond"+compt);
            case INF:
                return newLine("jge cond"+compt);
            case IOE:
                return newLine("jg cond"+compt);
            case SOE:
                return newLine("jl cond"+compt);
            case SUP:
                return newLine("jle cond"+compt);
            default:
                return newLine("asm failed for operator");
        }
    }

    // On peut potentiellement avoir besoin de faire un saut quand la condition est vraie
    public String toASMNEG(String label){
        switch(op) {
            case EQU:
                return newLine("je " + label);
            case INF:
                return newLine("jnge " + label);
            case IOE:
                return newLine("jng " + label);
            case SOE:
                return newLine("jnl " + label);
            case SUP:
                return newLine("jnle " + label);
            default:
                return newLine("asm failed for operator");
        }
    }
}
