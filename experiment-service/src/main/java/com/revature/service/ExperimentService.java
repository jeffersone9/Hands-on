package com.revature.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.revature.model.SpeedResult;

@Service
public class ExperimentService {
	
	String repoUrl = "http://localhost:8002/api/repo/";
	
	String conversionUrl = "http://localhost:8001/api/convert/%s/to/%s?unit=%f";
	
	public void save(SpeedResult result) {
		//hit repo service save url
		new RestTemplate().postForEntity(repoUrl, result, SpeedResult.class);
	}
	
	public SpeedResult conversion(String name, String to) {
		SpeedResult result = new RestTemplate().getForEntity(repoUrl + "/name", SpeedResult.class).getBody();
		String from = result.getSpeed().getDistance().getDistanceUnit().toString();
		//send request to conversion api
		
		return new RestTemplate().getForEntity(String.format(conversionUrl, from, to, result.getSpeed().getDistance().getUnit()), SpeedResult.class).getBody();
	}
	
}
