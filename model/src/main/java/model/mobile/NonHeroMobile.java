package model.mobile;

import contract.ObjectType;
import contract.Sprite;

public class NonHeroMobile extends Mobile {
	

	public NonHeroMobile(Sprite sprite, ObjectType objectType) {
		super(sprite, objectType);
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
