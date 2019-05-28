package model.mobile;

import contract.INonHeroMobile;
import contract.ObjectType;
import contract.Sprite;

public class NonHeroMobile extends Mobile implements INonHeroMobile {

	public NonHeroMobile(Sprite sprite, ObjectType objectType, final int x, final int y) {
		super(sprite, objectType, x, y);
	}

	private Boolean isFalling;

	public Boolean getIsFalling() {
		return isFalling;
	}

	public void setIsFalling(Boolean isFalling) {
		this.isFalling = isFalling;
	}

	public void moveDown() {

	}

	public void moveDownLeft() {

	}

	public void moveDownRight() {

	}
}
