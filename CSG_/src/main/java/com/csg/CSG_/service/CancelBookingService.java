package com.csg.CSG_.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.csg.CSG_.repository.CancelBookingRepository;



@Service
public class CancelBookingService {

	private final CancelBookingRepository cancelBookingRepository;

    @Autowired
    public CancelBookingService(CancelBookingRepository cancelBookingRepository) {
        this.cancelBookingRepository = cancelBookingRepository;
    }

    public void deleteBookingByName(String name) {
        cancelBookingRepository.deleteByName(name);
    }

   
		

}
