package com.nt.bike;

public class BajajPulsorBike implements BajajBike {
	private  String power;
		
	@Override
	public void drive() {
	 System.out.println("BajajPulsorBike.drive()");
	}

}
