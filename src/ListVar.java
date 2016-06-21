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

    private boolean isSingle(){
        return (listVar==null);
    }

    @Override
    public String toASMData() {
        String output;
        output = var.name()+ ":\tdd\t0";
        if(!isSingle())output= output+"\n"+listVar.toASMData();
        return output;
    }
}
