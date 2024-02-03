package com.azer.megrinBack.entities;

public class City {
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
