public class Inst {
	private Affct affct;
	private Decl decl;
	private Decaf decaf;
	private Comment comment;
	private Boucle boucle;

	public Inst(Affct affct){
		this.affct = affct;
	}
	
	public Inst(Decl decl){
		this.decl = decl;
	}
	
	public Inst(Decaf decaf){
		this.decaf = decaf;
	}
	
	public Inst(Comment comment){
		this.comment = comment;
	}
	
	public Inst(Boucle boucle){
		this.boucle = boucle;
	}
	
	public void toASM(){
		
	}
}
