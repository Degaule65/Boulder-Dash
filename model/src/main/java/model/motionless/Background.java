package model.motionless;

import model.ObjectType;
import model.Sprite;

public class Background extends MotionlessElement {

	private static final Sprite SPRITE = new Sprite(' ', "/image/wall.jpg");

	public Background() {
		super(SPRITE, ObjectType.BACKGROUND);
	}
}
