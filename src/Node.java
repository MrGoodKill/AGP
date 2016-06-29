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

    // Si la fonction n'est pas d�finie dans les classes filles, celle-ci sera appel�e
    public String toASM(){
        return "\n[Node sans ASM : "+getClass().getName()+"]";
    }

    public String toASMData(){
        return "";
    }

    //code ASM � rajouter � la section .data
    public String getGlobalData(){
        return newLabel("")+"temp:\tdd\t0"+globalData;
    }

    //code ASM � rajouter � la section .text
    public String getGlobalASM(){
    	return globalASM;
    }

    //nom de la fonction courante lors du parsing, ceci sert � pouvoir distinger la variable
    // a dans main qui s'appellera main$a et celle de fonction qui s'�crira fonction$a
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

    //Stockage des functions (objet Func) associ�es � leur nom
    public void addFunction(String name,Func function){
        funcName.put(name,function);
    }

    //Renvoie la function associ�e au nom donn� en argument
    public Func getFunction(String name){
        return funcName.get(name);
    }

	//Renvoie la liste des enfants, quelque soit leur classe
    public ArrayList<Node> getChildren(){
        return children;
    }

    //Renvoie les functions appel�es dans l'arbre g�n�r� par le noeud
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
