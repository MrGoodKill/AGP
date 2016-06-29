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
				+ newLabel(name + ":")				// La fonction commence par son label
				+ toASMPopFunc()					// Ensuite nous récupérons les arguments depuis la pile
				+ bloc.toASM()						// On écrit le code contenu dans la fonction
				+ newLine("mov eax,[funcReturn]");	// On n'oublie pas de remettre dans la pile la valeur du esp
		return output;
	}
	
	public String toASMData(){
		String output="";
	    paramList = new ArrayList<Var>();
	    // Il faut déclarer tous les paramètres dans la section data
		for(Var v:listvar){
            output=output+newLabel("") + v.getName() + ":\tdd\t0";
            paramList.add(v);
        }
        return output+bloc.toASMData();
    }

	
	public String toASMPopFunc(){
    	
    	String output="";
    	// On commence par récupérer et stocker la valeur de l'esp
    	output += 	newLine("pop eax")
    				+ newLine("mov [funcReturn],eax");
    	// On récupère et on stocke ensuite la valeur de chacun des paramètres passés en arguments 
    	for(int i=paramList.size()-1; i>=0; i--){
    		output=output
    		+ newLine("pop eax")
    		+ newLine("mov [" + paramList.get(i).getName() +"],eax");
    	}
    	return output;
    }
}
