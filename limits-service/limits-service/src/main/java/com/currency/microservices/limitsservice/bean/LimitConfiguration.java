package com.currency.microservices.limitsservice.bean;

public class LimitConfiguration {
	
	int maximum;
	int minimum;
	
	private LimitConfiguration() {
		// No Arg constructor
	}
	
	public LimitConfiguration(int maximum, int minimum) {
		super();
		this.maximum = maximum;
		this.minimum = minimum;
	}
	public int getMaximum() {
		return maximum;
	}
	public void setMaximum(int maximum) {
		this.maximum = maximum;
	}
	public int getMinimum() {
		return minimum;
	}
	public void setMinimum(int minimum) {
		this.minimum = minimum;
	}
	
	

}
