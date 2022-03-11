package com.nt.delegate;

import com.nt.vo.StockAllDetailsVO;

public interface IStockMgmtBusinessDelegate {
      public StockAllDetailsVO   findStockAllDetailsByStockName(String stockName)throws Exception;
}
