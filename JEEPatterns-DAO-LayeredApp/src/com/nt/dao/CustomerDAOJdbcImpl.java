package com.nt.dao;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

import com.nt.factory.ConnectionFactory;
import com.nt.model.Customer;

public class CustomerDAOJdbcImpl implements ICustomerDAO {
	private static final String  INSERT_CUSTOMER_QUERY="INSERT INTO DAO_CUSTOMER VALUES(DP_CID_SEQ.NEXTVAL,?,?,?)";
			
   private static Properties props; 
   static {
	   //Load properties file content into  java.util.Properties class obj
	   try {
		   InputStream is=new FileInputStream("src/com/nt/commons/jdbc.properties");
		    props=new Properties();
		   props.load(is);  //method does actual work
	   }
	   catch(IOException ioe) {
		   ioe.printStackTrace();
	   }
	   catch(Exception e) {
		   e.printStackTrace();
	   }
	 }//static block
	
		/*@Override
		public int insertCustomer(Customer customer) throws SQLException {
			Connection con=null;
			PreparedStatement ps=null;
			int result=0;
			try {
				//get Connection from Connection Factory
			    con=ConnectionFactory.getConnection(props.getProperty("jdbc.url"),
			    		                                                            props.getProperty("jdbc.username"),
			    		                                                            props.getProperty("jdbc.password"));
			    //create PreparedStatement obj
			    ps=con.prepareStatement(INSERT_CUSTOMER_QUERY);
			    //set values to query params
			    ps.setString(1,customer.getCname());
			    ps.setString(2, customer.getCadd());
			    ps.setFloat(3, customer.getBillAmt());
			    //execute  the query
			    result=ps.executeUpdate();
			}
			catch(SQLException se) {
				se.printStackTrace();
				throw se; //exception re-throwing
			}
			catch(Exception e) {
				 e.printStackTrace();
				 throw e;
			}
			finally {
				 //close jdbc objs
				try {
				  if(ps!=null)
					  ps.close();
				}
				catch(SQLException se) {
					se.printStackTrace();
				}
				
				try {
					  if(con!=null)
						  con.close();
					}
					catch(SQLException se) {
						se.printStackTrace();
					}
			} //finally
			return result;
		}//methoid
		*/
   
   
   @Override
	public int insertCustomer(Customer customer) throws SQLException {
		int result=0;
		try(	//get Connection from Connection Factory
			  Connection  con=ConnectionFactory.getConnection(props.getProperty("jdbc.url"),
                        props.getProperty("jdbc.username"),
                        props.getProperty("jdbc.password"));
			    //create PreparedStatement obj
			    PreparedStatement ps=con.prepareStatement(INSERT_CUSTOMER_QUERY)){
			
		    //set values to query params
		    ps.setString(1,customer.getCname());
		    ps.setString(2, customer.getCadd());
		    ps.setFloat(3, customer.getBillAmt());
		    //execute  the query
		    result=ps.executeUpdate();
		}//try
		catch(SQLException se) {
			se.printStackTrace();
			throw se; //exception re-throwing
		}
		catch(Exception e) {
			 e.printStackTrace();
			 throw e;
		}
		return result;
	}//methoid
   
   
}//class
