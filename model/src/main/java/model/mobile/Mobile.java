package model.mobile;

import java.awt.Point;

import contract.IMobile;
import contract.ObjectType;
import contract.Sprite;
import model.Element;

public class Mobile extends Element implements IMobile {
	private Point position = new Point();

	public Mobile(Sprite sprite, ObjectType objectType, int x, int y) {
		super(sprite, objectType);
		this.setX(x);
		this.setY(y);
	}

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
		return this.getPosition();
	}

	public void setPosition(Point position) {
		this.position = position;
	}

}
