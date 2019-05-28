/**
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
package main;

import contract.ControllerOrder;
import controller.Controller;
import model.IModel;
import model.Model;
import model.ObjectType;
import model.Sprite;
import view.View;
public abstract class Main {

	public static void main(final String[] args) {
		final IModel model = new IModel();
		final View view = new View(Sprite sprite, ObjectType objectType);
		final Controller controller = new Controller(view, model);
		view.setController(controller);
	}
}
