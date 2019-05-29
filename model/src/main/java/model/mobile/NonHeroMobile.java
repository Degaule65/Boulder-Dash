package model.mobile;

import contract.ObjectType;
import contract.Sprite;
import model.IMap;

public class NonHeroMobile extends Mobile {

	public NonHeroMobile(Sprite sprite, ObjectType objectType, final int x, final int y, final IMap map) {
		super(sprite, objectType, x, y, map);
	}

	private Boolean isFalling;

	public Boolean getIsFalling() {
		return isFalling;
	}

	public void setIsFalling(Boolean isFalling) {
		this.isFalling = isFalling;
	}

	public void moveDown() {
		this.setHasMoved();
	}

	public void moveDownLeft() {
		this.setHasMoved();
	}

	public void moveDownRight() {
		this.setHasMoved();
	}
}
