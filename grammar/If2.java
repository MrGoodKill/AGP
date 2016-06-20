public class If2 {
	private Cond cond;
	private Bloc bloc;
	private Else2 else2;
	
	public If2(Cond cond, Bloc bloc, Else2 else2){
		this.cond = cond;
		this.bloc = bloc;
		this.else2 = else2;
	}
	
	public If2(Cond cond, Bloc bloc){
		this.cond = cond;
		this.bloc = bloc;
	}
	
	public void toASM(){};

}
