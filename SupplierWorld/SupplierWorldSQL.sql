/* 

SUPPLIERORDERS = orders from store to supplier 
SUPPLIERUSER = for login purposes on supplier side 
SUPPLIERSTOCK = holds all stock of products that the supplier has 

*/

DROP TABLE IF EXISTS supplierorders;
CREATE TABLE supplierorders(
id INT(3) AUTO_INCREMENT PRIMARY KEY,
productcode INT(3) NOT NULL,
quantity INT NOT NULL,
status VARCHAR(30) NOT NULL
);

INSERT INTO supplierorders (productcode, quantity, status) VALUES
(1, 100, "FULFILLED"),
(2, 120, "FULFILLED"),
(3, 50, "FULFILLED"),
(4, 25, "FULFILLED"),
(5, 60, "FULFILLED"),
(6, 100, "FULFILLED"),
(7, 120, "FULFILLED"),
(8, 50, "FULFILLED"),
(2, 25, "RECEIVED"),
(5, 60, "RECEIVED"),
(1, 12, "NEW"),
(3, 66, "NEW");

DROP TABLE IF EXISTS supplieruser;
CREATE TABLE supplieruser(
id Integer AUTO_INCREMENT PRIMARY KEY,
username varchar(255) NOT NULL,
password varchar(255) NOT NULL
);

INSERT INTO supplieruser (username, password) VALUES
("admin", "admin"); 

DROP TABLE IF EXISTS supplierstock;
CREATE TABLE supplierstock ( 
id INT NOT NULL PRIMARY KEY,
quantity INT NOT NULL
);

INSERT INTO supplierstock values
(1, 1000),
(2, 1000),
(3, 1000),
(4, 1000),
(5, 1000),
(6, 1000),
(7, 1000),
(8, 1000);