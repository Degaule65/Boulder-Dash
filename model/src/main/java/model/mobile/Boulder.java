package model.mobile;

import contract.ObjectType;
import contract.Sprite;
import model.IMap;

public class Boulder extends NonHeroMobile {

	public static final char fileSym = 'o';
	private static final Sprite SPRITE = new Sprite(Boulder.fileSym, "images/pierre/ROCK.gif");

	public Boulder(final int x, final int y, final IMap map) {
		super(SPRITE, ObjectType.BOULDER, x, y, map);
		this.setX(x);
		this.setY(y);
	}

}
