package searchEngine;

import java.sql.*;

public class DBConnection {

	String url;
	
	public void connection(String dbname, String user, String password)
			throws Exception {
		
		Connection conn;
		Statement stmt;
		ResultSet rs;
		
		String credentials = "jdbc:sqlserver://sqlserver.dmst.aueb.gr:1433;"
							+ "databaseName="
							+ dbname
							+ ";user="
							+ user
							+ ";password=" + password + ";";
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		} catch (java.lang.ClassNotFoundException e) {
			System.out.print("ClassNotFoundException: ");
			System.out.println(e.getMessage());
		}
		try {
			conn = DriverManager.getConnection(credentials);
			stmt = conn.createStatement();
			rs = stmt.executeQuery("SELECT paths, url " + 
								   "FROM Crawler ");
			
			while (rs.next()) {
				String path = rs.getString("paths");
				url = rs.getString("url");
				GetText text = new GetText();
				String s = text.getText(path); 
				Normalization norm = new Normalization();
				String[] nwl = norm.textNormalization(s);
				
			}
			
			rs.close();
			stmt.close();
			conn.close();
			
		} catch (SQLException e) {
			System.out.print("SQLException: ");
			System.out.println(e.getMessage());
		}
	}
	
	//public String getUrl() {
	//	return url;
	//}
	
}
