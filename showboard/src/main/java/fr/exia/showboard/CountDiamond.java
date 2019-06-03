package fr.exia.showboard;

/**
 * Used to keep track of the remaining diamond to collect.
 * 
 * @author Charles Carré
 *
 */
public class CountDiamond {

	/**
	 * The number of diamonds needed to open the exit. 5 is a random default number.
	 */
	private int nbrDiamond = 5;

	/**
	 * Gets the number of diamonds to collect.
	 * 
	 * @return the number of diamond to collect.
	 */
	public int getDiamondNbr() {
		return nbrDiamond;
	}

	/**
	 * Gets a string ready to be displayed.
	 * 
	 * @return a string to display
	 */
	public String getStr() {
		return "Remaining diamond : " + this.nbrDiamond;
	}

	/**
	 * Reduce the number of diamond to collect by 1.
	 */
	public void collectDiamond() {
		if (this.getDiamondNbr() > 0) {
			this.nbrDiamond--;
		}
	}
}