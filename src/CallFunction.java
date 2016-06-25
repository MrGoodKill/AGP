
public class CallFunction extends Node {
	private String name;
	private ListOp listop;
	
	public CallFunction(Var name, ListOp listop){
		this.name = name.getNameWithoutHeader();
		this.listop = listop;
	}
	
	@Override
	public String toASM(){
		String output = "";
		if(listop!=null) {
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
