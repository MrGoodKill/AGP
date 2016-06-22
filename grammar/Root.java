public class Root extends Node{

    private Prog p;

    public Root(Prog p) {
        this.p = p;
    }

    @Override
    public String toASM() {
        String output =
                newLabel("extern printf,exit") +
                newLabel("section .data") +
                p.toASMData() +
                newLabel("") + newLabel("") +
                newLabel("section .text") +
                p.toASM();
        return output;

    }

}
