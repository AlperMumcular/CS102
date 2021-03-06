import java.awt.event.*;
import javax.swing.*;


/**
 * Hangman Letter Button Controls class
 * @author Alper Mumcular
 * @version 03.12.2020
 */
public class HangmanLetterButtonControls extends LetterButtonControls implements IHangmanView, ActionListener{
 
 //VARIABLES
 HangmanModel model;
 
 //CONSTRUCTOR
 public HangmanLetterButtonControls(String letters, HangmanModel model) {
  super(letters);
  this.model = model;
 }
 
 //METHODS
 @Override
 public void updateView(Hangman hangmanModel) {
  
  setEnabledAll(true);
  setDisabled( hangmanModel.getUsedLetters() );
  
  if(hangmanModel.isGameOver())
  {
   setEnabledAll(false);
  }
 }

 @Override
 public void actionPerformed(ActionEvent e) {
  
  model.tryThis(e.getActionCommand().charAt(0));
  
  ((JButton) e.getSource()).setEnabled(false);
 }

}
