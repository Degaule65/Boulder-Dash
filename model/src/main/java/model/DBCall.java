package model;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBCall {

	/**
	 * Get skills by candidate id
	 * @throws SQLException 
	 *
	 * 
	 */
	public Map getMap(int IDmap) throws SQLException {
		String query = "{ call test(?) }";
		Connection conn = DBConnection.getInstance().getConnection();
		CallableStatement stmt;
		int style;
		int width;
		int heigth;
		String content;
		stmt = conn.prepareCall(query);
		stmt.setInt(IDmap, 1);
		ResultSet rs = stmt.executeQuery();
		rs.first();
		style = rs.getInt("style");
		width = rs.getInt("width");
		heigth = rs.getInt("height");
		content = rs.getString("content");
		return new Map(content, width, heigth, style);
	}
}