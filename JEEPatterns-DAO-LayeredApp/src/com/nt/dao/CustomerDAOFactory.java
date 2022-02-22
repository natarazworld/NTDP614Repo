//DAO Factory
package com.nt.dao;

//Factory pattern
public class CustomerDAOFactory {

	public static  ICustomerDAO    getInstance(String type) {
		// if(type.equalsIgnoreCase("jdbc"))
		 if("jdbc".equalsIgnoreCase(type))
			 return new CustomerDAOJdbcImpl();
		 else 
			 throw new IllegalArgumentException("Invalid DAO type");
		
	}
}
