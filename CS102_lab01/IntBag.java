import java.util.*;

/**
 * IntBag class
 * @author Alper Mumcular
 * @version 08.10.2020
 */ 
public class IntBag {
   // properties
   private int[] bag;
   
   //constructor
   public IntBag() {
      bag = new int[] {-1,0,0,0};
   }
   
   //methods
   /**
    * adds the given value to the end of the array
    * @param x --> given value from the user
    */
   public void addToEnd( int x ){
      int size = this.getSize();
      if( bag[bag.length - 1] == -1 ) {
         bag = Arrays.copyOf( bag, 2 * bag.length ); 
      }
         bag[size] = x;
         bag[size + 1] = -1;
   }
   
   /**
    * adds the given value to the given particular location
    * @param index --> array location,  x --> given value from the user 
    * @return boolean result (false if index >= bag.length or x < 0)  
    */
   public boolean addToParticular( int index, int x ) {
      int size = this.getSize();
      if( index >= 0 && index <= size ) {
         if( bag[size] == -1 )
            bag = Arrays.copyOf( bag, 2 * bag.length ); 
         for( int n = size; n >= index; n-- ) {
            bag[ n + 1] = bag[n];
         }
         bag[index] = x;
         return true;
      } 
      return false;
   }
   
   /**
    * removes the given location value
    * @param index --> array location
    * @return boolean result 
    */
   public boolean remove( int index ) {
      int size = this.getSize();
      if ( index >= 0 && index < size ) {
         bag[index] = bag[ size - 1];
         bag[size - 1] = -1;
         bag[size] = 0;
         return true;    
      }
      return false;
   }
   
   /**
    * checks the array contains given value 
    * @param x --> given value from the user
    * @return boolean result (true if x >= 0)
    */
   public boolean isContains( int x ) {
      for(int i = 0; i < this.getSize(); i++ ) {
         if(bag[i] == x )
            return true;
      }
      return false;
   }
   
   
   /**
    * shows the value at particular location
    * @param index --> array location
    * @return value of the particular location (-1 if there is not such an index)
    */
   public int getTheValue( int index ) {
      if( index >= 0 && index < this.getSize() )
         return bag[index];
      return -1;
   }
   
   /**
    * Shows the number of values currently in the collection
    * 
    * @return the number of values currently in the collection
    */
   public int getSize(){
      int sizeCount = 0;
      int i = 0;
      while( bag[i] != -1 ) {
         sizeCount++;
         i++;
      }
      return sizeCount;               
   }
   
   /**
    * removes all locations which contains the given value
    * @param value --> given value from the user
    * @return boolean result
    */
   public void removeAll( int value )
   {
      for(int i = 0; i < this.getSize(); i++ ) {
         if( bag[i] == value ) {
            for( int n = i ; n < this.getSize(); n++ ) { 
               bag[n] = bag[n+1];
            }
            bag[this.getSize() + 1] = 0;
            i--;
         }
      }
   }
   
   /**
    * String representation of this class
    * 
    * @return string representation of the class
    */
   @Override
   public String toString(){
      String s;
      s = "[";
      for( int i = 0; i < this.getSize(); i++) {
            s += bag[i] + ",";
      }
      if(s.length() > 1 )
         s = s.substring(0, s.length() - 1);
      s += "]";
     return s; 
   }
   
   
}