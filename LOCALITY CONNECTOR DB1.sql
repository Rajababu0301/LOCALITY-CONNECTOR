CREATE DATABASE locality_connector;

USE locality_connector;

CREATE TABLE users (
    id INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(100) NOT NULL,
    password VARCHAR(255) NOT NULL,  -- Store hashed passwords for security
    category ENUM('user', 'business') NOT NULL
);
