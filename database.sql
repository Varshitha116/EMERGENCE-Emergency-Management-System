CREATE DATABASE emergence;

USE emergence;

CREATE TABLE users (
    user_id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100),
    email VARCHAR(100) UNIQUE,
    password VARCHAR(100)
);

CREATE TABLE contacts (
    contact_id INT PRIMARY KEY AUTO_INCREMENT,
    user_id INT,
    contact_name VARCHAR(100),
    phone VARCHAR(15),
    relation_name VARCHAR(50),
    FOREIGN KEY(user_id) REFERENCES users(user_id)
);

CREATE TABLE alerts (
    alert_id INT PRIMARY KEY AUTO_INCREMENT,
    user_id INT,
    alert_type VARCHAR(100),
    location_name VARCHAR(200),
    alert_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY(user_id) REFERENCES users(user_id)
);