public class Prog extends Node {

    private ListVar lv;
    private Bloc b;

    public Prog(ListVar lv, Bloc b) {
        this.lv = lv;
        this.b = b;
    }

    @Override
    public String toASM() {
        return newLabel("global main") +
               newLabel("") +
               newLabel("main:") +
               b.toASM();
    }

    @Override
    public String toASMData() {
        String output="";
        for(Var v:lv){
            output=output+newLabel("")+v.name()+ ":\tdd\t0";
        }
        return output+b.toASMData();
    }
}
