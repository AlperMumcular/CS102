import java.awt.*;
import javax.swing.*;


/**
 * Labels Hangman View
 * @author Alper Mumcular
 * @version 03.12.2020
 */
public class LabelsHangmanView extends JPanel implements IHangmanView {

 //VARIABLES
 int tries;
 Hangman hangman;
 JLabel hasLost;
 JLabel knownSoFar;
 JLabel triesLeft;
 JLabel usedLetters;

 //CONSTRUCTOR
 public LabelsHangmanView ( Hangman hangman)
 {
  this.hangman = hangman;

  setLayout(new GridLayout(4,1));
  setBackground( new Color (0xF7C59F));
  setPreferredSize (new Dimension(400, 300));

  tries = hangman.getMaxAllowedIncorrectTries() - hangman.getNumOfIncorrectTries();

  hasLost = new JLabel ();
  hasLost.setFont(new Font("Consolas", Font.PLAIN, 50));
  hasLost.setHorizontalAlignment(JLabel.CENTER);
  
  knownSoFar = new JLabel ( hangman.getKnownSoFar() );
  knownSoFar.setFont(new Font("Consolas", Font.PLAIN, 30));
  knownSoFar.setHorizontalAlignment(JLabel.CENTER);

  triesLeft = new JLabel ( tries + " tries left" );
  triesLeft.setFont(new Font("Consolas", Font.PLAIN, 30));
  triesLeft.setHorizontalAlignment(JLabel.CENTER);

  usedLetters = new JLabel ("Used: " + hangman.getUsedLetters());
  usedLetters.setFont(new Font("Consolas", Font.PLAIN, 30));
  usedLetters.setHorizontalAlignment(JLabel.CENTER);

  add(hasLost);
  add(knownSoFar);
  add(triesLeft);
  add(usedLetters);
 }

 //METHODS
 @Override
 public void updateView(Hangman hangmanModel) {
  
  knownSoFar.setText( hangmanModel.getKnownSoFar());
  
  tries = hangman.getMaxAllowedIncorrectTries() - hangman.getNumOfIncorrectTries();
  triesLeft.setText( tries + " tries left" );
  
  usedLetters.setText("Used: " + hangman.getUsedLetters());
  
  if(hangmanModel.hasLost())
  {
   hasLost.setText("You lost.");
  }
  else if ( hangmanModel.isGameOver() && !hangmanModel.hasLost() )
  {
   hasLost.setText( "You win!!!!" );
  }
  else
  {
   hasLost.setText("");
  }
  
 }

}
