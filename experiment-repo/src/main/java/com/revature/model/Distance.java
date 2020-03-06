package com.revature.model;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class Distance implements Serializable{
		
	private DistanceUnit distanceUnit;
	
	private Double unit;
;
	
	public Distance() {
		super();
	}
	public Distance(DistanceUnit distanceUnit, Double unit) {
		super();
		this.distanceUnit = distanceUnit;
		this.unit = unit;
	}
	public DistanceUnit getDistanceUnit() {
		return distanceUnit;
	}
	public void setDistanceUnit(DistanceUnit distanceUnit) {
		this.distanceUnit = distanceUnit;
	}
	public Double getUnit() {
		return unit;
	}
	public void setUnit(Double unit) {
		this.unit = unit;
	}
}
