public class ListFunc extends Node{

	private Func function;
	private ListFunc listFunc;
	
	public ListFunc(Func function, ListFunc listFunc){
		
		this.function=function;
		this.listFunc=listFunc;
	}
	
	public String toASM(){
		String output;
        output=function.toASM();
        output=output+listFunc.toASM();
        return output;
	}
	
	public String toASMData(){
		String output;
        output=function.toASMData();
        output=output+listFunc.toASMData();
        return output;
	}
	
}
