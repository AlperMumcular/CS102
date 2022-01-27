import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

/**
 * SOSCanvas class
 * @author Alper Mumcular
 * @version 27.11.2020
 */ 
public class SOSCanvas extends JPanel 
{
   // properties
   private SOS game;
   
   // constructors
   public SOSCanvas( SOS game ) {
      this.game = game;
      setBackground(Color.orange);
      setPreferredSize(new Dimension(30 + (100*game.getDimension()),30+(100*game.getDimension())));
   }
   
   // methods
   public void paintComponent(Graphics g) {
      super.paintComponent(g);
      
      int x = 20;
      int y = 20;
      for(int i = 0; i < game.getDimension(); i++) {
         g.drawRect(x,(100*i)+y,100,100);
         for(int n = 0; n < game.getDimension(); n++) {
            g.drawRect(x+(100*n), (100*i)+y, 100,100);
         }
      }
      
      String letter;
      letter = "";
      g.setFont(new Font("Times New Roman", Font.BOLD, 80) );
      for(int i = 0; i < game.getDimension(); i++) {
         for(int n = 0; n < game.getDimension(); n++) {
            if(game.getCellContents(i,n) == 'o' || game.getCellContents(i,n) == 's'){
               letter += game.getCellContents(i,n);
               g.drawString( letter,x+35+(100*n), (100*i)+y+65);
               letter = "";
            }
         }
      }
   }
}