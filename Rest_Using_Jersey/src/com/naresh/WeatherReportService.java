package com.naresh;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/reporter")
public class WeatherReportService {

	@GET
	public String getInfo()
	{
		return "This is a Weather Report Service";
	}
	
	
}
