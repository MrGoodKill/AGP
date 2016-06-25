
public class CallFunction extends Node {
	private String name;
	private ListVar listvar;
	
	public CallFunction(Var name, ListVar listvar){
		this.name = name.name();
		this.listvar = listvar;
	}
	
	@Override
	public String toASM(){
		String output = "";
		if(listvar!=null) {
			for(Var v:listvar){
		        output += 	newLine("mov eax," + "[" + v.name() + "]") + 
		        			newLine("push eax");
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
