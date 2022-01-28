package com.nt.builder;

import com.nt.product.House;
import com.nt.product.WoodenBasement;
import com.nt.product.WoodenInterior;
import com.nt.product.WoodenRoofing;
import com.nt.product.WoodenStructure;

public class WoodenHouseBuilder implements HouseBuilder {
	private House house;

	public WoodenHouseBuilder() {
		System.out.println("WoodenHouseBuilder: 0- param constructor");
		house=new House();
	}

	@Override
	public void buildBasement() {
		System.out.println("WoodenHouseBuilder.buildBasement()");
		house.setBasement(new WoodenBasement());
	}

	@Override
	public void buildRoofing() {
		System.out.println("WoodenHouseBuilder.buildRoofing()");
		house.setRoofing(new WoodenRoofing() );
	}

	@Override
	public void buildStructure() {
		System.out.println("WoodenHouseBuilder.buildStructure()");
	   house.setStructure(new WoodenStructure());
	}

	@Override
	public void buildInterior() {
		System.out.println("WoodenHouseBuilder.buildInterior()");
	house.setInterior(new WoodenInterior());
	}

	@Override
	public House createHouse() {
		System.out.println("WoodenHouseBuilder.createHouse()");
		return house;
	}

}
