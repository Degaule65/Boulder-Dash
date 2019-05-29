package model.mobile;

import contract.ObjectType;
import contract.Sprite;

public class Diamond extends NonHeroMobile {

	public static final char fileSym = '$';
	private static final Sprite SPRITE = new Sprite(Diamond.fileSym, "/images/diament/Diament.gif");

	public Diamond(final int x, final int y) {
		super(SPRITE, ObjectType.DIAMOND, x, y);
		SPRITE.loadImage();
	}

}
