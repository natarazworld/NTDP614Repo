package com.nt.dto;

import java.io.Serializable;
import java.time.LocalDate;

import lombok.Data;

@Data
public class StockFutureDetailsDTO  implements Serializable{
	private  double nextOneYearStockValue;
	private  double nextTwoYearsStockValue;
	private  double nextThreeYearsStockValue;
	private  double  changePercentage;
	

}
