/**
 * Rectangle Class
 * @author Alper Mumcular
 * @date 05.11.2020
 */
public class Rectangle extends Shape
{
   // properties
   int width;
   int height;

   // constructors
   public Rectangle( int width, int height, int x, int y ) {
      this.width = width;
      this.height = height;
      setLocation(x,y);
   }
   
   // methods
   public double getArea() {
      return this.width*this.height;
   }
   
   public double getPerimeter() {
      return 2*(this.width*this.height);
   }

   public String toString() {
      String s;
      s = "\nShape Type:Rectangle\theight: " + this.height + "\twidth: "+ this.width +"\tArea: "+ getArea()+"\tPerimeter: "+ getPerimeter() 
         + "\n x and y Coordinates: (" + getX() + "," + getY() + ")\t Is Selected?: "+ getSelected();
      return s;
   }
}