/**
 * Square Class
 * @author Alper Mumcular
 * @date 05.11.2020
 */
public class Square extends Rectangle 
{
   // properties
   
   // constructors
   public Square( int side, int x, int y ) {
      super(side, side, x, y );
   }
   
   // methods
   public String toString() {
      String s;
      s = "\nShape Type:Square\tside: " + this.height + "\tArea: "+ getArea()+"\tPerimeter: "+ getPerimeter() 
         + "\n x and y Coordinates: (" + getX() + "," + getY() + ")\t Is Selected?: "+ getSelected();
      return s;
   } 
}