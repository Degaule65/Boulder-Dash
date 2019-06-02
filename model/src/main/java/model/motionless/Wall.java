package model.motionless;

import contract.ObjectType;
import contract.Sprite;
import model.Map;

/**
 * @author Degaule65
 *
 *Configuration of the Wall which isn't a traversable element, it is
 *         configured with a single sprite. In addition, we have assigned it
 *         a"=" symbol which will later allow us to make the conversion between
 *         the symbol and the sprite. It has its own permissions
 */
public class Wall extends MotionlessElement {

	public static final char fileSym = '=';
	private static final Sprite SPRITE = new Sprite(Wall.fileSym, "images/" + Map.getStyle() + "/wall.png");

	public Wall() {
		super(SPRITE, ObjectType.WALL);
	}
}
