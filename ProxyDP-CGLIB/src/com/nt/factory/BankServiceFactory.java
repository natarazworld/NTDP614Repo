//Factory Pattern
package com.nt.factory;

import com.nt.proxy.BankServiceProxyHelper;
import com.nt.real.BankServiceImpl;

import net.sf.cglib.proxy.Enhancer;

public class BankServiceFactory {
	
	public  static  BankServiceImpl  getInstance(boolean  RBIMonitoring) {
		  BankServiceImpl service=null;
		  if(RBIMonitoring) {
			   service=(BankServiceImpl) Enhancer.create(BankServiceImpl.class, new BankServiceProxyHelper()); //generated InMemory proxy class
		  }
		  else {
			  service=new BankServiceImpl();
		  }
		  
		  return service;
	}//method
	
}//class
