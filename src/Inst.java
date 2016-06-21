public class Inst extends Node {

    private Affct affct;
    private Decl decl;
    private Decaf decaf;
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

    public Inst(Boucle boucle){
        this.boucle = boucle;
    }
}
