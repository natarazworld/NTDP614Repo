package com.nt.builder;

import com.nt.product.House;

public interface HouseBuilder {
     public  void  buildBasement();
     public  void  buildRoofing();
     public  void  buildStructure();
     public  void  buildInterior();
     public   House createHouse();
     
}
