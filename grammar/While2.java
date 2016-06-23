public class While2 extends Node {

    private Cond c;
    private Bloc b;
    private int compt;

    public While2(Cond c, Bloc b) {
        this.c = c;
        this.b = b;
        this.compt = condCpt;
        condCpt++;
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
    
}
