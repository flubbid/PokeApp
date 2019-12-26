package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBC {

	public static Connection conn = null;
	
	public static Connection getConnection() {

		try {
			System.out.println(Class.forName("oracle.jdbc.driver.OracleDriver"));
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//this checks to see if we have a connection or not
		if(conn == null) {
			//if we haven't returned a connection, then we need to create one
			
			
			//This is the hostname/endpoint from the database followed by the port and SID
			String endpoint = "jdbc:oracle:thin:@database-1.cdmfnlnkaexw.us-east-2.rds.amazonaws.com:1521:ORCL";
			String username = "admin";
			String password = "password";
			
			try {
				conn = DriverManager.getConnection(endpoint, username, password);
				return conn;
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			
		}else {
			//if we have a connection return the connection
			return conn;
		}
		
		return null;
	}
	
	public static void main(String[] args) {
		Connection conn1 = getConnection();

		System.out.println(conn1);

	}
	
	
}
