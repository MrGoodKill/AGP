public class Number extends Node {

    private Const2 c;
    private Var v;

    public Number(Const2 c) {
        this.c = c;
    }

    public Number(Var v) {
        this.v = v;
    }

    public String getString() {
        if(c!=null){
            return ""+c.getValeur();
        }
        if(v!=null){
            return v.name();
        }
        return "";
    }

    public String placeInEax() {
        if(c!=null){
            return "mov eax,"+c.getValeur();
        }
        if(v!=null){
            return "mov eax,["+v.name()+"]";
        }
        return "";
    }

    public String placeInStack(){
        if(c!=null){
            return "push "+c.getValeur();
        }
        if(v!=null){
            return "push ["+v.name()+"]";
        }
        return "";
    }
}