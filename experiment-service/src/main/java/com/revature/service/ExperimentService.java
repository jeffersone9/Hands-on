package com.revature.service;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ExperimentService {
	
	ExperimentRepo experimentRepo;
	
	public List<SpeedResult> findAll(){
		return experimentRepo.findAll();
	}
	
	public void createExperiment(SpeedResult result) {
		return experimentRepo.save(result);
	}
}
