package model.mobile;

import model.ObjectType;
import model.Sprite;

public class Diamond extends NonHeroMobile {

	private static final Sprite sprite = new Sprite('R', "Diamond.gif");
	
	public Diamond() {
		super(sprite, ObjectType.DIAMOND);
	}

}
