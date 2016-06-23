import java.util.ArrayList;

public class Prog extends Node {

    private ListVar lv;
    private Bloc b;
    private ArrayList<String> mainList = new ArrayList<String>();

   
	public Prog(ListVar lv, Bloc b) {
        this.lv = lv;
        this.b = b;
    }

    @Override
    public String toASM() {
        return newLabel("global main") +
               newLabel("") +
               newLabel("main:") +
               toASMPopMain() +
               b.toASM();
    }

    @Override
    public String toASMData() {
        String output="";
        for(Var v:lv){
            output=output+newLabel("")+v.name()+ ":\tdd\t0";
            mainList.add(v.name());
        }
        return output+b.toASMData();
    }
    
    public String toASMPopMain(){
    	
    	String output="";
    	for(int i=mainList.size()-1; i>=0; i--){
    		output=output+newLine("") 
    		+ "pop eax"
    		+ newLine("")
    		+ "mov [" + mainList.get(i) +"],eax";
    	}
    	return output;
    }
    
    public final ArrayList<String> getMainList() {
		return mainList;
	}

}
