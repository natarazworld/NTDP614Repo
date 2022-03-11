package com.nt.sessionfacade;

import java.time.LocalDate;

import com.nt.dto.StockAllDetailsDTO;
import com.nt.dto.StockDetailsDTO;
import com.nt.dto.StockFutureDetailsDTO;
import com.nt.ext1.BSEStockIdFinderImpl;
import com.nt.ext1.IBSEStockIdFinder;
import com.nt.ext2.BSEStockValueFinderImpl;
import com.nt.ext2.IBSEStockValueFinder;
import com.nt.ext3.BSEStockFutureValueFinderImpl;
import com.nt.ext3.IBSEStockFutureValueFinder;

public class StockDetailsFindderSessionFacadeImpl implements IStockDetailsFinderSessionFacade {

	@Override
	public StockAllDetailsDTO findAllStockDetailsByStockName(String stockName) {
		System.out.println("StockDetailsFindderSessionFacadeImpl.findAllStockDetailsByStockName()");
		  //invoke  3 extends service copmps locally
		// extComp1
		  IBSEStockIdFinder  extComp1=new BSEStockIdFinderImpl();
		  long stockId=extComp1.findStockIdByStockName(stockName);
		  //extComp2
		  IBSEStockValueFinder  extComp2=new BSEStockValueFinderImpl();
		  StockDetailsDTO  dto=extComp2.findStockDetailsById(stockId);
		  //extcomp3
		  IBSEStockFutureValueFinder extComp3=new BSEStockFutureValueFinderImpl();
		  StockFutureDetailsDTO  futureDTO=extComp3.findStockFutureDetailsByStockName(dto);
		  
		  //prepare StockAllDetailsDTO class obj
		  StockAllDetailsDTO  allDetailsDTO=new StockAllDetailsDTO();
		  allDetailsDTO.setStockId(dto.getStockId());
		  allDetailsDTO.setStockName(dto.getStockName());
		  allDetailsDTO.setStockType(dto.getStockType());
		  allDetailsDTO.setStockValue(dto.getStockValue());
		  allDetailsDTO.setCompany(dto.getCompany());
		  allDetailsDTO.setListedOn(dto.getListedOn());
		  allDetailsDTO.setNextOneYearStockValue(futureDTO.getNextOneYearStockValue());
		  allDetailsDTO.setNextTwoYearsStockValue(futureDTO.getNextTwoYearsStockValue());
		  allDetailsDTO.setNextThreeYearsStockValue(futureDTO.getNextThreeYearsStockValue());
		  allDetailsDTO.setChangePercentage(futureDTO.getChangePercentage());
		  allDetailsDTO.setVerifedOn(LocalDate.now());
		  return allDetailsDTO;
	}

}
