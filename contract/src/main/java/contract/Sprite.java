package contract;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Sprite {

	private char strImage;
	private String imageName;
	private Image image;
	private boolean loadImage;

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
		// name + Model.STYLE + ".jpg"
		try {
			this.image = (ImageIO.read(new File(this.getImageName())));
		} catch (IOException e) {
			//TODO Mettre image base
			e.printStackTrace();
		}
	}

	public final boolean isImageLoaded() {
		return this.loadImage;
	}
}