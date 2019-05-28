package model;

import java.util.Arrays;
import java.util.List;
import java.util.Observable;

import model.mobile.Mobile;
import model.motionless.Factory;
import model.motionless.MotionlessElement;

/**
 * The Class Map.
 *
 * @author [enter name]
 */

public class Map extends Observable implements IMap {

	public static final int width = 40;
	public static final int heigth = 30;
	public static final int STYLE = 1;
	private IElement[][] onMap = new IElement[width][heigth];

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
		List<String> rows = Arrays.asList(content.split(";"));
		int x = 0;
		int y = 0;
		for (String row : rows) {
			for (char symbol : row.toCharArray()) {
				Element element = Factory.getFromFileSymbole(symbol);
				if (element instanceof MotionlessElement) {
					this.setOnTheMapXY(element, x, y);
				} else if (element instanceof Mobile) {
					this.setOnTheMapXY(Factory.createBackground(), x, y);
				}
				x = x + 1;
			}
			y = y + 1;
			x = 0;
		}
	}

	@Override
	public IElement getOnTheMapXY(int x, int y) {
		return onMap[x][y];
	}

	private void setOnTheMapXY(final IElement element, final int x, final int y) {
		this.onMap[x][y] = element;
	}

	public IElement[][] getOnMap() {
		return onMap;
	}

}
