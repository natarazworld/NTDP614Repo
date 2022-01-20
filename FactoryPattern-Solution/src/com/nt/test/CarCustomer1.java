package com.nt.test;

import com.nt.comps.BudgetCar;
import com.nt.comps.Car;
import com.nt.factory.CarFactory;

public class CarCustomer1 {
	
	public static void main(String[] args) {
		Car bCar=CarFactory.createCar("budget");
		bCar.drive();
	
		
	}

}
