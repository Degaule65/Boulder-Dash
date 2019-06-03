package model;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import model.mobile.MobileFactory;
import model.motionless.MotionlessFactory;

public class AbstractFactoryTest {

	@Test
	public void testGetFactory() {
		IFactory factory = AbstractFactory.getFactory('H');
		assertTrue(factory instanceof MobileFactory);
		assertNotNull(factory);
		factory = AbstractFactory.getFactory('=');
		assertTrue(factory instanceof MotionlessFactory);
		assertNotNull(factory);
	}

}
