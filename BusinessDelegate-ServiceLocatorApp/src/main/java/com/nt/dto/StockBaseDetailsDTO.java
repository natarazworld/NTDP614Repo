package com.nt.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public abstract class StockBaseDetailsDTO implements Serializable {
	private long stockId;
	private String stockName;
	private  double stockValue;
	private  String company;

}
