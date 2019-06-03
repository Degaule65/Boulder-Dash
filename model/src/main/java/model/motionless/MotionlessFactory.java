package model.motionless;

import model.IFactory;
import model.IMap;

/**
 * @author Degaule65
 *
 *         In this class we implemented IFactory in order to be able to use the
 *         different elements that are (background,dirt,wall and exit), we do
 *         not use this element because they are only elements that do not move
 *         they are motionless.
 */

public class MotionlessFactory implements IFactory {

	/**
	 * Instantiation of a background to be used later
	 */
	private static final Background background = new Background();
	/**
	 * Instantiation of a dirt to be used later
	 */
	private static final Dirt dirt = new Dirt();
	/**
	 * Instantiation of a wall to be used later
	 */
	private static final Wall wall = new Wall();
	/**
	 * Instantiation of a Exit to be used later
	 */
	private static final Exit exit = new Exit();

	/**
	 * 
	 * define in an array of the different elements as motionlessElements
	 * 
	 */
	private static MotionlessElement[] motionlessElements = { background, dirt, wall, exit };

	/**
	 * we created method for the creation of the background.
	 * 
	 * @return background
	 */
	public static MotionlessElement createBackground() {
		return background;
	}

	/**
	 * we created method for the creation of the dirt.
	 * 
	 * @return dirt
	 */
	public static MotionlessElement createDirt() {
		return dirt;
	}

	/**
	 * we created method for the creation of the wall.
	 * 
	 * @return wall
	 */
	public static MotionlessElement createWall() {
		return wall;
	}

	/**
	 * we created method for the creation of the exit.
	 * 
	 * @return exit
	 */
	public static MotionlessElement createExit() {
		return exit;
	}

	/**
	 * finally we have created another method that returns a motionless (dirt, wall
	 * or background) that corresponds to the symbol. And if he doesn't find any
	 * correspondence he gives us a background(by default)
	 *
	 * @return motionlessElement or Background
	 */
	public MotionlessElement getFromFileSymbole(final char symbol, final int x, final int y, final IMap map) {
		for (final MotionlessElement motionlessElement : motionlessElements) {
			if (motionlessElement.getSprite().getStrImage() == symbol) {
				return motionlessElement;
			}
		}
		return background;
	}

}
