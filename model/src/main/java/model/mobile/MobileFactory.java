package model.mobile;

import model.IFactory;
import model.IMap;



public class MobileFactory implements IFactory {
	
	/**
	 * Creates the Hero.
	 */
	public static Mobile createHero(int x, int y, final IMap map) {
		return new Hero(x, y, map);
	}
	/**
	 * Creates a boulder.
	 */
	public static Mobile createBoulder(int x, int y, final IMap map) {
		return new Boulder(x, y, map);
	}
	/**
	 * Creates a diamond.
	 */
	public static Mobile createDiamond(int x, int y, final IMap map) {
		return new Diamond(x, y, map);
	}

	/**
	 * Compare symbols to sprites and then return the right mobile element.
	 *
	 */
	public Mobile getFromFileSymbole(final char symbol, final int x, final int y, final IMap map) {
		Hero hero = new Hero(x, y, map);
		Boulder boulder = new Boulder(x, y, map);
		Diamond diamond = new Diamond(x, y, map);
		Mobile[] mobile = { hero, boulder, diamond };
		for (Mobile mobileElement : mobile) {
			if (mobileElement.getSprite().getStrImage() == symbol) {
				return mobileElement;
			}
		}
		return boulder;
	}
}
