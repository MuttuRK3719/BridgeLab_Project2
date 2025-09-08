CREATE DATABASE InsurancePolity;
use InsurancePolity;
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

ALTER table agents
ADD COLUMN HEIGHT FLOAT;

ALTER TABLE policies
Rename COLUMN policy_name TO policy_title;

ALTER TABLE customers
DROP address ;

UPDATE  policies
SET premium =1000
WHERE policy_id=2;

DELETE FROM claimprocessing
WHERE claim_id=2;
DELETE FROM claims
WHERE claim_id=2;

INSERT INTO policies(policy_id,policy_title,policy_type,coverage_details,
premium, start_date, end_date)values(6, 'Travel Guard', 'Travel', 'Covers international travel risks', 2500.00, '2023-08-01', '2024-08-01');


SELECT * FROM customers c
INNER JOIN policyassignments pa 
ON pa.customer_id=c.customer_id
INNER JOIN policies p 
ON p.policy_id=pa.policy_id;

SELECT  c.claim_id,c.claim_amount,p.policy_type from claims c
INNER JOIN policies p ON c.policy_id=p.policy_id;


SELECT c.claim_id,c.claim_amount, 
cus.customer_id,cus.first_name,
cus.last_name,cus.gender FROM claims c 
INNER JOIN  customers cus 
ON c.customer_id=cus.customer_id;

SELECT p.policy_type, SUM(c.claim_amount),count(*) from claims c 
INNER JOIN policies p ON p.policy_id=c.policy_id
Group BY p.policy_type;

SELECT c.customer_id, c.first_name,c.last_name,MAX(claim.claim_date) FROM claims claim
INNER JOIN customers c ON c.customer_id=claim.customer_id
GROUP BY c.customer_id;