package com.nt.test;

import com.nt.comps.BudgetCar;
import com.nt.comps.Car;

public class CarCustomer1 {
	
	public static void main(String[] args) {
		Car bCar=new BudgetCar();
		bCar.assemble();
		bCar.roadTest();
		bCar.drive();
		
	}

}
