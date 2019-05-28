package model;

import java.util.Observable;

import contract.IElement;

public interface IMap {

	IElement getOnTheMapXY(int x, int y);

	void setMobileHasChanged();

	Observable getObservable();
}
