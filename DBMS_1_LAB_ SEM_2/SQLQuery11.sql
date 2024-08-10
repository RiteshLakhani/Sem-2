Create table Student
(
	Rno int,
	Name varchar(50),
	Branch varchar(50)
);

Insert into Student
values (101,'Raju','CE'),
	   (102,'Amit','CE'),
	   (103,'Sanjay','ME'),
	   (104,'Neha','Meera'),
	   (105,'Meera','EE'),
	   (106,'Mahesh','ME')

Create table Result
(
	Rno int,
	SPI Decimal(4,2)
);

Insert into Result
values (101,8.8),
	   (102,9.2),
	   (103,7.6),
	   (104,8.2),
	   (105,7.0),
	   (107,8.9)

--* Lab 11 Set Procedures * --

--1. Create a stored procedure to display all the records.(Rno,Name,Branch,SPI).
--2. Create a stored procedure to get a roll number from user and display all the details of it.
--3. Create a stored procedure to insert a record in student table ( 107,Raj,EE).
--4. Create a stored procedure to update Branch of roll number 105 to EC in student table.
--5. Create a stored procedure to delete a record in Student table whose roll number is 103.