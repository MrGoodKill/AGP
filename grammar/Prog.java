import java.util.ArrayList;

public class Prog extends Node {

    private ListVar lv;
    private Bloc b;
    private ListFunc listFunc1;
    private ListFunc listFunc2;
    private ArrayList<String> mainList = new ArrayList<String>();

   
	public Prog(ListVar lv, Bloc b, ListFunc listFunc1, ListFunc listFunc2) {
        this.lv = lv;
        this.b = b;
        this.listFunc1 = listFunc1;
        this.listFunc2 = listFunc2;
    }

    @Override
    public String toASM() {
        return newLabel("global main") +
               newLabel("") +
               listFunc1.toASM() + 
               newLabel("main:") +
               toASMPopMain() +
               b.toASM() +
               listFunc2.toASM();
    }

    @Override
    public String toASMData() {
        String output="";
        for(Var v:lv){
            output=output+newLabel("")+v.name()+ ":\tdd\t0";
            mainList.add(v.name());
        }
        return output
        		+ b.toASMData()
        		+ listFunc1.toASMData() 
        		+ listFunc2.toASMData();
    }
    
    public String toASMPopMain(){
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
    
    public final ArrayList<String> getMainList() {
		return mainList;
	}

}
