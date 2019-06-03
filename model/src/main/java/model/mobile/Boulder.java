package model.mobile;

import contract.ObjectType;
import contract.Sprite;
import model.IMap;
import model.Map;


public class Boulder extends NonHeroMobile {
	
	// variables corresponding to the Boulder symbol on the source map and to the Sprite of the boulder.
	public static final char fileSym = 'o';
	private static final Sprite SPRITE = new Sprite(Boulder.fileSym, "images/" + Map.getStyle() + "/boulder.gif");

	//Initiate the coords of the boulder.
	public Boulder(final int x, final int y, final IMap map) {
		super(SPRITE, ObjectType.BOULDER, x, y, map);
		this.setX(x);
		this.setY(y);
	}

}
