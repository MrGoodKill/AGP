
public class Ask extends Node{

	private Var var;

	public Ask(Var var){
		this.var = var;
	}
	
	@Override
	public String toASM() {
        String output;
        output = newLine("mov edx, 255") +
                newLine("mov ecx, sinput") +
                newLine("mov ebx, 0") +
                newLine("mov eax, 3") +
                newLine("int 80h") +
                newLine("mov sinput [" + var.name() + "]");
        return output;
    }
}

        mov     edx, 255        ; number of bytes to read
        mov     ecx, sinput     ; reserved space to store our input (known as a buffer)
        mov     ebx, 0          ; write to the STDIN file
        mov     eax, 3          ; invoke SYS_READ (kernel opcode 3)
        int     80h