Create table Student
(
	Rno int,
	Name varchar(50),
	Branch varchar(50)
);

Insert into Student
values ( 101 , 'Raju' , 'CE' ),
       ( 102 , 'Amit', 'CE'),
	   ( 103 , 'Sanjay','ME'),
	   ( 104 , 'Neha' , 'EC' ),
	   ( 105 , 'Meera' , 'EE'),
	   ( 106 , 'Mahesh', 'ME')

Create table Result
(
	Rno int ,
	SPI Decimal(4,2)
);

Insert into Result
values ( 101 , 8.8 ),
	   ( 102 , 9.2 ),
	   ( 103 , 7.6 ),
	   ( 104 , 8.2 ),
	   ( 105 , 7.0 ),
	   ( 106 , 8.9 )

Create table  Employee
(
	EmployeeNo varchar(50),
	Name varchar(50),
	ManagerNo varchar(50),
);

Insert into Employee
values ( 'E01',  'Tarun' ,NULL),
       ( 'E02', 'Rohan' , 'E02'),
	   ( 'E03', 'PRIYA' , 'E01'),
	   ('E04', 'MILAN','E03'),
	   ('E05','JAY','EO1'),
	   ('E06','ANJNA','E04')

Select * from Student;
Select * from Result;

-- Normal join-- 
--2.Display Rno, Name, Branch and SPI of CE branch’s student only.
Select Student.Rno,name,branch,spi 
from Student,Result
where student.rno = Result.rno And branch='CE';

--3.Display Rno, Name, Branch and SPI of other than EC branch’s student only.
Select Student.Rno,name,Branch,spi
from Student,Result
where Student.Rno = Result.rno and Branch<>'CE';

--4.Display average result of each branch.Select Branch ,avg(spi) as Avrage from Result,Studentwhere Student.rno = Result.RnoGroup by Branch;--Inner Join---Select Student.Rno,Namefrom studentInner Join ResultOn Student.Rno = Result.Rno--Left Join / Left Outer Join---Select Student.Rno,name,spifrom StudentLeft Join ResultOn Student.Rno = Result.Rno;--Right Join / Right Outer Join--Select Student.Rno,name,spifrom StudentRight Join ResultOn Student.Rno = Result.Rno;--Full Outer Join---Select Student.Rno,name,spifrom StudentFull Outer Join ResultOn Student.Rno = Result.Rno; --5.Display average result of each branch and sort them in ascending order by SPI.Select Branch ,avg(spi) as Avrage from Result,Studentwhere Student.rno = Result.RnoGroup by Branchorder by avg(spi);--6.Display average result of CE and ME branch.Select Branch ,avg(spi) as Avrage from Result,Studentwhere Student.rno = Result.Rno Group by Branchhaving Branch IN ('CE','ME')--10.. Retrieve the names of employee along with their manager’s name from the Employee table.Select E1.EmployeeNo,E1.Name as "Employee name",E2.Name as "Manager name"from Employee E1, Employee E2where E1.ManagerNo = E2.EmployeeNodelete from Employeewhere name ='Tarun';