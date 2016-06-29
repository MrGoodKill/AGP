public class If2 extends Node {

    private Cond cond;
    private Bloc bloc;
    // Le contenu d'un potentiel else
    private Bloc bloc2;
    // On a besoin d'un compteur pour faire des labels uniques pour chaque instance des if
    private int compt = -1;
    
    // COnstructeur pour if simple
    public If2(Cond cond, Bloc bloc){
        this.cond = cond;
        this.bloc = bloc;
        this.compt = condCpt;
        condCpt++;
    }
    
    // Constructeur pour if avec else
    public If2(Cond cond, Bloc bloc, Bloc bloc2){
        this.cond = cond;
        this.bloc = bloc;
        this.bloc2 = bloc2;
        this.compt = condCpt;
        condCpt++;
    }
    
    public String toASM() {
        // La condition s'occupe de faire la comparaison et le saut associé
    	String output= cond.toASM(compt);
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
        String asmData = cond.toASMData()+bloc.toASMData();
        if (bloc2!=null){
        	asmData+= cond.toASMData()+bloc2.toASMData();
        }
        return asmData;
    }
}
