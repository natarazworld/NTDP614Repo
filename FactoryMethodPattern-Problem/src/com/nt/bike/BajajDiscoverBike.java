package com.nt.bike;

public class BajajDiscoverBike implements BajajBike {
	private  String milege;

	@Override
	public void painting() {
	System.out.println("BjaiDiscoverBike.painting()");
		
	}

	@Override
	public void assembling() {
		System.out.println("BjaiDiscoverBike.assembling()");
		
	}

	@Override
	public void engineTest() {
    System.out.println("BjaiDiscoverBike.engineTest()");		
	}

	@Override
	public void roadTest() {
     System.out.println("BjaiDiscoverBike.roadTest()");		
	}
	
	@Override
	public void drive() {
	 System.out.println("BajajDiscoverBike.drive()");
		
	}

}
