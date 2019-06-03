package contract;

import java.awt.Image;

import fr.exia.showboard.ISquare;

public interface IElement extends ISquare {

	/**
	 * @return the element's sprite
	 */
	public Sprite getSprite();

	/**
	 * @return the element's type
	 */
	public ObjectType getObjectType();

	/**
	 * @return the element's image
	 */
	public Image getImage();

}
