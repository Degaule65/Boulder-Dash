package model.mobile;

import contract.IHero;
import contract.ObjectType;
import contract.Sprite;
import model.IMap;

public class Hero extends Mobile implements IHero {

	static String imageUP = "images/UP/UP.gif";
	static String imageDown = "images/DOWN/DOWN.gif";
	static String imageTurnLeft = "images/gauche/HeroLeft.gif";
	static String imageTurnRight = "images/droite/RIGHT.gif";
	static String imageNone = "images/héro_basique/Hero.gif";
	public static final char fileSym = 'H';

	private static final Sprite sprite = new Sprite(Hero.fileSym, imageNone);
	private static final Sprite spriteDown = new Sprite(Hero.fileSym, imageDown);
	private static final Sprite spriteTurnLeft = new Sprite(Hero.fileSym, imageTurnLeft);
	private static final Sprite spriteTurnRight = new Sprite(Hero.fileSym, imageTurnRight);
	private static final Sprite spriteUP = new Sprite(Hero.fileSym, imageUP);

	public Hero(final int x, final int y, final IMap map) {
		super(sprite, ObjectType.HERO, x, y, map);
		spriteTurnLeft.loadImage();
		spriteTurnRight.loadImage();
		spriteUP.loadImage();
		spriteDown.loadImage();
	}

	public void moveUp() {
		this.setSprite(spriteUP);
		this.setY(this.getY()-1);
		this.setHasMoved();
	}

	public void moveDown() {
		this.setSprite(spriteDown);
		this.setY(this.getY()+1);
		this.setHasMoved();
	}

	public void moveRight() {
		this.setSprite(spriteTurnRight);
		this.setX(this.getX()+1);
		this.setHasMoved();
	}

	public void moveLeft() {
		this.setSprite(spriteTurnLeft);
		this.setX(this.getX()-1);
		this.setHasMoved();
	}

}
