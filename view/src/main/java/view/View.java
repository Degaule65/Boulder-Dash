package view;

import java.awt.event.KeyEvent;

import contract.ControllerOrder;
import contract.IController;
import contract.IHero;
import contract.INonHeroMobile;
import contract.IView;
import model.IMap;
import model.IModel;

public final class View implements IView, Runnable {

	private IMap map;
	private IHero Hero;
	private int View;
	private INonHeroMobile Boulder;
	private INonHeroMobile Diamond;

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
		default:
			return ControllerOrder.NONE;
		}
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

	}

	public void displayMessage(String message) {

	}

	public int getView() {
		return 0;
	}

	public int setView() {
		return 0;
	}

	public void getMap() {

	}

	public void keyTyped(KeyEvent keyEvent) {

	}

	public void keyPressed(KeyEvent keyEvent) {

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

}
