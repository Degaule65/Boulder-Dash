package model.motionless;

import contract.ObjectType;
import contract.Sprite;
import fr.exia.showboard.ISquare;
import model.Element;

/**
 * @author Degaule65
 *
 *         This class allows us to define that each motionlesssElement has a
 *         particular sprite and a specific permability.
 */
public class MotionlessElement extends Element implements ISquare {

	MotionlessElement(final Sprite sprite, final ObjectType ObjectType) {
		super(sprite, ObjectType);
	}
}
