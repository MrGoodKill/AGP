public class Final2 extends Node {

    private Op op;
    private Number nb;

    public Final2(Op op){
        this.op = op;
        children.add(op);
    }

    public Final2(Number nb){
        this.nb = nb;
        children.add(nb);
    }

    public String toASM() {
        if(op!=null){
            return op.toASM();
        }
        if(nb!=null){
            return newLine(nb.placeInStack());
        }
        return "";
    }

    public String toASMInEAX() {
        if(op!=null){
            return op.toASM();
        }
        if(nb!=null){
            return newLine(nb.placeInEax());
        }
        return "";
    }
}
