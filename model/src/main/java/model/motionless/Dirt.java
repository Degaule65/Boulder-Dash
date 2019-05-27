package model.motionless;

import model.ObjectType;
import model.Sprite;

public class Dirt extends MotionlessElement {

	private static final Sprite SPRITE = new Sprite('/', "/image/rock.png");

	public Dirt() {
		super(SPRITE, ObjectType.DIRT);
	}
}
