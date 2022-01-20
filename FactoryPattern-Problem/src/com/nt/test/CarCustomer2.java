package com.nt.test;

import com.nt.comps.Car;
import com.nt.comps.LuxoryCar;

public class CarCustomer2 {
	
	public static void main(String[] args) {
		Car lCar=new LuxoryCar();
		lCar.assemble();
		lCar.roadTest();
		lCar.drive();
		
	}

}
