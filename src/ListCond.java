import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class ListCond extends Node{

    //Contient une condition
    private Cond cond;
    //Contient une liste d'autres conditions
    private ListCond listCond;
    //Contient le lien logique entre la condition et la liste (ET ou OU)
    private Operator logic;
    private int comptOr;
    private static int comptORGlobal=1;

    public ListCond(Cond cond, ListCond listCond,String logic){
        this.cond = cond;
        this.listCond = listCond;
        this.logic=new Operator(logic);
        children.add(cond);
        children.add(listCond);
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
            //Cas où la liste n'est composée que d'une seule condition
            return cond.toASM(compt);
        }
        if(logic!=null) {
            //Cas d'une condition et d'une listcond liée par un opérateur logique
            if(logic.getOp().equals(Operator.Op.AND)){
                //Dans le cas du ET, on met les deux conditions à la suite
                output += cond.toASM(compt);
                output += listCond.toASM(compt);
            }
            if(logic.getOp().equals(Operator.Op.OR)){
                //Dans le cas du OU, on teste la première et on passe au code du bloc s'elle est vraie,
                // sinon on vérifie la seconde et on passe au bloc si elle est fausse
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
