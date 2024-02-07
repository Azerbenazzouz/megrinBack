package com.azer.megrinBack.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.azer.megrinBack.entities.Governorate;
import com.azer.megrinBack.service.GovernorateService;

@RestController
@RequestMapping(path = "api/v1/governorate")
public class GovernorateController {

    private final GovernorateService governorateService;

    public GovernorateController(GovernorateService governorateService) {
        this.governorateService = governorateService;
    }
    
    @GetMapping("/all")
    public List<Governorate> getAllGovernorates() {
        return governorateService.getAllGovernorates();
    };

    @GetMapping("/byCountry")
    public List<Governorate> getGovernoratesByCountry(@RequestParam Long countryId) {
        return governorateService.getGovernoratesByCountry(countryId);
    };
}
