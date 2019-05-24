package model;

import java.awt.Image;

public class Sprite {

	private char strImage;
	private String imageName;
	private Image image;

	public Sprite(String name) {
		this.loadImage(name);
	}

	public char getStrImage() {
		return this.strImage;
	}

	public void setStrImage(char strImage) {
		this.strImage = strImage;
	}

	public String getImageName() {
		return imageName;
	}

	public void setImageName(String imageName) {
		this.imageName = imageName;
	}

	public Image getImage() {
		return this.image;
	}

	private void loadImage(String name) {
		// name + Model.STYLE + ".jpg"
	}
}
