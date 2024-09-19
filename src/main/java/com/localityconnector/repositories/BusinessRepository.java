package com.localityconnector.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.localityconnector.models.Business;

public interface BusinessRepository extends JpaRepository<Business, Long> {
    List<Business> findByName(String name);
    List<Business> findByAddress(String address);
    @Query("SELECT b FROM Business b WHERE b.name = :name AND b.address = :address")
    List<Business> findByNameAndAddress(@Param("name") String name, @Param("address") String address);
}