import java.util.Scanner;

/**
 * Recursion examples Lab06 
 * @author Alper Mumcular
 * @version 10.12.2020
 */ 
public class Lab06b
{
   public static void main( String[] args )
   {
      Scanner scan = new Scanner( System.in );
      
      // program code
      System.out.print("Input: ");
      System.out.println( "Output: " + nonWovel(scan.nextLine()) );
   }

   
   public static int nonWovel( String s ) {
     // base case
     if(s.length() == 0)
       return 0;
     
     //recursive
     if( Character.isLetter(s.charAt(s.length()-1)) && !isVowel(s.charAt(s.length()-1)) )
       return 1 + nonWovel(s.substring(0, s.length()-1));
     else
       return nonWovel(s.substring(0, s.length()-1));
   }
   
   // helper method for part b
   public static boolean isVowel(char a) {
     a = Character.toLowerCase(a);
     return(a=='a' || a=='e' || a=='i' || a=='o' || a=='u');
   }

}