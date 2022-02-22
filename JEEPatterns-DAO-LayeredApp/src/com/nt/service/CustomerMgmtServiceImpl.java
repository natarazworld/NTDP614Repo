package com.nt.service;

import com.nt.dao.CustomerDAOFactory;
import com.nt.dao.CustomerDAOJdbcImpl;
import com.nt.dao.ICustomerDAO;
import com.nt.model.Customer;

public class CustomerMgmtServiceImpl implements ICustomerMgmtService {
	  private ICustomerDAO dao;
	  
	  public CustomerMgmtServiceImpl() {
	   dao=CustomerDAOFactory.getInstance("jdbc");
	}
	  

	@Override
	public String registerCustomer(Customer customer) throws Exception{
	   //  gst on  bill amount  (.logic)
		float billAmt=customer.getBillAmt()+ (customer.getBillAmt()*0.18f);
		//use DAO
		  int count=dao.insertCustomer(customer);
		  
		return count==0?" Customer not registered":" Customer registered";
	}

}
