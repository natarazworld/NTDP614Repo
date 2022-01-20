package com.nt.factory;

import com.nt.recruitment.HireDotNetFresher;
import com.nt.recruitment.HireFresher;
import com.nt.recruitment.HireJavaFresher;
import com.nt.recruitment.HireUITechnologiesFresher;

public class HireFresherFactory {
	
	
	  //static factory method  -- Factory Pattern
	public static   HireFresher  getInstance(String type) {
		  HireFresher fresher=null;
		    if(type.equalsIgnoreCase("java"))
		    	  fresher=new HireJavaFresher();
		    else if(type.equalsIgnoreCase("dotNet"))
		    	  fresher=new HireDotNetFresher();
		    else if(type.equalsIgnoreCase("ui"))
		    	   fresher=new HireUITechnologiesFresher();
		    else
		    	 throw new IllegalArgumentException("invalid fresher type");
		    
		    return fresher;
	}//method

}//class
