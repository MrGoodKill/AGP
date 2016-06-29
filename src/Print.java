
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
            // Ici on push la valeur � print, puis on push la cha�ne de caract�re correspondant au formatage
        	// Finalement on appelle la fonction externe printf
        	output = newLine("push dword [" + var.getName() + "]") +
                    newLine("push dword print") +
                    newLine("call printf") +
                    // On replace le stack pointer au bon endroit suite � l'appel de printf
                    newLine("add esp,8");
        } 
        // Print d'une cha�ne de caract�res
        else {
            // Ici on push l'adresse de la chaine de caract�re
            // puis on pr�cise le formattage qui pr�cise qu'il s'agit d'une chaine de caract�re (%s)
            // Finalement on appelle la fonction externe printf
            output = newLine("push dword str"+string.getIndex()) +
                    newLine("push dword printstr") +
                    newLine("call printf")+
                    newLine("add esp,8");
        }
        return output;
    }
}