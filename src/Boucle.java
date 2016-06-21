public class Boucle extends Node {

    private If2 if2;
    private While2 while2;

    public Boucle(If2 if2){
        this.if2 = if2;
    }

    public Boucle(While2 while2){
        this.while2 = while2;
    }
}
