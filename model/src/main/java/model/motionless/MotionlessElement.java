package model.motionless;

import fr.exia.showboard.ISquare;
import model.Element;
import model.ObjectType;
import model.Sprite;

public class MotionlessElement extends Element implements ISquare{

	MotionlessElement(final Sprite sprite, final ObjectType ObjectType) {
		super(sprite, ObjectType);
	}
}
