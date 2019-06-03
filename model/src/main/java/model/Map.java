package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Observable;

import contract.IElement;
import contract.IHero;
import contract.IMobile;
import model.mobile.Hero;
import model.mobile.Mobile;
import model.motionless.Exit;
import model.motionless.IExit;
import model.motionless.MotionlessElement;
import model.motionless.MotionlessFactory;

/**
 * The Class Map.
 */

public class Map extends Observable implements IMap {

	/** The width */
	private int width;

	/** The height */
	private int height;

	/** The style */
	private static int style;

	/** The map array */
	private IElement[][] onMap;

	/** The pawn list */
	private List<IMobile> boulAndDia = new ArrayList<IMobile>();

	/** The hero */
	private IHero hero;

	/** The exit */
	private IExit exit;

	/**
	 * Initialize and build the map.
	 * 
	 * @param content the string representing the map
	 * @param width   the width
	 * @param height  the height
	 * @param style   the style
	 */
	public Map(final String content, final int width, final int height, final int style) {
		this.setWidth(width);
		this.setHeight(height);
		Map.setStyle(style);
		this.onMap = new IElement[width][height];
		this.buildMap(content);
	}

	/**
	 * Notify the observers.
	 */
	@Override
	public void setMobileHasChanged() {
		this.setChanged();
		this.notifyObservers();
	}

	/**
	 * Return this object as an observable.
	 */
	@Override
	public Observable getObservable() {
		return this;
	}

	/**
	 * Builds the map from the string.
	 * 
	 * @param content the string representing the map
	 */
	private void buildMap(String content) {
		List<String> rows = Arrays.asList(content.split(";"));
		int x = 0;
		int y = 0;
		for (String row : rows) {
			for (char symbol : row.toCharArray()) {
				Element element = AbstractFactory.getFactory(symbol).getFromFileSymbole(symbol, x, y, this.getMap());
				if (element instanceof MotionlessElement) {
					this.setOnTheMapXY(element, x, y);
					if (element instanceof Exit) {
						this.setExit((IExit) element);
					}
				} else if (element instanceof Mobile) {
					this.setOnTheMapXY(MotionlessFactory.createBackground(), x, y);
					if (element instanceof Hero) {
						this.setHero((Hero) element);
					} else {
						boulAndDia.add((IMobile) element);
					}
				}
				x = x + 1;
			}
			y = y + 1;
			x = 0;
		}
	}

	/**
	 * Gets the element on the specified coordinates.
	 * 
	 * @param x the x coordinate
	 * @param y the y coordinate
	 */
	@Override
	public IElement getOnTheMapXY(int x, int y) {
		return onMap[x][y];
	}

	/**
	 * Sets an element on the map to specified coordinates.
	 * 
	 * @param element the element
	 * @param x       the x coordinate
	 * @param y       the y coordinate
	 */
	public void setOnTheMapXY(final IElement element, final int x, final int y) {
		this.onMap[x][y] = element;
	}

	/**
	 * Gets the map's array.
	 * 
	 * @return the map
	 */
	public IElement[][] getOnMap() {
		return onMap;
	}

	/**
	 * Gets the boulders and diamonds list.
	 * 
	 * @return the list containing the boulders and diamonds
	 */
	public List<IMobile> getBoulAndDia() {
		return boulAndDia;
	}

	/**
	 * Gets the map.
	 * 
	 * @return the map
	 */
	public IMap getMap() {
		return this;
	}

	/**
	 * Gets the hero.
	 * 
	 * @return the hero
	 */
	public IHero getHero() {
		return hero;
	}

	/**
	 * Sets the hero.
	 * 
	 * @param hero the new hero
	 */
	public void setHero(IHero hero) {
		this.hero = hero;
	}

	/**
	 * Gets the width.
	 * 
	 * @return the width
	 */
	public int getWidth() {
		return width;
	}

	/**
	 * Sets the width.
	 * 
	 * @param width the new width
	 */
	public void setWidth(int width) {
		this.width = width;
	}

	/**
	 * Gets the height.
	 * 
	 * @return the height
	 */
	public int getHeight() {
		return height;
	}

	/**
	 * Sets the height.
	 * 
	 * @param heigth the new height
	 */
	public void setHeight(int heigth) {
		this.height = heigth;
	}

	/**
	 * Gets the style.
	 * 
	 * @return the style
	 */
	public static int getStyle() {
		return style;
	}

	/**
	 * Sets the style.
	 * 
	 * @param style the new style
	 */
	public static void setStyle(int style) {
		Map.style = style;
	}

	/**
	 * Gets the exit
	 * 
	 * @return the exit
	 */
	public IExit getExit() {
		return exit;
	}

	/**
	 * Sets the exit.
	 * 
	 * @param exit the new exit
	 */
	public void setExit(IExit exit) {
		this.exit = exit;
	}

}
