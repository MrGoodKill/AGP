
public class Print extends Node{
	
	private Var var;
	
	public Print(Var var){
		this.var = var;
	}
	
	@Override
	public String toASM() {
        String output=	newLine("push dword["+var.name()+"]") +
        				newLine("push dword print") +
        				newLine("call printf");
        return output;
    }
}
