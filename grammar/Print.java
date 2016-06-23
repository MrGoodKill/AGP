
public class Print extends Node{
	
	private Var var;
	
	public Print(Var var){
		this.var = var;
	}
	
	@Override
	public String toASM() {
        String output=	"push dword["+var.name()+"]" +
        				"push dword print:" +
        				"call printf";
        return output;
    }
}
