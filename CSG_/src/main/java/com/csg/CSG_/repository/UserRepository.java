package com.csg.CSG_.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.csg.CSG_.model.User;



public interface UserRepository extends JpaRepository<User, Long>{

	boolean existsByEmail(String email);

	User findByEmail(String email);

	

	
}
