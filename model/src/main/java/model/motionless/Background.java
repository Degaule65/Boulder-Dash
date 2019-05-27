package model.motionless;

import model.ObjectType;
import model.Sprite;

public class Background extends MotionlessElement {

@SuppressWarnings("unused")
private static final Sprite SPRITE = new Sprite(' ', "/image/wall.jpg");

	Background(Sprite sprite) {
		
		super(sprite,ObjectType.BACKGROUND); 

}
}
