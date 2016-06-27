public class Return2 extends Node{
	
	private Op op;
	
	public Return2(Op op){
		this.op = op;
	}
	
	public String toASM(){
		String output = ""
		+ op.toASM()
		+ newLine("mov eax,[funcReturn]")
		+ newLine("push eax")
		+ newLine("ret");
		return output;
	}
	

}