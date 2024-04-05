package com.csg.CSG_.controller;

import java.sql.Time;
import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.csg.CSG_.model.Booking;


public class ConfirmationController {
	 @PostMapping("/submitConfirmation")
	    public ResponseEntity<String> submitConfirmation(@RequestBody Booking  formData) {
	        String name = formData.getName();
	        Date date = formData.getMeetingDate();
	        Time meetingTime=formData.getMeetingTime();
            String meetingSubject=formData.getMeetingSubject();   
	        String confirmationMessage = "Confirmation message: Hello " + name + ", your date of the meeting is " + date + "and your time "+meetingTime+"and for regarding"+meetingSubject;
	        return ResponseEntity.status(HttpStatus.OK).body(confirmationMessage);
	    }
}
