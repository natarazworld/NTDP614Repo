package com.nt.factory;

import com.nt.bike.BajajBike;
import com.nt.bike.BajajDiscoverBike;
import com.nt.bike.BajajPlatinaBike;
import com.nt.bike.BajajPulsorBike;
import com.nt.factory.method.BajajBikeFactory;

//factory pattern1
public class NagpurBajajFactory extends BajajBikeFactory {
	
	
	public   BajajBike  createBike(String type) {
		  BajajBike bike=null;
		  if(type.equalsIgnoreCase("pulsor"))
			  bike=new BajajPulsorBike();
		  else if(type.equalsIgnoreCase("discover"))
			  bike=new BajajDiscoverBike();
		  else if(type.equalsIgnoreCase("platina"))
			  bike=new  BajajPlatinaBike();
		  else
			   throw new IllegalArgumentException("Invalid bike type");
		  return bike;
	}

	@Override
	public void painting() {
		System.out.println("NagpurBajajFactory.painting()");
		
	}

	@Override
	public void assembling() {
		System.out.println("NagpurBajajFactory.assembling()");
	}

	@Override
	public void engingTest() {
		System.out.println("NagpurBajajFactory.engingTest()");
		
	}

	@Override
	public void roadTest() {
       System.out.println("NagpurBajajFactory.roadTest()");		
	}

	
}
