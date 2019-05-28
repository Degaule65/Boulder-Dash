package model;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connexion {

	public static void main(String[] args) {
		connecterDB();
	}

	Connection cnx = connecterDB();

	public static Connection connecterDB() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver is loaded");
			String url = "jdbc:mysql://localhost:3306/jpublankproject?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC&useSSL=false";
			String user = "root";
			String password = "";
			Connection cnx = DriverManager.getConnection(url, user, password);
			System.out.println("You are now connected to the DataBase");
			return cnx;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
