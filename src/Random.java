
public class Random extends Node{

    private Number nb;

	public Random(Number nb){
        this.nb=nb;
        children.add(nb);
    }
	
	@Override
	public String toASM() {
        String output;
        output = newLine("push eax") +
                newLine("push edx") +
                newLine("rdtsc") +
                newLine("mov edx, 0") +
                newLine(nb.placeInStack()) +
                newLine("pop ebx") +
                newLine("div ebx") +
                newLine("mov [temp], edx") +
                newLine("pop edx") +
                newLine("pop eax") +
                newLine("push dword [temp]");
        return output;
    }
}