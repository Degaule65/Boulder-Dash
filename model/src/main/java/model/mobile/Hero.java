package model.mobile;

import contract.ControllerOrder;
import contract.IHero;
import contract.ObjectType;
import contract.Sprite;
import model.IMap;



public class Hero extends Mobile implements IHero {

	/**
	 * Variables containing the gifs corresponding to the hero in alternative positions.
	 *
	 */
	private final String imageUp = "images/Hero/heroUp.gif";
	private final String imageDown = "images/Hero/heroDown.gif";
	private final String imageLeft = "images/Hero/heroLeft.gif";
	private final String imageRight = "images/Hero/heroRight.gif";
	private final static String imageNone = "images/Hero/heroStandby.gif";
	
	/**
	 * Variables for the Symbol representing the hero on the map source file and a state.
	 *
	 */
	public static final char fileSym = 'H';
	private int state = 0;

	/**
	 * Variable that defines the sprites for the hero.
	 *
	 */
	private final static Sprite sprite = new Sprite(Hero.fileSym, imageNone);
	private final Sprite spriteDown = new Sprite(Hero.fileSym, imageDown);
	private final Sprite spriteTurnLeft = new Sprite(Hero.fileSym, imageLeft);
	private final Sprite spriteTurnRight = new Sprite(Hero.fileSym, imageRight);
	private final Sprite spriteUp = new Sprite(Hero.fileSym, imageUp);

	public Hero(final int x, final int y, final IMap map) {
		super(sprite, ObjectType.HERO, x, y, map);
	}

	/**
	 * When the hero moves up.
	 *
	 */
	public void moveUp() {
			this.setY(this.getY() - 1);
			this.setHasMoved();
	}
	/**
	 * When the hero moves down.
	 *
	 */
	public void moveDown() {
			this.setY(this.getY() + 1);
			this.setHasMoved();
	}
	/**
	 * When the hero moves to the right.
	 *
	 */
	public void moveRight() {
			this.setX(this.getX() + 1);
			this.setHasMoved();
	}
	/**
	 * When the hero moves to the left.
	 *
	 */
	public void moveLeft() {
			this.setX(this.getX() - 1);
			this.setHasMoved();
	}
	/**
	 * Changes the sprite depending of the direction of the hero.
	 *
	 */
	public void changeSprite(ControllerOrder order) {
		switch (order) {
		case UP:
			this.setSprite(spriteUp);
			break;
		case DOWN:
			this.setSprite(spriteDown);
			break;
		case LEFT:
			this.setSprite(spriteTurnLeft);
			break;
		case RIGHT:
			this.setSprite(spriteTurnRight);
			break;
		default:
			break;
		}
	}
	/**
	 * Getter of the state.
	 *
	 */
	public void setState(int state) {
		this.state = state;
	}
	/**
	 * Setter of the state.
	 *
	 */
	@Override
	public int getState() {
		return this.state;
	}
}
