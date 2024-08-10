Create table Student_Marks
(
	Sid int,
	Sname varchar(50),
	Marks int,
);

Insert into Student_Marks

values ( 1 , 'John' , 90 ),
	   ( 2 , 'Martin' , 80 ),
	   ( 3 , 'Carol' ,  89 ),
	   ( 4 , 'Jack' , 99 ) ,
	   ( 5 , 'Rose' , 88 ) ,
	   ( 6 , 'Mary' , 90)

--1. Find total number of students.
Select count(sid) from Student_Marks;

--2. Find total of marks scored by all students.
Select sum(Marks) from Student_Marks;

--3.Find average marks of all Student.
Select avg(Marks) from Student_Marks;

--4.Find minimum marks Scored from all students.
Select min(Marks) from Student_Marks;

--5.Find maximum marks Scored from all Students.
Select max(Marks) from Student_Marks;



--Date Functions.

--1. Write a query to display the current date & time. Label the column Today_Date.
Select GETDATE() as Today_Date;

--2.Write a query to find new date after 365 day with reference to today.Select DATEADD( day, 365 , getdate()) as new_Date ;--3.Display the current date in a format that appears as may 5 1994 12:00AMSelect CONVERT ( Varchar(20) ,  Getdate() , 100 ) as date;--4.Display the current date in a format that appears as 03 Jan 1995.Select CONVERT ( varchar(20) , Getdate() , 106 ) as New_Date;--5.Display the current date in a format that appears as Jan 04, 96.Select CONVERT ( varchar(20) , Getdate() , 6) as New_Date;--6.Write a query to find out total number of months between 31-Dec-08 and 31-Mar-09.Select DATEDIFF( MONTH , '2008-12-31' , '2009-03-31') as Total_Month;--7.Write a query to find out total number of years between 25-Jan-12 and 14-Sep-10.Select DATEDIFF ( YEAR ,'2010-10-14' ,'2012-01-25') as Total_Years;--8.Write a query to find out total number of hours between 25-Jan-12 7:00 and 26-Jan-12 10:30.Select DATEDIFF(HOUR, '2012-01-25 07:00:00', '2012-01-26 10:30:00') AS Total_Hours;--9.Write a query to extract Day, Month, Year from given date 12-May-16.SELECT DAY('2016-05-12') AS Day, MONTH('2016-05-12') AS Month, YEAR('2016-05-12') AS Year;--10.Write a query that adds 5 years to current date.Select DATEADD ( YEAR , 5 , GETDATE() ) as New_Date;--11.Write a query to subtract 2 months from current date.Select DATEADD ( MONTH , -2 , GETDATE() ) AS New_Date;--12.Extract month from current date using datename () and datepart () function.Select DATENAME ( DAY ,  GETDATE() ) AS month_name , SELECT DATEPART ( MINUTE , GETDATE() ) AS month_Number ; --13.Write a query to find out last date of current month.Select DATEADD ( MONTH , DATEDIFF ( MONTH , 0 , GETDATE() ) +1 , -1) As Last_Date;
Select EOMONTH (Getdate());

--14.Write a query to display date & time after 30 days from today.
SELECT DATEADD(day, 30 , GETDATE()) AS Date_Time;


--15.Calculate your age in years and months.
Select DATEDIFF( YEAR , '2005-07-15' , GETDATE());
Select DATEDIFF( Month, '2005-07-15' , Getdate()); 





