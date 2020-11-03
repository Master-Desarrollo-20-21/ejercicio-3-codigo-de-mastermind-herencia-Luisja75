class Board {

	private static final int NUMBER_MAXIMUN_ATTEMPTS = 11;
	private Console console;
	private boolean isWin;
	private int currentAttempt;
	private Attempt[] attempts;
	private CombinationSecret combinationSecret;
	
	public Board() {
		currentAttempt = 0;
		isWin = false;
		combinationSecret = new CombinationSecret();
		console = new Console();
		attempts = new Attempt[NUMBER_MAXIMUN_ATTEMPTS];
		for (int i=0; i<=NUMBER_MAXIMUN_ATTEMPTS-1; i++) {
			attempts[i] = new Attempt(combinationSecret);
		}
	}
	
	public void play() {
		combinationSecret.set();
		do { 
			this.attempts[this.currentAttempt].set();
			isWin = this.attempts[this.currentAttempt].isSecret();
			this.console.out(currentAttempt + " Attempt(s):\n");
			this.combinationSecret.show();
			for(int i=0; i<=currentAttempt; i++) {
				this.attempts[i].show();
			}
			currentAttempt++;
		} while (currentAttempt < NUMBER_MAXIMUN_ATTEMPTS && !isWin);	
	}
	
	public void showResult() {
		if (isWin) {
			console.out("You've won!!! :-)\n");
		} else {
			console.out("you've lost!!! :-(\n");
		}				
		console.out("RESUME? (y/n): ");		
	}
}
