package com.nt.bike;

public class BajajPulsorBike implements BajajBike {
	private  String power;
	@Override
	public void painting() {
	System.out.println("BjaiPlulsorBike.painting()");
		
	}

	@Override
	public void assembling() {
		System.out.println("BjaiPlulsorBike.assembling()");
		
	}

	@Override
	public void engineTest() {
    System.out.println("BjaiPlulsorBike.engineTest()");		
	}

	@Override
	public void roadTest() {
     System.out.println("BjaiPlulsorBike.roadTest()");		
	}
	
	@Override
	public void drive() {
	 System.out.println("BajajPulsorBike.drive()");
	}

}
