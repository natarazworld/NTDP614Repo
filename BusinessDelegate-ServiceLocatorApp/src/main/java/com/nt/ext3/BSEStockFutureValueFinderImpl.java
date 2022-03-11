package com.nt.ext3;

import com.nt.dto.StockDetailsDTO;
import com.nt.dto.StockFutureDetailsDTO;

public class BSEStockFutureValueFinderImpl implements IBSEStockFutureValueFinder {

	@Override
	public StockFutureDetailsDTO findStockFutureDetailsByStockName(StockDetailsDTO detailsDTO) {
		System.out.println("BSEStockFutureValueFinderImpl.findStockFutureDetailsByStockName()");
		StockFutureDetailsDTO  futureDTO=new StockFutureDetailsDTO();
		 if(detailsDTO.getStockId()==1122) {
			 futureDTO.setNextOneYearStockValue(detailsDTO.getStockValue()+detailsDTO.getStockValue()*0.1f);
			 futureDTO.setNextTwoYearsStockValue(detailsDTO.getStockValue()+detailsDTO.getStockValue()*0.2f);
			 futureDTO.setNextThreeYearsStockValue(detailsDTO.getStockValue()+detailsDTO.getStockValue()*0.3f);
			 futureDTO.setChangePercentage(10.0);
		 }
		 else if(detailsDTO.getStockId()==2233) {
			 futureDTO.setNextOneYearStockValue(detailsDTO.getStockValue()+detailsDTO.getStockValue()*0.11f);
			 futureDTO.setNextTwoYearsStockValue(detailsDTO.getStockValue()+detailsDTO.getStockValue()*0.22f);
			 futureDTO.setNextThreeYearsStockValue(detailsDTO.getStockValue()+detailsDTO.getStockValue()*0.33f);
			 futureDTO.setChangePercentage(11.0);
		 }
		 else if(detailsDTO.getStockId()==3344) {
			 futureDTO.setNextOneYearStockValue(detailsDTO.getStockValue()+detailsDTO.getStockValue()*0.12f);
			 futureDTO.setNextTwoYearsStockValue(detailsDTO.getStockValue()+detailsDTO.getStockValue()*0.24f);
			 futureDTO.setNextThreeYearsStockValue(detailsDTO.getStockValue()+detailsDTO.getStockValue()*0.36f);
			 futureDTO.setChangePercentage(12.0);
		 }
		 else if(detailsDTO.getStockId()==4455) {
			 futureDTO.setNextOneYearStockValue(detailsDTO.getStockValue()+detailsDTO.getStockValue()*0.14f);
			 futureDTO.setNextTwoYearsStockValue(detailsDTO.getStockValue()+detailsDTO.getStockValue()*0.24f);
			 futureDTO.setNextThreeYearsStockValue(detailsDTO.getStockValue()+detailsDTO.getStockValue()*0.36f);
			 futureDTO.setChangePercentage(13.0);
		 }
		 else
			 throw new IllegalArgumentException("Invalid stockDetails");

      return futureDTO;
	}//method
}//class
