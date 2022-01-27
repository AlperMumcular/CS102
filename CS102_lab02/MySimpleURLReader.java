import cs1.*;
import java.util.ArrayList;
/**
 * Lab02 b
 * @author Alper Mumcular
 * @version 22.10.2020
 */ 
public class MySimpleURLReader extends SimpleURLReader 
{  
   //properties 
   String url;
   
   //constructor
   public MySimpleURLReader ( String url ) {
      super(url);
      this.url = url;
   }
   
   // get methods
   public String getURL() {
      return this.url;
   }
   
   /**
    * gets the filename part of the url 
    * @param 
    * @return filename part of the url
    */
   public String getName() {
      String name;
      name = "";
      for( int i = url.length() - 1; i >= 0 ; i--) {
         if(url.charAt(i) == '/' ) {
            name = url.substring(i+1);
            i = 0;
         }
      }
      return name;
   }
   
   /**
    * shows how many css links does html code contains
    * @param 
    * @return number of css links.
    */
   public int getNumberOfCSSLinks() {
      ArrayList<String> links = new ArrayList<String>();
      String  content;
      int countOfCSSLinks, index, end, startOfLink, endOfLink;
      index = 0;
      countOfCSSLinks = 0;
      content = super.getPageContents().substring(4);
      while( content.indexOf( "<link", index ) != -1 && index != -1 )
      {
         startOfLink = content.indexOf( "<link", index );
         endOfLink = content.indexOf( ">" , startOfLink ) + 1;
         String link = content.substring( startOfLink, endOfLink );
         links.add( link );
         index = endOfLink;
      }
      
      for(int i = 0 ; i < links.size() ; i++ )
      {
         if( links.get( i ).contains(".css") )
            countOfCSSLinks++;
      }
      return countOfCSSLinks;
   }
   

}