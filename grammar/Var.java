public class Var extends Node {

    private String texte;

    public Var(String text){
        this.texte = text;
    }

    public String name(){
        return texte;
    }
}
