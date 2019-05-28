package contract;

import java.awt.Point;

import fr.exia.showboard.IPawn;

public interface IMobile extends IPawn, IElement {
	int getX();

	int getY();

	Point getPosition();
}
