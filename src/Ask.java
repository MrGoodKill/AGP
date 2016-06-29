
public class Ask extends Node{

	private Var var;

	public Ask(Var var){
		this.var = var;
            children.add(var);
	}
	
	@Override
	public String toASM() {
        String output;
        output = newLine("mov edx, 255") +
                newLine("mov ecx, sinput") +
                newLine("mov ebx, 0") +
                newLine("mov eax, 3") +
                newLine("int 80h") +
                newLine("mov eax, sinput") +
                newLine("call atoi") +
                newLine("mov [" + var.getName() + "], eax");
        return output;
    }
}