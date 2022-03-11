package com.nt.ext2;

import com.nt.dto.StockDetailsDTO;

public interface IBSEStockValueFinder {
     public  StockDetailsDTO  findStockDetailsById(long stockId);
}
