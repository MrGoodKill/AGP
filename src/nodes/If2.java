package nodes;

public class If2 extends Node {

    private Cond cond;
    private Bloc bloc;

    public If2(Cond cond, Bloc bloc){
        this.cond = cond;
        this.bloc = bloc;
    }

}
