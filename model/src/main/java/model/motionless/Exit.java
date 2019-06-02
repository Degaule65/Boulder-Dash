package model.motionless;

import contract.ObjectType;
import contract.Sprite;
import model.Map;

public class Exit extends MotionlessElement {
	public static final char fileSym = 'E';
	private static final Sprite SPRITE = new Sprite(Dirt.fileSym, "images/" + Map.getStyle() + "/exit.gif");

	public Exit() {
		super(SPRITE, ObjectType.DIRT);
	}
}
