package contract;

import fr.exia.showboard.BoardFrame;

/**
 * The Interface IView.
 *
 * @author Groupe 1
 */
public interface IView {
	/**
	 * @return the BoardFrame
	 */
	BoardFrame getBoardFrame();

	/**
	 * @param message The message to display
	 */
	void displayMessage(String message);

	/**
	 * Center the view on the player
	 */
	void followHero();
}
