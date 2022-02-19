//Factory Pattern
package com.nt.factory;

import java.lang.reflect.Proxy;

import com.nt.proxy.BankServiceProxyHelper;
import com.nt.real.BankServiceImpl;
import com.nt.real.IBankService;

public class BankServiceFactory {
	
	public  static  IBankService  getInstance(boolean  RBIMonitoring) {
		  IBankService service=null;
		    if(RBIMonitoring)
		    	service=(IBankService) Proxy.newProxyInstance(IBankService.class.getClassLoader(),
                                                                                         new Class[] {IBankService.class},new BankServiceProxyHelper());
		    else
		    	service= new BankServiceImpl();
		    
		    return service;
		
	}
	

}
