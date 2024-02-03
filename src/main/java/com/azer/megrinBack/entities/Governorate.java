package com.azer.megrinBack.entities;

public class Governorate {
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
