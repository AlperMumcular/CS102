/**
 * Triangle Class
 * @author Alper Mumcular
 * @date 05.11.2020
 */
public class Triangle extends Shape
{
   // properties
   private int a;
   private int b;
   private int c;

   // constructors
   public Triangle( int a, int b, int c, int x, int y ) {
      this.a = a;
      this.b = b;
      this.c = c;
      setLocation(x,y);
   }
   
   // methods
   public double getArea() {
      double s;
      s = (a+b+c) / 2;
      return Math.sqrt( s * (s-a) * (s-b) * (s-c) );
   }
   
   public double getPerimeter() {
      return a+b+c;
   }
   
   public String toString() {
      String s;
      s = "\nShape Type:Triangle\tSides: " + this.a + "," + this.b+","+this.c + "\tArea: "+ getArea()+"\tPerimeter: "+ getPerimeter() 
         + "\n x and y Coordinates: (" + getX() + "," + getY() + ")5\t Is Selected?: "+ getSelected();
      return s;
   } 
}