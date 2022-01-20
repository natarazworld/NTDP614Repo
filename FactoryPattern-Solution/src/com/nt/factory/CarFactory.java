package com.nt.factory;

import com.nt.comps.BudgetCar;
import com.nt.comps.Car;
import com.nt.comps.LuxoryCar;
import com.nt.comps.SportsCar;
//Factory Pattern
public class CarFactory {
	 
	 //static  fatory method
	public static   Car  createCar(String type) {
		Car car=null;
		 if(type.equalsIgnoreCase("budget"))
			   car=new BudgetCar();
		 else if(type.equalsIgnoreCase("luxory"))
			 car=new LuxoryCar();
		 else if(type.equalsIgnoreCase("sports"))
			  car=new SportsCar();
		 else
			 throw new IllegalArgumentException("Invaldi Car type");
		  car.assemble();
		  car.roadTest();
		 return car;
	}

}
