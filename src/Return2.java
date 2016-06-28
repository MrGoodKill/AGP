import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Return2 extends Node{
	
	private Op op;
	private ArrayList<Var> saveList;
	private ArrayList<Var> paramList;

	
	public Return2(Op op){
		this.op = op;
	}
	
	public String toASM(){
		String output = ""
		+ newLine("pop ebx")
		+ op.toASMInEAX();
		if(saveList!=null) {
			for (Var v : saveList) {
				output = output +
						newLine("pop dword [" + v.getName() + "]");
			}
		}
		if(paramList!=null) {
			for (Var v : paramList) {
				output = output +
						newLine("pop dword [" + v.getName() + "]");
			}
		}
		output+= newLine("push eax")
		+ newLine("push ebx")
		+ newLine("ret");
		return output;
	}


	public void setArguments(ArrayList<Var> saveList, ArrayList<Var> paramList) {
		this.saveList=(ArrayList<Var>)saveList.clone();
		Collections.reverse(this.saveList);
		this.paramList=(ArrayList<Var>)paramList.clone();
		System.out.println();
	}
}