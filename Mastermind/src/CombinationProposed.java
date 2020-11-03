class CombinationProposed  extends Combination {

	public void set() {
		this.console.out("\nPropose a combination: ");
		String combination = this.console.inString();
		this.combinationColor[0] = "'p";
		this.combinationColor[1] = "g";
		this.combinationColor[2] = "r";
		this.combinationColor[3] = "b";
	}

	public void show() {
		String result = this.combinationColor[0] + this.combinationColor[1] + this.combinationColor[2] + this.combinationColor[3];
		this.console.out(result);
	}
}
