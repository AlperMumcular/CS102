import java.util.ArrayList;
import cs102.*;

/**
 * HangmanModel class
 *
 * @author Alper Mumcular
 * @version 03.12.2020
 */
public class HangmanModel extends Hangman {

	ArrayList<IHangmanView> views;

	public HangmanModel( IHangmanSetup setup ) {
		super(setup);
		views = new ArrayList<IHangmanView>();
	}

	public void addView( IHangmanView view ){
		views.add( view );
	}

	public void update() {
		if (views != null) {
			for (int i = 0; i < views.size(); i++) {
				views.get(i).updateView( this );
			}
		}
	}

	@Override
	public void initNewGame() {
		super.initNewGame();
		update();
	}

	@Override
	public int tryThis( char letter ) {
		int result;
		result = super.tryThis( letter );
		update();
		return result;
	}

}