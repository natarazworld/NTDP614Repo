package com.nt.test;

import com.nt.comps.Car;
import com.nt.comps.SportsCar;
import com.nt.factory.CarFactory;
import com.nt.factory.CarType;

public class CarCustomer3 {
	
	public static void main(String[] args) {
		Car sCar=CarFactory.createCar(CarType.MODEL_SPORTS);
		sCar.drive();
		
	}

}
