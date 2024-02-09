package com.azer.megrinBack.repository;

import java.time.LocalDate;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.azer.megrinBack.entities.Role;
import com.azer.megrinBack.entities.User;

import jakarta.transaction.Transactional;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
    @Query("SELECT u FROM User u WHERE u.email = ?1")
    Optional<User> existsByUserEmail(String email);

    Optional<User> findByEmail(String email);
    @Transactional
    @Modifying
    @Query("UPDATE User u SET u.username = ?1, u.phone = ?3, u.address = ?4, u.countryId = ?5, u.governorateId = ?6, u.cityId = ?7, u.dateOfBirth = ?8 WHERE u.email = ?2")
    void updateProfiUser(String username, String email, String phone, String address, Long countryId,
            Long governorateId, Long cityId, LocalDate dateOfBirth);


    @Transactional
    @Modifying
    @Query("UPDATE User u SET u.role = ?2 WHERE u.email = ?1")
    void updateRoleUser(String email, Role role);
}
