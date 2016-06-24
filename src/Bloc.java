public class Bloc extends Node {

    private Inst inst;
    private Bloc bloc;
    private boolean empty;

    public Bloc(Inst inst, Bloc bloc){
        this.inst = inst;
        this.bloc = bloc;
        this.empty=false;
    }

    public Bloc(){
        this.empty=true;
    }

    public boolean isEmpty(){
        return empty;
    }

    @Override
    public String toASM() {
        String output;
        if(!isEmpty()){
            output=inst.toASM();
            output=output+bloc.toASM();		//if(bloc!=null) a verifier avant?
        } else output="";
        return output;
    }

    @Override
    public String toASMData() {
        String output;
        if(!isEmpty()){
            output=inst.toASMData();
            output=output+bloc.toASMData(); //if(bloc!=null) a verifier avant?
        } else output="";
        return output;
    }
}
