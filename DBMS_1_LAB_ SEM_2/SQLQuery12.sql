--Create table table_name(
	--columns..
--);

--crate view view_name
--as 
--Select columns_from table_name

--create view Demo
--As
--Select Cname,Bname from Borrow

--create view Branch_view 
--As
--Select Bname,city From Branch_view

--Lab-12-- View 

Create table Student
(
	Rno int,
	Name varchar(50),
	Branch varchar(50),
	SPI Decimal(4,2),
	Bklog int
);

Insert into Student
values (101,'Raju',  'CE',8.80,0),
       (102,'Amit',  'CE',2.20, 3),
       (103,'Sanjay','ME',1.50,6),
       (104,'Neha' , 'EC',7.65,1),
	   (105,'Meera', 'EE',5.52,2),
       (106,'Mahesh','EC',4.50,3)

--1.Create a view Personal with all columns.Create View Personal 
As 
Select * From Student;

--2.Create a view Student_Details having columns Name, Branch & SPI.
Create View Student_Details
As
Select Name,Branch,SPI
from Student;

--3.Create a view Academic having columns RNo, Name, Branch.
Create View Academic
As
Select RNo,Name,Branch
From Student;

--4.Create a view Student_Data having all columns but students whose bklog more than 2.
Create View Stdent_Data
As
Select * From Student
Where Bklog > 2;

--5.Create a view Student_Pattern having RNo, Name & Branch columns in which Name consists of four letters.Create View Student_PatternAsSelect RNo, Name, Branch From StudentWhere Name like '____';--6.Insert a new record to Academic view. (107, Meet, ME)Insert Into Academicvalues (107,'Meet','ME');--7.Update the branch of Amit FROM CE to ME in Student_Details view.Update Student_Details Set Branch = 'ME'where Name = 'Amit' And Branch = 'CE';--8.Delete a student whose roll number is 104 FROM Academic view.Delete From Academicwhere RNo = 104 ;--9.Create a view that displays information of all students whose spi is above 9.5.CREATE VIEW [vwSPIAbove9.5]
AS
SELECT * FROM Student WHERE SPI>9.5--10.Create a view that displays 0 backlog students.CREATE VIEW [vwZeroBklog]
AS
SELECT * FROM Student WHERE Bklog=0; 

   