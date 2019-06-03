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

public final class View implements IView, Runnable, KeyListener {

	private IMap map;
	private IHero hero;
	private int view;
	private Rectangle closeView;
	private IController orderPerformer;
	private BoardFrame boardFrame;
	private int currentKey;

	//Initiate the view
	public View(IMap map) {
		this.setView(1);
		this.setMap(map);
		this.setHero(map.getHero());
		this.setCloseView(new Rectangle(0, 0, 11, 11));
		SwingUtilities.invokeLater(this);
	}
	//return the right key code to the control in function of the key used.
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

	// Run the game.
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

	//View of the map that follows the hero.
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

	//Permits to display a message on the screen, out of the window game.
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
	//Getters and setters of the view and the map.
	public int getView() {
		return this.view;
	}

	public void setView(int view) {
		this.view = view;
	}

	public IMap getMap() {
		return this.map;
	}

	private void setMap(IMap map) {
		this.map = map;
	}
	//Methods that listen to the keys typed, pressed and released.
	public void keyTyped(KeyEvent keyEvent) {

	}

	public void keyPressed(KeyEvent keyEvent) {
		this.currentKey = keyEvent.getKeyCode();
		this.getOrderPerformer().setOrder(keyCodeToControllerOrder(keyEvent.getKeyCode()));
	}

	public void keyReleased(KeyEvent keyEvent) {
		if (keyEvent.getKeyCode() == this.currentKey) {
			this.getOrderPerformer().setOrder(ControllerOrder.NONE);
			this.currentKey = 0;
		}
	}
	//Get the order performer.
	private IController getOrderPerformer() {
		return this.orderPerformer;
	}
	//Getter and setter parameters for the hero.
	public IHero getHero() {
		return this.hero;
	}

	public void setHero(IHero hero) {
		this.hero = hero;
	}
	//Getter and setter for the close of the view.
	public Rectangle getCloseView() {
		return this.closeView;
	}
	
	public void setCloseView(final Rectangle closeView) {
		this.closeView = closeView;
	}
	//Getter and setter for the BoardFrame.
	@Override
	public BoardFrame getBoardFrame() {
		return boardFrame;
	}

	public void setBoardFrame(BoardFrame boardFrame) {
		this.boardFrame = boardFrame;
	}

}
