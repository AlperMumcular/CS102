import java.util.Scanner;
import javax.swing.*;
   
/**
 * Pot Luck Game
 * @author Alper Mumcular
 * @version 27.11.2020
 */ 
public class PotLuckTest
{
   public static void main( String[] args )
   {
      Scanner scan = new Scanner( System.in );

      // variables
      int row;
      JFrame frame = new JFrame("Button Matrix Game");
      
      // program code
      System.out.print( "Please insert the dimension of the pot luck game" );
      row = scan.nextInt();
      frame.getContentPane().add(new PotLuckPanel(row));
      frame.pack();
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
      
   }
}