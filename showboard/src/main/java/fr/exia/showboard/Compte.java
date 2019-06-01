package fr.exia.showboard;

import java.awt.Color;

public class Compte implements Runnable {

	private final int STOP = 1000;
	private int compteurTemps;
	private String str;

	public Compte() {
		this.compteurTemps = 100;
		this.str = Color.red + "temps restant:100";

		Thread Compte = new Thread(this);
		Compte.start();
	}

	public int getCompteurTemps() {
		return compteurTemps;
	}

	public String getStr() {
		return str;
	}

	@Override
	public void run() {
		while (true) {
			try {
				Thread.sleep(STOP);
			} catch (InterruptedException e) {}
			this.compteurTemps--;
			this.str = "temps restant:" + this.compteurTemps;
		}
		
	}
}