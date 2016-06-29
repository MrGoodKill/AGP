public class ListFunc extends Node{

	private Func function;
	private ListFunc listFunc;
	private boolean empty;
	
	public boolean isEmpty() {
		return empty;
	}

	public ListFunc(Func function, ListFunc listFunc){
		
		this.function=function;
		this.listFunc=listFunc;
		this.empty = false;
		children.add(function);
		children.add(listFunc);
	}
	
	public ListFunc(){
		this.empty = true;
	}
	
	public String toASM(){
		String output = "";
		if(!isEmpty()){
			// Permet de savoir dans quelle fonction on se trouve et donc de retracer l'origine des instructions
            setGlobalFctName(function.getFctName());
	        // On écrit ensuite le code des attributs
            output=function.toASM();
	        if(listFunc!=null) output=output+listFunc.toASM();
		}
        return output;
	}
	
	// Fonctionnement similaire mais pour la déclaration des variables
	public String toASMData(){
		String output = "";
		if(!isEmpty()){
            setGlobalFctName(function.getFctName());
			output=function.toASMData();
			if(listFunc!=null) output=output+listFunc.toASMData();
		}
        return output;
	}
	
}
