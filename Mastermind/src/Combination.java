abstract class Combination {
	
	protected static final char[] LIST_CHARACTERS_ALLOWS = {'r', 'b', 'y', 'g', 'o', 'p'};
	protected static final int NUMBER_COLORS = 4;
	
	protected char[] combinationColors;
	protected Console console;
	
	public Combination() {
		combinationColors = new char[Combination.NUMBER_COLORS];
		console = new Console();
	}
	
	public abstract void set();	
	
	public abstract void show();	
	
	protected boolean hasColorDuplicate() {
		for (int i=0; i < this.combinationColors.length; i++) {
			char color = this.combinationColors[i];
			for (int j=i+1; j < this.combinationColors.length; j++) {
				if (color == this.combinationColors[j]) {
					return true;
				}
			}
		}
		return false;
	}

	protected boolean hasColorIncorrect()
	{
		boolean correct = true;
		
		for (char color : this.combinationColors) {
			boolean colorCorrect = false;
			for (char colorAllowed : Combination.LIST_CHARACTERS_ALLOWS) {
				if (color == colorAllowed) {
					colorCorrect = true;
					break;
				}
			}
			if (!colorCorrect) {
				correct = false;
				break;
			}
		}
		
		return !correct;
	}	
}
