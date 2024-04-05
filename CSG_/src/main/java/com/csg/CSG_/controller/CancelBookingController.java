package com.csg.CSG_.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.csg.CSG_.service.CancelBookingService;




@RestController
@RequestMapping("/api/cancel")
public class CancelBookingController {

	private final CancelBookingService cancelBookingService;

    @Autowired
    public CancelBookingController(CancelBookingService cancelBookingService) {
        this.cancelBookingService = cancelBookingService;
    }

    @DeleteMapping("/{name}")  
    public void deleteBookingByName(@PathVariable String name) {
        cancelBookingService.deleteBookingByName(name);
    }
}
