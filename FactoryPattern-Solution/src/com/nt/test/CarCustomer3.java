package com.nt.test;

import com.nt.comps.Car;
import com.nt.comps.SportsCar;
import com.nt.factory.CarFactory;

public class CarCustomer3 {
	
	public static void main(String[] args) {
		Car sCar=CarFactory.createCar("sports");
		sCar.drive();
		
	}

}
