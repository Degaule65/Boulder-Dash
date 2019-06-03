package fr.exia.showboard;

/**
 * @author perri
 *
 */
public class CountTime implements Runnable {

	/** The time between two update */
	private final int STOP = 1000;

	/** The time */
	private int compteurTemps;

	/* The string */
	private String str;

	/**
	 * Initialize the counter and start a thread.
	 */
	public CountTime() {
		this.compteurTemps = 120;
		this.str = "Remaining time : " + this.getTime();

		Thread Compte = new Thread(this);
		Compte.start();
	}

	/**
	 * Gets the remaining time.
	 * 
	 * @return the remaining time
	 */
	public int getTime() {
		return compteurTemps;
	}

	/**
	 * Gets a string, ready to be displayed.
	 * 
	 * @return a string to display
	 */
	public String getStr() {
		return str;
	}

	/**
	 * The loop that will update the counter.
	 */
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
			Thread.sleep(STOP * 3);
		} catch (InterruptedException e) {
		}
		System.exit(0);
	}
}