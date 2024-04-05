package com.csg.CSG_.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.csg.CSG_.model.Booking;

import com.csg.CSG_.service.BookingService;


@RestController
@RequestMapping("/api/bookings")
public class BookingController {

	private final BookingService bookingService;


    @Autowired
    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    @PostMapping("/Booking")
    public Booking bookMeeting(@RequestBody Booking booking) {
    	
        return bookingService.bookMeeting(booking);
    }
   
    
}
