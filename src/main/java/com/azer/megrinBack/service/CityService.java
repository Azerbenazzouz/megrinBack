package com.azer.megrinBack.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.azer.megrinBack.entities.City;
@Service
public class CityService {

    public List<City> getAllCities() {
        return List.of(
            new City(
                1L, 
                "Alexandria545454444", 
                1L
            )
        );
    };
}
