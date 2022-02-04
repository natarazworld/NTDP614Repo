package com.nt.test;

import com.nt.service.AccuWeatherServiceImpl;
import com.nt.service.IAccuWeatherService;

public interface AdapterDPTest {
	public static void main(String[] args) {
		//use  AccuWeather service
		IAccuWeatherService service=new AccuWeatherServiceImpl();
		String result=service.showTemparature("hyderabad");
		System.out.println("Temparture ::"+result);
	}
}
