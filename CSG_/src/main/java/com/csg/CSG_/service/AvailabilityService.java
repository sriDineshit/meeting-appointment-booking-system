package com.csg.CSG_.service;

import java.sql.Time;
import java.util.Date;
import java.util.List;


import org.springframework.stereotype.Service;

import com.csg.CSG_.model.AvailabilityCheck;
import com.csg.CSG_.repository.AvailabilityRepository;



@Service
public class AvailabilityService {

	 private final AvailabilityRepository availabilityRepository;

	    public AvailabilityService(AvailabilityRepository availabilityRepository) {
	        this.availabilityRepository = availabilityRepository;
	    }

	    public boolean isSlotFree(Date checkDate, Time checkTime) {
	        List<AvailabilityCheck> existingChecks = availabilityRepository.findByCheckDateAndCheckTime(checkDate, checkTime);
	        return existingChecks.isEmpty(); // If the list is empty, the slot is free; otherwise, it's occupied
	    }

	    public AvailabilityCheck checkAvailability(AvailabilityCheck availabilityCheck) {
	        Date checkDate = availabilityCheck.getCheckDate();
	        Time checkTime = availabilityCheck.getCheckTime();

	        boolean slotFree = isSlotFree(checkDate, checkTime);
	        if (slotFree) {
	            // Slot is available, you can return the original AvailabilityCheck object
	            return availabilityCheck;
	        } else {
	            // Slot is booked or unavailable, you can return null or appropriate response
	            return null;
	        }
	    }

}
