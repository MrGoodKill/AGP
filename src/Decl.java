public class Decl extends Node {

    private ListVar listVar;

    public Decl(ListVar listVar){
        this.listVar = listVar;
    }

    @Override
    public String toASM() {
        return "";
    }

    @Override
    public String toASMData() {
        String output="";
        for(Var v:listVar){
            output=output+newLabel("")+v.getName()+ ":\tdd\t0";
        }
        return output;
    }

    public ListVar getListVar() {
        return listVar;
    }
}
