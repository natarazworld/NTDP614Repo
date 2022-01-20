package com.nt.test;

import com.nt.bike.BajajBike;
import com.nt.factory.ChennaiBajajFactory;
import com.nt.factory.NagpurBajajFactory;

public class NorthCustomer {

	public static void main(String[] args) {
	   BajajBike bike=NagpurBajajFactory.createBike("pulsor");
	   bike.drive();

	}

}
