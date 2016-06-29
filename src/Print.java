
public class Print extends Node{
	
	private Var var;
    private String2 string;
	
	public Print(Var var){
		this.var = var;
        children.add(var);
	}

    public Print(String2 string){
        this.string = string;
        children.add(string);
    }
	
	@Override
	public String toASM() {
        String output;
        // Print d'une variable
        if(var!=null) {
            // Ici on push la valeur à print, puis on push la chaîne de caractère correspondant au formatage
        	// Finalement on appelle la fonction externe printf
        	output = newLine("push dword [" + var.getName() + "]") +
                    newLine("push dword print") +
                    newLine("call printf") +
                    // On replace le stack pointer au bon endroit suite à l'appel de printf
                    newLine("add esp,8");
        } 
        // Print d'une chaîne de caractères
        else {
            output = newLine("push dword str"+string.getIndex()) +
                    newLine("push dword printstr") +
                    newLine("call printf")+
                    newLine("add esp,8");
        }
        return output;
    }
}