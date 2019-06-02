package model.mobile;

import contract.ObjectType;
import contract.Sprite;
import model.IMap;

/**
 * @author Tanguy
 * 
 *  This class contains methods which are functions of diamonds and boulders.
 *
 */

public class NonHeroMobile extends Mobile {

	public NonHeroMobile(Sprite sprite, ObjectType objectType, final int x, final int y, final IMap map) {
		super(sprite, objectType, x, y, map);
	}

	private boolean isFalling;

	public boolean getIsFalling() {
		return isFalling;
	}

	public void setIsFalling(boolean isFalling) {
		this.isFalling = isFalling;
	}

	public void moveDown() {
		this.setY(this.getY() + 1);
		this.setIsFalling(true);
		this.setHasMoved();
	}

	public void moveLeft() {
		this.setX(this.getX() - 1);
		this.setHasMoved();
	}

	public void moveRight() {
		this.setX(this.getX() + 1);
		this.setHasMoved();
	}
}
