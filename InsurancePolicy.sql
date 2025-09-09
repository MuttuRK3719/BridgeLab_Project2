-- Creating database--  
CREATE DATABASE InsurancePolity;
use InsurancePolity;
-- Creating customers table-- 
CREATE TABLE Customers (
    customer_id INT PRIMARY KEY,
    first_name VARCHAR(50),
    last_name VARCHAR(50),
    date_of_birth DATE,
    gender VARCHAR(10),
    contact_number VARCHAR(15),
    email VARCHAR(100),
    address VARCHAR(200)
);
-- 1. Policies Table
CREATE TABLE Policies (
    policy_id INT PRIMARY KEY,
    policy_name VARCHAR(100),
    policy_type VARCHAR(50),
    coverage_details TEXT,
    premium DECIMAL(10,2),
    start_date DATE,
    end_date DATE
);

-- 2. Claims Table
CREATE TABLE Claims (
    claim_id INT PRIMARY KEY,
    claim_date DATE,
    claim_amount DECIMAL(12,2),
    approved_amount DECIMAL(12,2),
    claim_status VARCHAR(20),
    policy_id INT,
    customer_id INT,
    FOREIGN KEY (policy_id) REFERENCES Policies(policy_id),
    FOREIGN KEY (customer_id) REFERENCES Customers(customer_id)
);

-- 3. Agents Table
CREATE TABLE Agents (
    agent_id INT PRIMARY KEY,
    first_name VARCHAR(50),
    last_name VARCHAR(50),
    contact_number VARCHAR(15),
    email VARCHAR(100),
    hire_date DATE
);

-- 4. Policy Assignments Table
CREATE TABLE PolicyAssignments (
    assignment_id INT PRIMARY KEY,
    customer_id INT,
    policy_id INT,
    start_date DATE,
    end_date DATE,
    FOREIGN KEY (customer_id) REFERENCES Customers(customer_id),
    FOREIGN KEY (policy_id) REFERENCES Policies(policy_id)
);

-- 5. Claim Processing Table
CREATE TABLE ClaimProcessing (
    processing_id INT PRIMARY KEY,
    claim_id INT,
    processing_date DATE,
    payment_amount DECIMAL(12,2),
    payment_date DATE,
    FOREIGN KEY (claim_id) REFERENCES Claims(claim_id)
);

-- Adding new Column to table--  
ALTER table agents
ADD COLUMN HEIGHT FLOAT;

-- Renaming the column name-- 
ALTER TABLE policies
Rename COLUMN policy_name TO policy_title;

-- Drop / deleting the column from table -- 
ALTER TABLE customers
DROP address ;

-- updating the table record -- 
UPDATE  policies
SET premium =1000
WHERE policy_id=2;

-- Deleting specific record from table -- 
DELETE FROM claimprocessing
WHERE claim_id=2;
DELETE FROM claims
WHERE claim_id=2;

-- Inserting record to table --
INSERT INTO policies(policy_id,policy_title,policy_type,coverage_details,
premium, start_date, end_date)values(6, 'Travel Guard', 'Travel', 'Covers international travel risks', 2500.00, '2023-08-01', '2024-08-01');

-- retrive the customers where policy matchs with customer id--
SELECT * FROM customers c
INNER JOIN policyassignments pa 
ON pa.customer_id=c.customer_id
INNER JOIN policies p 
ON p.policy_id=pa.policy_id;

-- retrive records claimed policies 
SELECT  c.claim_id,c.claim_amount,p.policy_type from claims c
INNER JOIN policies p ON c.policy_id=p.policy_id;

-- retrive the customers who claimed the policies --
SELECT c.claim_id,c.claim_amount, 
cus.customer_id,cus.first_name,
cus.last_name,cus.gender FROM claims c 
INNER JOIN  customers cus 
ON c.customer_id=cus.customer_id;

-- Get total amount of claim with respected policy type
SELECT p.policy_type, SUM(c.claim_amount),count(*) from claims c 
INNER JOIN policies p ON p.policy_id=c.policy_id
Group BY p.policy_type;

--  Retrive recetly claimed 
SELECT c.customer_id, c.first_name,c.last_name,MAX(claim.claim_date) FROM claims claim
INNER JOIN customers c ON c.customer_id=claim.customer_id
GROUP BY c.customer_id;

-- Left Joint
SELECT * FROM customers c
LEFT JOIN claims cm 
ON cm.customer_id=c.customer_id;

-- Right Joint
SELECT * FROM customers c 
RIGHT JOIN claims cm ON 
cm.customer_id=c.customer_id;

-- Fully Joint
SELECT * FROM customers c 
LEFT JOIN claims cm ON 
cm.customer_id=c.customer_id

UNION

SELECT * FROM customers c
RIGHT JOIN claims cm ON
c.customer_id=cm.customer_id;

-- Cross Joint

SELECT * FROM customers c
 CROSS JOIN claims cm ;