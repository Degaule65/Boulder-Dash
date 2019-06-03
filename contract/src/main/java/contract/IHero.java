package contract;

public interface IHero extends IMobile {
	/**
	 * Move the hero to the right.
	 */
	void moveRight();

	/**
	 * Move the hero to the left.
	 */
	void moveLeft();

	/**
	 * Move the hero upward.
	 */
	void moveUp();

	/**
	 * Move the hero downward.
	 */
	void moveDown();

	/**
	 * Get the hero's Y coordinate.
	 * 
	 * @return the hero's Y coordinate
	 */
	int getY();

	/**
	 * Get the hero's X coordinate.
	 * 
	 * @return the hero's X coordinate
	 */
	int getX();

	/**
	 * Get the state : -1 dead, 0 alive, 1 won.
	 * 
	 * @return the current state
	 */
	int getState();

	/**
	 * Set a new state : -1 dead, 0 alive, 1 won.
	 * 
	 * @param state the new state
	 */
	void setState(int state);

	/**
	 * @param order the sprite's direction
	 */
	void changeSprite(ControllerOrder order);
}
