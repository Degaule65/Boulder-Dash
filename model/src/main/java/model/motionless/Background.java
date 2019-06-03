package model.motionless;

import contract.ObjectType;
import contract.Sprite;
import model.Map;

/**
 * @author Degaule65
 * 
 *         Configuration of the background which is corresponding to the
 *         background of the game, it is traversable by any object as well as
 *         the character. It is configured with a single sprite. In addition, we
 *         have assigned it a " " symbol which will later allow us to convert
 *         between the symbol and her sprite. The sprite is associated with an
 *         image in relation to the getStyle() which allows us to have a
 *         different sprite for each map. It has its own permissions.
 */

public class Background extends MotionlessElement {

	public static final char fileSym = ' ';
	private static final Sprite SPRITE = new Sprite(Background.fileSym, "images/" + Map.getStyle() + "/background.gif");

	/**
	 * @author Degaule65
	 *
	 *         This method allows to set the background with a sprite and a type
	 *         (its permability)
	 *
	 */
	public Background() {
		super(SPRITE, ObjectType.BACKGROUND);
	}
}
