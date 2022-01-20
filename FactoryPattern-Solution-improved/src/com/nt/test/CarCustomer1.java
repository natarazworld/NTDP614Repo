package com.nt.test;

import com.nt.comps.BudgetCar;
import com.nt.comps.Car;
import com.nt.factory.CarFactory;
import com.nt.factory.CarType;

public class CarCustomer1 {
	
	public static void main(String[] args) {
		Car bCar=CarFactory.createCar(CarType.MODEL_BUDGET);
		bCar.drive();
	
		
	}

}
