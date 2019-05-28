package contract;

public interface IHero extends IMobile {
	void moveRight();
	void moveLeft();
	void moveUp();
	void moveDown();
	int getY();
	int getX();
	
}
