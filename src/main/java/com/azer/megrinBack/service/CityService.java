package com.azer.megrinBack.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.azer.megrinBack.entities.City;
import com.azer.megrinBack.repository.CityRepository;


@Service
public class CityService {

    private final CityRepository cityRepository;

    public CityService(
        CityRepository cityRepository
    ){
        this.cityRepository = cityRepository;
    }


    public List<City> getAllCities() {
        return cityRepository.findAll();
    }
}
