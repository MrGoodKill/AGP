public class Final2 extends Node {

    private Op op;
    private Number nb;

    public Final2(Op op){
        this.op = op;
    }

    public Final2(Number nb){
        this.nb = nb;
    }

    public String toASM() {
        if(op!=null){
            return op.toASM();
        }
        if(nb!=null){
            return "\n"+nb.placeInStack();
        }
        return "";
    }

    public String toASMInEAX() {
        if(op!=null){
            return op.toASM();
        }
        if(nb!=null){
            return "\n"+nb.placeInEax();
        }
        return "";
    }
}
