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
    	String output =	newLabel("while"+compt+":") +
                        c.toASM(compt) +
    					b.toASM() +
    					newLine("jmp while"+compt) +
    					newLabel("cond"+compt+":");
		return output;
    }
   
   @Override
   public String toASMData() {
       String asmData = c.toASMData()+b.toASMData();
       return asmData;
   }

    public ArrayList<Var> getDeclList() {
        ArrayList<Var> result = b.getDeclList();
        return result;
    }

    public ArrayList<Return2> getReturnList() {
        ArrayList<Return2> result = b.getReturnList();
        return result;
    }
}
