package contract;

import java.awt.Image;
import javax.swing.ImageIcon;

public class Sprite {

	private char strImage;
	private String imageName;
	private Image image;

	public Sprite(final char character, final String imageName) {
		this.setStrImage(character);
		this.setImageName(imageName);
		this.loadImage();
	}

	public char getStrImage() {
		return this.strImage;
	}

	public void setStrImage(char bufferedImage) {
		this.strImage = bufferedImage;
	}

	public final String getImageName() {
		return this.imageName;
	}

	public void setImageName(String imageName) {
		this.imageName = imageName;
	}

	public Image getImage() {
		return this.image;
	}

	public final void loadImage() {
		this.image = (new ImageIcon(this.getImageName())).getImage();
	}
}