package com.localityconnector.service;

import com.localityconnector.model.Business;
import com.localityconnector.repository.BusinessRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BusinessServiceImpl implements BusinessService {

    @Autowired
    private BusinessRepository businessRepository;

    @Override
    public List<Business> getAllBusinesses() {
        return businessRepository.findAll();
    }

    @Override
    public Optional<Business> getBusinessById(Long id) {
        return businessRepository.findById(id);
    }

    @Override
    public Business saveBusiness(Business business) {
        return businessRepository.save(business);
    }

    @Override
    public void deleteBusiness(Long id) {
        businessRepository.deleteById(id);
    }
}
