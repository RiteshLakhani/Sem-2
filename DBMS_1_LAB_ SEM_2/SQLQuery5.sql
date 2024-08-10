CREATE TABLE Students_528(
	StuID INT,
	FirstName VARCHAR(25),
	LastName VARCHAR(25),
	Website VARCHAR(50),
	City VARCHAR(25),
	Divison VARCHAR(20)
)

INSERT INTO Students_528

VALUES ( 1011,'Keyur','Patel','techonthenet.com','Rajkot','II-BCX'),
	   ( 1022,'Hardik','Shah','digminecraft.com','Ahmedabad','I-BCY'),
	   ( 1033,'Kajal','Trivedi','bigactivities.com','Baroda','IV-DCX'),
	   ( 1044,'Bhoomi','Gajera','checkyourmath.com','Ahmedabad','III-DCW'),
	   ( 1055,'Harmit','Mitel',NULL,'Rajkot','II-BCY'),
	   ( 1066,'Ashok','Jani',NULL,'Baroda','II-BCZ')


SELECT FirstName from Students_528 where FirstName like 'k%'
SELECT FirstName from Students_528 where FirstName like '_____'
SELECT FirstName,LastName from Students_528 where city like '_____%a' 
SELECT *FROM STUDENTs_528 where LastName like '%tel'
SELECT *FROM STUDENTs_528 where FirstName like 'ha%t'
SELECT *FROM STUDENTs_528 where FirstName like 'k%' And FirstName like '__%y%'
SELECT FirstName FROM STUDENTs_528 where Website  is null   And Firstname like '_____'
SELECT *FROM STUDENTs_528 where lastName like '%jer%'
SELECT *FROM STUDENTs_528 where City like 'r%'or City like 'b%'
SELECT *FROM STUDENTs_528 where Website is not null
SELECT *FROM STUDENTs_528 where FirstName like '[A-H]%'
SELECT *FROM STUDENTs_528 where FirstName like '_[A,E,I,O,U]%'  
SELECT FirstName FROM STUDENTs_528 where City like '%rod%'
SELECT FirstNAME,LastName FROM STUDENTs_528 where Website like 'bi%'
SELECT City From STUDENTs_528 where lastName like '______'
SELECT *From STUDENTs_528 where City like '_____' AND City not like 'ba%'  
SELECT *FROM STUDENTs_528 where Divison like'II%'
SELECT FirstName FROM STUDENTs_528 where Divison like '%bc%'
SELECT StuID,City FROM STUDENTs_528 where divison like '______' and Website is not null 
SELECT *FROM STUDENTs_528 where FirstNAME not like '__[A,E,I,O,U]%'