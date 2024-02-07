package com.azer.megrinBack.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.azer.megrinBack.entities.Governorate;
import com.azer.megrinBack.repository.GovernorateRepository;

@Service
public class GovernorateService {

    private final GovernorateRepository governorateRepository;

    public GovernorateService(GovernorateRepository governorateRepository) {
        this.governorateRepository = governorateRepository;
    }

    public List<Governorate> getAllGovernorates() {
        return governorateRepository.findAll();
    }

    public List<Governorate> getGovernoratesByCountry(Long countryId) {
        return this.governorateRepository.findByCountryId(countryId);
    }
    
}
