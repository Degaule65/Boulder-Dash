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
	 * Set order to be performed
	 *
	 * @param order the controller order
	 */
	void setOrder(ControllerOrder order);
}
