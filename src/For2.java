public class For2 extends Node {

    private Decaf decaf;
    private Affct aff;
    private ListCond c;
    private Bloc b;
    private int compt;

    public For2(Decaf decaf, Affct aff, ListCond c, Bloc b) {
        this.c = c;
        this.aff=aff;
        this.decaf=decaf;
        this.b = b;
        this.compt = condCpt;
        condCpt++;
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
    
}
