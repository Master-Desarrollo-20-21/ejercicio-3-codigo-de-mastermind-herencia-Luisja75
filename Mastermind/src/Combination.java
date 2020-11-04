
public class Combination {
	
	protected static final char[] LIST_CHARACTERS_ALLOWS = {'r', 'b', 'y', 'g', 'o', 'p'};
	protected static final int NUMBER_COLORS = 4;
	
	protected char[] combinationsColor;
	protected Console console;
	
	public Combination() {
		combinationsColor = new char[Combination.NUMBER_COLORS];
		console = new Console();
	}	
}
