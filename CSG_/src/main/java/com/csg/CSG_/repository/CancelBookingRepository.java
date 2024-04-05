package com.csg.CSG_.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.csg.CSG_.model.CancelBooking;

public interface CancelBookingRepository extends JpaRepository<CancelBooking, Long> {

	
	 void deleteByName(String name);
} 
