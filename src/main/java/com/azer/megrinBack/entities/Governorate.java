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


    public Governorate(String name, Long countryId) {
        this.name = name;
        this.countryId = countryId;
    }

}
