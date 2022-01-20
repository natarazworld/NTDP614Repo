package com.nt.bike;

public class BajajPlatinaBike implements BajajBike {
	private  float price;
	@Override
	public void painting() {
	System.out.println("BjaiPlatinaBike.painting()");
		
	}

	@Override
	public void assembling() {
		System.out.println("BjaiPlatinaBike.assembling()");
		
	}

	@Override
	public void engineTest() {
    System.out.println("BjaiPlatinaBike.engineTest()");		
	}

	@Override
	public void roadTest() {
     System.out.println("BjaiPlatinaBike.roadTest()");		
	}
	
	@Override
	public void drive() {
		System.out.println("BajajPlatinaBike.drive()");
		
	}

}
