package model.mobile;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import model.mobile.Hero;

public class HeroTest {
	

	public HeroTest() {

	}
	@Test
	public void testMoveUp() {
		String imageUPTest = "images/UP/UP.gif";
		
		assertEquals(imageUPTest, Hero.imageUP);
		
	}
	@Test
	public void testMoveDown() {
		String imageDownTest = "images/DOWN/DOWN.gif";
		
		assertEquals(imageDownTest, Hero.imageDown);
	}

	@Test
	public void testMoveRight() {
		String imageTurnRightTest = "images/droite/RIGHT.gif";
		
		assertEquals(imageTurnRightTest, Hero.imageTurnRight);
	}

	@Test
	public void testMoveLeft() {
		String imageTurnLeftTest = "images/gauche/LEFT.gif";
		
		assertEquals(imageTurnLeftTest, Hero.imageTurnLeft);
	}

	@Test
	public void testNone() {
		String imageNoneTest = "images/héro_basique/Hero.gif";
		
		assertEquals(imageNoneTest, Hero.imageNone);
	}

}