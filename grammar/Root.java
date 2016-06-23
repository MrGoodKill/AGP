public class Root extends Node{

    private Prog p;

    public Root(Prog p) {
        this.p = p;
    }

    @Override
    public String toASM() {
        String output =
                newLabel("extern printf,exit") +
                newLabel("section .data") +
                newLabel("print:\tdb \"Value Asked=%d\", 10, 0") +
                p.toASMData() +
                newLabel("") + newLabel("") +
                newLabel("section .text") +
                p.toASM() +
                newLine("push 0")+
                newLine("call exit") + 
                addAtoi();           
        return output;

    }
    
    public String addAtoi(){
    	String output;
    	output = 
    			newLabel("atoi:") +
    			newLine("push ebx") +
    			newLine("push ecx") +
				newLine("mov ebx, eax") +
				newLine("mov eax, 0") +
				newLine("mov ecx, 0") +
				newLabel("atoi_loop:") +
				newLine("cmp byte[ebx], 0") +
				newLine("je end_atoi") +
				newLine("mov cl, byte[ebx]") +
				newLine("sub cl, '0'") +
				newLine("cmp cl, 9") +
				newLine("jg end_atoi") +
				newLine("imul eax, 10") +
				newLine("add eax, ecx") +
				newLine("inc ebx") + 
				newLine("jmp atoi_loop") +
				newLabel("end_atoi:") +
				newLine("pop ecx") +
				newLine("pop ebx") +
				newLine("ret");
    	return output;
    }

}
