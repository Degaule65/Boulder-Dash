package model.motionless;

import contract.ObjectType;
import contract.Sprite;

public class Background extends MotionlessElement {

	public static final char fileSym = ' ';
	private static final Sprite SPRITE = new Sprite(Background.fileSym, "images/ground.png");

	public Background() {
		super(SPRITE, ObjectType.BACKGROUND);
	}
}
