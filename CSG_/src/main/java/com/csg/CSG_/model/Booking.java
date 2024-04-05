package com.csg.CSG_.model;

import java.sql.Date;
import java.sql.Time;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Booking_Details")
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Date meetingDate;
    private Time meetingTime;
    private String meetingSubject;
    
    public Booking()
    {
    	
    }
    
   
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getMeetingDate() {
		return meetingDate;
	}
	public void setMeetingDate(Date meetingDate) {
		this.meetingDate = meetingDate;
	}
	public Time getMeetingTime() {
		return meetingTime;
	}
	public void setMeetingTime(Time meetingTime) {
		this.meetingTime = meetingTime;
	}
	public String getMeetingSubject() {
		return meetingSubject;
	}
	public void setMeetingSubject(String meetingSubject) {
		this.meetingSubject = meetingSubject;

	}
	public Booking(Long id, String name, Date meetingDate, Time meetingTime, String meetingSubject) {
		super();
		this.id = id;
		this.name = name;
		this.meetingDate = meetingDate;
		this.meetingTime = meetingTime;
		this.meetingSubject = meetingSubject;
	}
	
}
