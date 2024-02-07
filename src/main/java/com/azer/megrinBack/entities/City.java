package com.azer.megrinBack.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table
public class City {
    @Id
    @SequenceGenerator(
        name = "city_sequence",
        sequenceName = "city_sequence",
        allocationSize = 1
    )
    @GeneratedValue(
        strategy = GenerationType.SEQUENCE, 
        generator = "city_sequence"
    )
    private Long id;
    private String name;
    private Long governorateId;

    public City() {
    }

    public City(Long id, String name, Long governorateId) {
        this.id = id;
        this.name = name;
        this.governorateId = governorateId;
    }

    public City(String name, Long governorateId) {
        this.name = name;
        this.governorateId = governorateId;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Long getGovernorateId() {
        return governorateId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGovernorateId(Long governorateId) {
        this.governorateId = governorateId;
    }

    public void setId(Long id) {
        this.id = id;
    }

    
}
