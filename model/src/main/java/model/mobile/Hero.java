package model.mobile;

import model.ObjectType;
import model.Sprite;

public class Hero extends Mobile {
	
	private static final Sprite sprite = new Sprite('R', "Hero.gif");

	public Hero() {
		super(sprite, ObjectType.HERO);
	}

	public void moveUp() {

	}

	public void moveDown() {

	}

	public void moveRight() {

	}

	public void moveLeft() {

	}
}
