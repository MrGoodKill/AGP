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
        return lv.toASMData()+b.toASMData();
    }
}
