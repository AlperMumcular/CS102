import java.util.Iterator;
import java.util.Scanner;
import java.util.ArrayList;

/**
 * A program tests the IntBagStepIterator class and iterator interface
 * @author Alper Mumcular
 * @version 05.11.2020
 */ 
public class TestStepIterator
{
   public static void main( String[] args )
   {
      Scanner scan = new Scanner(System.in);
      
      // variables
      IntBag a = new IntBag();
      int m;
      Iterator i;
      ArrayList<Integer> list = new ArrayList<Integer>();

      // program code
      System.out.print("Step Size: ");
      m = scan.nextInt();
      
      for(int n = 1; n <= 20; n++ ) {
         a.addToEnd(n);
      }
      
      i = a.iterator( m );
      
      while ( i.hasNext() ){
         list.add( (int) i.next());        
      }
      System.out.println( list.toString() ); 
   } 
} 
