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

	public View(IMap map) {
		this.setView(1);
		this.setMap(map);
		this.setHero(map.getHero());
		this.setCloseView(new Rectangle(0, 0, 11, 11));
		SwingUtilities.invokeLater(this);
	}

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
	 * Sets the controller.
	 *
	 * @param controller the new controller
	 */
	public void setController(final IController controller) {
		this.orderPerformer = controller;
	}

	@Override
	public void run() {
		this.setBoardFrame(new BoardFrame("Rockford CESI version (free trial) (alpha)"));
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

	public void followHero() {
		this.getCloseView().y = this.getHero().getY() - 5;
		this.getCloseView().x = this.getHero().getX() - 5;
	}

	public void displayMessage(String message) {
		JOptionPane.showMessageDialog(null, message);
	}

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

	public void keyTyped(KeyEvent keyEvent) {

	}

	public void keyPressed(KeyEvent keyEvent) {
		this.getOrderPerformer().orderPerform(keyCodeToControllerOrder(keyEvent.getKeyCode()));
	}

	private IController getOrderPerformer() {
		return this.orderPerformer;
	}

	public void keyReleased(KeyEvent keyEvent) {
	}

	public IHero getHero() {
		return this.hero;
	}

	public void setHero(IHero hero) {
		this.hero = hero;
	}

	public Rectangle getCloseView() {
		return this.closeView;
	}

	public void setCloseView(final Rectangle closeView) {
		this.closeView = closeView;
	}

	public BoardFrame getBoardFrame() {
		return boardFrame;
	}

	public void setBoardFrame(BoardFrame boardFrame) {
		this.boardFrame = boardFrame;
	}
	
}
