/**
 * Lab02 d
 * @author Alper Mumcular
 * @version 22.10.2020
 */
public class HTMLFilteredReader extends MySimpleURLReader 
{
   // constructors
   public HTMLFilteredReader ( String url ) {
      super(url);
   }
   
   // methods
   /**
    * removes html codes on source code
    * @param 
    * @return text without html codes.
    */
   @Override
   public String getPageContents() {
      String unfilteredText;
      String filteredText;
      unfilteredText = getUnfilteredPageContents();
      filteredText = "";
      
      int endOfHTML = 0;
      int startOfHTML = unfilteredText.indexOf( "<" );
      while( startOfHTML != -1 ) // no "<" char remains.
      {
         if( startOfHTML != unfilteredText.indexOf( "</script>", endOfHTML ) )
            filteredText = filteredText + unfilteredText.substring( endOfHTML, startOfHTML );
         endOfHTML = unfilteredText.indexOf( ">", startOfHTML ) + 1;
         startOfHTML = unfilteredText.indexOf( "<", endOfHTML );
      }
      filteredText = filteredText + unfilteredText.substring( endOfHTML );
      
      return filteredText;
   }
   
   /**
    * shows all source code
    * @param 
    * @return text with html codes.
    */
   public String getUnfilteredPageContents() {
      return super.getPageContents().substring(4);
   }
}