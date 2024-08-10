Create table Computer
(
	RollNo int,
	Name varchar(50)
);

Insert into Computer
 
values ( 101 , 'Ajay'),
       ( 109 , 'Haresh'),
	   ( 115 , 'Manish')


Create Table Electrical
(
	RollNo int,
	Name varchar(50)
);

Insert into Electrical

values ( 105 , 'Ajay'),
       ( 107 , 'Mahesh'),
	   ( 115 , 'Manish')

--SET OPRATORS--

--1.Display name of students who is either in Computer or in Electrical.
Select name from computer
UNION 
Select name from Electrical;

--2.Display name of students who is either in Computer or in Electrical including duplicate data.
Select name from computer
UNION ALL
Select name from Electrical;

--3.Display name of students who is in both Computer and Electrical.
Select name from computer
INTERSECT 
Select name from Electrical;

--4.Display name of students who are in Computer but not in Electrical.
Select name from computer
EXCEPT
Select name from Electrical;

--5.Display name of students who are in Electrical but not in Computer.
Select name from Electrical
EXCEPT
Select name from Computer;

--6.Display all the details of students who is either in Computer or in Electrical.
Select * from Computer
Union
Select * from Electrical;

--7.Display all the details of students who is in both Computer and Electrical.
Select * from Computer
INTERSECT
Select * from Electrical;


-----------------Select Into Lab_9-------

Create table Cricket
(
	Name varchar(50),
	City varchar(50),
	Age int
);

Insert into Cricket

values ( 'Sachin Tendulkar','Mumbai'   ,30),
	   ( 'Rahul Dravid'    ,'Bombay'   ,35),
	   ( 'M.S. Dhoni'      ,'Jharkhand',31),
	   ( 'Suresh Raina'    ,'Gujarat'  ,30)

--1. Create table World cup from cricket with all the columns. 
Select * 
INTO World_Cup 
From Cricket;

--2.Create table T20 from cricket with first two columns with no data.
Select Name , City
INTO T20
From Cricket;

--3.Create table IPL From Cricket with No Data.
Select * Into IPL 
From Cricket
where 1=0;
 

--4.Insert the data into IPL from Cricket whose Second Charcter should be 'A' and String should Have at least 7 charcters in cricket Name Field.

Insert into IPL
Select * from cricket 
where name like '_A_____%'

select * from ipl;

--5.Delete All the rows from ipl.
Delete from  ipl;

--6.Delete the Detail of Cricketer whose city is Jharkhand.
Delete From Cricket
where city ='Jharkhand';

--7.Rename the table Ipl to IPL2018.
SP_Rename IPL , IPL2018;

--8.Distroy table T20 with all the Data.
Drop table T20;