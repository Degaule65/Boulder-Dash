package view;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JOptionPane;

import contract.ControllerOrder;
import contract.IController;
import contract.IHero;
import contract.INonHeroMobile;
import contract.IView;
import fr.exia.showboard.BoardFrame;
import model.IMap;
import model.IModel;
import model.Map;
import model.ObjectType;
import model.Sprite;
import model.mobile.Hero;
import model.mobile.Mobile;

public final class View extends Hero implements IView, Runnable, KeyListener {

	public View(Sprite sprite, ObjectType objectType) {
		super(sprite, objectType);
		// TODO Auto-generated constructor stub
	}

	private IMap map;
	private IHero hero;
	private int view;
	private INonHeroMobile boulder;
	private INonHeroMobile diamond;
	private Rectangle closeView;

	public void View(IModel model) {

	}

	/**
	 * Key code to controller order.
	 *
	 * @param keyCode the key code
	 * @return the controller order
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
	 * Sets the controller.
	 *
	 * @param controller the new controller
	 */
	public void setController(final IController controller) {

	}

	public void run() {

		final BoardFrame boardFrame = new BoardFrame("coucou");
		boardFrame.setDimension(new Dimension(Map.width, Map.heigth));
		boardFrame.setDisplayFrame(this.closeView);

		boardFrame.setSize(this.closeView.width * view, this.closeView.height * view);
		boardFrame.setHeightLooped(true);
		boardFrame.addKeyListener(this);
		boardFrame.setFocusable(true);
		boardFrame.setFocusTraversalKeysEnabled(false);

	}

	public void boulderView(IMap Map, IHero Hero) {

	}

	public void followHero() {
		this.view = (this.getHero()).getY() - 1;
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

	public void keyTyped(KeyEvent keyEvent) {

	}

	public void keyPressed(KeyEvent keyEvent) {
		this.getOrderPerformer().orderPerform(keyCodeToControllerOrder(keyEvent.getKeyCode()));
	}

	private IController getOrderPerformer() {
		return null;
	}

	public void keyReleased(KeyEvent keyEvent) {
	}

	public IHero getHero() {
		return null;
	}

	public void setHero(IHero hero) {

	}

	public void setBoulder(INonHeroMobile boulder) {

	}

	public INonHeroMobile getBoulder() {
		return null;
	}

	public void setDiamond(INonHeroMobile diamond) {

	}

	public INonHeroMobile getDiamond() {
		return null;
	}

	public Rectangle getCloseView() {
		return this.closeView;
	}

	public void setCloseView(final Rectangle closeView) {
		this.closeView = closeView;
	}

}
