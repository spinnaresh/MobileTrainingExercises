package com.naresh;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Summary {

	private String city;
	private double temperature;
	
	
	public Summary() {
		super();
	}

	public Summary(String city, double temparature) {
		super();
		this.city = city;
		this.temperature = temparature;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public double getTemperature() {
		return temperature;
	}

	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}

	
	
}
