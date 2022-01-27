/**
 * First 40 Fibonacci Numbers
 * @author Alper Mumcular
 * @version 08.10.2020
 */ 
public class Fibonacci
{
   public static void main( String[] args )
   {
      // variables
      IntBag Fib;

      // program code
      Fib = new IntBag();
      Fib.addToEnd(0);
      Fib.addToEnd(1);

      for(int i = 2; i <= 40; i++){
         Fib.addToEnd( Fib.getTheValue( i - 2 ) + Fib.getTheValue( i - 1 ) );
      }
      
      System.out.println( Fib );
   }
}