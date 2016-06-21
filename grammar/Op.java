public class Op {
	
	private Factor factor;
	private Op op;
	
	public Op(Factor factor, Op op){
		this.factor = factor;
		this.op = op;
	}
	
	public Op(Factor factor){
		this.factor = factor;
	}
	
	public void toAsm(){
		
	}

}
