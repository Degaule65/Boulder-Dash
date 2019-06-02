package fr.exia.showboard;

import java.awt.Color;

public class CountDiamond implements Runnable {

	private final int STOP = 1000;
	private int nbrDiamond;
	private String str;

	public CountDiamond() {
		this.nbrDiamond = 0;
		this.str = Color.red + "Diamond:";

		Thread Compte = new Thread(this);
		Compte.start();
	}

	public int getnbrDiamond() {
		return nbrDiamond;
	}

	public String getStr() {
		return str;
	}

	@Override
	public void run() {
		while (true) {
			try {
				Thread.sleep(STOP);
			} catch (InterruptedException e) {
			}
			this.str = "Remaining diament :" + this.nbrDiamond;
		}
	}
}