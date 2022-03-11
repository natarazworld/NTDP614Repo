package com.nt.factory;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ResourceBundle;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class ConnectionFactory {
	private static  String dsJndiName;
	static {
		try {
		ResourceBundle bundle=ResourceBundle.getBundle("com/nt/commons/jdbc");
		dsJndiName=bundle.getString("datasource.jndi");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static   Connection getPooledJdbcConnection()throws SQLException ,NamingException {
		try {
		   //create Initialcontext obj
		   InitialContext context=new InitialContext();
		  //get DataSource object from jndi registry
		 DataSource ds=(DataSource)context.lookup(dsJndiName);
		   //get Pooled jdbc con object
		 Connection con=ds.getConnection();
		 return con;
		}
		catch(SQLException se) {
			se.printStackTrace();
			throw se;  // exception re throwing concept
		}
		catch(NamingException ne) {
			ne.printStackTrace();
			throw ne;
		}
		catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
	}//method
}//class
