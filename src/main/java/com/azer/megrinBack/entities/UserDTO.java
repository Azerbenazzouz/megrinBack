package com.azer.megrinBack.entities;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {
    private String username;
    private String email;
    private String phone;
    private String address;
    private Long countryId;
    private Long governorateId;
    private Long cityId;
    private LocalDate dateOfBirth;
    private Role role;

}
