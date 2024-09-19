package com.localityconnector.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.localityconnector.models.Business;
import com.localityconnector.repositories.BusinessRepository;

@Service
public class BusinessService {
  
  @Autowired
  private BusinessRepository businessRepository;
  
  public List<Business> getAllBusinesses() {
    return businessRepository.findAll();
  }
  
  public Business getBusinessById(Long id) {
    return businessRepository.findById(id).orElse(null);
  }
  
  public Business createBusiness(Business business) {
    return businessRepository.save(business);
  }
  
  public Business updateBusiness(Business business) {
    return businessRepository.save(business);
  }
  
  public void deleteBusiness(Long id) {
    businessRepository.deleteById(id);
  }
}