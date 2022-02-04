package com.nt.external;

import java.util.Random;

public class WeatherReportCompImpl implements IWeatherReportComp {

	@Override
	public float getTempature(int cityCode) {
		//gives  temparature in faranheit degrees
		  if(cityCode==1100) //hyderabad , india
			    return  new Random().nextFloat()*100.0f;
		  else if(cityCode==1101)  // delhi
			  return  new Random().nextFloat()*100.0f;
		  else if(cityCode==1102)  // bangulore
			  return  new Random().nextFloat()*100.0f;
		  else
			  throw new IllegalArgumentException("Invalid  city code");
		
	}

}
