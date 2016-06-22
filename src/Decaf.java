public class Decaf extends Node {

    private Affct affct;

    public Decaf(Affct affct){
        this.affct = affct;
    }

    @Override
    public String toASMData() {
        String output = "\n" + affct.getVar().name() + ":\tdd\t0";
        return output;
    }

    @Override
    public String toASM() {
        return affct.toASM();
    }
}
