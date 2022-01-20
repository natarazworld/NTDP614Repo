package com.nt.test;

import com.nt.bike.BajajBike;
import com.nt.factory.ChennaiBajajFactory;
import com.nt.factory.NagpurBajajFactory;
import com.nt.factory.method.BajajBikeFactory;

public class NorthCustomer {

	public static void main(String[] args) {
	  BajajBikeFactory  factory=new  NagpurBajajFactory();
	  BajajBike  bike=factory.orderBike("discover");
	  bike.drive();
	}

}
