package com.azer.megrinBack.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.azer.megrinBack.entities.Country;
import com.azer.megrinBack.service.CountryService;

@RestController
@RequestMapping(path = "api/v1/country")
public class CountryController {

    private final CountryService countryService;

    public CountryController(CountryService countryService) {
        this.countryService = countryService;
    }

    @GetMapping(path = "/all")
    public List<Country> getCountries() {
        return countryService.getCountries();
    }
}
