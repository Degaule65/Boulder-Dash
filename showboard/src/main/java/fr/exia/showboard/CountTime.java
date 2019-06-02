package fr.exia.showboard;

import java.awt.Color;

public class CountTime implements Runnable {

	private final int STOP = 1000;
	private int compteurTemps;
	private String str;
	private String lose;

	public CountTime() {
		this.compteurTemps = 10;
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

	public void setLose(String lose) {
		this.lose = lose;
	}

	@Override
	public void run() {
		while (compteurTemps >= 0) {
			try {
				Thread.sleep(STOP);
			} catch (InterruptedException e) {
			}
			this.compteurTemps--;
			this.str = "temps restant:" + this.compteurTemps;
		}
		this.str = "Vous avez perdu";
		try {
			Thread.sleep(STOP);
		} catch (InterruptedException e) {
		}
		System.exit(0);
	}
}