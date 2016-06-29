import java.util.ArrayList;
import java.util.Collection;

public class While2 extends Node {

    private ListCond c;
    private Bloc b;
    private int compt;

    public While2(ListCond c, Bloc b) {
        this.c = c;
        this.b = b;
        this.compt = condCpt;
        condCpt++;
        children.add(c);
        children.add(b);
    }
    
   public String toASM(){
    	String output =	// Le label qui d�finit o� d�marre la boucle
    					newLabel("while"+compt+":") +
    					// On �crit la condition qui fait sauter apr�s les insctructions du while si elle est fausse
                        c.toASM(compt) +
    					b.toASM() +
    					// Dans tous les cas on revient au d�but des instructions, l� o� la condition est �valu�e
    					newLine("jmp while"+compt) +
    					// On d�finit un autre label juste apr�s la fin du code sur lequel on saute si
    					// La condition est fausse
    					newLabel("cond"+compt+":");
		return output;
    }
   
   @Override
   public String toASMData() {
       String asmData = c.toASMData()+b.toASMData();
       return asmData;
   }
   
   // R�cup�re toutes les variables d�clar�es dans le bloc
    public ArrayList<Var> getDeclList() {
        ArrayList<Var> result = b.getDeclList();
        return result;
    }
    
    // R�cup�re tous les return de bloc
    public ArrayList<Return2> getReturnList() {
        ArrayList<Return2> result = b.getReturnList();
        return result;
    }
}
