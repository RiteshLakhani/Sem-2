Create table Employees
(
	EID int,
	EName varchar(50),
	Department varchar(50),
	Salary int,
	JoiningDate DateTime,
	City varchar(50)
);

Insert Into Employees

values (101,'Rahul','Admin',56000,'1-1-90','Rajkot'),
	   (102,'Hardik','IT',18000,'9-25-90','Ahmedabad'),
	   (103,'Bhavin','HR',25000,'5-14-91','Baroda'),
	   (104,'Bhoomi','ADMIN',39000,'2-8-91','Rajkot'),
	   (105,'Rohit','IT',17000,'7-23-90','Jamnagr'),
	   (106,'Priya','IT',9000,'10-18-90','Ahmedabad'),
	   (107,'Neha','HR',34000,'12-25-91','Rajkot')


--1.
Select max(salary) as Maximum,min(salary)as Minimum,sum(salary) as Total_Sal,avg(salary) as Average_Sal
from Employees

--2.
Select count(Ename) from Employees;

--3.
Select Department , max(Salary)
from Employees
where Department = 'IT'
Group by Department; 

--4.
Select City , count( Distinct city)
from Employees
Group by City;

--5.
Select City , count ( ENAME )
from Employees
Group by City;

--6.
Select City , count ( * )
from Employees
Group by City
having count(*)>2;

--7.
Select department , sum(salary)
from Employees
Group by Department;

--8.
Select avg(salary) as Avg_salary
from Employees
group by department;

--9.
SELECT MIN(salary) AS min_salary
FROM employees
WHERE city = 'Ahmedabad';

--10.
SELECT Department , sum(salary)
from Employees
where city = 'Rajkot'
group by Department
having sum(salary)>50000

--11.
Select count(city)
from Employees
where city = 'Rajkot';

--12
SELECT MAX(salary) - MIN(salary) AS SAL_DIFFERENCE
FROM employees; 

--13.
Select COUNT(*) as Total_No_Of_Employes
FROM Employees
WHERE JoiningDate < '1991-01-01';

--14.
Select Department , sum(Salary) as TotalSalary
From Employees
Group by Department
having sum(salary)>35000
order by sum(salary)

--15.
Select Department , count(*)
from Employees
group by Department
having count (*)>=2;

--16.
Select min(salary)
from Employees
where city = 'Rajkot';

--17.
Select City , count(ENAME)
FROM Employees
Group by City;

--18.
Select Department , min(Salary)
from Employees
group by Department;

--19.
Select sum(salary) as Total_Salary
from Employees
group by city;

--20.
Select department, min(salary) as Minimum,max(salary) as Maximum ,sum(salary) as Total
from Employees
Group by Department;

--21.
Select * from(Select city , SUM (Salary) as total
From Employees
group by city) as temp
where temp.total>10000;




