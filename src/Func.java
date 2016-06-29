import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class Func extends Node{

	private Bloc bloc;
	private String name;
	private ArrayList<Var> paramList;
	private ArrayList<Var> saveList;
	private ArrayList<Return2> returnList;
	
	public Func(ListVar listvar, Bloc bloc, Var funcName){
		this.bloc=bloc;
		this.name=funcName.getNameWithoutHeader();

		children.add(bloc);

		returnList=bloc.getReturnList();
		paramList = new ArrayList<Var>();
		for(Var v:listvar){
			paramList.add(v);
		}
		saveList=bloc.getDeclList();
		for(Return2 r:returnList) {
			r.setArguments(saveList, paramList);
		}
		addFunction(name,this);
	}

	public boolean isRecur(){
		ArrayList<Func> alreadySeen = new ArrayList<>();
		Stack<Func> toBeSeen = new Stack<>();
		toBeSeen.addAll(getDependList());
		while(!toBeSeen.isEmpty()){
			Func f = toBeSeen.pop();
			if(f==this){
				System.out.println("Fonction "+name+" est recursive !");
				return true;
			} else {
				alreadySeen.add(f);
				ArrayList<Func> list = f.getDependList();
				for(Func f2:list){
					if(!alreadySeen.contains(f2)) toBeSeen.add(f2);
				}
			}
		}
		System.out.println("Fonction "+name+" n'est pas recursive !");
		return false;
	}

	public ArrayList<Func> getDependList(){ return bloc.getChildrenFunctionCall();}

    public String getFctName(){
        return name;
    }
	
	public String toASM(){
		String output="";
		output= output
				+ newLabel(name + ":")				// La fonction commence par son label
				+ toASMPopFunc()					// Ensuite nous récupérons les arguments depuis la pile
				+ bloc.toASM()						// On écrit le code contenu dans la fonction
		return output;
	}
	
	public String toASMData(){
		String output="";
		// Il faut déclarer tous les paramètres dans la section data
		for(Var v:paramList){
            output=output+newLabel("") + v.getName() + ":\tdd\t0";
        }
        return output+bloc.toASMData();
    }

	
	public String toASMPopFunc(){
		String output="";
		output += 	newLine("pop eax")
				+ newLine("mov [funcReturn],eax");
		if(isRecur()) {
			for(Return2 r:returnList) {
				r.setRecur(true);
			}
			int decalage = 0;
			for (int i = paramList.size() - 1; i >= 0; i--) {
				output += newLine("pop dword [funcTemp]") +
						newLine("push dword [" + paramList.get(i).getName() + "]") +
						newLine("mov eax, [funcTemp]") +
						newLine("mov [" + paramList.get(i).getName() + "], eax") +
						newLine("add esp,4");
				decalage += 4;
			}
			output += newLine("sub esp," + decalage);
			for (Var v : saveList) {
				output = output +
						newLine("push dword [" + v.getName() + "]");
			}
		}else{
			for(int i=paramList.size()-1; i>=0; i--){
				output=output
						+ newLine("pop eax")
						+ newLine("mov [" + paramList.get(i).getName() +"],eax");
			}
			output+=newLine("push dword [funcReturn]");
		}
		output += newLine("push dword [funcReturn]");
		return output;
    }
}
