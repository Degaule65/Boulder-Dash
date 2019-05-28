package model.motionless;

import model.ObjectType;
import model.Sprite;

public class Wall extends MotionlessElement {

	private static final Sprite SPRITE = new Sprite(':', "/image/wall.png");
	
	public Wall() {
		super(SPRITE ,ObjectType.WALL);
	}
}
