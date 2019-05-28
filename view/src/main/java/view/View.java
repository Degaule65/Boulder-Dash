package view;

import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import contract.ControllerOrder;
import contract.IController;
import contract.IHero;
import contract.INonHeroMobile;
import contract.IView;
import model.IMap;
import model.IModel;
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
	private IHero Hero;
	private int View;
	private INonHeroMobile Boulder;
	private INonHeroMobile Diamond;
	private Rectangle closeView;

	

	public void View (IModel model) {
		
	}

	/**
	 * Key code to controller order.
	 *
	 * @param keyCode the key code
	 * @return the controller order
	 */
	protected static ControllerOrder keyCodeToControllerOrder(final int keyCode) {
		switch (keyCode) {
		default:
			break;
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

	}

	public void boulderView(IMap Map, IHero Hero) {

	}

	public void followHero() {
		this.getView().y = ((Mobile) this.getHero()).getY() - 1;
	}

	public void displayMessage(String message) {
		JOptionPane.showMessageDialog(null, message);
	}

	public int getView() {
		return this.View;
	}

	public void setView() {
		this.View = View;
	}

	public void getMap() {

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
