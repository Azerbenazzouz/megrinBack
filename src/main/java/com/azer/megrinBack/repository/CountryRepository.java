package com.azer.megrinBack.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.azer.megrinBack.entities.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country, Long>{

}
