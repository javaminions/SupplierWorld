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
(5, 60, "FULFILLED");