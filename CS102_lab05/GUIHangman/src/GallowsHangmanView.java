import java.awt.*;
import javax.swing.*;


/**
 * Gallows Hangman View class
 * @author Alper Mumcular
 * @version 03.12.2020
 */
public class GallowsHangmanView extends JPanel implements IHangmanView {
 
 //VARIABLES
 Hangman hangman;

 //CONSTRUCTOR
 public GallowsHangmanView ( Hangman hangman )
 {
  this.hangman = hangman;
  this.setPreferredSize( new Dimension(260,400));
  setBackground(new Color(0x767B91));
 }

 //METHODS
 
 //Paints the gallows and the body.
 @Override
 public void paintComponent(Graphics g)
 {
  super.paintComponent(g);

  //Drawing the gallows
  g.setColor( new Color(0x35281D) );
  
  g.fillRect(30, 320, 200, 30);
  g.fillRect(50, 110, 20, 230);
  g.fillRect(50, 110, 100, 20);
  g.fillRect(140, 110, 10, 60);
  
  //Drawing the body parts
  if(hangman.getNumOfIncorrectTries() > 0)
  {
   g.drawOval(125, 170, 40, 40);
  }

  if(hangman.getNumOfIncorrectTries() > 1)
  {
   g.drawLine(145, 210, 145, 260);
  }

  if(hangman.getNumOfIncorrectTries() > 2)
  {
   g.drawLine(145,220,120,240);
  }

  if(hangman.getNumOfIncorrectTries() > 3)
  {
   g.drawLine(145,220,170,240);
  }

  if(hangman.getNumOfIncorrectTries() > 4)
  {
   g.drawLine(145,260,120,280);
  }

  if(hangman.getNumOfIncorrectTries() > 5)
  {
   g.drawLine(145,260,170,280);
  }
 }
 
 @Override
 public void updateView(Hangman hangman)
 {
  this.hangman = hangman;
  repaint();
 }

}
