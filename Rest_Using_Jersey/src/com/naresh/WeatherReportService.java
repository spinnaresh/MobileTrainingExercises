package com.naresh;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/reporter")
public class WeatherReportService {

	
	String msg ="Temperate of city %s is %s";
	@GET
	public String getInfo()
	{
		return "This is a Weather Report Service";
	}
	
	@GET
	@Path("/info2")
	public String getInfo2()
	{
		return "This is a info2";
	}
	
	@GET
	@Path("{city}")	
	public String getTemparature(@PathParam("city") String city)
	{
		return String.format(msg, city, Math.random()*100 );
	}
	
	@GET
	@Path("{country}/{city}")	
	public String getTemparature2(String city)
	{
		return String.format(msg, city, Math.random()*100 );
	}
	
	
	
}
