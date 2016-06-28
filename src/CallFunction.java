
public class CallFunction extends Node {
	private String name;
	private ListOp listop;
	// Une fonction peut prendre en param�tre une op�ration
	// Une fonction peut avoir plusieurs param�tres, il faut donc une liste d'op�rations
	
	public CallFunction(Var name, ListOp listop){
		this.name = name.getNameWithoutHeader();
		this.listop = listop;
	}
	
	@Override
	public String toASM(){
		String output = "";
		if(listop!=null) {
			// On �crit le code asm correspondant � toutes les op�rations pr�sentes dans listop
			for(Op op:listop){
		        output += 	op.toASM();
		    }
		}
		output += newLine("call " + name);
		return output;
	}
	
	@Override
    public String toASMData() {
        return "";
    }
	
}
