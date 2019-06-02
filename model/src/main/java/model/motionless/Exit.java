package model.motionless;

import contract.ObjectType;
import contract.Sprite;
import model.Map;

public class Exit extends MotionlessElement {
	public static final char fileSym = 'E';
	private static final Sprite SPRITE_CLOSE = new Sprite(Exit.fileSym, "images/" + Map.getStyle() + "/wall.png");
	private static final Sprite SPRITE_OPEN = new Sprite(Exit.fileSym, "images/" + Map.getStyle() + "/exit.gif");

	public Exit() {
		super(SPRITE_CLOSE, ObjectType.EXIT_CLOSE);
	}
	
	public void open() {
		this.setSprite(SPRITE_OPEN);
		this.setObjectType(ObjectType.EXIT_OPEN);
	}
}
