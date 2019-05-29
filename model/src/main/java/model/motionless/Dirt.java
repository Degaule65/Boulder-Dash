package model.motionless;

import contract.ObjectType;
import contract.Sprite;
import model.Map;

public class Dirt extends MotionlessElement {

	public static final char fileSym = '/';
	private static final Sprite SPRITE = new Sprite(Dirt.fileSym, "images/" + Map.getStyle() + "/dirt.png");

	public Dirt() {
		super(SPRITE, ObjectType.DIRT);
	}
}
