package com.revature.model;

public enum DistanceUnit {
	Millimeters("millimeters"),
	Centimeter("centimeters"),
	Meters("meters"),
	Kilometers("kilometers"),
	Inches("inches"),
	Feet("feet"),
	Yards("yards"),
	Miles("miles");
	
	private String name;
	DistanceUnit(String string) {
		this.name = string;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
