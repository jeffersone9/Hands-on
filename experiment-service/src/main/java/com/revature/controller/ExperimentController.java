package com.revature.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.http.ResponseEntity;
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

	
//	@PostMapping("/")
//	public ResponseEntity<SpeedResult> createExperiment(@RequestBody SpeedResult result){
//		//result = experimentService.createExperiment(result);
//		
//		
//	}
//	
//	@GetMapping("?subjectName={name}&converTo=@Param{unit}")
//	public ResponseEntity<SpeedResult> convertUnit(@RequestBody SpeedResult result,
//			@PathVariable String name, @PathVariable String unit){
//		
//	}
}
