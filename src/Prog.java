public class Prog extends Node {

    private ListVar lv;
    private Bloc b;

    public Prog(ListVar lv, Bloc b) {
        this.lv = lv;
        this.b = b;
    }

    @Override
    public String toASM() {
        return newLabel("global main") +
               newLabel("") +
               newLabel("main:") +
               declareMainArg() + 
               b.toASM();
    }

    @Override
    public String toASMData() {
        String output="";
        for(Var v:lv){
            output=output+newLabel("")+v.name()+ ":\tdd\t0";
        }
        return output+b.toASMData();
    }
    
    public String declareMainArg(){
    	String output = "";
    	int i = 2;
    	for(Var v:lv){
    		output += newLine("mov eax,[esp+" + 4*i + "]") +
    				newLine("call atoi") + 
    				newLine("mov [" + v.name() + "], eax");
    		i++;
        }
    	return output;
    }
}
