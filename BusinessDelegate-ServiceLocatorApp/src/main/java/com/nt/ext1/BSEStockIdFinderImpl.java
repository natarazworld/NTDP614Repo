package com.nt.ext1;

public class BSEStockIdFinderImpl implements IBSEStockIdFinder {

	@Override
	public long findStockIdByStockName(String name) {
		System.out.println("BSEStockIdFinderImpl.findStockIdByStockName()");
		  long stockId=0;
		if(name.equalsIgnoreCase("SBI"))
			  stockId=1122;
		else if(name.equalsIgnoreCase("ICICI"))
			stockId=2233;
		else if(name.equalsIgnoreCase("HDFC"))
			 stockId=3344;
		else if(name.equalsIgnoreCase("Reliance"))
			 stockId=4455;
		else
			throw new IllegalArgumentException("invalid Stock name");
		
		return stockId;
	}

}
