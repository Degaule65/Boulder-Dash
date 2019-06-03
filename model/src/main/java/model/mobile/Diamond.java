package model.mobile;

import contract.ObjectType;
import contract.Sprite;
import model.IMap;
import model.Map;

public class Diamond extends NonHeroMobile {

	// variables corresponding to the Diamond symbol on the source map and to the Sprite of the Diamond.
	public static final char fileSym = '$';
	private static final Sprite SPRITE = new Sprite(Diamond.fileSym, "images/" + Map.getStyle() + "/diamond.gif");

	//Initiate the coords of the diamond.
	public Diamond(final int x, final int y, final IMap map) {
		super(SPRITE, ObjectType.DIAMOND, x, y, map);
	}

}
