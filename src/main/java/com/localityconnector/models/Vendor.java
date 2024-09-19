package com.localityconnector.models;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;

@Entity
@Table(name = "vendors")
public class Vendor {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  
  @Column(name = "name")
  private String name;
  
  @Column(name = "category")
  private String category;
  
  @Column(name = "description")
  private String description;
  
  @Column(name = "address")
  private String address;
  
  // Getters and setters
}