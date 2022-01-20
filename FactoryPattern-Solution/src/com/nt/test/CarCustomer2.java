package com.nt.test;

import com.nt.comps.Car;
import com.nt.comps.LuxoryCar;
import com.nt.factory.CarFactory;

public class CarCustomer2 {
	
	public static void main(String[] args) {
		Car lCar=CarFactory.createCar("luxory");
		lCar.drive();
		
	}

}
