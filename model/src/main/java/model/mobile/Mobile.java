package model.mobile;

import java.awt.Point;

import contract.IMobile;
import model.Element;
import model.ObjectType;
import model.Sprite;

public class Mobile extends Element implements IMobile {
	private Point position;

	public Mobile(Sprite sprite, ObjectType objectType) {
		super(sprite, objectType);
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
