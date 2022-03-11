package com.nt.ext2;

import java.time.LocalDate;

import com.nt.dto.StockDetailsDTO;

public class BSEStockValueFinderImpl implements IBSEStockValueFinder {

	@Override
	public StockDetailsDTO findStockDetailsById(long stockId) {
		System.out.println("BSEStockValueFinderImpl.findStockDetailsById()");
		StockDetailsDTO  dto=new StockDetailsDTO();
		if(stockId==1122) {
			//collect from DB s/w
			  dto.setStockId(stockId);
			  dto.setStockName("SBI");
			  dto.setStockType("Banking");
			  dto.setStockValue(4567);
			  dto.setListedOn(LocalDate.of(2010, 10, 10));
		}
		else if(stockId==2233) {
			//collect from DB s/w
			  dto.setStockId(stockId);
			  dto.setStockName("ICICI");
			  dto.setStockType("Banking");
			  dto.setStockValue(1567);
			  dto.setListedOn(LocalDate.of(2011, 11, 11));
		}
		else if(stockId==3344) {
			//collect from DB s/w
			  dto.setStockId(stockId);
			  dto.setStockName("HDFC");
			  dto.setStockType("Banking");
			  dto.setStockValue(1167);
			  dto.setListedOn(LocalDate.of(2015, 12, 12));
		}
		else if(stockId==4455) {
			//collect from DB s/w
			  dto.setStockId(stockId);
			  dto.setStockName("Reliance");
			  dto.setStockType("AllRounder");
			  dto.setStockValue(2167);
			  dto.setListedOn(LocalDate.of(2015, 12, 12));
		}
		else {
			throw new IllegalArgumentException("Invalid  stockId");
		}
		
		return dto;
	}

}
