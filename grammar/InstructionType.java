public enum InstructionType {
    Affct,
    Decl,
    Decaf,
    If2,
    While2,
    Comment,
	Print;

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
}
