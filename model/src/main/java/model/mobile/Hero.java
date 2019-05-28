package model.mobile;

import contract.IHero;
import contract.ObjectType;
import contract.Sprite;

public class Hero extends Mobile implements IHero {

	static String imageUP = "main/images/UP/UP.gif";
	static String imageDown = "main/images/DOWN/DOWN.gif";
	static String imageTurnLeft = "main/images/gauche/HeroLeft.gif";
	static String imageTurnRight = "main/images/droite/RIGHT.gif";
	static String imageNone = "main/images/héro_basique/Hero.gif";
	public static final char fileSym = 'H';

	private static final Sprite sprite = new Sprite(Boulder.fileSym, imageNone);
	private static final Sprite spriteDown = new Sprite(Boulder.fileSym, imageDown);
	private static final Sprite spriteTurnLeft = new Sprite(Boulder.fileSym, imageTurnLeft);
	private static final Sprite spriteTurnRight = new Sprite(Boulder.fileSym, imageTurnRight);
	private static final Sprite spriteUP = new Sprite(Boulder.fileSym, imageUP);

	public Hero(final int x, final int y) {
		super(sprite, ObjectType.HERO, x, y);
		spriteTurnLeft.loadImage();
		spriteTurnRight.loadImage();
		spriteUP.loadImage();
		spriteDown.loadImage();
	}

	public void moveUp() {

		this.setSprite(spriteUP);
		this.setY(-1);
	}

	public void moveDown() {

		this.setSprite(spriteDown);
		this.setY(+1);

	}

	public void moveRight() {

		this.setSprite(spriteTurnRight);
		this.setX(+1);

	}

	public void moveLeft() {

		this.setSprite(spriteTurnLeft);
		this.setX(-1);

	}

}
