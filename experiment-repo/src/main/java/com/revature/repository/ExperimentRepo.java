package com.revature.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.model.SpeedResult;

@Repository
public interface ExperimentRepo extends JpaRepository<SpeedResult, Long>{

	public SpeedResult findByName(String name);
	public void update(SpeedResult result);
}