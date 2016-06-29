import java.util.ArrayList;
import java.util.HashMap;

public class Node {
	
    protected static int condCpt=1;
    protected static int stringIndex=1;
    protected static String globalData="";
    protected static String globalASM="";
    private static String fctName="main";
    protected ArrayList<Node> children = new ArrayList<>();
    private static HashMap<String,Func> funcName = new HashMap<>();

    public String toASM(){
        return "\n[Node sans ASM : "+getClass().getName()+"]";
    }

    public String toASMData(){
        return "";
    }

    public String getGlobalData(){
        return newLabel("")+"temp:\tdd\t0"+globalData;
    }

    public String getGlobalASM(){
    	return globalASM;
    }

    public String getGlobalFctName(){return fctName;}

    public void setGlobalFctName(String fctName){Node.fctName=fctName;}

    public String newLine(String line){
    	String output;
    	if(Main.DEBUG){
            output = "\n\t"+line+"\t\t\t;["+getClass().getName()+"]";
        } else {
            output = "\n\t"+line;
        }
    	return output;
    }

    public void addFunction(String name,Func function){
        funcName.put(name,function);
    }

    public Func getFunction(String name){
        return funcName.get(name);
    }

    public String newLabel(String label){
    	
    	String output;
    	output = "\n"+label;
    	return output;
    }

    public ArrayList<Node> getChildren(){
        return children;
    }

    public ArrayList<Func> getChildrenFunctionCall(){
        ArrayList<Func> result = new ArrayList<>();
        for(Node n:getChildren()){
            if(n.getClass()==CallFunction.class){
                result.add(((CallFunction)n).getFunc());
            } else {
                result.addAll(n.getChildrenFunctionCall());
            }
        }
        return result;
    }
    
}
