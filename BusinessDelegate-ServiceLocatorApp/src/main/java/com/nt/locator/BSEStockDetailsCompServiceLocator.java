package com.nt.locator;

import java.util.HashMap;
import java.util.Map;

import com.nt.ext2.IBSEStockValueFinder;
import com.nt.sessionfacade.IStockDetailsFinderSessionFacade;
import com.nt.sessionfacade.StockDetailsFindderSessionFacadeImpl;

public class BSEStockDetailsCompServiceLocator {
	private static BSEStockDetailsCompServiceLocator INSTANCE;
	private  Map<String,Object> cacheMap=new HashMap();
	

	
	//static factory method
	public  static  BSEStockDetailsCompServiceLocator  getInstance() {
		    if(INSTANCE==null)
		    	  INSTANCE=new BSEStockDetailsCompServiceLocator();
		    return INSTANCE;
	}
	
	//method having jndi lookup code logic and placeing SessionFactory ref in the internal cache
	 public  IStockDetailsFinderSessionFacade   getSessionFacadeCompRef(String jndiName) {
		 System.out.println("BSEStockDetailsCompServiceLocator.getSessionFacadeCompRef()");
		    if(!cacheMap.containsKey(jndiName)) {
		    	  //Here we should actually write  Jndi lookup code .. to get SEssionFacade comp ref from jndi registry
		    	  //but we are directly creating object for SessionFacade class
		    	  IStockDetailsFinderSessionFacade  facade=new StockDetailsFindderSessionFacadeImpl();
		    	  //keep in SessionFacade comp ref in cache
		    	  cacheMap.put(jndiName, facade);
		    }
		    return (IStockDetailsFinderSessionFacade) cacheMap.get(jndiName);
	 }//method

}//class
