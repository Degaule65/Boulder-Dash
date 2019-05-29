package model.motionless;

import contract.ObjectType;
import contract.Sprite;
import model.Map;

public class Wall extends MotionlessElement {

	public static final char fileSym = '=';
	private static final Sprite SPRITE = new Sprite(Wall.fileSym, "images/" + Map.getStyle() + "/wall.png");

	public Wall() {
		super(SPRITE, ObjectType.WALL);
	}
}
