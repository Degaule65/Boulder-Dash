package controller;

import contract.ControllerOrder;
import contract.IController;
import contract.IView;
import model.IMap;

/**
 * The Class Controller.
 */
public final class Controller implements IController {

	/** The view. */
	private IView view;

	/** The model. */
	private IMap map;

	/**
	 * Instantiates a new controller.
	 *
	 * @param view  the view
	 * @param model the model
	 */
	public Controller(final IView view, final IMap map) {
		this.setView(view);
		this.setModel(map);
	}

	/**
	 * Sets the view.
	 *
	 * @param pview the new view
	 */
	private void setView(final IView view) {
		this.view = view;
	}

	/**
	 * Sets the model.
	 *
	 * @param model the new model
	 */
	private void setModel(final IMap map) {
		this.map = map;
	}

	/**
	 * Order perform.
	 *
	 * @param controllerOrder the controller order
	 */
	/*
	 * (non-Javadoc)
	 *
	 * @see contract.IController#orderPerform(contract.ControllerOrder)
	 */
	public void orderPerform(final ControllerOrder controllerOrder) {
		switch (controllerOrder) {
		case RIGHT:
			this.map.getHero().moveRight();
			break;
		case LEFT:
			this.map.getHero().moveLeft();
			break;
		case UP:
			this.map.getHero().moveUp();
			break;
		case DOWN:
			this.map.getHero().moveDown();
			break;
		default:
			break;
		}
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		
	}

	public IController getOrderPerformer() {
		return this;
	}

}
