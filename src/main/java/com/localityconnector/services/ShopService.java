package com.localityconnector.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.localityconnector.models.Shop;
import com.localityconnector.repositories.ShopRepository;

@Service
public class ShopService {
  
  @Autowired
  private ShopRepository shopRepository;
  
  public List<Shop> getAllShops() {
    return shopRepository.findAll();
  }
  
  public Shop getShopById(Long id) {
    return shopRepository.findById(id).orElse(null);
  }
  
  public Shop createShop(Shop shop) {
    return shopRepository.save(shop);
  }
  
  public Shop updateShop(Shop shop) {
    return shopRepository.save(shop);
  }
  
  public void deleteShop(Long id) {
    shopRepository.deleteById(id);
  }
}