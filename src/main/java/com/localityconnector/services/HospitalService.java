package com.localityconnector.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.localityconnector.models.Hospital;
import com.localityconnector.repositories.HospitalRepository;

@Service
public class HospitalService {
    @Autowired
    private HospitalRepository hospitalRepository;

    public List<Hospital> getAllHospitals() {
        return hospitalRepository.findAll();
    }

    public Hospital createHospital(Hospital hospital) {
        return hospitalRepository.save(hospital);
    }

    public Hospital getHospitalById(Long id) {
        return hospitalRepository.findById(id).orElseThrow();
    }
}