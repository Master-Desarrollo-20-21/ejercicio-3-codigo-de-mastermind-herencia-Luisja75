import java.util.Random;

class CombinationSecret extends Combination {
	
	private int numberWhites;
	private int numberBlacks;

	public CombinationSecret() {
		numberWhites = 0;
		numberBlacks = 0;
		do {
			this.set();
		} while (this.hasColorDuplicate());			
	}

	public void set() {
		for (int i=0; i<this.combinationColors.length; i++) {
			int position = new Random().nextInt(Combination.LIST_CHARACTERS_ALLOWS.length);			
			this.combinationColors[i] = Combination.LIST_CHARACTERS_ALLOWS[position];
		}
	}
		
	public void show() {
		this.console.out("XXXX\n");
	}

	public void showSecret() {
		this.console.out(String.valueOf(this.combinationColors) + "\n");
	}
	
	public int getNumberBlacks(Combination combination) {
		this.checkHits(combination);
		return numberBlacks;
	}

	public int getNumberWhites(Combination combination) {
		this.checkHits(combination);
		return numberWhites;
	}
	
	private void checkHits(Combination combination) {
		numberWhites = 0;
		numberBlacks = 0;
		for (int i=0; i<combination.combinationColors.length; i++) {
			char color = combination.combinationColors[i];
			this.checkColor(color,i);
		}
	}	
	
	private void checkColor(char color, int position) {
		for (int i=0; i<this.combinationColors.length; i++) {
			if (color == this.combinationColors[i]) {
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
