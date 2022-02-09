package com.nt.proxy;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class BankServiceProxyHelper implements MethodInterceptor {

	@Override
	public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
		  System.out.println("BanlServiceProxyHelper.intercept() (Helper for Dynamic Proxy class");
		      if(method.getName().equalsIgnoreCase("withdraw")) {
		    	    if(((Float)args[1])<=4000) {
		    	    	  //invoke  the real method
		    	    	Object retVal=proxy.invokeSuper(obj, args);  //invoke real method
		    	    	  return retVal;
		    	    }
		    	    else {
		    	    	throw new IllegalArgumentException("u can not withdraw more than 4000  in the period of Demontization");
		    	    	}
		      }
		      else {
		    	  Object retVal=proxy.invokeSuper(obj, args);  // invoke real method
		    	  return retVal;
		      }
				
	}//method
}//class
