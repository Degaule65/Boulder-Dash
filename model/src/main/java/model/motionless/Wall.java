package model.motionless;

import model.ObjectType;
import model.Sprite;

public class Wall extends MotionlessElement {

	@SuppressWarnings("unused")
	private static final Sprite SPRITE = new Sprite('/', "/image/wall.png");
	
	Wall(Sprite sprite) {
		super(sprite,ObjectType.WALL);
		// TODO Auto-generated constructor stub
	}
}
