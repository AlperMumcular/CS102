import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
/**
 * SOS Game
 * @author Alper Mumcular
 * @version 27.11.2020
 */ 
public class SOSGame
{
   public static void main( String[] args )
   {
      // variables
      JFrame frame = new JFrame("SOS Game");
      JPanel panel = new JPanel();
            
      // program code 
      int size;
      do {
         size = Integer.parseInt(JOptionPane.showInputDialog( "Board Size")); 
      } while (size < 3 || size > 10);
      
      String player1 = JOptionPane.showInputDialog("Please enter first player's name:");
      String player2 = JOptionPane.showInputDialog("Please enter second player's name:");
      SOS game = new SOS(size);
      
      panel.setLayout( new BorderLayout());
      panel.add(new SOSGUIPanel( game, player1, player2), BorderLayout.CENTER);
      frame.add(panel); 
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
      frame.pack();
      frame.setVisible(true);  
   }
}