package com.csg.CSG_.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.csg.CSG_.model.Booking;

import com.csg.CSG_.repository.BookingRepository;



@Service
public class BookingService {

	private final BookingRepository bookingRepository;

    @Autowired
    public BookingService(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }

    public Booking bookMeeting(Booking booking) {
        return bookingRepository.save(booking);
    }

    
   
}
