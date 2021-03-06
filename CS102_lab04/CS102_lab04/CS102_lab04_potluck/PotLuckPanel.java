import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
/**
 * PotLuckPanel class
 * Alper Mumcular
 * 27.11.2020
 */
public class PotLuckPanel extends JPanel
{
   // properties
   private int column, row;
   private JButton[] buttons, bombs;
   private int noOfGuesses;
   private JButton prize;
   private JLabel label;
   
   // constructors
   public PotLuckPanel( int row ) {
      this.column = row;
      this.row = row;
      buttons = new JButton[this.row*this.column];
      buttonCreator();
      createComponents(row, column);
      this.prize = choosePrizeButton();
      this.bombs = chooseBombButtons(prize);
      this.noOfGuesses = 0;
   }
   
   // methods
   private void createComponents( int row, int column) {
      setBackground(Color.green);
      this.setLayout(new BorderLayout());
      
      JPanel panel = new JPanel();
      panel.setPreferredSize(new Dimension(130*this.row,40));
      panel.setBackground(Color.yellow);
      
      label = new JLabel(Integer.toString(noOfGuesses) );
      panel.add(label);
      this.add(panel, BorderLayout.NORTH);
      
      JPanel panel2 = new JPanel();
      panel2.setLayout(new GridLayout(row, column, 20, 10));
      panel2.setBackground(Color.gray);
      
      ActionListener listener = new ClickListener();
      for(int i = 0; i < buttons.length; i++) {
         panel2.add(buttons[i]);
         buttons[i].addActionListener(listener);
      }
      this.add(panel2, BorderLayout.CENTER);
   }
   
   private void buttonCreator() {
      for(int i = 0; i < buttons.length; i++) {
         buttons[i] = new JButton("Pot " + (i+1) );
         buttons[i].setPreferredSize( new Dimension(120, 60) );
      }
   }
   
   private JButton choosePrizeButton() {
      return buttons[(int) (Math.random()*16)];
   }
   
   private JButton[] chooseBombButtons( JButton prize ) {
      int bombCount = 0;
      JButton[] bomb = new JButton[2];
      for(int i =(int) (Math.random() * 16); bombCount < 2; i =(int) (Math.random() * 16)) {
         if( bombCount == 0 ) {
            if( buttons[i] != prize ) {
               bomb[0] = buttons[i];
               bombCount++;
            }
         }
         else
            if(buttons[i] != prize && buttons[i] != bomb[0]) {
            bomb[1] = buttons[i];
            bombCount++;
         }
      }
      return bomb;
   }
   
   class ClickListener implements ActionListener{
      public void actionPerformed(ActionEvent event) {
         noOfGuesses++;
         label.setText(Integer.toString(noOfGuesses));
         if(event.getSource() == prize ) {
            label.setText("Hurray!! Prize Found in " + noOfGuesses + " !");
            for( int i = 0 ; i < buttons.length ; i++) {
               buttons[i].setEnabled(false);
            }
         }
         else if(event.getSource() == bombs[0]) {
            label.setText("Sorry! You are blown up at attempt " + noOfGuesses + " !");
            for( int i = 0 ; i < buttons.length ; i++) {
               buttons[i].setEnabled(false);
            }
         }
         else if(event.getSource() == bombs[1]) {
            label.setText("Sorry! You are blown up at attempt " + noOfGuesses + " !");
            for( int i = 0 ; i < buttons.length ; i++) {
               buttons[i].setEnabled(false);
            }
         }
      }
   }
}