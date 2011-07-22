package main.java.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Connector {

	static final String DATABASE = "jpatest2";
	static final String IP = "localhost";
	static final int PORT = 3306;
	static final String USER = "root";
	static final String PASSWORD = "gregory";
	
	static Connection conn = null;
	
	public static void init() {
	   try {
	      Class.forName( "com.mysql.jdbc.Driver" );
	 } catch ( Exception e ){
	      e.printStackTrace();
	      }
	 try {
	     conn = DriverManager.getConnection( "jdbc:mysql://"+IP+":"+PORT+"/"+DATABASE+"?user="+USER+"&password="+PASSWORD );
	 } catch ( SQLException e ) {
	      System.err.println( "can't connect to MySQL: " + e.getMessage() );
	  }
}

	public static ResultSet select (String query) throws SQLException{
		if (conn == null) init();
		Statement s = conn.createStatement ();
		s.executeQuery (query);
		return s.getResultSet ();
	}
	
	
	
}
