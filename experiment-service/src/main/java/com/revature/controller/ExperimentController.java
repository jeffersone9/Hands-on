package com.revature.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.model.SpeedResult;
import com.revature.service.ExperimentService;

@RestController
@RequestMapping("api/experiment")
public class ExperimentController {

	@Autowired
	ExperimentService es;
	
	@PostMapping("/")
	public void createExperiment(@RequestBody SpeedResult result){
		es.save(result);
		
	}
	
	@GetMapping("?subjectName={name}&converTo=@Param{to}")
	public void convertUnit(@PathVariable String name, @PathVariable String to){
		es.conversion(name, to);
	}
}
