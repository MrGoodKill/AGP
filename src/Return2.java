
public class Return2 extends Node{
	
	private Var var;
	
	public Return2(Var var){
		this.var = var;
	}
	
	public String toASM(){
		String output = ""
		+ newLine("mov eax,[" + var.getName() + "]")
		+ newLine("push eax")
		+ newLine("mov eax,[funcReturn]")
		+ newLine("push eax")
		+ newLine("ret");
		return output;
	}
	

}
