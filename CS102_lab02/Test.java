/**
 * Lab02 f
 * @author Alper Mumcular
 * @version 22.10.2020
 */ 
public class Test
{
   public static void main( String[] args )
   {
      // PART B. Testing MySimpleURLReader
      MySimpleURLReader a = new MySimpleURLReader("http://www.cs.bilkent.edu.tr/~ozturk/cs102/scrapethissite.html");
      System.out.println(a.getURL());
      System.out.println(a.getName());
      System.out.println( "Page Contents: \n" + a.getPageContents().substring(4));
      System.out.println( "Line Count: " + a.getLineCount() );
      System.out.println("--------------------------------------------------End of Part B--------------------------------------------------");
      
      // PART C. Testing MySimpleURLReader getNumberOfCSSLinks() method
      System.out.println( "Number of CSS links: " + a.getNumberOfCSSLinks());
      System.out.println("--------------------------------------------------End of Part C--------------------------------------------------");
      
      // PART D. Testing HTMLFilteredReader 
      HTMLFilteredReader b = new HTMLFilteredReader( "http://www.cs.bilkent.edu.tr/~ozturk/cs102/scrapethissite.html" );
      System.out.println(b.getPageContents());
      System.out.println("--------------------------------------------------End of Part D--------------------------------------------------");
      
      // PART E. Testing wordSearch class
      String[] words = new String[] { "Turkey", "Ankara" };
      wordSearch c = new wordSearch( "http://www.cs.bilkent.edu.tr/~ozturk/cs102/scrapethissite.html");
      c.searchWord( words );      
   }
}