package view;

import java.awt.event.KeyEvent;

import contract.ControllerOrder;
import contract.IController;
import contract.IMap;
import contract.IModel;
import contract.IView;


/**
 * The Class View.
 *
 * @author Jean-Aymeric Diet
 */
public final class View implements IView, Runnable {

	private IMap map;
	private Mobile Hero
	private int View;
	private IOrderPerformer orderPerformer;
	private Mobile Boulder;
	private Mobile Diamond;
	
	public void View(IModel model) {
		
	}
	
	/**
	 * Key code to controller order.
	 *
	 * @param keyCode
	 *          the key code
	 * @return the controller order
	 */
	protected static ControllerOrder keyCodeToControllerOrder(final int keyCode) {
		switch (keyCode) {
			case KeyEvent.VK_G:
				return ControllerOrder.English;
			case KeyEvent.VK_F:
				return ControllerOrder.Francais;
			case KeyEvent.VK_D:
				return ControllerOrder.Deutsch;
			case KeyEvent.VK_I:
				return ControllerOrder.Indonesia;
			default:
				return ControllerOrder.English;
		}
	}
	
	/**
	 * Sets the controller.
	 *
	 * @param controller
	 *          the new controller
	 */
	public void setController(final IController controller) {
		this.viewFrame.setController(controller);
	}
	
	public void run() {
		this.viewFrame.setVisible(true);
	}
	
	public void boulderView(IMap Map, Mobile Hero) {
		
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
	
	public void keyTyped(keyEvent keyEvent) {
		
	}
	
	public void keyPressed(keyEvent keyEvent) {
		
	}
	
	public void keyReleased(keyEvent keyEvent) {
		
	}

	
	
	
	
	
}
