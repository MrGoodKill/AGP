
public class Wait2 extends Node {
	
	private Op op;
	private static boolean waitAdded = false;
	private static boolean waitAddedData = false;
	
	public Wait2(Op op){
		this.op = op;
		children.add(op);
	}
	
	@Override
	public String toASM(){
		// On rajoute le code li� � l'op�ration, on call la fonction wait et on �crit donc on code dans globalASM
		String output = 
						op.toASM()
						+ newLine("call wait2");
		globalASM += addWait();
		return output;
	}
	
	@Override
	// On ne d�clare qu'une seule fois les variables utilis�es, m�me si wait est appel� plusieurs fois
	public String toASMData() {
		if(!waitAddedData) {
			waitAddedData=true;
			return newLabel("timeval:")
					+ newLine("tv_sec\tdd\t0")
					+ newLine("tv_usec\tdd\t0");
		} else {
			return "";
		}
    }
	
	public String addWait(){
		if(!waitAdded) {
			waitAdded=true;
			String output;
			output =
					newLine("")
							+ newLabel("wait2:")
							// On r�cup�re la valeur de l'esp que l'on stocke dans une variable
							+ newLine("pop eax")
							+ newLine("mov [funcReturn],eax")
							// On r�cup�re la valeur de l'argument pass� en param�tre
							+ newLine("pop eax")
							// On push 0s et eax nano secondes
							+ newLine("mov dword [tv_sec], 0")
							+ newLine("mov dword [tv_usec], eax  ;nanosecondes")
							// On rentre les codes correspondant � une attente et on lance une interruption
							+ newLine("mov eax, 162")
							+ newLine("mov ebx, timeval")
							+ newLine("mov ecx, 0")
							+ newLine("int 0x80")
							// On replace la valeur de esp dans la stack et on call ret
							+ newLine("mov eax,[funcReturn]")
							+ newLine("push eax")
							+ newLine("ret");
			return output;
		} else {
			return "";
		}
    }

}
