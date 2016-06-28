public class Node {
	
    protected static int condCpt=1;
    protected static int stringIndex=1;
    protected static String globalData="";
    protected static String globalASM="";
    private static String fctName="main";

    // Si la fonction n'est pas définie dans les classes filles, celle-ci sera appelée
    public String toASM(){
        return "\n[Node sans ASM : "+getClass().getName()+"]";
    }

    public String toASMData(){
        return "";
    }

    // 
    public String getGlobalData(){
        return newLabel("")+"temp:\tdd\t0"+globalData;
    }

    public String getGlobalASM(){
    	return globalASM;
    }
    
    public String getGlobalFctName(){return fctName;}

    public void setGlobalFctName(String fctName){Node.fctName=fctName;}
    
    // Fonction d'indentation
    public String newLine(String line){
    	
    	String output;
    	if(Main.DEBUG){
            output = "\n\t"+line+"\t\t\t;["+getClass().getName()+"]";
        } else {
            output = "\n\t"+line;
        }
    	return output;
    }
    
    // Fonction d'indentation
    public String newLabel(String label){
    	
    	String output;
    	output = "\n"+label;
    	return output;
    }
    
}
