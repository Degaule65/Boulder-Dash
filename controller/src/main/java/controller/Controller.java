package controller;

import contract.ControllerOrder;
import contract.IController;
import contract.IElement;
import contract.IView;
import contract.ObjectType;
import fr.exia.showboard.BoardFrame;
import fr.exia.showboard.IPawn;
import model.IMap;
import model.mobile.Hero;
import model.mobile.Mobile;
import model.mobile.NonHeroMobile;

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
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
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
			Mobile[][] pawns = new Mobile[this.getMap().getWidth()][this.getMap().getHeigth()];
			for (IPawn pawn : this.getBoardFrame().getPawns()) {
				if (pawn instanceof NonHeroMobile) {
					pawns[pawn.getX()][pawn.getY()] = (NonHeroMobile) pawn;
				}
				if (pawn instanceof Hero) {
					pawns[pawn.getX()][pawn.getY()] = (Hero) pawn;
				}
			}
			for (IPawn pawn : this.getBoardFrame().getPawns()) {
				if (pawn instanceof NonHeroMobile) {
					this.gravity((NonHeroMobile) pawn, pawns);
				}
			}
		}
	}

	private void gravity(NonHeroMobile element, Mobile[][] pawns) {
		IElement caseDown = this.getMap().getOnTheMapXY(element.getX(), element.getY() + 1);
		IElement caseDownRight = this.getMap().getOnTheMapXY(element.getX() - 1, element.getY() + 1);
		IElement caseDownLeft = this.getMap().getOnTheMapXY(element.getX() + 1, element.getY() + 1);
		IElement caseLeft = this.getMap().getOnTheMapXY(element.getX() + 1, element.getY());
		IElement caseRight = this.getMap().getOnTheMapXY(element.getX() - 1, element.getY());
		
		if (caseDown.getObjectType() == ObjectType.BACKGROUND) {
			Mobile pawnDown = pawns[element.getX()][element.getY() + 1];
			if (pawnDown == null) {
				element.moveDown();
				pawns[element.getX()][element.getY()] = null;
				pawns[element.getX()][element.getY() - 1] = element;
				return;
			} else if (element.getIsFalling() && pawnDown instanceof Hero) {
				element.moveDown();
				pawns[element.getX()][element.getY()] = null;
				pawns[element.getX()][element.getY() - 1] = element;
				this.getMap().getHero().setAlive(false);
				return;
			}
			else if (pawnDown.getObjectType() == ObjectType.DIAMOND || pawnDown.getObjectType() == ObjectType.BOULDER
					|| pawnDown.getObjectType() == ObjectType.WALL) {
				Mobile pawnLeft = pawns[element.getX() - 1][element.getY()];
				Mobile pawnDownLeft = pawns[element.getX() - 1][element.getY() + 1];
				Mobile pawnRight = pawns[element.getX() + 1][element.getY()];
				Mobile pawnDownRight = pawns[element.getX() + 1][element.getY() + 1];
				if (caseDownLeft.getObjectType() == ObjectType.BACKGROUND
						&& caseLeft.getObjectType() == ObjectType.BACKGROUND && pawnLeft == null
						&& pawnDownLeft == null) {
					element.moveLeft();
					pawns[element.getX()][element.getY()] = null;
					pawns[element.getX() - 1][element.getY()] = element;
					return;
				} else if (caseDownRight.getObjectType() == ObjectType.BACKGROUND
						&& caseRight.getObjectType() == ObjectType.BACKGROUND && pawnRight == null
						&& pawnDownRight == null) {
					element.moveRight();
					pawns[element.getX()][element.getY()] = null;
					pawns[element.getX() + 1][element.getY()] = element;
					return;
				}
			}
		}
		element.setIsFalling(false);
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
