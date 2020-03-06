package com.revature.model;

import java.sql.Timestamp;
import java.time.Duration;


public class SpeedResult {

	private Long id;
	
	private String subjectName;
	
	private Timestamp experimentTime;

	public SpeedResult() {
		super();
	}

	public SpeedResult(String subjectName, Timestamp experimentTime) {
		super();
		this.subjectName = subjectName;
		this.experimentTime = experimentTime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public Timestamp getExperimentTime() {
		return experimentTime;
	}

	public void setExperimentTime(Timestamp experimentTime) {
		this.experimentTime = experimentTime;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((experimentTime == null) ? 0 : experimentTime.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((subjectName == null) ? 0 : subjectName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SpeedResult other = (SpeedResult) obj;
		if (experimentTime == null) {
			if (other.experimentTime != null)
				return false;
		} else if (!experimentTime.equals(other.experimentTime))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (subjectName == null) {
			if (other.subjectName != null)
				return false;
		} else if (!subjectName.equals(other.subjectName))
			return false;
		return true;
	}
	
	class Speed {
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
	
	class Distance {
		private DistanceUnit distanceUnit;
		private Double unit;
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
	enum DistanceUnit{
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
	
}
