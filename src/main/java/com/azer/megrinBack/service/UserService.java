package com.azer.megrinBack.service;

import java.util.List;

import com.azer.megrinBack.entities.UserDTO;
import com.azer.megrinBack.entities.User;
import org.springframework.stereotype.Service;

import com.azer.megrinBack.repository.UserRepository;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
    // register
    public User register(UserDTO user) {
        userRepository.existsByUserEmail(user.getEmail()).ifPresent(
            u -> {
                throw new IllegalStateException("Email already exists");
            }
        );

        User newUser = new User(
            user.getUsername(),
            user.getPassword(),
            user.getEmail(),
            user.getPhone(),
            user.getRole()
        );
        userRepository.save(newUser);
        return newUser;
    }

}
