package com.azer.megrinBack.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table
public class Country {
    @Id
    @SequenceGenerator(
        name = "country_sequence",
        sequenceName = "country_sequence",
        allocationSize = 1
    )
    @GeneratedValue(
        strategy = GenerationType.SEQUENCE,
        generator = "country_sequence"
    )
    private Long id;
    private String name;
    private String code;
    private String flag;

    public Country() {
    }

    public Country(Long id, String name, String code, String flag) {
        this.id = id;
        this.name = name;
        this.code = code;
        this.flag = flag;
    }

    public Country(String name, String code, String flag) {
        this.name = name;
        this.code = code;
        this.flag = flag;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public String getFlag() {
        return flag;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
