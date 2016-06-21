public class Cond {
	private Op op1;
	private Op op2;
	private String operator;

	public Cond(Op op1, Op op2, String operator){
		this.op1 = op1;
		this.op2 = op2;
		this.operator = operator;

	}

	public void toASM(){};

}
