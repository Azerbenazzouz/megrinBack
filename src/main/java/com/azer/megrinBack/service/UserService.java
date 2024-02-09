package com.azer.megrinBack.service;

import java.time.LocalDate;
import java.util.List;

import com.azer.megrinBack.exception.EmailExist;
import com.azer.megrinBack.entities.Role;
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


    public void updateProfiUser(String username, String email, String phone, String address, Long countryId, Long governorateId,
            Long cityId, LocalDate dateOfBirth) {
        // if user not found throw exception
        userRepository.findByEmail(email).orElseThrow(
            () -> new EmailExist("User not found")
        );
        userRepository.updateProfiUser(username, email, phone, address, countryId, governorateId, cityId, dateOfBirth);
    }

    public void updateRoleUser(String email, Role role) {
        // if user not found throw exception
        userRepository.findByEmail(email).orElseThrow(
            () -> new EmailExist("User not found")
        );
        userRepository.updateRoleUser(email, role);
    }

    

}
