package com.nt.sessionfacade;

import com.nt.dto.StockAllDetailsDTO;

public interface IStockDetailsFinderSessionFacade {
     public StockAllDetailsDTO   findAllStockDetailsByStockName(String stockName);
  }
