class Op {
	
	private Factor factor;
	private Op op;
	private String operator;
	
	public Op(Factor factor, Op op, String operator){
		this.factor = factor;
		this.op = op;
		this.operator = operator;
	}
	
	public Op(Factor factor){
		this.factor = factor;
	}
	
	public void toAsm(){
		
	}

}
