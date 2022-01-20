package com.nt.test;

import com.nt.comps.Car;
import com.nt.comps.SportsCar;

public class CarCustomer3 {
	
	public static void main(String[] args) {
		Car sCar=new SportsCar();
		sCar.assemble();
		sCar.roadTest();
		sCar.drive();
		
	}

}
