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

	public final void loadImage() throws IOException {
		// name + Model.STYLE + ".jpg"
		this.setStrImage(ImageIO.read(new File("images/" + this.getImageName())));
	}

	private void setStrImage(BufferedImage read) {
		// TODO Auto-generated method stub

	}

	public final boolean isImageLoaded() {
		return this.loadImage;
	}
}