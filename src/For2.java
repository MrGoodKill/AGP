import java.util.ArrayList;
import java.util.Collection;

public class For2 extends Node {

    private Decaf decaf;
    private Affct aff;
    private ListCond c;
    private Bloc b;
    private int compt;
    private ArrayList<Var> declList;

    public For2(Decaf decaf, Affct aff, ListCond c, Bloc b) {
        this.c = c;
        this.aff=aff;
        this.decaf=decaf;
        this.b = b;
        this.compt = condCpt;
        condCpt++;
        children.add(c);
        children.add(aff);
        children.add(decaf);
        children.add(b);
    }
    
   public String toASM(){
    	String output =	// On commence par �crire les instructions li�es � l'affectation
    					decaf.toASM() +
                        // On d�finit ou d�marre la boucle for avec un label
    					newLabel("for"+compt+":") +
                        // On �crit ici la condition de saut. Si elle est invalid�e, on saute apr�s les intructions
    					c.toASM(compt) +
    					b.toASM() +
                        aff.toASM() +
    					// On saute a ud�but de la boucle inconditionnellement, la condition est test�e en haut
                        newLine("jmp for"+compt) +
                        // Ici on d�finit la fin de la boucle
    					newLabel("cond"+compt+":");
		return output;
    }
   
   @Override
   public String toASMData() {
       String asmData = decaf.toASMData()+c.toASMData()+b.toASMData();
       return asmData;
   }

   // On r�cup�re toutes les d�clarations contenues dans bloc 
   public ArrayList<Var> getDeclList() {
        ArrayList<Var> result = new ArrayList<>();
        result.add(decaf.getVar());
        result.addAll(b.getDeclList());
        return result;
    }
   
   // On r�cup�re tous les returns du bloc
    public ArrayList<Return2> getReturnList() {
        ArrayList<Return2> result = b.getReturnList();
        return result;
    }
}
