import java.util.Scanner;
import cs102.*;

/**
 * ConsoleHangman_v1 class
 *
 * @author Alper Mumcular
 * @version 03.12.2020
 */

public class ConsoleHangman_v1
{
    public static void main( String[] args)
	{
    	Scanner scan = new Scanner( System.in);

    	System.out.println( "Start of ConsoleHangman_v1\n");

		// VARIABLES
		Hangman		hangman;

		// PROGRAM CODE
		hangman = new Hangman( new BasicSetup() );

		System.out.println( hangman.getKnownSoFar() );

		// ToDo - allow user to repeatedly enter a letter and tryThis letter
		//		  then show game status, until gameover. Finally report win/lose.
		do {
			System.out.println("All Letters:" + hangman.getAllLetters());
			System.out.println("Used Letters:" + hangman.getUsedLetters());
			System.out.print("Incorrect tries:" + hangman.getNumOfIncorrectTries() + "\t" );
			System.out.println("Max Incorrect tries:" + hangman.getMaxAllowedIncorrectTries());
			System.out.println("Secret word: " + hangman.getKnownSoFar());
			System.out.print("Try this: ");
			hangman.tryThis(scan.nextLine().charAt(0));
			System.out.println("\n\n\n\n");
		} while (!hangman.isGameOver());
		
		if(hangman.hasLost() )
			System.out.println("You lost.");
		else
			System.out.println("You win");


		System.out.println( "\nEnd of ConsoleHangman\n" );
	}

} // end of class ConsoleHangman
