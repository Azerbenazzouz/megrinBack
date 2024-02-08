package com.azer.megrinBack.controller;

import java.util.List;

import com.azer.megrinBack.entities.User;
import com.azer.megrinBack.entities.UserDTO;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.azer.megrinBack.service.UserService;


@RestController
@RequestMapping("/api/v1/user")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/all")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    // update Profile User Information
    @PostMapping("/updateProfile")
    public void updateProfiUser(@RequestBody UserDTO userDTO) {
        userService.updateProfiUser(userDTO.getUsername(), userDTO.getEmail(), userDTO.getPhone(), userDTO.getAddress(), userDTO.getCountryId(), userDTO.getGovernorateId(), userDTO.getCityId(), userDTO.getDateOfBirth());
    }   
}
