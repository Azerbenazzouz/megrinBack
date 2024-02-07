package com.azer.megrinBack.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
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


    public Country(String name, String code, String flag) {
        this.name = name;
        this.code = code;
        this.flag = flag;
    }


}
