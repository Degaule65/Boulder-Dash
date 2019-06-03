package model;

import java.util.List;
import java.util.Observable;

import contract.IElement;
import contract.IHero;
import contract.IMobile;
import model.motionless.IExit;

/**
 * @author perri
 *
 */
public interface IMap {

	/**
	 * Gets the element on the specified coordinates.
	 * 
	 * @param x the x coordinate
	 * @param y the y coordinate
	 * @return an element
	 */
	IElement getOnTheMapXY(int x, int y);

	/**
	 * Sets an element on the map to specified coordinates.
	 * 
	 * @param element the element
	 * @param x       the x coordinate
	 * @param y       the y coordinate
	 */
	void setOnTheMapXY(final IElement element, final int x, final int y);

	/**
	 * Gets the boulders and diamonds list.
	 * 
	 * @return the list containing the boulders and diamonds
	 */
	List<IMobile> getBoulAndDia();

	/**
	 * Notify the observers.
	 */
	void setMobileHasChanged();

	/**
	 * Gets the hero.
	 * 
	 * @return the hero
	 */
	IHero getHero();

	/**
	 * Return this object as an observable.
	 * 
	 * @return an observable
	 */
	Observable getObservable();

	/**
	 * Gets the width.
	 * 
	 * @return the width
	 */
	int getWidth();

	/**
	 * Gets the height.
	 * 
	 * @return the height
	 */
	int getHeight();

	/**
	 * Gets the exit
	 * 
	 * @return the exit
	 */
	IExit getExit();
}
