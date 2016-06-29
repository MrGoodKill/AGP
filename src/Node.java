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

    // Si la fonction n'est pas définie dans les classes filles, celle-ci sera appelée
    public String toASM(){
        return "\n[Node sans ASM : "+getClass().getName()+"]";
    }

    public String toASMData(){
        return "";
    }

    //code ASM à rajouter à la section .data
    public String getGlobalData(){
        return newLabel("")+"temp:\tdd\t0"+globalData;
    }

    //code ASM à rajouter à la section .text
    public String getGlobalASM(){
    	return globalASM;
    }

    //nom de la fonction courante lors du parsing, ceci sert à pouvoir distinger la variable
    // a dans main qui s'appellera main$a et celle de fonction qui s'écrira fonction$a
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
    
    // Fonction d'indentation pour les labels
    public String newLabel(String label){
    	
    	String output;
    	output = "\n"+label;
    	return output;
    }

    //Stockage des functions (objet Func) associées à leur nom
    public void addFunction(String name,Func function){
        funcName.put(name,function);
    }

    //Renvoie la function associée au nom donné en argument
    public Func getFunction(String name){
        return funcName.get(name);
    }

	//Renvoie la liste des enfants, quelque soit leur classe
    public ArrayList<Node> getChildren(){
        return children;
    }

    //Renvoie les functions appelées dans l'arbre généré par le noeud
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
