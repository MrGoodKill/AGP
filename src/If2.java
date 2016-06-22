public class If2 extends Node {

    private Cond cond;
    private Bloc bloc;
    private Bloc bloc2;

    private static int compt = 0;

    public If2(Cond cond, Bloc bloc){
        this.cond = cond;
        this.bloc = bloc;
    }

    public If2(Cond cond, Bloc bloc, Bloc bloc2){
        this.cond = cond;
        this.bloc = bloc;
        this.bloc2 = bloc2;
    }

    @Override
    public String toASM() {
        String output=cond.toASM();
        output=output+"\njne endif"+compt;
        output=output+bloc.toASM();
        output=output+"\nendif"+compt+":";
        compt++;
        return output;
    }

    @Override
    public String toASMData() {
        return cond.toASMData()+bloc.toASMData();
    }
}
