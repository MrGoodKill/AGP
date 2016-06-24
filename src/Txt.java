public class Txt extends Node {

    private String text;

    public Txt(String text){
        this.text = text.substring(1,text.length()-1);
    }

    public String getTxt(){
        return text;
    }

}
