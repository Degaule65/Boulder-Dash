package model.motionless;

import contract.ObjectType;
import contract.Sprite;
import model.Map;

/**
 * @author Degaule65
 *
 *
 *         Configuration of the output which allows the player to leave the
 *         game, it is configured with two different sprites( 1 for the blocked
 *         output, when the player does not have all the pieces and the second
 *         when the player has recovered all the pieces). In addition we assign
 *         it a symbol "E" which will later allow us to convert between the symbol
 *         and the sprite. The two doors have different permissions, which means
 *         that it is possible to cross the exit or not.
 * 
 */
public class Exit extends MotionlessElement implements IExit {
	public static final char fileSym = 'E';
	private static final Sprite SPRITE_CLOSE = new Sprite(Exit.fileSym, "images/" + Map.getStyle() + "/wall.png");
	private static final Sprite SPRITE_OPEN = new Sprite(Exit.fileSym, "images/" + Map.getStyle() + "/exit.gif");

	public Exit() {
		super(SPRITE_CLOSE, ObjectType.EXIT_CLOSE);
	}

	@Override
	public void open() {
		this.setSprite(SPRITE_OPEN);
		this.setObjectType(ObjectType.EXIT_OPEN);
	}
}
