package com.nt.ext3;

import com.nt.dto.StockDetailsDTO;
import com.nt.dto.StockFutureDetailsDTO;

public interface IBSEStockFutureValueFinder {
    public  StockFutureDetailsDTO  findStockFutureDetailsByStockName(StockDetailsDTO  detailsDTO);
}
