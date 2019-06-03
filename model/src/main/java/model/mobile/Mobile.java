package model.mobile;

import java.awt.Point;

import contract.IMobile;
import contract.ObjectType;
import contract.Sprite;
import model.Element;
import model.IMap;


public class Mobile extends Element implements IMobile {
	private Point position = new Point();
	private IMap map;

	/**
	 * Initiates mobile elements;
	 *
	 */
	public Mobile(Sprite sprite, ObjectType objectType, int x, int y, final IMap map) {
		super(sprite, objectType);
		this.setMap(map);
		this.setX(x);
		this.setY(y);
	}
	/**
	 * Getter of the map.
	 *
	 */
	public IMap getMap() {
		return map;
	}
	/**
	 * Setter of the map.
	 *
	 */
	public void setMap(IMap map) {
		this.map = map;
	}
	/**
	 * Getter of mobile X position.
	 *
	 */
	public int getX() {
		return (int) this.position.getX();
	}
	/**
	 * Setter of mobile X position.
	 *
	 */
	public void setX(final int x) {
		this.position.x = x;
	}
	/**
	 * Getter of mobile Y position.
	 *
	 */
	public int getY() {
		return (int) this.position.getY();
	}
	/**
	 * Setter of mobile Y position.
	 *
	 */
	public void setY(final int y) {
		this.position.y = y;
	}
	/**
	 * Getter of the position of a mobile element.
	 *
	 */
	public Point getPosition() {
		return this.getPosition();
	}
	/**
	 * Setter of the position of a mobile element.
	 *
	 */
	public void setPosition(Point position) {
		this.position = position;
	}
	/**
	 * Permits to take in count that an element has changed it position.
	 *
	 */
	protected void setHasMoved() {
		this.getMap().setMobileHasChanged();
	}

}
