public class Number extends Node {

    private Const2 c;
    private Var v;
    private Random r;

    public Number(Const2 c) {
        this.c = c;
    }

    public Number(Var v) {
        this.v = v;
    }

    public Number(Random r) {
        this.r = r;
    }

    public String placeInEax() {
        if(c!=null){
            return "mov eax,"+c.getValeur();
        }
        if(v!=null){
            return "mov eax,["+v.getName()+"]";
        }
        if(r!=null){
            return r.toASM()+newLine("pop eax");
        }
        return "";
    }

    public String placeInStack(){
        if(c!=null){
            return "push "+c.getValeur();
        }
        if(v!=null){
            return "push dword["+v.getName()+"]";
        }
        if(r!=null){
            return r.toASM();
        }
        return "";
    }
}