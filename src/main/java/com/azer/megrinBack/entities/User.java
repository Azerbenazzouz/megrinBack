package com.azer.megrinBack.entities;

public class User {
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

    public User() {
    }

    public User(Long id, String username, String password, String email, String phone, String address, Long countryId, Long governorateId, Long cityId, int age, Role role) {
        this.id = id;
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

    public Long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getCountryId() {
        return countryId;
    }

    public void setCountryId(Long countryId) {
        this.countryId = countryId;
    }

    public Long getGovernorateId() {
        return governorateId;
    }

    public void setGovernorateId(Long governorateId) {
        this.governorateId = governorateId;
    }

    public Long getCityId() {
        return cityId;
    }

    public void setCityId(Long cityId) {
        this.cityId = cityId;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    // @Override
    // public String toString() {
    //     return "User{" +
    //             "id=" + id +
    //             ", username='" + username + '\'' +
    //             ", password='" + password + '\'' +
    //             ", email='" + email + '\'' +
    //             ", phone='" + phone + '\'' +
    //             ", address='" + address + '\'' +
    //             ", countryId=" + countryId +
    //             ", governorateId=" + governorateId +
    //             ", cityId=" + cityId +
    //             ", age=" + age +
    //             ", role=" + role +
    //             '}';
    // }

    

}
