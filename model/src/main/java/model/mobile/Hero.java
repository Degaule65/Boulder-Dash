package model.mobile;

import java.io.IOException;
import contract.IHero;
import model.IMap;
import model.ObjectType;
import model.Sprite;

public class Hero extends Mobile implements IHero {
	
	static String imageUP = "main/images/UP/UP.gif";
    static String imageDown = "main/images/DOWN/DOWN.gif";
    static String imageTurnLeft = "main/images/gauche/HeroLeft.gif";
    static String imageTurnRight = "main/images/droite/RIGHT.gif";
    static String imageNone = "main/images/héro_basique/Hero.gif";

    private static final Sprite sprite = new Sprite('H', imageNone);
    private static final Sprite spriteDown = new Sprite('H', imageDown);
    private static final Sprite spriteTurnLeft = new Sprite('H', imageTurnLeft);
    private static final Sprite spriteTurnRight = new Sprite('H', imageTurnRight);
    private static final Sprite spriteUP = new Sprite('H', imageUP);

	public Hero(final int x, final int y, final IMap map) throws IOException {
		super(sprite, ObjectType.HERO);
		spriteTurnLeft.loadImage();
		spriteTurnRight.loadImage();
		spriteUP.loadImage();
		spriteDown.loadImage();
	}
	

	public void moveUp() {

		this.setSprite(spriteUP);
		this.setY(+1);
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
	
	public Hero(Sprite sprite, ObjectType objectType) {
		super(sprite, objectType);
	}
	
}
