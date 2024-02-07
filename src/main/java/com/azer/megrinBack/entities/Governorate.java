package com.azer.megrinBack.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table
public class Governorate {
    @Id
    @SequenceGenerator(
        name = "governorate_sequence",
        sequenceName = "governorate_sequence",
        allocationSize = 1
    )
    @GeneratedValue(
        strategy = GenerationType.SEQUENCE, 
        generator = "governorate_sequence"
    )
    private Long id;
    private String name;
    private Long countryId;

    public Governorate() {
    }

    public Governorate(Long id, String name, Long countryId) {
        this.id = id;
        this.name = name;
        this.countryId = countryId;
    }

    public Governorate(String name, Long countryId) {
        this.name = name;
        this.countryId = countryId;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Long getCountryId() {
        return countryId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCountryId(Long countryId) {
        this.countryId = countryId;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
