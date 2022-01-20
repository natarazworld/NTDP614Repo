package com.nt.comps;

public class SportsCar extends  Car {
	private  String  speed;
	private  String  pickup;  
	
	public SportsCar() {
		System.out.println("SportsCar:: 0-param constructor");
	}
	
	@Override
	public void assemble() {
		 System.out.println("SportsCar::assemble()");
	}
	@Override
	public void roadTest() {
		System.out.println("SportsCar::roadTest()");
	}
	
	@Override
	public void drive() {
     System.out.println("SportsCar::drive()");		
	}

}
