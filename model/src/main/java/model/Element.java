package model;

import java.awt.Image;

import contract.IElement;
import contract.ObjectType;
import contract.Sprite;

public abstract class Element implements IElement {

	private Sprite sprite;
	private ObjectType objectType;

	public Element(Sprite sprite, ObjectType objectType) {
		this.setObjectType(objectType);
		this.setSprite(sprite);
	}
	
	public void setObjectType(ObjectType objectType) {
		this.objectType = objectType;
	}

	@Override
	public Sprite getSprite() {
		return sprite;
	}

	protected void setSprite(Sprite sprite) {
		this.sprite = sprite;
	}

	@Override
	public Image getImage() {
		return this.sprite.getImage();
	}

	@Override
	public ObjectType getObjectType() {
		return this.objectType;
	}

}
