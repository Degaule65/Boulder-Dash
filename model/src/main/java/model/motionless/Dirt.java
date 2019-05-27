package model.motionless;

import model.ObjectType;
import model.Sprite;

public class Dirt extends MotionlessElement {

	@SuppressWarnings("unused")
	private static final Sprite SPRITE = new Sprite('/', "/image/rock.png");
	
	Dirt(Sprite sprite) {
		super(sprite,ObjectType.DIRT);
		// TODO Auto-generated constructor stub
	}
}
