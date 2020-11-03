class CombinationSecret extends Combination {

	public void set() {
		this.combinationColor[0] = "p";
		this.combinationColor[1] = "g";
		this.combinationColor[2] = "r";
		this.combinationColor[3] = "b";	
	}

	public void show() {
		this.console.out("xxxx\n");
	}

	public static int getBlacks(CombinationProposed combinationProposed) {
		return 0;
	}

	public static int getWhites(CombinationProposed combinationProposed) {
		return 0;
	}
}
