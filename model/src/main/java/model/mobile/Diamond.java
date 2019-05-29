package model.mobile;

import contract.ObjectType;
import contract.Sprite;
import model.IMap;

public class Diamond extends NonHeroMobile {

	public static final char fileSym = '$';
	private static final Sprite SPRITE = new Sprite(Diamond.fileSym, "images/diament/Diament.gif");

	public Diamond(final int x, final int y, final IMap map) {
		super(SPRITE, ObjectType.DIAMOND, x, y, map);
		this.setX(x);
		this.setY(y);
	}

	public static void setVisible(boolean b) {
		return;
	}

}
