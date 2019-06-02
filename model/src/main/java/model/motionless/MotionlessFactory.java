package model.motionless;

import model.IFactory;
import model.IMap;

/**
 * @author Degaule65
 *
 *         In this class we implemented IFactory in order to be able to use the
 *         different elements that are (background,dirt,wall and exit), we do
 *         not use this element because they are only elements that do not move
 *         they are motionless. Following this we created different methods for
 *         the creation of the background of the wall dirt as well as the
 *         output. And finally we have created another method that returns a
 *         motionless (dirt, wall or background) that corresponds to the symbol.
 *         And if he doesn't find any correspondence he gives us a background
 *         (by default)

 *
 */

public class MotionlessFactory implements IFactory {

	private static final Background background = new Background();
	private static final Dirt dirt = new Dirt();
	private static final Wall wall = new Wall();
	private static final Exit exit = new Exit();

	private static MotionlessElement[] motionlessElements = { background, dirt, wall, exit };

	public static MotionlessElement createBackground() {
		return background;
	}

	public static MotionlessElement createDirt() {
		return dirt;
	}

	public static MotionlessElement createWall() {
		return wall;
	}

	public static MotionlessElement createExit() {
		return exit;
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
