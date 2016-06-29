import java.util.ArrayList;
import java.util.Collection;

public class Inst extends Node {

    private Affct affct;
    private Decl decl;
    private Decaf decaf;
    private If2 if2;
    private While2 while2;
    private Print print;
    private Comment comment;
    private Ask ask;
    private CallFunction call;
    private Return2 return2;
    private For2 for2;
    private Wait2 wait2;
    private InstructionType type;
    private ArrayList<Var> declList;
    private Collection<? extends Return2> returnList;

    public Inst(Affct affct){
        this.affct = affct;
        type = InstructionType.Affct;
        children.add(affct);
    }

    public Inst(Decl decl){
        this.decl = decl;
        type = InstructionType.Decl;
        children.add(decl);
    }

    public Inst(Decaf decaf){
        this.decaf = decaf;
        type = InstructionType.Decaf;
        children.add(decaf);
    }

    public Inst(If2 if2){
        this.if2 = if2;
        type = InstructionType.If2;
        children.add(if2);
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
        children.add(print);
    }

    public Inst(Ask ask){
        this.ask = ask;
        type = InstructionType.Ask;
        children.add(ask);
    }
    
    public Inst(Return2 return2){
    	this.return2 = return2;
    	type = InstructionType.Return2;
        children.add(return2);
    }
    
    public Inst(CallFunction call){
    	this.call = call;
    	type = InstructionType.Call;
        children.add(call);
    }
    
    public Inst(Wait2 wait2){
    	this.wait2 = wait2;
    	type = InstructionType.Wait2;
        children.add(wait2);
    }

    public Inst(For2 for2){
        this.for2 = for2;
        type = InstructionType.For2;
        children.add(for2);
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
            case Ask: output= ask.toASM();
                break;
            case Return2: output= return2.toASM();
                break;
            case For2: output= for2.toASM();
                break;
            case Call: output= call.toASM()+newLine("pop eax");
                break;
            case Wait2: output= wait2.toASM();
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
            case Ask: output= ask.toASMData();
                break;
            case Return2: output= return2.toASMData();
                break;
            case For2: output= for2.toASMData();
                break;
            case Call: output= call.toASMData();
            	break;
            case Wait2: output= wait2.toASMData();
            	break;
        }
        return output;
    }

    public boolean isReturn(){
        return type.isReturn2();
    }

    public Return2 getReturn2(){
        return return2;
    }

    public ArrayList<Var> getDeclList() {
        ArrayList<Var> result = new ArrayList<>();
        if(type.isDecl()) {
            for(Var v:decl.getListVar()){
                result.add(v);
            }
        }
        if(type.isDecaf()) {
            result.add(decaf.getVar());
        }
        if(type.isFor2()) {
            result.addAll(for2.getDeclList());
        }
        if(type.isIf2()){
            result.addAll(if2.getDeclList());
        }
        if(type.isWhile2()){
            result.addAll(while2.getDeclList());
        }
        return result;
    }

    public ArrayList<Return2> getReturnList() {
        ArrayList<Return2> result = new ArrayList<>();
        if(type.isReturn2()) {
            result.add(return2);
        }
        if(type.isFor2()) {
            result.addAll(for2.getReturnList());
        }
        if(type.isIf2()){
            result.addAll(if2.getReturnList());
        }
        if(type.isWhile2()){
            result.addAll(while2.getReturnList());
        }
        return result;
    }
}
