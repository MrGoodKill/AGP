import java.util.ArrayList;

public class Func extends Node{

	private Bloc bloc;
	private String name;
	private ArrayList<Var> paramList;
	private ArrayList<Var> saveList;
	private ArrayList<Return2> returnList;
	
	public Func(ListVar listvar, Bloc bloc, Var funcName){
		this.bloc=bloc;
		this.name=funcName.getNameWithoutHeader();
		returnList=bloc.getReturnList();
		paramList = new ArrayList<Var>();
		for(Var v:listvar){
			paramList.add(v);
		}
		saveList=bloc.getDeclList();
		for(Return2 r:returnList) {
			r.setArguments(saveList, paramList);
		}
	}

    public String getFctName(){
        return name;
    }
	
	public String toASM(){
		String output="";
		output= output
				+ newLabel(name + ":")
				+ toASMPopFunc()
				+ bloc.toASM();
		return output;
	}
	
	public String toASMData(){
		String output="";
		for(Var v:paramList){
            output=output+newLabel("") + v.getName() + ":\tdd\t0";
        }
        return output+bloc.toASMData();
    }

	
	public String toASMPopFunc(){
    	String output="";
    	output += 	newLine("pop eax")
			+ newLine("mov [funcReturn],eax");
		int decalage=0;
		for(int i=paramList.size()-1; i>=0; i--){
			output+=newLine("pop dword [funcTemp]")+
					newLine("push dword ["+paramList.get(i).getName()+"]")+
					newLine("mov eax, [funcTemp]")+
					newLine("mov ["+paramList.get(i).getName()+"], eax")+
					newLine("sub esp,4");
			decalage+=4;
		}
		output+=newLine("add esp,"+decalage);
		for(Var v:saveList){
			output=output +
					newLine("push dword ["+v.getName()+"]");
		}
		output+=newLine("push dword [funcReturn]");
    	return output;
    }
}
