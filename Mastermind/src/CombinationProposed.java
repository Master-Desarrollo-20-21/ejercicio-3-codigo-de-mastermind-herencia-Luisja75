
class CombinationProposed  extends Combination {

	public void set() {
		do {
			this.console.out("\nPropose a combination: ");
			String combination = this.console.inString();
			this.combinationColors = combination.toCharArray();
		} while (!valid());
	}

	public void show() {
		this.console.out(String.valueOf(this.combinationColors));
	}
	
	private boolean valid()
	{
		boolean correct = true;
		if (this.combinationColors.length == Combination.NUMBER_COLORS) {
			correct = (!this.hasColorDuplicate() && !this.hasColorIncorrect());			
		} 
		else {
			correct = false;
		}
		
		if(!correct)
		{
			this.console.out("Wrong colors, they must be " + Combination.NUMBER_COLORS + " not repeat of: " + String.valueOf(Combination.LIST_CHARACTERS_ALLOWS));
		}
		return correct;
	}
}
