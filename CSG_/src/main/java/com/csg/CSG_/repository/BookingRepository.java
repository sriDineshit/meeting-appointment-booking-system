package com.csg.CSG_.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.csg.CSG_.model.Booking;






public interface BookingRepository  extends JpaRepository<Booking, Long> {

	
}
