package com.nt.service;

import com.nt.adapter.WeatherReportCompAdapter;

public class AccuWeatherServiceImpl implements IAccuWeatherService{

	@Override
	public String showTemparature(String cityName) {
          //use  adapter class
		WeatherReportCompAdapter adapter=new WeatherReportCompAdapter();
		String tempc=adapter.fetchTemparature(cityName);
		return tempc;
	}

}
