package com.nt.factory;

import com.nt.bike.BajajBike;
import com.nt.bike.BajajDiscoverBike;
import com.nt.bike.BajajPlatinaBike;
import com.nt.bike.BajajPulsorBike;

//factory pattern1
public class NagpurBajajFactory {
	
	public   static BajajBike  createBike(String type) {
		  BajajBike bike=null;
		  if(type.equalsIgnoreCase("pulsor"))
			  bike=new BajajPulsorBike();
		  else if(type.equalsIgnoreCase("discover"))
			  bike=new BajajDiscoverBike();
		  else if(type.equalsIgnoreCase("platina"))
			  bike=new  BajajPlatinaBike();
		  else
			   throw new IllegalArgumentException("Invalid bike type");
		  bike.assembling();
		  bike.painting();
		  bike.engineTest();
		  return bike;
	}

}
