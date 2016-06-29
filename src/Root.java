public class Root extends Node{

    private Prog p;

    public Root(Prog p) {
        this.p = p;
        children.add(p);
    }

    // Ici on �crit les mots cl�s d�finissant les diff�rentes parties du programme
    @Override
    public String toASM() {
        String output =
                newLabel("extern printf,exit") +
                newLabel("section .data") +
                newLabel("print:\tdb \"%d\", 10, 0") +
                newLabel("printstr:\tdb \"%s\",0") +
                newLabel("funcReturn:\tdd\t0") +
                newLabel("funcTemp:\tdd\t0") +
                // On �crit les d�clarations des variables
                getGlobalData()+
                p.toASMData() +
                    newLabel("") + newLabel("") +
                newLabel("section .bss\n") +
                newLabel("sinput: resb 255") +
                    newLabel("") + newLabel("") +
                newLabel("section .text") +
                // On �crit le code asm du programme
                p.toASM() +
                // On rajoute la fonction atoi pour les print
                addAtoi() +
        		// On rajoute potentiellement des fonctions hardcod�es comme wait, si besoin seulement
                getGlobalASM();
        return output;

    }
    
    public String addAtoi(){
    	String output;
    	output = 
    			newLine("") +
    			newLabel("atoi:") +
    			newLine("push ebx") +
    			newLine("push ecx") +
				newLine("mov ebx, eax") +
				newLine("mov eax, 0") +
				newLine("mov ecx, 0") +
				newLabel("atoi_loop:") +
				newLine("cmp byte[ebx], 0") +
				newLine("je end_atoi") +
                newLine("cmp byte[ebx], 10") +
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
