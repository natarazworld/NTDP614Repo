package com.nt.test;

import com.nt.bike.BajajBike;
import com.nt.factory.ChennaiBajajFactory;

public class SouthCustomer {

	public static void main(String[] args) {
	   BajajBike bike=ChennaiBajajFactory.createBike("pulsor");
	   bike.drive();

	}

}
