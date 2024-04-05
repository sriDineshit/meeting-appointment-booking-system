package com.csg.CSG_.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.csg.CSG_.model.User;
import com.csg.CSG_.repository.UserRepository;


@Service
public class UserService {

	private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User signUp(User user) {
        // Check if user with the given email already exists
        if (userRepository.existsByEmail(user.getEmail())) {
            throw new RuntimeException("Email already exists");
        }
        // Implement signup logic, e.g., encrypting password
        return userRepository.save(user);
    }

    public User signIn(User user) {
        // Find user by email
        User existingUser = userRepository.findByEmail(user.getEmail());
        if (existingUser == null) {
            throw new RuntimeException("User not found");
        }
        // Verify password
        if (!existingUser.getPassword().equals(user.getPassword())) {
            throw new RuntimeException("Incorrect password");
        }
        return existingUser;
    }

}
