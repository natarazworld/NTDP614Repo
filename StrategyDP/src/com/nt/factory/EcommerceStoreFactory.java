//Factory Pattern class
package com.nt.factory;

import com.nt.comps.BlueDart;
import com.nt.comps.Courier;
import com.nt.comps.DHL;
import com.nt.comps.ECommerceStore;

public class EcommerceStoreFactory {
	
	public static   ECommerceStore  getInstance(String courierType) {
		//create Dependent class obj
		  Courier  courier=null;
		  if(courierType.equalsIgnoreCase("dhl"))
			    courier=new DHL();
		  else if(courierType.equalsIgnoreCase("blueDart"))
			    courier=new BlueDart();
		  else 
			  throw new IllegalArgumentException("Invalid Courier type");
		  // create target class object
		  ECommerceStore store=new ECommerceStore();
		    //assign Dependent class obj
		  store.setCourier(courier);
		  return store;
	}

}
