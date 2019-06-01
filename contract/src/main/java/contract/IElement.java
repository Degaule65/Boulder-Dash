package contract;

import java.awt.Image;

import fr.exia.showboard.ISquare;

public interface IElement extends ISquare {

	public Sprite getSprite();

	public ObjectType getObjectType();

	public Image getImage();

}
