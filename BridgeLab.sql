CREATE DATABASE  Library1;
USE Library1;
CREATE TABLE AUTHOR(
authorId int primary key,
firstName VARCHAR(50),
lastName VARCHAR(50),
dateOfBirth DATE,
natinality VARCHAR(50));

CREATE TABLE BOOKS(
bookId int PRIMARY KEY,
title VARCHAR(50),
authorId int,
publitionYear int,
genre VARCHAR(50),
isbn int ,
availableCopies int,
FOREIGN KEY (authorId)  REFERENCES AUTHOR(authorId));

CREATE TABLE MEMBERS(
memberId int primary key,
firstName VARCHAR(50),
lastName VARCHAR(50),
dateOfBirth DATE,
contactNumber bigint,
email VARCHAR(50),
membershipDate DATE);

CREATE TABLE Loans(
loanId int PRIMARY KEY,
bookId int,
memberId int,
loanDate Date,
returnDate Date,
actualReturnDate Date,
FOREIGN KEY (bookId) REFERENCES BOOKS(bookId)
);

CREATE TABLE STAFF(
staffId int PRIMARY KEY,
firstName VARCHAR(50),
lastName VARCHAR(50),
position VARCHAR(50),
contactNumber BIGINT,
email VARCHAR(50),
hireDate DATE);

ALTER TABLE BOOKS
ADD COLUMN customerName VARCHAR(50);

ALTER TABLE STAFF
RENAME COLUMN position TO jobTitle;

SELECT * FROM STAFF;

ALTER TABLE MEMBERS
DROP COLUMN email;

SELECT * FROM members;

INSERT INTO BOOKS (bookId, title, authorId, publitionYear, genre, isbn, availableCopies)
VALUES
(105, '- Malegalalli Madumagalu', 1, 1949, 'Spiritual', 97881, 5);

UPDATE  MEMBERS
SET firstName='Muttu',lastName='kagal' where memberId=4;

DELETE FROM Loans
Where loanId=2;

INSERT INTO Loans(loanId,bookId,memberId,loanDate,returnDate,actualReturnDate)
VALUES(1005, 101, 1, '2023-08-01', '2023-08-15', '2023-08-14');S