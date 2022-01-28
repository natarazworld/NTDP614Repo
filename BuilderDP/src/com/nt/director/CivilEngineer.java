package com.nt.director;

import com.nt.builder.HouseBuilder;
import com.nt.product.House;

public class CivilEngineer {
	private   HouseBuilder builder;
	
	public CivilEngineer(HouseBuilder builder) {
		System.out.println("CivilEngineer:: 1-param constructor");
		  this.builder=builder;
	}
	
	
	// method containing logic of house construction
	public void constructHouse() {
		System.out.println("CivilEngineer.constructHouse()");
		builder.buildBasement();
		builder.buildStructure();
		builder.buildRoofing();
		builder.buildInterior();
	}
	
	//method  giving product.
	public   House  getHouse() {
		System.out.println("CivilEngineer.getHouse()");
		  return  builder.createHouse();
	}

}
