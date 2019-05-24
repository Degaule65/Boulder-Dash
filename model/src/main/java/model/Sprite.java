package model;

import java.awt.Image;

public class Sprite {

	public Sprite(String name) {
		loadImage(name);
	}

	private char strImage;
	private String imageName;
	private Image image;

	public char getStrImage() {
		return strImage;
	}

	public void setStrImage(char strImage) {
		this.strImage = strImage;
	}

	public String getImageName() {
		return imageName;
	}

	public void imageName(String imageName) {
		this.imageName = imageName;
	}
	
	public Image getImage() {
		return image;
	}

	private void loadImage(String name) {
		//name + Model.STYLE + ".jpg"
	}
}
