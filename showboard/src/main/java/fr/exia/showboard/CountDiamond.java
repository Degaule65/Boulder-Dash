package fr.exia.showboard;

public class CountDiamond {

	private int nbrDiamond = 5;

	public int getDiamondNbr() {
		return nbrDiamond;
	}

	public String getStr() {
		return "Remaining diamond : " + this.nbrDiamond;
	}

	public void collectDiamond() {
		if (this.getDiamondNbr() > 0) {
			this.nbrDiamond--;
		}
	}
}