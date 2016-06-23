public class If2 extends Node {

    private Cond cond;
    private Bloc bloc;
    private Bloc bloc2;
    private int compt = -1;

    public If2(Cond cond, Bloc bloc){
        this.cond = cond;
        this.bloc = bloc;
        this.compt = condCpt;
        condCpt++;
    }

    public If2(Cond cond, Bloc bloc, Bloc bloc2){
        this.cond = cond;
        this.bloc = bloc;
        this.bloc2 = bloc2;
        this.compt = condCpt;
        condCpt++;
    }
    
    public String toASM() {
        String output= cond.toASM(compt);
        output=output+bloc.toASM();
        if (bloc2!=null){
        	output+= newLine("jmp endelse"+compt);
        }
        output+=newLabel("cond"+compt+":");
        if (bloc2!=null){
        	output+=bloc2.toASM();
        	output+=newLabel("endelse"+compt+":");
        }
        return output;
    }

    @Override
    public String toASMData() {
        String asmData = cond.toASMData()+bloc.toASMData();
        if (bloc2!=null){
        	asmData+= cond.toASMData()+bloc2.toASMData();
        }
        return asmData;
    }
}
