package model.motionless;

import contract.ObjectType;
import contract.Sprite;
import model.Map;

/**
 * @author Degaule65
 * 
 *         Configuration of the dirt which is a traversable element, it is
 *         configured with a single sprite. In addition, we have assigned it
 *         a"/" symbol which will later allow us to make the conversion between
 *         the symbol and the sprite. It has its own permissions
 */
public class Dirt extends MotionlessElement {

	public static final char fileSym = '+';
	private static final Sprite SPRITE = new Sprite(Dirt.fileSym, "images/" + Map.getStyle() + "/dirt.gif");

	public Dirt() {
		super(SPRITE, ObjectType.DIRT);
	}
}
