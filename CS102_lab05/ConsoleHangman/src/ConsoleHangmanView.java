import cs102.*;

/**
 * ConsoleHangmanView class
 *
 * @author Alper Mumcular
 * @version 03.12.2020
 */
public class ConsoleHangmanView implements IHangmanView {
	
	private int triesLeft;
	
	@Override
	public void updateView(Hangman hangman) {
		
		triesLeft = hangman.getMaxAllowedIncorrectTries() - hangman.getNumOfIncorrectTries();
		
		System.out.println("Secret Word: " + hangman.getKnownSoFar() );
		System.out.println("You have " + triesLeft + " tries left.");
		System.out.println("Used Letters: " + hangman.getUsedLetters() );
		System.out.println();
		
		if ( hangman.isGameOver() ) {
			if ( hangman.hasLost() )
				System.out.println( "You lost.");
			else
				System.out.println( "You win!");		
		}	
	
	}
}
