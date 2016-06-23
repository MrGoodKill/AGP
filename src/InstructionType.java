public enum InstructionType {
    Affct,
    Decl,
    Decaf,
    If2,
    While2,
    Ask,
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
    public boolean isPrint(){
        return this.equals(Print);
    }
    public boolean isAsk(){
        return this.equals(Ask);
    }
}
