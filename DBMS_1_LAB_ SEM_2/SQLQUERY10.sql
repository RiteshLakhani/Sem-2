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
values ('E01','Tarun' , NULL),
       ('E02','Rohan' ,'E02'),
	   ('E03','PRIYA' ,'E01'),
	   ('E04','MILAN' ,'E03'),
	   ('E05','JAY'   ,'E01'),
	   ('E06','ANJANA','E04')

Select * from Student;
Select * from Result;

--1.Combine information from student and result table using cross join or Cartesian product.
SELECT *
FROM Student
CROSS JOIN Result;

--2.Display Rno, Name, Branch and SPI of CE branch’s student only.
Select Student.Rno,Student.Name,Student.Branch,Result.SPI
FROM Student
LEFT OUTER JOIN Result
ON student.rno = Result.rno and Branch = 'CE';

--3.Display Rno, Name, Branch and SPI of other than EC branch’s student only.
Select Student.Rno,Student.Name,Student.Branch,Result.SPI
FROM Student
LEFT OUTER JOIN Result
ON student.rno = Result.rno and Branch <>'EC';

--4.Display average result of each branch.
Select Student.Branch , avg(Result.SPI) as Avrage
from Student
Left outer join Result
ON Student.rno = Result.Rno
Group by Student.Branch;

Select Branch , avg(Result.SPI) as Avrage
from Student
Inner join Result
ON Student.rno = Result.Rno
Group by Student.Branch;



update Result
Set Rno = 107 
where spi = 8.9;

--5.Display average result of each branch and sort them in ascending order by SPI.
Select Student.Branch , avg(Result.SPI) as Avrage
From Student
Inner JOIN  Result
On Student.rno = Result.rno
Group by Student.Branch
Order by avg(Result.SPI);

--6.Display average result of CE and ME branch.
Select Student.Branch , avg(Spi) as Avrage
From student
Inner join Result
On Student.Rno = Result.Rno
Group by Student.Branch
having Branch in ('CE','ME');

--7.Perform the left outer join on Student and Result tables.
Select Student.Rno,Student.name,Result.spifrom StudentLeft outer Join ResultOn Student.Rno = Result.Rno;

--8.Perform the right outer join on Student and Result tables.Select Student.Rno,Student.name,Result.SPI,Student.Branchfrom StudentRight outer join ResultON Student.Rno = Result.Rno;--9.Perform the full outer join on Student and Result tables. Select Student.Rno,name,spifrom StudentFull Outer Join ResultOn Student.Rno = Result.Rno; --10.Retrieve the names of employee along with their manager’s name from the Employee table.Select E1.EmployeeNo,E1.Name as "Employee name",E2.Name as "Manager name"from Employee E1, Employee E2where E1.ManagerNo = E2.EmployeeNo;SELECT E.Name As EmployeeName,M.Name As ManagerName
FROM Employee E
LEFT OUTER JOIN Employee M
ON E.ManagerNo = M.EmployeeNo--11 Perform the Inner join on Student and Result tables. Select S.rno , S.name , S.branch , R.spifrom Student as SInner join Result as ROn S.RNo = R.Rno;
