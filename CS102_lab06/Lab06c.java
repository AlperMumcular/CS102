import java.util.Scanner;

/**
 * Recursion examples Lab06 
 * @author Alper Mumcular
 * @version 10.12.2020
 */ 
public class Lab06c
{
   public static void main( String[] args )
   {
      Scanner scan = new Scanner( System.in );

      // variables
      int n;
      
      // program code      
      System.out.print("Input: n = " );
      n = scan.nextInt();
      System.out.println(countStrings(n, "" ));
   }
   
   public static String countStrings(int n, String s) {
     // base case
     if(s.length() == 0) {
       return countStrings(n, "0") + countStrings(n, "1");
     }          
     if(n == s.length()) {
       System.out.println(s);
       return "";
     }
     //recursive
     //if last digit is 1
     if(s.charAt(s.length()-1) == '1') {
       return countStrings(n, s + "0");
     }
     
     //if last digit is 0
     return countStrings(n, s + "0") + countStrings(n, s + "1");

   }
}