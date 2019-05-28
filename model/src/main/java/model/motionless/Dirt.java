package model.motionless;

import contract.ObjectType;
import contract.Sprite;

public class Dirt extends MotionlessElement {

	public static final char fileSym = '/';
	private static final Sprite SPRITE = new Sprite(Dirt.fileSym, "/image/rock.png");

	public Dirt() {
		super(SPRITE, ObjectType.DIRT);
	}
}
