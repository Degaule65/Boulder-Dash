package model;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class LireLigne {

	public static String message;
	public String messageAfficher = "";
	private final BufferedReader buff;

	public static void main(String[] args) throws IOException {
		LireLigne console = new LireLigne();
		String laLigne;
		while ((laLigne = console.readLine()) != null) {
			System.out.println(laLigne);
		}
		console.close();
	}

	public LireLigne() throws FileNotFoundException {
		InputStream flux = new FileInputStream("map.txt");
		InputStreamReader lecture = new InputStreamReader(flux);
		buff = new BufferedReader(lecture);
	}

	public String readLine() throws IOException {
		return buff.readLine();
	}

	public void close() throws IOException {
		buff.close();
	}

}