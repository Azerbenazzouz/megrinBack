package com.azer.megrinBack.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.azer.megrinBack.entities.Country;
import com.azer.megrinBack.repository.CountryRepository;

@Service
public class CountryService {

    private final CountryRepository countryRepository;

    public CountryService(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    public List<Country> getCountries() {
        return countryRepository.findAll();
    }
}
