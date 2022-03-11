package com.nt.factory;

import com.nt.dao.FinanceEmployeeDAOImpl;
import com.nt.dao.HREmployeeDAOImpl;
import com.nt.dao.IEmployeeDAO;

public class EmployeeDAOFactory {

	public   static  IEmployeeDAO   getIstance(String type) {
		  if(type.equalsIgnoreCase("HR"))
			   return new  HREmployeeDAOImpl();
		  else  if(type.equalsIgnoreCase("finanace"))
			  return new FinanceEmployeeDAOImpl();
		  else
			  throw new IllegalArgumentException("invalud Exception type");
	}
	
	
}
