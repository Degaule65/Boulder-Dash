package model.motionless;

import contract.ObjectType;
import contract.Sprite;
import model.Map;

/**
 * @author Degaule65
 *
 *         Configuration of the output which allows the player to leave the
 *         game.It is configured with two different sprites ( 1 for the blocked
 *         output, when the player does not have all the pieces and the second
 *         when the player has recovered all the pieces).The two doors have
 *         different permissions, which means that it is possible to cross the
 *         exit or not.
 * 
 */
public class Exit extends MotionlessElement implements IExit {
	/**
	 * we have assigned it a "E" symbol that will later allow us to associate the
	 * symbol and the image
	 */
	public static final char fileSym = 'E';
	/**
	 * representation of the path to find GIFS in the MVC files.
	 */
	private static final Sprite SPRITE_CLOSE = new Sprite(Exit.fileSym, "images/" + Map.getStyle() + "/wall.gif");
	private static final Sprite SPRITE_OPEN = new Sprite(Exit.fileSym, "images/" + Map.getStyle() + "/exit.gif");

	/**
	 * wall configuration (with its sprite and permability)
	 */
	public Exit() {
		super(SPRITE_CLOSE, ObjectType.EXIT_CLOSE);
	}

	/**
	 * Configuration of the open method that allows the opening of the output
	 * (change of the sprite of the output as well as its permability)
	 */
	@Override
	public void open() {
		this.setSprite(SPRITE_OPEN);
		this.setObjectType(ObjectType.EXIT_OPEN);
	}
}
