import java.util.Scanner;
import cs102.*;

/**
 * ConsoleHangman class
 *
 * @author Alper Mumcular
 * @version 03.12.2020
 */

public class ConsoleHangman
{
	public static void main( String[] args)
	{
		Scanner scan = new Scanner( System.in);

		System.out.println( "Start of ConsoleHangman\n");

		// VARIABLES
		HangmanModel model;
		String letter;


		// PROGRAM CODE
		model = new HangmanModel( new BasicSetup() );
		model.addView( new ConsoleHangmanView() );
		model.addView( new ConsoleHangmanView() );

		System.out.println( "Secret Word: " + model.getKnownSoFar() );
		System.out.println( "Max Incorrect tries: " + model.getMaxAllowedIncorrectTries() );

		do
		{
			System.out.print("Please enter a letter: ");
			do 
			{
				letter = scan.nextLine();

				if( letter.equals( "" ) )
					System.out.println( "Please enter a letter: " );

			} while( letter.equals( "" ) );

			model.tryThis(letter.charAt(0));
			
		} while( !model.isGameOver() );

		System.out.println( "\nEnd of ConsoleHangman\n" );
	}

} // end of class ConsoleHangman
	
