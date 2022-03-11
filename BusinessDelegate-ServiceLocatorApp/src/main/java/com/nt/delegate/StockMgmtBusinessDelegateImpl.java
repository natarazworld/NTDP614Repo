package com.nt.delegate;

import com.nt.dto.StockAllDetailsDTO;
import com.nt.locator.BSEStockDetailsCompServiceLocator;
import com.nt.sessionfacade.IStockDetailsFinderSessionFacade;
import com.nt.vo.StockAllDetailsVO;

public class StockMgmtBusinessDelegateImpl implements IStockMgmtBusinessDelegate {

	@Override
	public StockAllDetailsVO findStockAllDetailsByStockName(String stockName) throws Exception {
		System.out.println("StockMgmtBusinessDelegateImpl.findStockAllDetailsByStockName()");
		  // get ServiceLocator class obj
		 BSEStockDetailsCompServiceLocator locator=BSEStockDetailsCompServiceLocator.getInstance();
		  // invoke method on Locator obj to get SessionFacade ref
		 IStockDetailsFinderSessionFacade  facade=locator.getSessionFacadeCompRef("bse");
		 //invoke method of SEssionFacade class
		  StockAllDetailsDTO  dto=facade.findAllStockDetailsByStockName(stockName);
		  //convert  DTO class object to VO class object
		    StockAllDetailsVO   vo=new StockAllDetailsVO();
		    vo.setStockId(String.valueOf(dto.getStockId()));
		    vo.setStockName(dto.getStockName());
		    vo.setCompany(dto.getCompany());
		    vo.setStockType(dto.getStockType());
		    vo.setStockValue(String.valueOf(dto.getStockValue()));
		    vo.setListedOn(dto.getListedOn().toString());
		    vo.setVerifiedOn(dto.getVerifedOn().toString());
		    vo.setNextOneYearStockValue(String.valueOf(dto.getNextOneYearStockValue()));
		    vo.setNextTwoYearsStockValue(String.valueOf(dto.getNextTwoYearsStockValue()));
		    vo.setNextThreeYearsStockValue(String.valueOf(dto.getNextThreeYearsStockValue()));
		    vo.setChangePercentage(String.valueOf(dto.getChangePercentage()));
		return vo;
	}

}
