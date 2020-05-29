DROP TABLE IF EXISTS supplieruser;
CREATE TABLE supplieruser(
id Integer AUTO_INCREMENT PRIMARY KEY,
username varchar(255) NOT NULL,
password varchar(255) NOT NULL
);

INSERT INTO supplieruser (username, password) VALUES
("admin", "admin"); 

SELECT * FROM supplieruser;