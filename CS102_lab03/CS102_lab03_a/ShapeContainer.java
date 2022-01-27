import java.util.ArrayList;
/**
 * ShapeContainer Class
 * @author Alper Mumcular
 * @date 05.11.2020
 */
public class ShapeContainer 
{
   // properties
   private ArrayList<Shape> shapes;

   // constructors
   public ShapeContainer() {
      shapes = new ArrayList<Shape>();
   }
   
   // methods
   public void add(Shape s) {
      shapes.add(s);
   }
   
   public Shape contains( int x, int y ){
      for ( Shape i: shapes ){
         if ( i.contains( x, y ) != null )
            return i;
      }
         return null;
   }
   
   public void removeSelectedOnes() {
      for( int i = 0; i < shapes.size(); i++ ) {
         if(shapes.get(i).getSelected()) {
            shapes.remove(i);
            i--;
         }
      }
   }
   
   public double getArea() {
      double area;
      area = 0;
      for( Shape a: shapes ) {
         area += a.getArea();
      }
      return area;
   }
   
   public double getPerimeter() {
      double perimeter;
      perimeter = 0;
      for( Shape a: shapes ) {
         perimeter += a.getPerimeter();
      }
      return perimeter;
   }
   
   public String toString() {
      String s = "";
      for( Shape a: shapes ) {
         s += a.toString();
      }
      return s;
   }
   
}