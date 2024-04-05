package com.csg.CSG_.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.csg.CSG_.model.User;
import com.csg.CSG_.service.UserService;


@RestController
@RequestMapping("/api/users")
public class UserController {
	 private final UserService userService;

	    @Autowired
	    public UserController(UserService userService) {
	        this.userService = userService;
	    }

	    @PostMapping("/signup")
	    public ResponseEntity<?> signUp(@RequestBody User user) {
	        try {
	            userService.signUp(user);
	            return ResponseEntity.ok("User signed up successfully");
	        } catch (RuntimeException e) {
	            return ResponseEntity.badRequest().body(e.getMessage());
	        }
	    }

	    @PostMapping("/signin")
	    public ResponseEntity<?> signIn(@RequestBody User user) {
	        try {
	            User authenticatedUser = userService.signIn(user);
	            return ResponseEntity.ok(authenticatedUser);
	        } catch (RuntimeException e) {
	            return ResponseEntity.badRequest().body(e.getMessage());
	        }
	    }

}
