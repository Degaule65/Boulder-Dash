package contract;

import fr.exia.showboard.IPawn;

public interface IMobile extends IPawn, IElement {
	/**
	 * @return the X coordinate
	 */
	int getX();

	/**
	 * @return the Y coordinate
	 */
	int getY();
}
