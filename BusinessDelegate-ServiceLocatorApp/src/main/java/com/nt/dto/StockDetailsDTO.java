package com.nt.dto;

import java.io.Serializable;
import java.time.LocalDate;

import lombok.Data;

@Data
public class StockDetailsDTO extends StockBaseDetailsDTO{
	private  String stockType;
	private  String company;
	private  LocalDate  listedOn;
	

}
