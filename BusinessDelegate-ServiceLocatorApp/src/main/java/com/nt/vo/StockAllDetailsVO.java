package com.nt.vo;

import java.time.LocalDate;

import lombok.Data;

@Data
public class StockAllDetailsVO {
	private String stockId;
	private String stockName;
	private  String stockValue;
	private  String stockType;
	private  String company;
	private  String  listedOn;
	private  String nextOneYearStockValue;
	private  String nextTwoYearsStockValue;
	private  String nextThreeYearsStockValue;
	private  String  changePercentage;
	private  String verifiedOn;

}
