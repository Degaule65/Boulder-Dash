package model;


import java.sql.*;

public class DBCall {
	public static void main(String[] args) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jpublankproject?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC&useSSL=false", "root", "");

		CallableStatement stmt = con.prepareCall("{CALL test(?,?)}");
		stmt.setInt(1,3);
	
		
		stmt.execute();

		System.out.println("success i guess");
	}
}