import java.util.Scanner;
import java.util.Arrays;
import java.io.*;
/**
 * Lab06d 
 * @author Alper Mumcular
 * @version 10.12.2020
 */ 
public class Lab06d
{
   public static void main( String[] args )
   {
      Scanner scan = new Scanner( System.in );

      // constants

      // variables
      File file = new File("C:\\Users\\PC1\\Desktop\\kodlar");
      
      // program code
      listFile(file, 0, 1);


      System.out.println( "End." );
   }

   public static File listFile( File file, int i, int count ) {
     File[] list = file.listFiles();
     
     // base case
     if(i == list.length) {
       System.out.println();
       return null;
     }
     
     // recursive
     if( list[i].isDirectory() ) {
       System.out.println();
       System.out.println( count + "\tDirectory-" + list[i].getPath());
       listFile(list[i], 0, 1);
     }
     if(list[i].isFile()) {
       System.out.println( count + "\t\tFile-" + list[i].getPath());
     }
     
     return listFile(file, i + 1, count + 1);
   } 
}