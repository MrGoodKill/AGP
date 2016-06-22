public class Affct extends Node {

    private Var var;
    private Op op;

    public Affct(Var var, Op op){
        this.var = var;
        this.op = op;
    }

    public Var getVar() {
        return var;
    }

    @Override
    public String toASM() {
        String output;
        output=op.toASMInEAX();
        output=output+newLine("mov ["+var.name()+"] eax");
        return output;
    }
}
