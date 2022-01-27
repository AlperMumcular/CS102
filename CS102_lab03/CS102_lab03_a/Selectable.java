/**
 * Selectable interface
 * @author Alper Mumcular
 * @date 05.11.2020
 */
public interface Selectable 
{
   boolean getSelected();
   void setSelected( boolean a );
   Shape contains( int x, int y );
}