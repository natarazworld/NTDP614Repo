package com.nt.factory;

import com.nt.bike.BajajBike;
import com.nt.bike.BajajDiscoverBike;
import com.nt.bike.BajajPlatinaBike;
import com.nt.bike.BajajPulsorBike;
import com.nt.factory.method.BajajBikeFactory;

//factory pattern2
public class ChennaiBajajFactory extends BajajBikeFactory {
	
	@Override
	public void assembling() {
	  System.out.println("ChennaiBajajFactory.assembling()");	
	}
	
	@Override
	public void painting() {
     System.out.println("ChennaiBajajFactory.painting()");		
	}
	
	@Override
	public void roadTest() {
		System.out.println("ChennaiBajajFactory.roadTest()");
	}
	
	 @Override
	public void engingTest() {
      System.out.println("ChennaiBajajFactory.engingTest()");		
	}
	
	public    BajajBike  createBike(String type) {
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

}
