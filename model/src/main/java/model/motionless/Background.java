package model.motionless;

import contract.ObjectType;
import contract.Sprite;
import model.Map;

/**
 * @author Degaule65
 * 
 * 
 *         Configuration of the background which is corresponding to the
 *         background of the game, it is traversable by any object as well as
 *         the character. It is configured with a single sprite. In addition, we
 *         have assigned it a"" symbol which will later allow us to convert
 *         between the symbol and the sprite. It has its own permissions.
 */
public class Background extends MotionlessElement {

	public static final char fileSym = ' ';
	private static final Sprite SPRITE = new Sprite(Background.fileSym, "images/" + Map.getStyle() + "/background.png");

	public Background() {
		super(SPRITE, ObjectType.BACKGROUND);
	}
}
