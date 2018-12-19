package task1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLConnection {

	private static final String URL = "jdbc:mysql://localhost:3306/cts";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "root";
	static Connection con = null;

	public static Connection getconnection() throws Exception
	{
		
			Class.forName("com.mysql.jdbc.Driver");
		 con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			System.out.println("connection established");
		return con;

	}

	
}
