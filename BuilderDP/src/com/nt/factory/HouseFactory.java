package com.nt.factory;

import com.nt.builder.ConcreteHouseBuilder;
import com.nt.builder.HouseBuilder;
import com.nt.builder.IglooHouseBuilder;
import com.nt.builder.WoodenHouseBuilder;
import com.nt.director.CivilEngineer;
import com.nt.product.House;

public class HouseFactory {

	 //factory pattern
	public static  House   getInstance(String type) {
		  House house=null;
		  HouseBuilder builder=null;
		  if(type.equalsIgnoreCase("concrete"))
			  builder=new ConcreteHouseBuilder();
		  else if(type.equalsIgnoreCase("wooden"))
			  builder=new WoodenHouseBuilder();
		  else if(type.equalsIgnoreCase("igloo"))
			  builder=new IglooHouseBuilder();
		  else 
			  throw new IllegalArgumentException("invalid house type");
		  //create Director object
		  CivilEngineer  engineer=new CivilEngineer(builder);
		  // consturuct the house /product
		  engineer.constructHouse();
		  // get house (product)
		  house=engineer.getHouse();
		  return house;
			  
	}
}
