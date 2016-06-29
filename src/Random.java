
public class Random extends Node{

    private Number nb;

	public Random(Number nb){
        this.nb=nb;
        children.add(nb);
    }
	
	@Override
	public String toASM() {
        String output;
        output = newLine("push eax") +          //Sauvegarde des registres
                newLine("push edx") +
                newLine("rdtsc") +              //Permet de r�cup�rer le temps processeur et le stocker dans eax
                newLine("mov edx, 0") +         //Mise � z�ro de edx pour pr�parer la division
                newLine(nb.placeInStack()) +    //Place le temps d'attente dans la pile
                newLine("pop ebx") +
                newLine("div ebx") +            //Division de eax par ebx, le reste est stock� dans edx (revient � faire un modulo)
                newLine("mov [temp], edx") +
                newLine("pop edx") +            //On remet les registres comme ils �taient avant
                newLine("pop eax") +
                newLine("push dword [temp]");
        return output;
    }
}