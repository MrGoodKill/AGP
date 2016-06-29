import java.util.ArrayList;
import java.util.Collections;

public class Return2 extends Node{

	//L'operation retourn�e par le return
	private Op op;
	//Liste des param�tres sauvegard�s par la fonction
	private ArrayList<Var> saveList;
	//Liste des param�tres de la fonction
	private ArrayList<Var> paramList;

	private boolean recur = false;

	
	public Return2(Op op){
		this.op = op;
		children.add(op);
	}
	
	public String toASM(){
		//Sauvegarde de l'adresse de retour
		String output = newLine("pop ecx");
		if(recur) {
			//Cas ou la fonction est r�cursive, il faut alors r�cup�rer les valeurs dans la pile pour les remettre comme elles �taient avant l'appel
			output += op.toASMInEAX();
			if (saveList != null) {
				//Recup�ration des variables utilis�es par la fonction
				for (Var v : saveList) {
					output = output +
							newLine("pop dword [" + v.getName() + "]");
				}
			}
			if (paramList != null) {
				//Recup�ration des param�tres utilis�es par la fonction
				for (Var v : paramList) {
					output = output +
							newLine("pop dword [" + v.getName() + "]");
				}
			}
			output += newLine("push eax");
		} else {
			//Cas non r�cursif, on calcule juste le r�sultat et on le place dans la pile
			output += op.toASM();
		}
		// On place l'adresse de retour dans la pile et on retourne
		output += newLine("push ecx")
				+ newLine("ret");
		return output;
	}


	public void setArguments(ArrayList<Var> saveList, ArrayList<Var> paramList) {
		this.saveList=(ArrayList<Var>)saveList.clone();
		Collections.reverse(this.saveList);
		this.paramList=(ArrayList<Var>)paramList.clone();
		System.out.println();
	}

	public void setRecur(boolean recur) {
		this.recur = recur;
	}
}