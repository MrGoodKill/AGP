public class Node {

    public String toASM(){
        return "\n[Node sans ASM : "+getClass().getName()+"]";
    }

    public String toASMData(){
        return "";
    }
    
    protected static int condCpt;
    
}
