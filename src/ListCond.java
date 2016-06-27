import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class ListCond extends Node{

    private Cond cond;
    private ListCond listCond;
    private Operator logic;
    private int comptOr;
    private static int comptORGlobal=1;

    public ListCond(Cond cond, ListCond listCond,String logic){
        this.cond = cond;
        this.listCond = listCond;
        this.logic=new Operator(logic);
    }

    public ListCond(ListCond listCond){
        this.listCond = listCond;
    }

    public ListCond(Cond cond) {
        this.cond = cond;
    }

    public Cond getCond(){return cond;}
    public ListCond getNextListCond(){return listCond;}
    public Operator getLogic(){return logic;}

    private boolean isSingle(){
        return (listCond==null);
    }

    public String toASM(int compt) {
        String output="";
        if(isSingle()){
            return cond.toASM(compt);
        }
        if(logic!=null) {
            if(logic.getOp().equals(Operator.Op.AND)){
                output += cond.toASM(compt);
                output += listCond.toASM(compt);
            }
            if(logic.getOp().equals(Operator.Op.OR)){
                this.comptOr=comptORGlobal;
                comptORGlobal++;
                output += cond.toASMOR("cond"+compt+"$OR"+comptOr);
                output += listCond.toASM(compt);
                output+=newLabel("cond"+compt+"$OR"+comptOr+":");
            }
        }
        return output;
    }
}
