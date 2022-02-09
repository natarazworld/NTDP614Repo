package com.nt.factory;

import java.util.HashMap;
import java.util.Map;

import com.nt.comp.Circle;
import com.nt.comp.Shape;
import com.nt.comp.Square;

public class ShapeFactory {
	private static  Map<String,Shape>  cacheMap=new HashMap();
	
	 //Factory  pattern with caching logic  
	public  static  Shape  getInstance(String type) {
		   Shape shape=null;
		if(!cacheMap.containsKey(type)) {
			   //create Shape object based on the type
			     if(type.equalsIgnoreCase("circle"))
			    	  shape=new Circle();
			     else if(type.equalsIgnoreCase("square"))
			    	 shape=new Square();
			     else 
			    	 throw new IllegalArgumentException("invalid  shape type");
			     //keep Shape object in the cache or buffer
			     cacheMap.put(type, shape);
		}
		return  cacheMap.get(type);
	}
	

}
