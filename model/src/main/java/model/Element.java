package model;

import java.awt.Image;

public class Element implements IElement {

	private Sprite sprite;

	public Sprite sprite() {
		return sprite;
	}

	public void sprite(Sprite sprite) {
		this.sprite = sprite;
	}

	@Override
	public Sprite getSprite() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ObjectType getObjectType() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Image getImage() {
		// TODO Auto-generated method stub
		return null;
	}

}
