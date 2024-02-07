package com.azer.megrinBack.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.azer.megrinBack.entities.Governorate;

@Repository
public interface GovernorateRepository extends JpaRepository<Governorate, Long>{

    @Query("SELECT g FROM Governorate g WHERE g.countryId = :countryID")
    List<Governorate> findByCountryId(Long countryID);

}
