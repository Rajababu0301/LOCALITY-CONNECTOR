package com.localityconnector.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.localityconnector.models.Vendor;

public interface VendorRepository extends JpaRepository<Vendor, Long> {
    List<Vendor> findByName(String name);
    List<Vendor> findByAddress(String address);
    @Query("SELECT v FROM Vendor v WHERE v.contactNumber = :contactNumber")
    List<Vendor> findByContactNumber(@Param("contactNumber") String contactNumber);
}