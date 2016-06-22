public class Inst extends Node {

    private Affct affct;
    private Decl decl;
    private Decaf decaf;
    private If2 if2;
    private While2 while2;
    private InstructionType type;

    public Inst(Affct affct){
        this.affct = affct;
        type = InstructionType.Affct;
    }

    public Inst(Decl decl){
        this.decl = decl;
        type = InstructionType.Decl;
    }

    public Inst(Decaf decaf){
        this.decaf = decaf;
        type = InstructionType.Decaf;
    }

    public Inst(If2 if2){
        this.if2 = if2;
        type = InstructionType.If2;
    }

    public Inst(While2 while2){
        this.while2 = while2;
        type = InstructionType.While2;
    }


    @Override
    public String toASM() {
        String output="";
        switch (type){
            case Affct: output= affct.toASM();
                break;
            case Decl: output= decl.toASM();
                break;
            case Decaf: output= decaf.toASM();
                break;
            case If2: output= if2.toASM();
                break;
            case While2: output= while2.toASM();
                break;
        }
        return output;
    }

    @Override
    public String toASMData() {
        String output="";
        switch (type){
            case Affct: output= affct.toASMData();
                break;
            case Decl: output= decl.toASMData();
                break;
            case Decaf: output= decaf.toASMData();
                break;
            case If2: output= if2.toASMData();
                break;
            case While2: output= while2.toASMData();
                break;
        }
        return output;
    }
}
