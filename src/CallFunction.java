
public class CallFunction extends Node {
	private String name;
	private ListOp listop;
	// Une fonction peut prendre en paramètre une opération
	// Une fonction peut avoir plusieurs paramètres, il faut donc une liste d'opérations
	
	public CallFunction(Var name, ListOp listop){
		this.name = name.getNameWithoutHeader();
		this.listop = listop;
	}
	
	@Override
	public String toASM(){
		String output = "";
		if(listop!=null) {
			// On écrit le code asm correspondant à toutes les opérations présentes dans listop
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
