
public class Attempt {
	
	private final int POSITION_BLACKS = 0;
	private final int POSITION_WHITES = 1;
	
	CombinationSecret combinationSecret;
	Combination combinationProposed;
	private int[] result;
	private Console console;

	public Attempt(CombinationSecret combinationSecret) {
		this.combinationSecret = combinationSecret;
		combinationProposed = new CombinationProposed(); 
		result = new int[2];
		console = new Console();
	}
		
	public void setCombinationProposed() {
		combinationProposed.set();
		result[POSITION_BLACKS] = combinationSecret.getNumberBlacks(combinationProposed);
		result[POSITION_WHITES] = combinationSecret.getNumberWhites(combinationProposed);	
	}

	public void show() {
		combinationProposed.show();
		String salida = " --> " + result[POSITION_BLACKS] + " blacks " +  result[POSITION_WHITES] + " whites\n"; 
		console.out(salida);
	}

	public boolean isSecret() {
		return result[POSITION_BLACKS] == 4;
	}
}
