
public class Operator extends Node{
	
	public enum Op{
		ADD,SUB,MULT,DIV,EQU,SOE,SUP,INF,IOE;
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
		}
	}

    public String toASM(){
        switch(op) {
            case ADD:
                return newLine("add eax,ebx");
            case SUB:
                return newLine("sub eax,ebx");
            case MULT:
                return newLine("imul ebx");
            case DIV:
                return newLine("div ebx");
        }
        return "";
    }

}
