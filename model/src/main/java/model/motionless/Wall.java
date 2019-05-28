package model.motionless;

import contract.ObjectType;
import contract.Sprite;

public class Wall extends MotionlessElement {

	public static final char fileSym = ':';
	private static final Sprite SPRITE = new Sprite(Wall.fileSym, "/image/wall.png");

	public Wall() {
		super(SPRITE, ObjectType.WALL);
	}
}
