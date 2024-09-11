package com.localityconnector.controller;

import com.localityconnector.model.Business;
import com.localityconnector.service.BusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/businesses")
public class BusinessController {
    @Autowired
    private BusinessService businessService;

    @GetMapping
    public List<Business> getAllBusinesses() {
        return businessService.getAllBusinesses();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Business> getBusinessById(@PathVariable Long id) {
        Optional<Business> business = businessService.getBusinessById(id);
        return business.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public Business createBusiness(@RequestBody Business business) {
        return businessService.saveBusiness(business);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBusiness(@PathVariable Long id) {
        businessService.deleteBusiness(id);
        return ResponseEntity.noContent().build();
    }
}
