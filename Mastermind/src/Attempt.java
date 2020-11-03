
public class Attempt {
	
	CombinationSecret combinationSecret;
	CombinationProposed combinationProposed;
	private int[] result;
	private Console console;

	public Attempt(CombinationSecret combinationSecret) {
		this.combinationSecret = combinationSecret;
		combinationProposed = new CombinationProposed(); 
		result = new int[2];
		console = new Console();
	}
		
	public void set() {
		combinationProposed.set();
		result[0] = CombinationSecret.getBlacks(combinationProposed);
		result[1] = CombinationSecret.getWhites(combinationProposed);	
	}

	public void show() {
		combinationProposed.show();
		String salida = " --> " + result[0] + " blacks " +  result[1] + " whites\n"; 
		console.out(salida);
	}

	public boolean isSecret() {
		return result[0] == 4;
	}
}
