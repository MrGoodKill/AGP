import java.util.ArrayList;
import java.util.Collection;

public class If2 extends Node {

    private ListCond lcond;
    private Bloc bloc;
    // Le contenu d'un potentiel else
    private Bloc bloc2;
    // On a besoin d'un compteur pour faire des labels uniques pour chaque instance des if
    private int compt = -1;

    // Constructeur pour if simple
    public If2(ListCond lcond, Bloc bloc){
        this.lcond = lcond;
        this.bloc = bloc;
        this.compt = condCpt;
        condCpt++;
        children.add(lcond);
        children.add(bloc);
    }

    // Constructeur pour if avec else
    public If2(ListCond lcond, Bloc bloc, Bloc bloc2){
        this.lcond = lcond;
        this.bloc = bloc;
        this.bloc2 = bloc2;
        this.compt = condCpt;
        condCpt++;
        children.add(lcond);
        children.add(bloc);
        children.add(bloc2);
    }
    
    public String toASM() {
        // La condition s'occupe de faire la comparaison et le saut associé
        String output=lcond.toASM(compt);
        output=output+bloc.toASM();
        // On vérifie qu'il y a bien un else
        if (bloc2!=null){
        	// S'il y a un else, à la fin du if on ne lit pas le code du else, on saute à endelse
        	output+= newLine("jmp endelse"+compt);
        }
        // Ce label permet de sauter le code du if et de n'exécuter que le code du else
        output+=newLabel("cond"+compt+":");
        if (bloc2!=null){
        	output+=bloc2.toASM();
        	// On doit déclarer le label dont on parlait plus haut
        	output+=newLabel("endelse"+compt+":");
        }
        return output;
    }

    @Override
    public String toASMData() {
        String asmData = lcond.toASMData()+bloc.toASMData();
        if (bloc2!=null){
        	asmData+= lcond.toASMData()+bloc2.toASMData();
        }
        return asmData;
    }

    //Renvoie les variables déclarées dans l'arbre généré par le noeud
    public ArrayList<Var> getDeclList() {
        ArrayList<Var> result = new ArrayList<>();
        result.addAll(bloc.getDeclList());
        if(bloc2!=null) result.addAll(bloc2.getDeclList());
        return result;
    }

    //Renvoie les returns utilisés dans l'arbre généré par le noeud
    public ArrayList<Return2> getReturnList() {
        ArrayList<Return2> result = new ArrayList<>();
        result.addAll(bloc.getReturnList());
        if(bloc2!=null) result.addAll(bloc2.getReturnList());
        return result;
    }

}
