package model;

import java.util.ArrayList;
import java.util.List;
import model.mobile.Boulder;
import model.mobile.Diamond;
import model.mobile.Hero;
import model.mobile.MobileFactory;
import model.motionless.Background;
import model.motionless.Dirt;
import model.motionless.Exit;
import model.motionless.MotionlessFactory;
import model.motionless.Wall;

public abstract class AbstractFactory {
	private static char[] mobile = new char[] { Boulder.fileSym, Diamond.fileSym, Hero.fileSym };
	private final static IFactory mobileFactory = new MobileFactory();

	private static char[] motionless = { Background.fileSym, Wall.fileSym, Dirt.fileSym, Exit.fileSym };
	private final static IFactory motionlessFactory = new MotionlessFactory();

	/**
	 * Gets the factory corresponding to an element.
	 * 
	 * @param symbol the symbol to evaluate
	 * @return the factory
	 */
	public static IFactory getFactory(final char symbol) {
		List<Character> mobileElement = new ArrayList<Character>();
		for (char c : mobile) {
			mobileElement.add(c);
		}
		List<Character> motionlessElement = new ArrayList<Character>();
		for (char c : motionless) {
			motionlessElement.add(c);
		}
		if (mobileElement.contains(symbol)) {
			return mobileFactory;
		} else if (motionlessElement.contains(symbol)) {
			return motionlessFactory;
		}
		return null;
	}
}
