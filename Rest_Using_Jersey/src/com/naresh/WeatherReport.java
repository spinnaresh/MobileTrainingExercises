package com.naresh;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/summary")
public class WeatherReport {

	@GET
	public String getInfo()	{
		return "This is a Weather Report Service";
	}	
	
	@GET
	@Path("/{city}")
	@Produces(MediaType.APPLICATION_JSON)
	public Summary getSummary( @PathParam("city") String city) {		
		return new Summary(city, Math.random()*100);
	}
}
