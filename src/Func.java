import java.util.ArrayList;

public class Func extends Node{

	private ListVar listvar;
	private Bloc bloc;
	private String name;
	private ArrayList<String> paramList = new ArrayList<String>();
	
	public Func(ListVar listvar, Bloc bloc, String name){
		
		this.listvar=listvar;
		this.bloc=bloc;
		this.name=name;
	}
	
	public String toASM(){
		
		String output="";
		output= output
				+ newLabel(name + ":")
				+ toASMPopFunc()
				+ bloc.toASM()
				+ newLine("ret");
		return output;
	}
	
	public String toASMData(){
		String output="";
	    for(Var v:listvar){
            output=output+newLabel("")+v.name()+ ":\tdd\t0";
            paramList.add(v.name());
        }
        return output+bloc.toASMData();
    }

	
	public String toASMPopFunc(){
    	
    	String output="";
    	for(int i=paramList.size()-1; i>=0; i--){
    		output=output
    		+ newLine("pop eax")
    		+ newLine("mov [" + paramList.get(i) +"],eax");
    	}
    	return output;
    }
}
