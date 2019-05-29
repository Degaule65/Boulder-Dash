package model.mobile;

import model.IFactory;

public class MobileFactory implements IFactory {

	public static Mobile createHero(int x, int y) {
		return new Hero(x, y);
	}

	public static Mobile createBoulder(int x, int y) {
		return new Boulder(x, y);
	}

	public static Mobile createDiamond(int x, int y) {
		return new Diamond(x, y);
	}

	public Mobile getFromFileSymbole(final char symbol, final int x, final int y) {
		Hero hero = new Hero(x, y);
		Boulder boulder = new Boulder(x, y);
		Diamond diamond = new Diamond(x, y);
		Mobile[] mobile = { hero, boulder, diamond };
		for (Mobile mobileElement : mobile) {
			if (mobileElement.getSprite().getStrImage() == symbol) {
				return mobileElement;
			}
		}
		return boulder;
	}
}
