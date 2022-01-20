package com.nt.comps;

public class LuxoryCar extends  Car {
	private  String bootspace;
	private  String  security;
	
	public LuxoryCar() {
		System.out.println("LurxoryCar:: 0-param constructor");
	}
	
	@Override
	public void assemble() {
		 System.out.println("LurxoryCar.assemble()");
	}
	@Override
	public void roadTest() {
		System.out.println("LurxoryCar.roadTest()");
	}
	
	@Override
	public void drive() {
     System.out.println("LurxoryCar.drive()");		
	}

}
