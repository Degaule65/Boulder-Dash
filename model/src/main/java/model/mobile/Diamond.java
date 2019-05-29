package model.mobile;

import contract.ObjectType;
import contract.Sprite;
import model.IMap;
import model.Map;

public class Diamond extends NonHeroMobile {

	public static final char fileSym = '$';
	private static final Sprite SPRITE = new Sprite(Diamond.fileSym, "images/" + Map.getStyle() + "/diamond.gif");

	public Diamond(final int x, final int y, final IMap map) {
		super(SPRITE, ObjectType.DIAMOND, x, y, map);
	}

	public static void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}

}
