package model;


/**
 * The Class Map.
 *
 * @author [enter name]
 */

public class Map implements IMap {
	
	private int width;
	private int heigth;
	private IElement[][] onMap;
	
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeigth() {
		return heigth;
	}
	public void setHeigth(int heigth) {
		this.heigth = heigth;
	}
	public IElement[][] getOnMap() {
		return onMap;
	}
	public void setOnMap(IElement[][] onMap) {
		this.onMap = onMap;
	}
	
	private void loadMap(String);

}
