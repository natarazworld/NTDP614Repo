package com.nt.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	public static    Connection getConnection(String  url, String user,String pwd) throws  SQLException{
		Connection con=null;
		try {
			//Establish the connection
			 con=DriverManager.getConnection(url, user, pwd);
		}
		catch(SQLException se) {
			se.printStackTrace();
			throw se;   // Exception  handling..
		}
		return con;
		
	}

}
