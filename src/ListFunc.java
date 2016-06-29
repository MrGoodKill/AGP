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
            setGlobalFctName(function.getFctName());
	        output=function.toASM();
	        if(listFunc!=null) output=output+listFunc.toASM();
		}
        return output;
	}
	
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
