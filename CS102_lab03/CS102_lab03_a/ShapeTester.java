import java.util.Scanner;

/**
 * A program tests the all interfaces and subclasses of Shape class and Shape class. 
 * @author Alper Mumcular
 * @version 05.11.2020
 */ 
public class ShapeTester
{
   public static void main( String[] args )
   {
      Scanner scan = new Scanner( System.in );

      // constants

      // variables
      int option;
      int shapeOption;
      ShapeContainer shapes = new ShapeContainer();
      Shape shape;
      int radius;
      int a,b,c;
      int width, height;
      int x, y;

      // program code
      do {
         System.out.println( "1- Create an empty set of shapes" );
         System.out.println( "2- Add shape " );
         System.out.println( "3- Compute & print out the total surface area of the entire set of shapes, and perimeter" );
         System.out.println( "4- Information about all of the shapes in the container " );
         System.out.println( "5- Find the first Shape that contains a given x, y point  " );
         System.out.println( "6- Remove all selected shapes from the set of shapes. " );
         System.out.println( "7- Exit. " );
         option = scan.nextInt();
         if( option == 1 ) {
            shapes = new ShapeContainer();
         }
         else if( option == 2 ) {
            System.out.println("What type of shape do you want to add\n1-Rectangle\n2-Circle\n3-Square\n4-Triangle");
            do {
                shapeOption = scan.nextInt();
                if( shapeOption == 1 ) {
                   System.out.print( "width, length, x, y:" );
                   width = scan.nextInt();
                   height = scan.nextInt();
                   x = scan.nextInt();
                   y = scan.nextInt();
                   shapes.add( new Rectangle( width, height, x, y) );
                }
                else if( shapeOption == 2 ) {
                   System.out.print("radius, x, y:");
                   radius = scan.nextInt();
                   x = scan.nextInt();
                   y = scan.nextInt();
                   shapes.add( new Circle( radius, x, y ) );
                }
                else if( shapeOption == 3 ) {
                   System.out.print("side length, x, y:");
                   height = scan.nextInt();
                   x = scan.nextInt();
                   y = scan.nextInt();
                   shapes.add( new Square( height, x, y ) );
                }
                else if( shapeOption == 4 ) {
                   System.out.print("enter sides length, x, y:");
                   a = scan.nextInt();
                   b = scan.nextInt();
                   c = scan.nextInt();
                   x = scan.nextInt();
                   y = scan.nextInt();
                   shapes.add( new Triangle( a, b, c, x, y) );
                } 
            } while( shapeOption > 5 && shapeOption <= 0 );
         }
         else if( option == 3 ) {
            System.out.println( "Area: " + shapes.getArea() + " Perimeter: " + shapes.getPerimeter() );
         }
         else if( option == 4 ) {
            System.out.println( shapes.toString() );
         }
         else if( option == 5 ) {
            System.out.print("x and y coordinates: " );
            x = scan.nextInt();
            y = scan.nextInt();
            Shape firstContains;
            boolean found = false;
            firstContains = shapes.contains(x, y);
            if( firstContains != null ) {
               firstContains.setSelected(true);
               System.out.println("First Shape that contains the coordinates has been selected. " );                 
            }
            else
               System.out.println("No Shape contains the coordinates. " );   
         }
         else if( option == 6 ) {
            shapes.removeSelectedOnes();
            System.out.println( "Selected shapes have been removed." );
         }
         else if( option > 7 || option < 1 ){
            System.out.println( "Invalid Choice!!!" );
         }
      } while( option != 7 );
      
      System.out.println( "Goodbye." );
   } 
}