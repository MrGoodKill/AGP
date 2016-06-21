public class Factor {
	private Final2 final2;
	private Factor factor;
	private String operator;

	public Factor(Final2 final2, Factor factor, String operator){
		this.final2 = final2;
		this.factor = factor;
		this.operator = operator;
	}

	public Factor(Final2 final2){
		this.final2 = final2;
	}


	public void toASM(){

	}

}
