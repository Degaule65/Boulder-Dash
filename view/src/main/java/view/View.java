package view;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import contract.ControllerOrder;
import contract.IController;
import contract.IHero;
import contract.IMobile;
import contract.IView;
import fr.exia.showboard.BoardFrame;
import model.IMap;

/**
 * View is the class that create the window and is in charge of displaying
 * everything.
 * 
 * @author Benoît Perriguet
 *
 */
public final class View implements IView, Runnable, KeyListener {

	/** The map. */
	private IMap map;

	/** The hero. */
	private IHero hero;

	/** The rectangle representing the view */
	private Rectangle closeView;

	/** The controller */
	private IController orderPerformer;

	/** The boardFrame */
	private BoardFrame boardFrame;

	/** The key being pressed */
	private int currentKey;

	/**
	 * Initializes the view.
	 * 
	 * @param map the map
	 */
	public View(IMap map) {
		this.setMap(map);
		this.setHero(map.getHero());
		this.setCloseView(new Rectangle(0, 0, 11, 11));
		SwingUtilities.invokeLater(this);
	}

	/**
	 * Turns a key into an order.
	 * 
	 * @param keyCode the KeyCode
	 * @return the corresponding order
	 */
	protected static ControllerOrder keyCodeToControllerOrder(final int keyCode) {
		switch (keyCode) {
		case KeyEvent.VK_RIGHT:
			return ControllerOrder.RIGHT;
		case KeyEvent.VK_LEFT:
			return ControllerOrder.LEFT;
		case KeyEvent.VK_UP:
			return ControllerOrder.UP;
		case KeyEvent.VK_DOWN:
			return ControllerOrder.DOWN;
		}
		return ControllerOrder.NONE;
	}

	/**
	 * Initializes the window and fill the pawn and square lists.
	 */
	@Override
	public void run() {
		this.setBoardFrame(new BoardFrame("BoulderDash"));
		this.boardFrame.setDimension(new Dimension(this.getMap().getWidth(), this.getMap().getHeigth()));
		this.boardFrame.setDisplayFrame(this.closeView);
		this.boardFrame.setSize(this.closeView.width * 32, this.closeView.height * 32);
		this.boardFrame.setHeightLooped(false);
		this.boardFrame.addKeyListener(this);
		this.boardFrame.setFocusable(true);
		this.boardFrame.setFocusTraversalKeysEnabled(false);

		for (int x = 0; x < this.getMap().getWidth(); x++) {
			for (int y = 0; y < this.getMap().getHeigth(); y++) {
				this.boardFrame.addSquare(this.map.getOnTheMapXY(x, y), x, y);
			}
		}

		for (IMobile pawn : map.getBoulAndDia()) {
			this.boardFrame.addPawn(pawn);
		}
		this.boardFrame.addPawn(this.getHero());

		this.getMap().getObservable().addObserver(this.boardFrame.getObserver());
		this.followHero();

		this.boardFrame.setVisible(true);
	}

	/**
	 * Centers the view on the hero except when near the walls.
	 */
	public void followHero() {
		if (this.getHero().getY() <= 5) {
			this.getCloseView().y = 0;
		} else if (this.getHero().getY() > this.getMap().getHeigth() - 7) {
			this.getCloseView().y = this.getMap().getHeigth() - 11;
		} else {
			this.getCloseView().y = this.getHero().getY() - 5;
		}
		if (this.getHero().getX() <= 5) {
			this.getCloseView().x = 0;
		} else if (this.getHero().getX() >= this.getMap().getWidth() - 7) {
			this.getCloseView().x = this.getMap().getWidth() - 11;
		} else {
			this.getCloseView().x = this.getHero().getX() - 5;
		}
	}

	/**
	 * Opens a pop-up with the specified message.
	 * 
	 * @param message The message to be displayed
	 */
	public void displayMessage(String message) {
		JOptionPane.showMessageDialog(null, message);
	}

	/**
	 * Sets the controller.
	 *
	 * @param controller the new controller
	 */
	public void setController(final IController controller) {
		this.orderPerformer = controller;
	}

	/**
	 * Gets the map.
	 * 
	 * @return the map
	 */
	public IMap getMap() {
		return this.map;
	}

	/**
	 * Sets a new map.
	 * 
	 * @param map the new map
	 */
	private void setMap(IMap map) {
		this.map = map;
	}

	public void keyTyped(KeyEvent keyEvent) {

	}

	/**
	 * When a key is pressed, gets the order and sends it to the controller.
	 */
	public void keyPressed(KeyEvent keyEvent) {
		this.currentKey = keyEvent.getKeyCode();
		this.getOrderPerformer().setOrder(keyCodeToControllerOrder(keyEvent.getKeyCode()));
	}

	/**
	 * When a key is released, checks that the key is the same as the one being
	 * pushed the last.
	 */
	public void keyReleased(KeyEvent keyEvent) {
		if (keyEvent.getKeyCode() == this.currentKey) {
			this.getOrderPerformer().setOrder(ControllerOrder.NONE);
			this.currentKey = 0;
		}
	}

	/**
	 * Gets the controller to send the orders to.
	 * 
	 * @return the controller
	 */
	private IController getOrderPerformer() {
		return this.orderPerformer;
	}

	/**
	 * Gets the hero.
	 * 
	 * @return the hero
	 */
	public IHero getHero() {
		return this.hero;
	}

	/**
	 * Sets a new hero.
	 * 
	 * @param hero the new hero
	 */
	public void setHero(IHero hero) {
		this.hero = hero;
	}

	/**
	 * Gets the rectangle representing the window.
	 * 
	 * @return the rectangle representing the window
	 */
	public Rectangle getCloseView() {
		return this.closeView;
	}

	/**
	 * Sets the new rectangle representing the view.
	 * 
	 * @param closeView the new rectangle
	 */
	public void setCloseView(final Rectangle closeView) {
		this.closeView = closeView;
	}

	/**
	 * Gets the boardFrame.
	 * 
	 * @return the boardFrame
	 */
	@Override
	public BoardFrame getBoardFrame() {
		return boardFrame;
	}

	/**
	 * Sets the new boardFrame.
	 * 
	 * @param boardFrame the new BoardFrame
	 */
	public void setBoardFrame(BoardFrame boardFrame) {
		this.boardFrame = boardFrame;
	}

}
