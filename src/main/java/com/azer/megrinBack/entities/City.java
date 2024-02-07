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


    public City(String name, Long governorateId) {
        this.name = name;
        this.governorateId = governorateId;
    }

}
