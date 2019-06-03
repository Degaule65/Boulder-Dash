package model;

import java.sql.*;


/**
 *
 * 
 */
public class DBCall {

	/**
	 * Get skills by candidate id
	 *
	 * 
	 */
	public static void test(int IDmap) {
		
		//
		String query = "{ call test(?) }";
		ResultSet rs;
		String url = "jdbc:mysql://localhost:3306/jpublankproject?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC&useSSL=false";
		String user = "root";
		String password = "";
		try (Connection conn = DriverManager.getConnection(url, user, password);

				CallableStatement stmt = conn.prepareCall(query)) {

			stmt.setInt(IDmap, 1);

			rs = stmt.executeQuery();
			if (rs.first()) {
				System.out.println(String.format("Style " + rs.getString("style") +"\nContent "+ rs.getString("content")+ " ") + "\nwidth " + rs.getString("width") + "\nheight " + rs.getString("height"));
			}
					

		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
	}

	/**
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		test(1);
	}
}