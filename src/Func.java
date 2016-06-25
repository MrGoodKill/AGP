import java.util.ArrayList;

public class Func extends Node{

	private ListVar listvar;
	private Bloc bloc;
	private String name;
	private ArrayList<Var> paramList;
	
	public Func(ListVar listvar, Bloc bloc, Var funcName){
		this.listvar=listvar;
		this.bloc=bloc;
		this.name=funcName.getNameWithoutHeader();
	}

    public String getFctName(){
        return name;
    }
	
	public String toASM(){
		String output="";
		output= output
				+ newLabel(name + ":")
				+ toASMPopFunc()
				+ bloc.toASM()
				+ newLine("mov eax,[funcReturn]");
		return output;
	}
	
	public String toASMData(){
		String output="";
	    paramList = new ArrayList<Var>();
		for(Var v:listvar){
            output=output+newLabel("") + v.getName() + ":\tdd\t0";
            paramList.add(v);
        }
        return output+bloc.toASMData();
    }

	
	public String toASMPopFunc(){
    	
    	String output="";
    	output += 	newLine("pop eax")
    				+ newLine("mov [funcReturn],eax");
    	for(int i=paramList.size()-1; i>=0; i--){
    		output=output
    		+ newLine("pop eax")
    		+ newLine("mov [" + paramList.get(i).getName() +"],eax");
    	}
    	return output;
    }
}
