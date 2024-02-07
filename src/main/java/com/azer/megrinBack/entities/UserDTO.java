package com.azer.megrinBack.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {
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

    public UserDTO(String username, String password, String email, String phone, Role role) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.phone = phone;
        this.role = role;
    }

}
