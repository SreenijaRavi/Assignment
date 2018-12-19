package task1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Operations // class where all the sql operations are performed
{
	static Connection con = null;
	static Statement stmt = null;
	static ResultClass r;
	static PreparedStatement ps = null;

	public static void showTables() throws Exception {
		con = SQLConnection.getconnection();
		stmt = con.createStatement();
		String query = QueryClass.getQueriesShowTables();
		ResultSet rs = stmt.executeQuery(query);
		System.out.println("below are the tables present in the database");
		while (rs.next()) {

			System.out.println(rs.getString(1));
		}

		// con.close();

	}

	public static void insertTrainee(int id, String name, int pno, String city, int tech, String tableName) throws Exception {
		String query = QueryClass.getQueriesInsert(tableName);
		ps = con.prepareStatement(query);
		ps.setInt(1, id);
		ps.setString(2, name);
		ps.setInt(3, pno);
		ps.setString(4, city);
		ps.setInt(5, tech);
		System.out.println(query);
		int count = ps.executeUpdate();

		System.out.println(count + "rows effected");
		// con.close();

	}
	
	


	public static void execute(String tableName) throws Exception {
		r = new ResultClass();
		stmt = con.createStatement();
		String query = QueryClass.getQueriesSelect(tableName);

		ResultSet rs = stmt.executeQuery(query);
		while (rs.next()) {

			String row = (rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));

			r.storeResults(row);
		}
		r.showResults();
		// con.close();
	}

	public static void close() throws Exception {
		con.close();
	}

	public static void insertTrainer(int id1, String name1, int pno1, String desg, String city1, String project,int id2,String tableName) throws Exception
	{
		String query = QueryClass.getQueriesInsert(tableName);
		ps = con.prepareStatement(query);
		ps.setInt(1, id1);
		ps.setString(2, name1);
		ps.setInt(3, pno1);
		ps.setString(4, desg);
		ps.setString(5, city1);
		ps.setString(6, project);
		ps.setInt(7, id2);
		System.out.println(query);
		int count = ps.executeUpdate();
       
		System.out.println(count + "rows effected");
		
	}

}