public class Inst extends Node {

    private Affct affct;
    private Decl decl;
    private Decaf decaf;
    private If2 if2;
    private While2 while2;
    private Print print;
    private Comment comment;
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
    
    public Inst(Comment comment){
        this.comment = comment;
        type = InstructionType.Comment;
    }
    
    public Inst(Print print){
        this.print = print;
        type = InstructionType.Print;
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
            case Comment: output= comment.toASM();
            	break;
            case Print: output= print.toASM();
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
            case Print: output= print.toASMData();
            	break;
        }
        return output;
    }
}
