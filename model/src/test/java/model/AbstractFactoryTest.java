package model;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import model.mobile.MobileFactory;

public class AbstractFactoryTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetFactory() {
			IFactory factory = AbstractFactory.getFactory('H');
			assertTrue(factory instanceof MobileFactory);
	}
	
	@Test
	public void testGetFactory2() {
			IFactory factory = AbstractFactory.getFactory('H');
			assertNotNull(factory);
	}

}
