public enum InstructionType {
    Affct,
    Decl,
    Decaf,
    If2,
    While2,
    Comment,
    Ask,
	Print,
	Return2,
	Call;

    public boolean isAffct(){
        return this.equals(Affct);
    }
    public boolean isDecl(){
        return this.equals(Decl);
    }
    public boolean isDecaf(){
        return this.equals(Decaf);
    }
    public boolean isIf2(){
        return this.equals(If2);
    }
    public boolean isWhile2(){
        return this.equals(While2);
    }
    public boolean isComment(){
        return this.equals(Comment);
    }
    public boolean isPrint(){
        return this.equals(Print);
    }
    public boolean isAsk(){
        return this.equals(Ask);
    }
    public boolean isReturn2(){
        return this.equals(Return2);
    }
    public boolean isCall(){
        return this.equals(Call);
    }
}
