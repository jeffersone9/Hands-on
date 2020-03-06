package com.revature.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	
	@GetMapping("/name")
	public SpeedResult findByName(@RequestParam String name) {
		return repo.findByName(name);
	}
	
	@PutMapping("/")
	public void updateResult(@RequestBody SpeedResult result) {
		repo.update(result);
	}
}
