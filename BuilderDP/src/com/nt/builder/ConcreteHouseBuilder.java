package com.nt.builder;

import com.nt.product.ConcreteBasement;
import com.nt.product.ConcreteRoofing;
import com.nt.product.ConcreteStructure;
import com.nt.product.GlassInterior;
import com.nt.product.House;

public class ConcreteHouseBuilder implements HouseBuilder {
	private House house;

	public ConcreteHouseBuilder() {
		System.out.println("ConcreteHouseBuilder.0-param consturctor");
		 house=new House();
	}

	@Override
	public void buildBasement() {
		System.out.println("ConcreteHouseBuilder.buildBasement()");
		house.setBasement(new ConcreteBasement());
	}

	@Override
	public void buildRoofing() {
		System.out.println("ConcreteHouseBuilder.buildRoofing()");
		house.setRoofing(new ConcreteRoofing() );
	}

	@Override
	public void buildStructure() {
		System.out.println("ConcreteHouseBuilder.buildStructure()");
	   house.setStructure(new ConcreteStructure());
	}

	@Override
	public void buildInterior() {
		System.out.println("ConcreteHouseBuilder.buildInterior()");
	house.setInterior(new GlassInterior());
	}

	@Override
	public House createHouse() {
		System.out.println("ConcreteHouseBuilder.createHouse()");
		return house;
	}

}
