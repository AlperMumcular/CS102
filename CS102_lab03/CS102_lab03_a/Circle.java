/**
 * Circle Class
 * @author Alper Mumcular
 * @date 05.11.2020
 */
public class Circle extends Shape 
{
   // properties
   private int radius;

   // constructors
   public Circle( int r, int x, int y ) {
      this.radius = r;
      setLocation(x,y);
   }
   
   // methods
   public double getArea() {
      return Math.PI*Math.pow(this.radius, 2);
   }
   
   public double getPerimeter() {
      return 2*Math.PI*this.radius;
   }
   
   public String toString() {
      String s;
      s = "\nShape Type:Circle\tRadius: " + this.radius + "\tArea: "+ getArea()+"\tPerimeter: "+ getPerimeter() 
         + "\n x and y Coordinates: (" + getX() + "," + getY() + ")\t Is Selected?: "+ getSelected();
      return s;
   }
}