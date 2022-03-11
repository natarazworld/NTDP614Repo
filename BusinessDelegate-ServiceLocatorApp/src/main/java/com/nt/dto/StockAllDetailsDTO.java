package com.nt.dto;

import java.time.LocalDate;

import lombok.Data;

@Data
public class StockAllDetailsDTO extends StockDetailsDTO {
	private  double nextOneYearStockValue;
	private  double nextTwoYearsStockValue;
	private  double nextThreeYearsStockValue;
	private  double  changePercentage;
	private   LocalDate verifedOn;
	

}
