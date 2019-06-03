package model.mobile;

import contract.ControllerOrder;
import contract.IHero;
import contract.ObjectType;
import contract.Sprite;
import model.IMap;

/**
 * @author Tanguy
 *
 *This class associates gif to the direction of the Hero and has the methods to move the Hero and set if is alive or no.
 */
public class Hero extends Mobile implements IHero {

	private final String imageUp = "images/Hero/heroUp.gif";
	private final String imageDown = "images/Hero/heroDown.gif";
	private final String imageLeft = "images/Hero/heroLeft.gif";
	private final String imageRight = "images/Hero/heroRight.gif";
	private final static String imageNone = "images/Hero/heroStandby.gif";
	public static final char fileSym = 'H';
	private int state = 0;

	private final static Sprite sprite = new Sprite(Hero.fileSym, imageNone);
	private final Sprite spriteDown = new Sprite(Hero.fileSym, imageDown);
	private final Sprite spriteTurnLeft = new Sprite(Hero.fileSym, imageLeft);
	private final Sprite spriteTurnRight = new Sprite(Hero.fileSym, imageRight);
	private final Sprite spriteUp = new Sprite(Hero.fileSym, imageUp);

	public Hero(final int x, final int y, final IMap map) {
		super(sprite, ObjectType.HERO, x, y, map);
	}

	public void moveUp() {
			this.setY(this.getY() - 1);
			this.setHasMoved();
	}

	public void moveDown() {
			this.setY(this.getY() + 1);
			this.setHasMoved();
	}

	public void moveRight() {
			this.setX(this.getX() + 1);
			this.setHasMoved();
	}

	public void moveLeft() {
			this.setX(this.getX() - 1);
			this.setHasMoved();
	}

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

	public void setState(int state) {
		this.state = state;
	}

	@Override
	public int getState() {
		return this.state;
	}
}
