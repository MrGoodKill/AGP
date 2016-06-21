public class Bloc extends Node {

    private Inst inst;
    private Bloc bloc;

    public Bloc(Inst inst, Bloc bloc){
        this.inst = inst;
        this.bloc = bloc;
    }

    public Bloc(Inst inst){
        this.inst = inst;
    }

    public Bloc(){}
}
