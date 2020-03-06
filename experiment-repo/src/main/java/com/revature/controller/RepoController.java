package com.revature.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.model.SpeedResult;
import com.revature.repository.ExperimentRepo;

@RestController
@RequestMapping("api/repo")
public class RepoController {

	@Autowired
	ExperimentRepo repo;
	
	@PostMapping("/")
	public SpeedResult addResult(@RequestBody SpeedResult result){
		return repo.save(result);
	}
}
