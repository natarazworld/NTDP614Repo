package com.nt.builder;

import com.nt.product.House;
import com.nt.product.IceBasement;
import com.nt.product.IceCurvingInterior;
import com.nt.product.IceRoofing;
import com.nt.product.IceStructure;

public class IglooHouseBuilder implements HouseBuilder {
	private House house;

	public IglooHouseBuilder() {
		System.out.println("IglooHouseBuilder.0-param constructor");
		 house=new House();
	}

	@Override
	public void buildBasement() {
		System.out.println("IglooHouseBuilder.buildBasement()");
		house.setBasement(new IceBasement());
	}

	@Override
	public void buildRoofing() {
		System.out.println("IglooHouseBuilder.buildRoofing()");
		house.setRoofing(new IceRoofing() );
	}

	@Override
	public void buildStructure() {
		System.out.println("IglooHouseBuilder.buildStructure()");
	   house.setStructure(new IceStructure());
	}

	@Override
	public void buildInterior() {
		System.out.println("IglooHouseBuilder.buildInterior()");
	house.setInterior(new IceCurvingInterior());
	}

	@Override
	public House createHouse() {
		System.out.println("IglooHouseBuilder.createHouse()");
		return house;
	}

}
