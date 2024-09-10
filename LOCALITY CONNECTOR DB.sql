CREATE DATABASE LocalityConnector;

USE LocalityConnector;

-- Table for Shops
CREATE TABLE Shops (
    id INT AUTO_INCREMENT PRIMARY KEY,
    shop_name VARCHAR(100) NOT NULL,
    shop_address VARCHAR(255) NOT NULL,
    shop_contact VARCHAR(20),
    shop_category VARCHAR(50),
    opening_hours VARCHAR(50)
);

-- Table for Vendors
CREATE TABLE Vendors (
    id INT AUTO_INCREMENT PRIMARY KEY,
    vendor_name VARCHAR(100) NOT NULL,
    vendor_address VARCHAR(255) NOT NULL,
    vendor_contact VARCHAR(20),
    vendor_category VARCHAR(50),
    services_offered TEXT
);

-- Table for Hospitals
CREATE TABLE Hospitals (
    id INT AUTO_INCREMENT PRIMARY KEY,
    hospital_name VARCHAR(100) NOT NULL,
    hospital_address VARCHAR(255) NOT NULL,
    hospital_contact VARCHAR(20),
    hospital_specialties TEXT,
    emergency_services BOOLEAN
);

-- Sample Data Insertion

-- Shops
INSERT INTO Shops (shop_name, shop_address, shop_contact, shop_category, opening_hours)
VALUES 
('The Corner Store', '123 Main St', '555-1234', 'Grocery', '8:00 AM - 8:00 PM'),
('Tech World', '456 Elm St', '555-5678', 'Electronics', '10:00 AM - 6:00 PM');

-- Vendors
INSERT INTO Vendors (vendor_name, vendor_address, vendor_contact, vendor_category, services_offered)
VALUES 
('John\'s Plumbing', '789 Maple St', '555-9876', 'Plumbing', 'Pipe Repair, Leak Fixing'),
('Garden Guru', '321 Oak St', '555-6543', 'Gardening', 'Lawn Care, Landscaping');

-- Hospitals
INSERT INTO Hospitals (hospital_name, hospital_address, hospital_contact, hospital_specialties, emergency_services)
VALUES 
('City General Hospital', '101 First Ave', '555-1122', 'Cardiology, Orthopedics', TRUE),
('Downtown Clinic', '202 Second Ave', '555-3344', 'Pediatrics, Family Medicine', FALSE);
