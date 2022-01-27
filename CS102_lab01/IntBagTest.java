import java.util.Scanner;

/**
 * Test IntBag class 
 * @author Alper Mumcular
 * @version 04.10.2020
 */ 
public class IntBagTest
{
   public static void main( String[] args )
   {
      Scanner scan = new Scanner( System.in );

      // variables
      IntBag bag;
      int option, index, value;
      
      // program code
      bag = new IntBag();
      do {
         System.out.println( "1. Create a new empty collection(any previous values are lost!)" );
         System.out.println( "2. Read a set of positive values into the collection(use zero to " +
                            "indicate all the values have been entered.)" );
         System.out.println( "3. Print the collection of values." );
         System.out.println( "4. Add a value to the collection of values at a specified location" );
         System.out.println( "5. Remove tha value at a specified location from the collection of values" );
         System.out.println( "6. Remove all instances of a value within the collection" );
         System.out.println( "7. Quit the program." ); // menu
         option = scan.nextInt();
         if(option == 1 ) // option 1
            bag = new IntBag();
         else if(option == 2 ) { // option 2
            System.out.print( "Enter a set of positive values: " );
            do{
               value = scan.nextInt();
               if( value > 0 )
                  bag.addToEnd( value );
            } while ( value != 0 );
         }
         else if(option == 3 ) // option 3
            System.out.println(bag);
         else if(option == 4 ) { // option 4
            System.out.print( "(index, value)" );
            index = scan.nextInt();
            value = scan.nextInt();
            bag.addToParticular( index, value );
         }
         else if(option == 5 ) { // option 5
            System.out.print( "(index)" );
            index = scan.nextInt();
            bag.remove( index );
         }
         else if(option == 6 ) { // option 6
            System.out.print( "(value)" );
            value = scan.nextInt();
            bag.removeAll( value );
         }
         System.out.println();
      } while( option != 7 ); // option 7 (end)
      System.out.println( "Goodbye!" ); 
   }

}