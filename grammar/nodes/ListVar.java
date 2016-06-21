package nodes;

public class ListVar extends Node{

    private Var var;
    private ListVar listVar;

    public ListVar(Var var, ListVar listvar){
        this.var = var;
        this.listVar = listVar;
    }

    public ListVar(Var var){
        this.var = var;
    }

}
