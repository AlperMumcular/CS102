import java.awt.*;


/**
 * GUIHangman - GUI based MVC test for cs102 Hangman & IHangmanSetup
 *
 * @author Alper Mumcular
 * @version 03/12/2020
 */

public class GUIHangman
{
 public GUIHangman()
 {
     System.out.println( "Start of GUIHangman\n");

  HangmanModel  hangman;
  IHangmanSetup  basicSetup;
  ConsoleHangmanView consoleView;
  TextFieldControlPanel   textPanel;
  NewGameButtonControl newGame;
  LabelsHangmanView labelsHangman;
  GallowsHangmanView gallowsHangman;
  HangmanLetterButtonControls buttons;
  
  basicSetup = new BasicSetup();
  hangman = new HangmanModel( basicSetup);

  consoleView = new ConsoleHangmanView();
  hangman.addView( consoleView);

  textPanel = new TextFieldControlPanel( hangman );
  
  newGame = new NewGameButtonControl( hangman );
  hangman.addView(newGame);
  
  labelsHangman = new LabelsHangmanView(hangman);
  hangman.addView(labelsHangman);
  
  gallowsHangman = new GallowsHangmanView(hangman);
  hangman.addView(gallowsHangman);
  
  buttons = new HangmanLetterButtonControls( hangman.getAllLetters(), hangman );
  buttons.addActionListener(buttons);
  hangman.addView(buttons);
  
  new SimpleJFrame( "GUIHangman",  // title
       gallowsHangman,   // center
       textPanel, newGame,  // north, south
       buttons, labelsHangman ); // east, west

  // this is an infinite loop reading from the console... not clever!
  ConsoleControl.controlFor( hangman);
 }

 public static void main( String[] args)
 {
  new GUIHangman();

//  // This is the approved way to initialise GUIs
//  // but won't work with the ConsoleControl as is!
//  // --------------------------------------------
//  SwingUtilities.invokeLater(
//   new Runnable() {
//       public void run() {
//           new GUIHangman();
//           new GUIHangman();
//       }
//   });
 }

} // end of class GUIHangman
