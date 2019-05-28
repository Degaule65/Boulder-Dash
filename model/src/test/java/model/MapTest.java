package model;

import static org.junit.Assert.*;

import org.junit.Test;

import model.motionless.Factory;

public class MapTest {
	private IElement[][] onMap = {{Factory.createBackground(), Factory.createDirt()}, {Factory.createDirt(), Factory.createWall()}};

	@Test
	public void test() {
		Map map = new Map(" /;/:");
		assertArrayEquals(onMap, map.getOnMap());
	}

}
