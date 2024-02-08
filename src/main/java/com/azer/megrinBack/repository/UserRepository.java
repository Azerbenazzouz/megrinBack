package com.azer.megrinBack.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.azer.megrinBack.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
    @Query("SELECT u FROM User u WHERE u.email = ?1")
    Optional<User> existsByUserEmail(String email);

    Optional<User> findByEmail(String email);
}
