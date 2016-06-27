
public class Print extends Node{
	
	private Var var;
    private String2 string;
	
	public Print(Var var){
		this.var = var;
	}

    public Print(String2 string){
        this.string = string;
    }
	
	@Override
	public String toASM() {
        String output;
        if(var!=null) {
            output = newLine("push dword [" + var.getName() + "]") +
                    newLine("push dword print") +
                    newLine("call printf") +
                    newLine("add esp,8");
        } else {
            output = newLine("push dword str"+string.getIndex()) +
                    newLine("push dword printstr") +
                    newLine("call printf")+
                    newLine("add esp,8");
        }
        return output;
    }
}
