package com.localityconnector.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.localityconnector.models.Hospital;

public interface HospitalRepository extends JpaRepository<Hospital, Long> {
    List<Hospital> findByName(String name);
    List<Hospital> findByAddress(String address);
    List<Hospital> findByCity(String city);
    @Query("SELECT h FROM Hospital h WHERE h.name = :name AND h.address = :address")
    List<Hospital> findByNameAndAddress(@Param("name") String name, @Param("address") String address);
}