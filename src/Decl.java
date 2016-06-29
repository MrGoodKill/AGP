public class Decl extends Node {

    private ListVar listVar;
    // On peut d�clarer plusieurs variables � la fois.

    public Decl(ListVar listVar){
        this.listVar = listVar;
        children.add(listVar);
    }

    @Override
    public String toASM() {
        return "";
    }

    @Override
    public String toASMData() {
        String output="";
        // On d�clare toutes les variables contenues dans listvar
        for(Var v:listVar){
            output=output+newLabel("")+v.getName()+ ":\tdd\t0";
        }
        return output;
    }

    public ListVar getListVar() {
        return listVar;
    }
}
