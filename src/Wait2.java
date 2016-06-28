
public class Wait2 extends Node {
	
	private Op op;
	private static boolean waitAdded = false;
	private static boolean waitAddedData = false;
	
	public Wait2(Op op){
		this.op = op;
	}
	
	@Override
	public String toASM(){
		String output = 
						op.toASM()
						+ newLine("call wait2");
		globalASM += addWait();
		return output;
	}
	
	@Override
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
							+ newLine("pop eax")
							+ newLine("mov [funcReturn],eax")
							+ newLine("pop eax")
							+ newLine("mov dword [tv_sec], 0")
							+ newLine("mov dword [tv_usec], eax  ;nanosecondes")
							+ newLine("mov eax, 162")
							+ newLine("mov ebx, timeval")
							+ newLine("mov ecx, 0")
							+ newLine("int 0x80")
							+ newLine("mov eax,[funcReturn]")
							+ newLine("push eax")
							+ newLine("ret");
			return output;
		} else {
			return "";
		}
    }

}
