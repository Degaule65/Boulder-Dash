package controller;

import contract.ControllerOrder;
import contract.IController;
import contract.IView;
import fr.exia.showboard.BoardFrame;
import model.IMap;

/**
 * The Class Controller.
 */

public final class Controller implements IController {

	/** The view. */
	private IView view;

	/** The model. */
	private IMap map;

	/** The BoardFrame */
	private BoardFrame boardFrame;

	private ControllerOrder order;

	/**
	 * Instantiates a new controller.
	 *
	 * @param view  the view
	 * @param model the model
	 */
	public Controller(final IView view, final IMap map) {
		this.setView(view);
		this.setBoardFrame(view.getBoardFrame());
		this.setMap(map);
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		while (this.getMap().getHero().isAlive()) {
			this.getMap().getHero().changeSprite(this.getOrder());
			switch (this.getOrder()) {
			case RIGHT:
				this.getMap().getHero().moveRight();
				break;
			case LEFT:
				this.getMap().getHero().moveLeft();
				break;
			case UP:
				this.getMap().getHero().moveUp();
				break;
			case DOWN:
				this.getMap().getHero().moveDown();
			default:
				break;
			}
		}
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
	 * Return the view.
	 *
	 * @param pview the new view
	 */
	public IView getView() {
		return this.view;
	}

	/**
	 * Sets the map.
	 *
	 * @param model the new model
	 */
	private void setMap(final IMap map) {
		this.map = map;
	}

	/**
	 * Return the map.
	 *
	 * @param pview the new view
	 */
	private IMap getMap() {
		return this.map;
	}

	public IController getOrderPerformer() {
		return this;
	}

	public ControllerOrder getOrder() {
		return order;
	}

	public void setOrder(ControllerOrder order) {
		this.order = order;
	}

	public BoardFrame getBoardFrame() {
		return boardFrame;
	}

	public void setBoardFrame(BoardFrame boardFrame) {
		this.boardFrame = boardFrame;
	}

}
