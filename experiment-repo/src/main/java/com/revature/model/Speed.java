package com.revature.model;

import java.time.Duration;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Speed {
		
	private Duration duration;
	private Distance distance;
	
	
	public Speed() {
		super();
	}
	public Speed(Duration duration, Distance distance) {
		super();
		this.duration = duration;
		this.distance = distance;
	}
	public Duration getDuration() {
		return duration;
	}
	public void setDuration(Duration duration) {
		this.duration = duration;
	}
	public Distance getDistance() {
		return distance;
	}
	public void setDistance(Distance distance) {
		this.distance = distance;
	}
}
