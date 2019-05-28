package model.mobile;

import contract.ObjectType;
import contract.Sprite;

public class Boulder extends NonHeroMobile {

	public static final char fileSym = 'o';
	private static final Sprite SPRITE = new Sprite(Boulder.fileSym, "main/images/pierre/ROCK.gif");

	public Boulder(final int x, final int y) {
		super(SPRITE, ObjectType.BOULDER, x, y);
		SPRITE.loadImage();
		this.setX(x);
		this.setY(y);
	}

}
