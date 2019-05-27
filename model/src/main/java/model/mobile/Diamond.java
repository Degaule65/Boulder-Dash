package model.mobile;

import java.io.IOException;

import model.ObjectType;
import model.Sprite;

public class Diamond extends NonHeroMobile {

	private static final Sprite sprite = new Sprite('R', "Diamond.gif");
	
	public Diamond() throws IOException {
		super(sprite, ObjectType.DIAMOND);
		sprite.loadImage();
	}

}
