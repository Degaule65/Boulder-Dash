package fr.exia.showboard;

public class CountDiamond {

	private int nbrDiamond = 10;

	public int getNbrDiamond() {
		return nbrDiamond;
	}

	public String getStr() {
		return "Remaining diamond : " + this.nbrDiamond;
	}

	public void collectDiamond() {
		if (this.getNbrDiamond() > 0) {
			this.nbrDiamond--;
		}
	}
}