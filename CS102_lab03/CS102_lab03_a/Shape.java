/**
 * Shape Class
 * @author Alper Mumcular
 * @date 05.11.2020
 */
public abstract class Shape implements Locatable, Selectable
{
   // instances
   private int x, y;
   private boolean isSelected = false;
   
   // methods
   public abstract double getArea();
   public abstract double getPerimeter();
   public abstract String toString();
   
   public void setLocation( int x, int y){
      this.x = x;
      this.y = y;
   }
   public int getX() {
      return x;
   }
   public int getY(){
      return y;
   }
   public Shape contains( int a, int b ){
      if ( this.x == a && this.y == b )
         return this;
      else
         return null;
   }
   
   public boolean getSelected() {
      return isSelected;
   }
   
   public void setSelected( boolean x ) {
      isSelected = x;
   }

}