package com.azer.megrinBack.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import com.azer.megrinBack.entities.City;
import com.azer.megrinBack.service.CityService;

@RestController
@RequestMapping(path = "api/v1/city")
public class CityController {

    // @Autowired
    private final CityService cityService;

    @Autowired
    public CityController(CityService cityService) {
        this.cityService = cityService;
    }    

    @GetMapping("/all")
    public List<City> getAllCities() {
        return cityService.getAllCities();
    };
}
