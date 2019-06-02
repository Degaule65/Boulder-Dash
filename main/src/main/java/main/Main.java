/**
 * @author Groupe 1
 * @version 1.0
 */
package main;

import contract.IController;
import controller.Controller;
import model.IMap;
import model.Map;
import view.View;

public abstract class Main {

	public static void main(final String[] args) {
		final IMap map = new Map("============;=o/////oo//=;=H/////oo//=;=//  o ////=;=== /$//  $=;=$  ///  //=;=//$ //  /E=;============", 12, 8, 1);
		final View view = new View(map);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		final IController controller = new Controller(view, map);
		view.setController(controller);

		controller.play();
	}
}
