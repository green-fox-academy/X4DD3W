-- CREATE TWO TABLES:
CREATE TABLE customer
(id INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
name VARCHAR(100) NOT NULL,
animal VARCHAR(100) NOT NULL,
born DATE);

CREATE TABLE account 
(accID INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
balance INT NOT NULL,
openDate DATETIME DEFAULT NOW(),
embossed BOOLEAN NOT NULL,
customerID INT,
FOREIGN KEY (customerID) REFERENCES customer(id));

-- HOW: INSERT INTO table1 (field1, field2, ...) VALUES (value1, value2, ...)
INSERT INTO customer (name, animal, born) VALUES ("Nala", "lion", "1991-04-15");
INSERT INTO customer (name, animal, born) VALUES ("Zazu", "zebra", "1997-07-10");
INSERT INTO customer (name, animal, born) VALUES ("Rafiki", "páviánvoltnem?", "1899-01-17");
INSERT INTO account (balance, embossed, customerID) VALUES (3643, true, 1);
INSERT INTO account (balance, embossed, customerID) VALUES (120, false, 2);
INSERT INTO account (balance, embossed, customerID) VALUES (10001, true, 3);

SELECT * FROM customer, account
WHERE customer.id = account.customerID;