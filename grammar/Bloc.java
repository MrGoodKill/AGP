public class Bloc extends Node {

    private Inst inst;
    private Bloc bloc;

    public Bloc(Inst inst, Bloc bloc){
        this.inst = inst;
        this.bloc = bloc;
    }

    public Bloc(){}

    @Override
    public String toASM() {
        String output;
        output=inst.toASM();
        if(bloc!=null) output=output+bloc.toASM();
        return output;
    }

    @Override
    public String toASMData() {
        String output;
        output=inst.toASMData();
        if(bloc!=null) output=output+bloc.toASMData();
        return output;
    }
}
