package model;

import java.util.List;
import java.util.Observable;

import contract.IElement;
import contract.INonHeroMobile;

public interface IMap {

	IElement getOnTheMapXY(int x, int y);
	List<INonHeroMobile> getBoulAndDia();

	void setMobileHasChanged();

	Observable getObservable();
}
