package model;

/**
 * Represents the factory
 * 
 * @author perri
 *
 */
public interface IFactory {
	/**
	 * This function give the element corresponding to a symbole.
	 * 
	 * @param symbol the symbol to test
	 * @param x      the x coordinate
	 * @param y      the y coordinate
	 * @param iMap   the map
	 * @return the element
	 */
	public Element getFromFileSymbole(final char symbol, final int x, final int y, IMap iMap);
}
