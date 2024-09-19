package com.localityconnector.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.localityconnector.models.Shop;

public interface ShopRepository extends JpaRepository<Shop, Long> {
    List<Shop> findByName(String name);
    List<Shop> findByAddress(String address);
    List<Shop> findByCity(String city);
    @Query("SELECT s FROM Shop s WHERE s.name = :name AND s.address = :address")
    List<Shop> findByNameAndAddress(@Param("name") String name, @Param("address") String address);
}