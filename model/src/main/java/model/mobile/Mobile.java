package model.mobile;

import java.awt.Point;
import model.Map;
import model.Sprite;

public class Mobile {

	private Point position;

	public int getX() {
		return (int) this.position.getX();
	}

	public void setX(final int x) {
		this.position.x = x;

	}

	public int getY() {
		return (int) this.position.getY();
	}

	public void setY(final int y) {
		this.position.y = y;

	}

	public Point getPosition() {
		return null;
	}

	public void setPosition(Point position) {

	}

	public void Mobile(Sprite sprite, Map map) {

	}
}
