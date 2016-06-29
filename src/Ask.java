
public class Ask extends Node{

	private Var var;

	public Ask(Var var){
		this.var = var;
            children.add(var);
	}
	
	@Override
	public String toASM() {
        String output;
            output = newLine("mov edx, 255") +  //Nombre d'octets à lire
                newLine("mov ecx, sinput") +    //Precise la zone mémoire de stockage de l'input
                newLine("mov ebx, 0") +         //Utiliser STDIN
                newLine("mov eax, 3") +         //Appel de la lecture d'entrée (int 80h avec eax=3)
                newLine("int 80h") +
                newLine("mov eax, sinput") +    //Recupération et conversion en entier
                newLine("call atoi") +
                newLine("mov [" + var.getName() + "], eax");
        return output;
    }
}