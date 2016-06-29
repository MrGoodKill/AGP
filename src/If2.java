import java.util.ArrayList;
import java.util.Collection;

public class If2 extends Node {

    private ListCond lcond;
    private Bloc bloc;
    private Bloc bloc2;
    private int compt = -1;

    public If2(ListCond lcond, Bloc bloc){
        this.lcond = lcond;
        this.bloc = bloc;
        this.compt = condCpt;
        condCpt++;
        children.add(lcond);
        children.add(bloc);
    }

    public If2(ListCond lcond, Bloc bloc, Bloc bloc2){
        this.lcond = lcond;
        this.bloc = bloc;
        this.bloc2 = bloc2;
        this.compt = condCpt;
        condCpt++;
        children.add(lcond);
        children.add(bloc);
        children.add(bloc2);
    }
    
    public String toASM() {
        String output=lcond.toASM(compt);
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
        String asmData = lcond.toASMData()+bloc.toASMData();
        if (bloc2!=null){
        	asmData+= lcond.toASMData()+bloc2.toASMData();
        }
        return asmData;
    }

    public ArrayList<Var> getDeclList() {
        ArrayList<Var> result = new ArrayList<>();
        result.addAll(bloc.getDeclList());
        result.addAll(bloc2.getDeclList());
        return result;
    }

    public ArrayList<Return2> getReturnList() {
        ArrayList<Return2> result = bloc.getReturnList();
        result.addAll(bloc2.getReturnList());
        return result;
    }

}
