package model.mobile;

import java.io.IOException;

import contract.ObjectType;
import contract.Sprite;

public class Diamond extends NonHeroMobile {

	private static final Sprite SPRITE = new Sprite('R', "main/images/diament/Diament.gif");
	
	public Diamond(Sprite sprite, ObjectType objectType) throws IOException {
		super(SPRITE, ObjectType.DIAMOND);
		sprite.loadImage();
	}

}
