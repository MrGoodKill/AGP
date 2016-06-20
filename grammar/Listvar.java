public class Listvar {
	private Var var;
	private Listvar listvar;
	
	public Listvar(Var var, Listvar listvar){
		this.var = var;
		this.listvar = listvar;
	}
	
	public Listvar(Var var){
		this.var = var;
	}
	
	public void toASM(){};

}
