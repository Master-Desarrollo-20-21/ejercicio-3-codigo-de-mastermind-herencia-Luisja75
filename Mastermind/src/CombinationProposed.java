
class CombinationProposed  extends Combination {

	public void set() {
		do {
			this.console.out("\nPropose a combination: ");
			String combination = this.console.inString();
			this.combinationsColor = combination.toCharArray();
		} while (!valid());
	}

	public void show() {
		this.console.out(String.valueOf(this.combinationsColor));
	}
	
	private boolean valid()
	{
		boolean correct = true;
		if (this.combinationsColor.length == Combination.NUMBER_COLORS) {
			for (char color : this.combinationsColor) {
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
		} 
		else {
			correct = false;
		}
		
		if(!correct)
		{
			this.console.out("Wrong colors, they must be " + Combination.NUMBER_COLORS + " of: " + String.valueOf(Combination.LIST_CHARACTERS_ALLOWS));
		}
		return correct;
	}
}
