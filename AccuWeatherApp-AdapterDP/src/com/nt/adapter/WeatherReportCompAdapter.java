package com.nt.adapter;

import com.nt.external.IWeatherReportComp;
import com.nt.external.WeatherReportCompImpl;
//Adapter class
public class WeatherReportCompAdapter {
	
	public  String   fetchTemparature(String cityName) {
		  //convert city  name to  city code (adatper logic)
		     int cityCode=0;
		    if(cityName.equalsIgnoreCase("hyderabad"))
		    	cityCode=1100;
		    else if(cityName.equalsIgnoreCase("bangulore"))
		    	cityCode=1103;
		    else if(cityName.equalsIgnoreCase("delhi"))
		    	cityCode=1101;
		    else
		    	 return "city not  found in list ";
		    //use  external comp service
		     IWeatherReportComp comp=new WeatherReportCompImpl();
             float tempf=comp.getTempature(cityCode);
             //convert faranheit degrees to  celsius  degrees (adapter logic)
             float tempc=5/9.0f*(tempf-32.0f);
             return tempc+"celsius degrees";
	}

}
