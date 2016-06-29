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
    	String output =	decaf.toASM() +
                        newLabel("for"+compt+":") +
                        c.toASM(compt) +
    					b.toASM() +
                        aff.toASM() +
    					newLine("jmp for"+compt) +
    					newLabel("cond"+compt+":");
		return output;
    }
   
   @Override
   public String toASMData() {
       String asmData = decaf.toASMData()+c.toASMData()+b.toASMData();
       return asmData;
   }

    public ArrayList<Var> getDeclList() {
        ArrayList<Var> result = new ArrayList<>();
        result.add(decaf.getVar());
        result.addAll(b.getDeclList());
        return result;
    }

    public ArrayList<Return2> getReturnList() {
        ArrayList<Return2> result = b.getReturnList();
        return result;
    }
}
