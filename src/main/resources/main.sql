--Database Name:
CREATE Database user_manager;
GRANT ALL PRIVILEGES ON user_manager.* TO 'Jayson'@'localhost' IDENTIFIED BY '12345678';

USE user_manager;
--USER TABLE STRUCTURE:
CREATE TABLE users(
user_id INT NOT NULL AUTO_INCREMENT,
first_name VARCHAR(50) NOT NULL,
last_name VARCHAR(50) NOT NULL,
email VARCHAR(255) NOT NULL UNIQUE,
password VARCHAR(255) NOT NULL,
created_at TIMESTAMP,
PRIMARY KEY(user_id)
);