package contract;

import fr.exia.showboard.BoardFrame;

/**
 * The Interface IView.
 *
 * @author Jean-Aymeric Diet
 */
public interface IView {
	BoardFrame getBoardFrame();

	void followHero();
}
