package model.mobile;

import contract.ObjectType;
import contract.Sprite;
import model.IMap;

/**
 * 
 * This class contains methods which are functions of diamonds and boulders.
 *
 */

public class NonHeroMobile extends Mobile {

	public NonHeroMobile(Sprite sprite, ObjectType objectType, final int x, final int y, final IMap map) {
		super(sprite, objectType, x, y, map);
	}

	/**
	 * Creation of the boolean variable isFalling.
	 *
	 */
	private boolean isFalling;

	/**
	 * Getter of isFalling.
	 *
	 */
	public boolean getIsFalling() {
		return isFalling;
	}

	/**
	 * Setter of isFalling.
	 *
	 */
	public void setIsFalling(boolean isFalling) {
		this.isFalling = isFalling;
	}

	/**
	 * Moves down an element.
	 *
	 */
	public void moveDown() {
		this.setY(this.getY() + 1);
		this.setIsFalling(true);
		this.setHasMoved();
	}

	/**
	 * Moves to the left an element.
	 *
	 */
	public void moveLeft() {
		this.setX(this.getX() - 1);
		this.setHasMoved();
	}

	/**
	 * Moves to the right an element.
	 *
	 */
	public void moveRight() {
		this.setX(this.getX() + 1);
		this.setHasMoved();
	}
}
