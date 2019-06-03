package contract;

import java.awt.Image;
import javax.swing.ImageIcon;

public class Sprite {

	/** The char corresponding to the sprite */
	private char strImage;

	/** The image name (relative folder) */
	private String imageName;

	/** The image to display */
	private Image image;

	/**
	 * Create the sprite and load its image
	 * 
	 * @param character The char corresponding to the sprite
	 * @param imageName The image relative path
	 */
	public Sprite(final char character, final String imageName) {
		this.setStrImage(character);
		this.setImageName(imageName);
		this.loadImage();
	}

	/**
	 * Get the sprite char
	 * 
	 * @return the sprite's char
	 */
	public char getStrImage() {
		return this.strImage;
	}

	/**
	 * Set a new character
	 * 
	 * @param character the new character
	 */
	public void setStrImage(char character) {
		this.strImage = character;
	}

	/**
	 * Get the image's name/path
	 * 
	 * @return the image name/path
	 */
	public final String getImageName() {
		return this.imageName;
	}

	/**
	 * Set the image's name/path
	 * 
	 * @param imageName the new image's name/path
	 */
	public void setImageName(String imageName) {
		this.imageName = imageName;
	}

	/**
	 * Get the sprite's image
	 * 
	 * @return the image
	 */
	public Image getImage() {
		return this.image;
	}

	/**
	 *  Load the image
	 */
	public final void loadImage() {
		this.image = (new ImageIcon(this.getImageName())).getImage();
	}
}