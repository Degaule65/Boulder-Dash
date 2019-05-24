package model.mobile;

import java.awt.Point;

public class Mobile {

	private Point position;

	public int getX() {
		return (int) this.position.getX();
	}

	public void setX(final int x) {
		this.position.x = x;

	}
}
