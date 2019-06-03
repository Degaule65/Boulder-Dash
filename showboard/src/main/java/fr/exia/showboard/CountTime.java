package fr.exia.showboard;

public class CountTime implements Runnable {

	private final int STOP = 1000;
	private int compteurTemps;
	private String str;
	
	public CountTime() {
		this.compteurTemps = 10;
		this.str = "Remaining time : " + this.getTime();

		Thread Compte = new Thread(this);
		Compte.start();
	}

	public int getTime() {
		return compteurTemps;
	}

	public String getStr() {
		return str;
	}

	@Override
	public void run() {
		while (compteurTemps > 0) {
			try {
				Thread.sleep(STOP);
			} catch (InterruptedException e) {
			}
			this.compteurTemps--;
			this.str = "Remaining time : " + this.getTime();
		}
		this.str = "No time left";
		try {
			Thread.sleep(STOP*3);
		} catch (InterruptedException e) {
		}
		System.exit(0);
	}
}