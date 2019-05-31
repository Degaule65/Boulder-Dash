package model.mobile;

import contract.IElement;
import contract.IHero;
import contract.ObjectType;
import contract.Sprite;
import model.IMap;

public class Hero extends Mobile implements IHero {
	
	

	private final static String imageUp = "images/Hero/heroUp.gif";
	private final static String imageDown = "images/Hero/heroDown.gif";
	private final static String imageLeft = "images/Hero/heroLeft.gif";
	private final static String imageRight = "images/Hero/heroRight.gif";
	private final static String imageNone = "images/Hero/heroStandby.gif";
	public static final char fileSym = 'H';

	private static final Sprite sprite = new Sprite(Hero.fileSym, imageNone);
	private static final Sprite spriteDown = new Sprite(Hero.fileSym, imageDown);
	private static final Sprite spriteTurnLeft = new Sprite(Hero.fileSym, imageLeft);
	private static final Sprite spriteTurnRight = new Sprite(Hero.fileSym, imageRight);
	private static final Sprite spriteUP = new Sprite(Hero.fileSym, imageUp);

	public Hero(final int x, final int y, final IMap map) {
		super(sprite, ObjectType.HERO, x, y, map);
	}

	public void moveUp() {
		IElement element = this.getMap().getOnTheMapXY(this.getX(), this.getY() - 1);

		if (element.getObjectType() == ObjectType.DIAMOND) {
			this.setSprite(spriteUP);
			this.setY(this.getY() + 1);
			this.setHasMoved();
		} else if (element.getObjectType() == ObjectType.BOULDER) {
			this.setSprite(spriteUP);
		} else if (element.getObjectType() == ObjectType.WALL) {
			this.setSprite(spriteUP);
		} else {
			this.setSprite(spriteUP);
			this.setY(this.getY() - 1);
			this.setHasMoved();
		}
	}

	public void moveDown() {
		IElement element = this.getMap().getOnTheMapXY(this.getX(), this.getY() + 1);
		
		if (element.getObjectType() == ObjectType.DIAMOND) {
			this.setSprite(spriteDown);
			Diamond.setVisible(false); 
		} else if (element.getObjectType() == ObjectType.BOULDER) {
			this.setSprite(spriteDown);
		} else if (element.getObjectType() == ObjectType.WALL) {
			this.setSprite(spriteDown);
		} else {
			this.setSprite(spriteDown);
			this.setY(this.getY() + 1);
			this.setHasMoved();
		}

	}

	public void moveRight() {
		IElement element = this.getMap().getOnTheMapXY(this.getX() + 1, this.getY());
		
		if (element.getObjectType() == ObjectType.DIAMOND) {
			this.setSprite(spriteTurnRight);
			Diamond.setVisible(false); 
		} else if (element.getObjectType() == ObjectType.BOULDER) {
			this.setSprite(spriteTurnRight);
		} else if (element.getObjectType() == ObjectType.WALL) {
			this.setSprite(spriteTurnRight);
		} else {
			this.setSprite(spriteTurnRight);
			this.setX(this.getX() + 1);
			this.setHasMoved();
		}
	}

	public void moveLeft() {
		IElement element = this.getMap().getOnTheMapXY(this.getX() - 1, this.getY());
		
		if (element.getObjectType() == ObjectType.DIAMOND) {
			this.setSprite(spriteTurnLeft);
			
		} else if (element.getObjectType() == ObjectType.BOULDER) {
			this.setSprite(spriteTurnLeft);
		} else if (element.getObjectType() == ObjectType.WALL) {
			this.setSprite(spriteTurnLeft);
		} else {
			this.setSprite(spriteTurnLeft);
			this.setX(this.getX() - 1);
			this.setHasMoved();
		}

	}
}
