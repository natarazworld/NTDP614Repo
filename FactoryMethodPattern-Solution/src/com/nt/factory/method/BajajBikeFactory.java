package com.nt.factory.method;

import com.nt.bike.BajajBike;

//Factory method  pattern..
public abstract class BajajBikeFactory {
	 public abstract void  painting();
	 public abstract void  assembling();
	 public abstract void  engingTest();
	 public abstract void  roadTest();
	 public abstract  BajajBike createBike(String type);
	 
	 public   BajajBike orderBike(String type) {
		   BajajBike bike=createBike(type);
		   painting();
		   assembling();
		   engingTest();
		   roadTest();
		   return  bike;
	 }
	 
	 
	 
	 

}
