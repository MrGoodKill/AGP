
public class Wait2 extends Node {
	
	private Op op;
	
	public Wait2(Op op){
		this.op = op;
	}
	
	@Override
	public String toASM(){
		String output = 
						op.toASM()
						+ newLine("call wait");
		globalASM += addWait();
		return output;
	}
	
	@Override
    public String toASMData() {
        return "waitVar$:\tdd\t00";
    }
	
	
	public String addWait(){
    	String output;
    	output = 
    			newLine("")
    			+ newLabel("wait:")
    			+ newLine("pop eax")
    			+ newLine("mov [funcReturn],eax")
    			+ newLine("pop eax")
    			+ newLine("mov [waitVar$],eax")
    			+ newLine("rdtsc")
    			+ newLine("push eax")
    			+ newLine("push edx")
    			+ newLabel("waitLoop:")
    			+ newLine("rdtsc")
    			+ newLine("sub eax, [esp]") 
    			+ newLine("sbb edx, [esp+4]")
    			+ newLine("comp eax,[waitVar$]")
    			+ newLine("jl waitLoop")
    			+ newLine("pop eax")	// We pushed 2 things since the beginning
    			+ newLine("pop edx")	// We pushed 2 things since the beginning
    			+ newLine("mov eax,[funcReturn]")
    			+ newLine("push eax")
    			+ newLine("ret");
    	return output;
    }


}
