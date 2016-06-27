import java.util.ArrayList;

public class String2 extends Node {

    private Txt txt;
    private int index;
    private boolean dataAdded=false;
    private int compt;

    public String2(Txt txt){
        this.txt = txt;
        index = stringIndex;
        stringIndex++;
        String text = txt.getTxt();
        String result ="";
        char c;
        char old='a';
        compt = 0;
        for (int i = 0; i < text.length(); i++){
            c = text.charAt(i);
            if(old=='\\' && c=='n'){
                compt++;
                result=result.substring(0,result.length()-1)+"\",10,\"";
            } else {
                result+=c;
            }
            old=c;
        }
        compt++;
        globalData+=newLabel("")+"str"+index+ ":\tdb \""+result+"\",0";
    }

    public int getIndex(){
        return index;
    }
}
