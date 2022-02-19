package com.nt.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import com.nt.real.BankServiceImpl;
import com.nt.real.IBankService;

public class BankServiceProxyHelper  implements InvocationHandler {
	 IBankService real=null;
	public BankServiceProxyHelper() {
		 real=new BankServiceImpl();  //real class object
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		  Object retVal=null;
		  if(method.getName().equalsIgnoreCase("withdraw")) {
			   if(((Float)args[1])<=4000){
				    //real class logics
				    method.invoke(real, args);  
			   }
			   else {
				   throw  new IllegalArgumentException("can not withdraw more than Rs.4000 amount");
			   }
		  }
		  return retVal;
		
	}

}
