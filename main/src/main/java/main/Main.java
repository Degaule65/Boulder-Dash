/**
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
package main;

import contract.IController;
import controller.Controller;
import model.IModel;
import model.Model;
import view.View;
public abstract class Main {

	public static void main(final String[] args) {
		final IModel model = new Model();
		final View view = new View(model.getMap(), model.getHero());
		final IController controller = new Controller(view, model);
		view.setController(controller);
		
		controller.play();
	}
}
