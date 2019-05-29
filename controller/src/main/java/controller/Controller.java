package controller;

import contract.ControllerOrder;
import contract.IController;
import contract.IView;
import model.IModel;

/**
 * The Class Controller.
 */
public final class Controller implements IController {

	/** The view. */
	private IView view;

	/** The model. */
	private IModel model;

	/**
	 * Instantiates a new controller.
	 *
	 * @param view  the view
	 * @param model the model
	 */
	public Controller(final IView view, final IModel model) {
		this.setView(view);
		this.setModel(model);
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
	private void setModel(final IModel model) {
		this.model = model;
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
		// move
		case RIGHT:
			this.model.getHero().moveRight();
			break;
		case LEFT:
			this.model.getHero().moveLeft();
			break;
		case UP:
			this.model.getHero().moveUp();
			break;
		case DOWN:
			this.model.getHero().moveDown();
			break;
		default:
			return;
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
