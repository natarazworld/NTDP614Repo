package com.nt.controller;

import com.nt.model.Customer;
import com.nt.service.CustomerMgmtServiceImpl;
import com.nt.service.ICustomerMgmtService;

public class CustomerOperationsController {
	private  ICustomerMgmtService service;
	
	public CustomerOperationsController() {
		service=new CustomerMgmtServiceImpl();
	}
	
	public  String processCustomerForRegistration(Customer customer)throws Exception{
		//use service
		  String resultMsg=service.registerCustomer(customer);
		  return resultMsg;
	}

}
