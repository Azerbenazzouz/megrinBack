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

@Entity
@Table
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User{
    @Id
    @SequenceGenerator(
        name = "user_sequence",
        sequenceName = "user_sequence",
        allocationSize = 1
    )
    @GeneratedValue(
        strategy = GenerationType.SEQUENCE,
        generator = "user_sequence"
    )
    private Long id;
    private String username;
    private String password;
     private String email;
    private String phone;
    private String address;
    private Long countryId;
    private Long governorateId;
    private Long cityId;
    private int age;
    private Role role;

    public User(String username, String password, String email, String phone, String address, Long countryId, Long governorateId, Long cityId, int age, Role role) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.countryId = countryId;
        this.governorateId = governorateId;
        this.cityId = cityId;
        this.age = age;
        this.role = role;
    }

    public User(String username, String password, String email, String phone, Role role) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.phone = phone;
        this.role = role;
    }

}
