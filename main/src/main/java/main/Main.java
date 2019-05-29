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
		final IMap map = new Map("======;=/o$/=;=H  /=;======", 6, 4, 1);
		final View view = new View(map);
		final IController controller = new Controller(view, map);
		view.setController(controller);
		
		controller.play();
	}
}
