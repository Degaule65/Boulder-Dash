package model.motionless;

import contract.ObjectType;
import contract.Sprite;
import fr.exia.showboard.ISquare;
import model.Element;

public class MotionlessElement extends Element implements ISquare{

	MotionlessElement(final Sprite sprite, final ObjectType ObjectType) {
		super(sprite, ObjectType);
	}
}
