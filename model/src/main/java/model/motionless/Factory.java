package model.motionless;

public abstract class Factory {
	
	private static final Background background = new Background();
	private static final Dirt dirt = new Dirt();
	private static final Wall wall = new Wall();
	
	private static MotionlessElement[] motionlessElements = {background, dirt, wall};

	public static MotionlessElement createBackground() {
		return background;
	}

	public static MotionlessElement createDirt() {
		return dirt;
	}
	
	public static MotionlessElement createWall() {
		return wall;
	}
	
	public static MotionlessElement getFromFileSymbole(final char symbol) {
		for (final MotionlessElement motionlessElement : motionlessElements) {
			if (motionlessElement.getSprite().getStrImage() == symbol) {
				return motionlessElement;
			}
		}
		return background;
	}

}
