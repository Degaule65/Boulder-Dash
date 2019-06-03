package model.motionless;

import contract.ObjectType;
import contract.Sprite;
import model.Map;

/**
 * @author Degaule65
 * 
 *         Configuration of the Background which is a traversable element, it is
 *         configured with a single sprite. In addition, It has its own
 *         permissions
 */

public class Background extends MotionlessElement {
	/**
	 * we have assigned it a " " symbol that will later allow us to associate the
	 * symbol and the image
	 */
	public static final char fileSym = ' ';
	/**
	 * representation of the path to find the GIF in the MVC files.
	 */
	private static final Sprite SPRITE = new Sprite(Background.fileSym, "images/" + Map.getStyle() + "/background.gif");

	/**
	 * Background configuration (with its sprite and permability)
	 */
	public Background() {
		super(SPRITE, ObjectType.BACKGROUND);
	}
}
