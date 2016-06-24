public class Var extends Node {

    private String texte;

    public Var(String text){
        this.texte = text;
    }

    public String getName(){
        return getGlobalFctName()+"$"+texte;
    }

    public String getNameWithoutHeader(){
        return texte;
    }
}