import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


/**
 * Text Field Control Panel class
 * @author Alper Mumcular
 * @version 03.12.2020
 */
public class TextFieldControlPanel extends JPanel implements ActionListener {

 //VARIABLES
 Hangman hangman;

 JTextField text;

 //CONSTRUCTOR
 public TextFieldControlPanel (Hangman hangman)
 {
  this.hangman = hangman;

  text = new JTextField(20);
  text.setBackground( new Color(0x9EC5AB) );
  text.addActionListener(this);
  
  setBackground(new Color(0x32746D));
  add(text);
 }
 
 //METHODS
 @Override
 public void actionPerformed(ActionEvent e) {
  
  String textEntered = ((JTextField)e.getSource()).getText();
  
  for (int x = 0; x < textEntered.length() && !hangman.isGameOver(); x++)
  {
   hangman.tryThis(textEntered.charAt(x));
  }
  
  ((JTextField)e.getSource()).setText("");
  
 }

}
