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

    public Prog(Bloc b, ListFunc listFunc1, ListFunc listFunc2) {
        this.b = b;
        this.listFunc1 = listFunc1;
        this.listFunc2 = listFunc2;
    }

    @Override
    public String toASM() {
        String output = newLabel("global main") +
               newLabel("");
        if(listFunc1!=null) output += listFunc1.toASM();
        setGlobalFctName("main");
        output += newLabel("main:") +
               toASMPopMain() +
               b.toASM() +
        newLine("push 0") +
        newLine("call exit");
        if(listFunc2!=null) output += listFunc2.toASM();
        return output;
    }

    @Override
    public String toASMData() {
        String output="";
        if(lv!=null) {
            for (Var v : lv) {
                output = output + newLabel("") + v.getName() + ":\tdd\t0";
				mainList.add(v.getName());
            }
        }
        output += b.toASMData();
        if(listFunc1!=null) output += listFunc1.toASMData(); 
        if(listFunc2!=null) output += listFunc2.toASMData();
        return output;
    }
    

    public String toASMPopMain(){
	String output = "";
    int i = 2;
    if(lv!=null) {
        for (Var v : lv) {
            output += newLine("mov eax,[esp+" + 4 * i + "]") +
                    newLine("call atoi") +
                    newLine("mov [" + v.getName() + "], eax");
            i++;
        }
    }
    return output;
    }
    
    public final ArrayList<String> getMainList() {
		return mainList;
	}

}
