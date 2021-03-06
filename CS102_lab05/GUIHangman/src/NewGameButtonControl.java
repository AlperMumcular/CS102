import java.awt.event.*;
import javax.swing.*;


/**
 * New Game Button Control class
 * @author Alper Mumcular
 * @version 03.12.2020
 */
public class NewGameButtonControl extends JButton implements ActionListener, IHangmanView {

 //VARIABLES
 HangmanModel model;

 //CONSTRUCTOR
 public NewGameButtonControl (HangmanModel model)
 {
  setText ("New Game");
  this.model = model;
  addActionListener(this);
  setEnabled(false);
 }
 
 //METHODS
 @Override
 public void actionPerformed(ActionEvent e) {
  model.initNewGame();
  setEnabled(false);
 }
 
 public void updateView(Hangman hangmanModel) {
  if ( hangmanModel.isGameOver())
     {
       setEnabled(true);
     }
 }

}
