public class String2 extends Node {

    private Txt txt;
    private int index;
    private boolean dataAdded=false;

    public String2(Txt txt){
        this.txt = txt;
        index = stringIndex;
        stringIndex++;
        globalData+=newLabel("")+"str"+index+ ":\tdb \""+txt.getTxt()+"\",0";
    }

    public String getTxt(){
        return txt.getTxt();
    }

    public int getIndex(){
        return index;
    }
}
