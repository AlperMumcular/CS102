import java.util.Scanner;

/**
 * Recursion examples Lab06 
 * @author Alper Mumcular
 * @version 10.12.2020
 */ 
public class Lab06
{
   public static void main( String[] args )
   {
      Scanner scan = new Scanner( System.in );
      
      // program code
      System.out.print( "Input: " );
      System.out.println("Output: " + length(scan.nextLine() ));
   }
   
   public static int length( String s ) {
     // base case
     if(s.length() == 0)
       return 0;
     
     // recursive
       return 1 + length( s.substring(1) );
     
   }
}