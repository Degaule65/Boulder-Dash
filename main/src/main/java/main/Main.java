/**
 * @author Groupe 1
 * @version 1.0
 */
package main;

import java.sql.SQLException;

import contract.IController;
import controller.Controller;
import model.DBCall;
import model.IMap;
import view.View;

public abstract class Main {

	/** The number of the map to use */
	private final static int idMap = 1;

	public static void main(final String[] args) throws SQLException {
		final IMap map = new DBCall().getMap(idMap);
		final View view = new View(map);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		final IController controller = new Controller(view, map);
		view.setController(controller);

		controller.play();
	}
}
