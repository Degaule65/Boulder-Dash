package model;

import java.util.Observable;

public interface IMap {

	IElement getOnTheMapXY(int x, int y);

	void setMobileHasChanged();

	Observable getObservable();

	int height();
	int width();
}
