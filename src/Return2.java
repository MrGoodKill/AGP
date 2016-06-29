import java.util.ArrayList;
import java.util.Collections;

public class Return2 extends Node{
	
	private Op op;
	private ArrayList<Var> saveList;
	private ArrayList<Var> paramList;

	private boolean recur = false;

	
	public Return2(Op op){
		this.op = op;
		children.add(op);
	}
	
	public String toASM(){
		String output = newLine("pop ebx");
		if(recur) {
			output += op.toASMInEAX();
			if (saveList != null) {
				for (Var v : saveList) {
					output = output +
							newLine("pop dword [" + v.getName() + "]");
				}
			}
			if (paramList != null) {
				for (Var v : paramList) {
					output = output +
							newLine("pop dword [" + v.getName() + "]");
				}
			}
			output += newLine("push eax");
		} else {
			output += newLine("pop ebx")
					+ op.toASM();
		}
			output += newLine("push ebx")
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