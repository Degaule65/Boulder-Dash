package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Connexion {

	public static void main(String[] args) {
		// connecterDB();
		// }

		try

		{

			Connection connection = connecterDB();
			Statement statement;
			ResultSet resultset;

			statement = connection.createStatement();
			resultset = statement.executeQuery("SELECT * FROM map");

			while (resultset.next()) {
				System.out.println(resultset.getString("Content"));
				System.out.println(resultset.getInt("IDMap"));
				System.out.println(resultset.getInt("Width"));
				System.out.println(resultset.getInt("height"));
				System.out.println();
			}

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public static Connection connecterDB() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("~Driver is loaded~");
			String url = "jdbc:mysql://localhost:3306/jpublankproject?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC&useSSL=false";
			String user = "root";
			String password = "";
			Connection connection = DriverManager.getConnection(url, user, password);
			System.out.println("~You are now connected to the DataBase~");
			return connection;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
