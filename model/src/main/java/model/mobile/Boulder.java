package model.mobile;

import model.ObjectType;
import model.Sprite;

public class Boulder extends NonHeroMobile {

	private static final Sprite sprite = new Sprite('R', "Boulder.gif");
	
	public Boulder(Sprite sprite, ObjectType objectType) {
		super(sprite, objectType);
	}

}
