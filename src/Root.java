public class Root extends Node{

    private Prog p;

    public Root(Prog p) {
        this.p = p;
    }

    @Override
    public String toASM() {
        String output =
                "extern printf,exit\n" +
                "section .data\n" +
                 p.toASMData() +
                 "\n\n" +
                 "section .text\n" +
                 p.toASM();
        return output;

    }

}
