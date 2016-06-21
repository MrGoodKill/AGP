package nodes;

public class Prog extends Node {

    private ListVar lv;
    private Bloc b;

    public Prog(ListVar lv, Bloc b) {
        this.lv = lv;
        this.b = b;
    }
}
