import cs1.*;
import java.util.Arrays;

/**
 * Lab02 e
 * @author Alper Mumcular
 * @version 22.10.2020
 */ 
public class wordSearch extends HTMLFilteredReader
{
      //constructor
      public wordSearch( String url ){
         super( url );
      }
      
      /**
       * searches the word and prints its place
       * @param words --> list of words to be searched in filtered html code
       * @return
       */
      public void searchWord( String[] words ) {
         int index;
         for(int i = 0; i < words.length; i++) {
            index = this.getPageContents().indexOf( words[i] ); 
            System.out.println( "The location of " + words[i] + ": " + index );
         }
      }

}