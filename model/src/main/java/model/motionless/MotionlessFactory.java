package model.motionless;

import model.IFactory;
import model.IMap;

public class MotionlessFactory implements IFactory {

	private static final Background background = new Background();
	private static final Dirt dirt = new Dirt();
	private static final Wall wall = new Wall();

	private static MotionlessElement[] motionlessElements = { background, dirt, wall };

	public static MotionlessElement createBackground() {
		return background;
	}

	public static MotionlessElement createDirt() {
		return dirt;
	}

	public static MotionlessElement createWall() {
		return wall;
	}

	public MotionlessElement getFromFileSymbole(final char symbol, final int x, final int y, final IMap map) {
		for (final MotionlessElement motionlessElement : motionlessElements) {
			if (motionlessElement.getSprite().getStrImage() == symbol) {
				return motionlessElement;
			}
		}
		return background;
	}

}
