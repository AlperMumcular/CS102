import java.util.ArrayList;
import java.util.Iterator;

/**
 * A program tests the IntBagIterator class and iterator interface
 * @author Alper Mumcular
 * @version 05.11.2020
 */ 
public class TestIterators
{
   public static void main( String[] args )
   {
      IntBag bag = new IntBag();
      //  … insert some elements
      for( int i = 1; i < 5; i++ ) {
         bag.addToEnd(i);
      }
      
      Iterator i, j;
      i = bag.iterator();
      while ( i.hasNext() )
      {
         System.out.println( i.next() );
         j = bag.iterator();
         while ( j.hasNext() )
         {
            System.out.println( "--" + j.next() );
         }
      }
   }

}