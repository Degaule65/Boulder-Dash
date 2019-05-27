package model;

import java.util.Observable;

/**
 * The Class Map.
 *
 * @author [enter name]
 */

public class Map extends Observable implements IMap {

	public static int width;
	public static int heigth;
	public static int STYLE = 1;
	private IElement[][] onMap;

	public void setOnMap(IElement[][] onMap) {
		this.onMap = onMap;
	}

	@Override
	public void setMobileHasChanged() {
		this.setChanged();
		this.notifyObservers();
	}

	@Override
	public Observable getObservable() {
		return this;
	}

	@Override
	public IElement getOnTheMapXY(int x, int y) {
		// TODO Auto-generated method stub
		return null;
	}

}
