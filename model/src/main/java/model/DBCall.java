package model;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBCall {

	/**
	 * Get the map from the stored procedure
	 * 
	 * @param id the map ID
	 * @return a map
	 * @throws SQLException when needed
	 */
	public Map getMap(int id) throws SQLException {
		String query = "{ call getMap(?) }";
		Connection conn = DBConnection.getInstance().getConnection();
		CallableStatement stmt;
		int style;
		int width;
		int height;
		String content;
		stmt = conn.prepareCall(query);
		stmt.setInt(1, id);
		ResultSet rs = stmt.executeQuery();
		rs.first();
		style = rs.getInt("style");
		width = rs.getInt("width");
		height = rs.getInt("height");
		content = rs.getString("content");
		return new Map(content, width, height, style);
	}
}