//Factory Pattern
package com.nt.factory;

import com.nt.proxy.BankServiceProxy;
import com.nt.real.BankServiceImpl;
import com.nt.real.IBankService;

public class BankServiceFactory {
	
	public  static  IBankService  getInstance(boolean  RBIMonitoring) {
		  IBankService service=null;
		    if(RBIMonitoring)
		    	 service=new BankServiceProxy();
		    else
		    	service= new BankServiceImpl();
		    
		    return service;
		
	}
	

}
