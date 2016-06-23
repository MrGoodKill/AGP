public class Node {
	
    protected static int condCpt=1;
    protected static int stringIndex=1;
    protected static String globalData="";

    public String toASM(){
        return "\n[Node sans ASM : "+getClass().getName()+"]";
    }

    public String toASMData(){
        return "";
    }

    public String getGlobalData(){
        return globalData;
    }
    
    public String newLine(String line){
    	
    	String output;
    	if(Main.DEBUG){
            output = "\n\t"+line+"\t\t\t;["+getClass().getName()+"]";
        } else {
            output = "\n\t"+line;
        }
    	return output;
    }
    
    public String newLabel(String label){
    	
    	String output;
    	output = "\n"+label;
    	return output;
    }
    
}
