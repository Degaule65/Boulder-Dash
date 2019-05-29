package model.motionless;

import contract.ObjectType;
import contract.Sprite;
import model.Map;

public class Background extends MotionlessElement {

	public static final char fileSym = ' ';
	private static final Sprite SPRITE = new Sprite(Background.fileSym, "images/" + Map.getStyle() + "/background.png");

	public Background() {
		super(SPRITE, ObjectType.BACKGROUND);
	}
}
