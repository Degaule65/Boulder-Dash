package model.mobile;

import contract.ObjectType;
import contract.Sprite;
import model.IMap;
import model.Map;

/**
 * @author Tanguy
 * 
 * This class initiates the Boulder with is fileSym used to construct the map and it Sprite and initiates the coords of the boulders.
 *
 */
public class Boulder extends NonHeroMobile {

	public static final char fileSym = 'o';
	private static final Sprite SPRITE = new Sprite(Boulder.fileSym, "images/" + Map.getStyle() + "/boulder.gif");

	public Boulder(final int x, final int y, final IMap map) {
		super(SPRITE, ObjectType.BOULDER, x, y, map);
		this.setX(x);
		this.setY(y);
	}

}
