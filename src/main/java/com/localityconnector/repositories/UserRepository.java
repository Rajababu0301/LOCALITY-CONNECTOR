package com.localityconnector.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.localityconnector.models.User;

public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findByUsername(String username);
    List<User> findByEmail(String email);
    @Query("SELECT u FROM User u WHERE u.username = :username AND u.email = :email")
    List<User> findByUsernameAndEmail(@Param("username") String username, @Param("email") String email);
}