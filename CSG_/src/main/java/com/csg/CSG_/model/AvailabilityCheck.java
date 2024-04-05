package com.csg.CSG_.model;

import java.sql.Date;
import java.sql.Time;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class AvailabilityCheck {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	private Date checkDate;
    private Time checkTime;
	
  
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getCheckDate() {
		return checkDate;
	}
	public void setCheckDate(Date checkDate) {
		this.checkDate = checkDate;
	}
	public Time getCheckTime() {
		return checkTime;
	}
	public void setCheckTime(Time checkTime) {
		this.checkTime = checkTime;
	}
	public AvailabilityCheck()
	{
		
	}
}
