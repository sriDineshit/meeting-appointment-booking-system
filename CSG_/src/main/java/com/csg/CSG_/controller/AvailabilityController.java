package com.csg.CSG_.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.csg.CSG_.model.AvailabilityCheck;
import com.csg.CSG_.service.AvailabilityService;


//AvailabilityController.java
@RestController
@RequestMapping("/api/availability")
public class AvailabilityController {

 private final AvailabilityService availabilityService;

 @Autowired
 public AvailabilityController(AvailabilityService availabilityService) {
     this.availabilityService = availabilityService;
 }

 @PostMapping
 public ResponseEntity<AvailabilityCheck> checkAvailability(@RequestBody AvailabilityCheck availabilityCheck) {
     AvailabilityCheck result = availabilityService.checkAvailability(availabilityCheck);
     if (result != null) {
         return ResponseEntity.ok(result); // Slot is available
     } else {
         return ResponseEntity.status(HttpStatus.CONFLICT).body(null); // Slot is booked or unavailable
     }
 }
}
