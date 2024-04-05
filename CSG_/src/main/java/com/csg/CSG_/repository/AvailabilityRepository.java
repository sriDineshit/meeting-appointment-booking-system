package com.csg.CSG_.repository;


import java.sql.Time;
import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.csg.CSG_.model.AvailabilityCheck;



public interface AvailabilityRepository extends JpaRepository<AvailabilityCheck, Long> {

	
	List<AvailabilityCheck> findByCheckDateAndCheckTime(Date checkDate, Time checkTime);

	

}
