class Mastermind { 

	private Board board; 

	private void play() { 
		do { 
			this.board = new Board();
			this.board.play();
			this.board.showResult();			
		} while(this.isResumed()); 
	} 

	private boolean isResumed() { 
		String answer;
		Console console = new Console(); 
		do { 
			console.out("¿Quieres continuar? (s/n): ");
			answer = console.inString(); 
		} while (!answer.equals("s") && !answer.equals("n")); 
		return answer.equals("s");
	} 

	public static void main(String[] args) {
		new Mastermind().play(); 
	} 
}