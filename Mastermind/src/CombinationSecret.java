import java.util.Random;

class CombinationSecret extends Combination {
	private int numberWhites;
	private int numberBlacks;

	public CombinationSecret() {
		numberWhites = 0;
		numberBlacks = 0;
		for (int i=0; i<this.combinationsColor.length; i++) {
			int position = new Random().nextInt(Combination.LIST_CHARACTERS_ALLOWS.length);			
			this.combinationsColor[i] = Combination.LIST_CHARACTERS_ALLOWS[position];
		}
	}

	public void show() {
		this.console.out("XXXX");
		//this.console.out(String.valueOf(this.combinationColor) + "\n");
	}

	public int getNumberBlacks(CombinationProposed combinationProposed) {
		checkHits(combinationProposed);
		return numberBlacks;
	}

	public int getNumberWhites(CombinationProposed combinationProposed) {
		checkHits(combinationProposed);
		return numberWhites;
	}
	
	private void checkHits(CombinationProposed combinationProposed) {
		numberWhites = 0;
		numberBlacks = 0;
		for (int i=0; i<combinationProposed.combinationsColor.length; i++) {
			char color = combinationProposed.combinationsColor[i];
			this.checkColor(color,i);
		}
	}	
	
	private void checkColor(char color, int position) {
		for (int i=0; i<this.combinationsColor.length; i++) {
			if (color == this.combinationsColor[i]) {
				if (position==i) {
					numberBlacks++;
				}
				else {
					numberWhites++;
				}
			}
		}
	}	
}
