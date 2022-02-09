package com.nt.factory;

import java.util.HashMap;
import java.util.Map;

import com.nt.comp.Circle;
import com.nt.comp.Shape;
import com.nt.comp.Square;

public class ShapeFactory<T extends Shape> {
	private static Map<String, Shape> cacheMap=new HashMap<>();
	
	public  static  <T extends Shape> T  getInstance(String type,Class<T> clazz) throws Exception {
		             if(!cacheMap.containsKey(type)) {
		            	   cacheMap.put(type,
		            			                    (T) clazz.getDeclaredConstructors()[0].newInstance(null));
		             }
		             return (T) cacheMap.get(type);
		}

}
