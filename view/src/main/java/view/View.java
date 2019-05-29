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
import model.Map;

public final class View implements IView, Runnable, KeyListener {

	private IMap map;
	private IHero hero;
	private int view;
	private Rectangle closeView;
	private IController orderPerformer;

	public View(IMap map, IHero hero) {
		this.setView(1);
		this.setHero(hero);
		this.setMap(map);
		this.getHero().getSprite().loadImage();
		this.setCloseView(new Rectangle(0, 0, Map.width * 16, Map.heigth * 16));
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
		final BoardFrame boardFrame = new BoardFrame("Rockford CESI version (free trial) (alpha)");
		boardFrame.setDimension(new Dimension(Map.width, Map.heigth));
		boardFrame.setDisplayFrame(this.closeView);
		boardFrame.setSize(this.closeView.width * 32, this.closeView.height * 32);
		boardFrame.setHeightLooped(false);
		boardFrame.addKeyListener(this);
		boardFrame.setFocusable(true);
		boardFrame.setFocusTraversalKeysEnabled(false);

		for (int x = 0; x < Map.width; x++) {
			for (int y = 0; y < Map.heigth; y++) {
				boardFrame.addSquare(this.map.getOnTheMapXY(x, y), x, y);
			}
		}

		for (IMobile pawn : map.getBoulAndDia()) {
			boardFrame.addPawn(pawn);
		}
		boardFrame.addPawn(this.getHero());

		this.getMap().getObservable().addObserver(boardFrame.getObserver());
		this.followHero();

		boardFrame.setVisible(true);
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
		for (int x = 0; x < Map.width; x++) {
			for (int y = 0; y < Map.heigth; y++) {
				if (this.getMap().getOnTheMapXY(x, y) == null) {
					break;
				}
				this.getMap().getOnTheMapXY(x, y).getSprite().loadImage();
			}
		}
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

}
