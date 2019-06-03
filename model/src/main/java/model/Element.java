package model;

import java.awt.Image;

import contract.IElement;
import contract.ObjectType;
import contract.Sprite;

public abstract class Element implements IElement {

	/** The sprite */
	private Sprite sprite;

	/** The type */
	private ObjectType objectType;

	/**
	 * Create an element with a sprite and a type
	 * 
	 * @param sprite     the element sprite
	 * @param objectType the element type
	 */
	public Element(Sprite sprite, ObjectType objectType) {
		this.setObjectType(objectType);
		this.setSprite(sprite);
	}

	/**
	 * Gets the sprite.
	 * 
	 * @return the sprite
	 */
	@Override
	public Sprite getSprite() {
		return sprite;
	}

	/**
	 * Sets the sprite.
	 * 
	 * @param sprite the new sprite
	 */
	protected void setSprite(Sprite sprite) {
		this.sprite = sprite;
	}

	/**
	 * Gets the image
	 * 
	 * @return the image
	 */
	@Override
	public Image getImage() {
		return this.sprite.getImage();
	}

	/**
	 * Gets the object type.
	 * 
	 * @return the object type
	 */
	@Override
	public ObjectType getObjectType() {
		return this.objectType;
	}

	/**
	 * Sets the object type.
	 * 
	 * @param objectType the new type
	 */
	public void setObjectType(ObjectType objectType) {
		this.objectType = objectType;
	}
}
