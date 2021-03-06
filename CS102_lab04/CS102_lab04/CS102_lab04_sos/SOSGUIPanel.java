import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
/**
 * SOSGUIPanel
 * @author Alper Mumcular
 * @version 27.11.2020
 */ 
public class SOSGUIPanel extends JPanel 
{
   // properties
   private SOS game;
   private SOSCanvas canvas;
   private String player1, player2;
   private int score1, score2;
   private JComboBox<Character> combo;
   private JPanel panel = new JPanel();
   private JLabel label = new JLabel();
   private JLabel label2 = new JLabel();

   // constructors
   public SOSGUIPanel(SOS game, String p1, String p2) {
      this.game = game;
      this.canvas = new SOSCanvas(game);
      this.player1 = p1;
      this.player2 = p2;
      this.score1 = game.getPlayerScore1();
      this.score2 = game.getPlayerScore2();
      setPreferredSize(new Dimension(50 + (100*game.getDimension()),100+(100*game.getDimension())));
      createComponents();
   }
   
   // methods
   public void createComponents(){
      this.setLayout( new BorderLayout());
      this.add(canvas, BorderLayout.CENTER);
      
      label.setText(player1 + ":" + score1);
      label.setForeground(Color.red);
      panel.add(label); 
      
      combo = new JComboBox<Character>(new Character[] { 's', 'o' });
      panel.add(combo);
      
      label2.setText(player2 + ":" + score2);
      panel.add(label2);
      
      this.add(panel, BorderLayout.SOUTH);
      MouseListener listener = new MyMouseListener();
      canvas.addMouseListener(listener);
   }
   
   class MyMouseListener implements MouseListener {
      public void mousePressed(MouseEvent event) {}
      public void mouseEntered(MouseEvent event) {}
      public void mouseReleased(MouseEvent event) {}
      public void mouseExited(MouseEvent event) {}
      
      public void mouseClicked(MouseEvent event) {
         for(int i = 0; i < game.getDimension(); i++ ) {
            for(int n = 0; n < game.getDimension(); n++) {
               if(event.getX() > 20+(100*i) && event.getX() < 120+(100*i) && event.getY() > 20+(100*n) && event.getY() < 120+(100*n)){                 
                  game.play( (char) combo.getSelectedItem(), n + 1, i + 1);
                  score1 = game.getPlayerScore1(); 
                  label.setText(player1 + ":" + score1);
                  score2 = game.getPlayerScore2();
                  label2.setText(player2 + ":" + score2);
                  
                  if(game.getTurn() == 1 ) {
                     label.setForeground(Color.red);
                     label2.setForeground(Color.black);
                  }
                  else {
                     label.setForeground(Color.black);
                     label2.setForeground(Color.red);
                  }
                  
                  repaint();
                  if(game.isGameOver()) {
                     if(game.getPlayerScore1() > game.getPlayerScore2()) {
                        JOptionPane.showMessageDialog(new JFrame(""), "Winner is " + player1 + "!", "Game Over", JOptionPane.WARNING_MESSAGE);
                     }
                     else if(game.getPlayerScore2() > game.getPlayerScore1()) {
                        JOptionPane.showMessageDialog(new JFrame(""), "Winner is " + player2 + "!", "Game Over", JOptionPane.WARNING_MESSAGE);
                     }
                     else 
                        JOptionPane.showMessageDialog(new JFrame(""), "It's a draw!", "Game Over", JOptionPane.WARNING_MESSAGE);
                  }
               }
            }
         }
      }
   }
}