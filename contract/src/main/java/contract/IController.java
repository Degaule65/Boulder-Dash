package contract;

/**
 * The Interface IController.
 *
 * @author Tanguy
 */
public interface IController {

	/**
	 * Play.
	 */
	public void play();

	/**
	 * Order perform.
	 *
	 * @param controllerOrder the controller order
	 */
	void setOrder(ControllerOrder order);
}
