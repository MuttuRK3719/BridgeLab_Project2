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
