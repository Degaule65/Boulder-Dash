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

	public Map(final String content) {
		this.buildMap(content);
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
	
	private void buildMap(String content) {
		
	}

	@Override
	public IElement getOnTheMapXY(int x, int y) {
		return onMap[x][y];
	}
	
	private void setOnTheMapXY(final IElement element, final int x, final int y) {
		this.onMap[x][y] = element;
	}

}
