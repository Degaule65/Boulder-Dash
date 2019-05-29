package model;

import java.util.List;
import java.util.Observable;

import contract.IElement;
import contract.IHero;
import contract.IMobile;

public interface IMap {

	IElement getOnTheMapXY(int x, int y);

	List<IMobile> getBoulAndDia();

	void setMobileHasChanged();

	IHero getHero();

	Observable getObservable();

	int getWidth();

	int getHeigth();
}
