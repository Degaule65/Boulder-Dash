package model.motionless;

import contract.ObjectType;
import contract.Sprite;
import model.Map;

/**
 * @author Degaule65
 * 
 *         Configuration of the Dirt which isn't a traversable element you have
 *         to dig it out , it is configured with a single sprite. In addition,
 *         It has its own permissions
 */
public class Dirt extends MotionlessElement {
	/**
	 * we have assigned it a "+" symbol that will later allow us to associate the
	 * symbol and the image
	 */
	public static final char fileSym = '+';

	/**
	 * representation of the path to find the GIF in the MVC files.
	 */
	private static final Sprite SPRITE = new Sprite(Dirt.fileSym, "images/" + Map.getStyle() + "/dirt.gif");
	/**
	 * Dirt configuration (with its sprite and permability)
	 */
	public Dirt() {
		super(SPRITE, ObjectType.DIRT);
	}
}
