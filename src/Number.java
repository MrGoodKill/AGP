public class Number extends Node {

    private Const2 c;
    private Var v;
    private Random r;
    private CallFunction call;

    public Number(Const2 c) {
        this.c = c;
    }

    public Number(Var v) {
        this.v = v;
    }

    public Number(Random r) {
        this.r = r;
    }
    
    public Number(CallFunction call) {
        this.call = call;
    }


    public String placeInEax() {
        if(c!=null){
            return "mov eax,"+c.getValeur();
        }
        if(v!=null){
            return "mov eax,["+v.name()+"]";
        }
        if(r!=null){
            return r.toASM()+newLine("pop eax");
        }
        if(call!=null){
        	return call.toASM()+newLine("pop eax");
        }
        return "";
    }

    public String placeInStack(){
        if(c!=null){
            return "push "+c.getValeur();
        }
        if(v!=null){
            return "push dword["+v.name()+"]";
        }
        if(r!=null){
            return r.toASM();
        }
        if(call!=null){
            return call.toASM();
        }
        return "";
    }
}