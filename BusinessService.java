package com.localityconnector.service;

import com.localityconnector.model.Business;

import java.util.List;
import java.util.Optional;

public interface BusinessService {
    List<Business> getAllBusinesses();
    Optional<Business> getBusinessById(Long id);
    Business saveBusiness(Business business);
    void deleteBusiness(Long id);
}
