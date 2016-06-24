public class ListFunc extends Node{

	private Func function;
	private ListFunc listFunc;
	
	public ListFunc(Func function, ListFunc listFunc){
		
		this.function=function;
		this.listFunc=listFunc;
	}
	
	public String toASM(){
		
	}
	
}
