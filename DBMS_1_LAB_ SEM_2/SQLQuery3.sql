CREATE TABLE STUDENT(
	Enrollment_No varchar(20),
	Name varchar(25),
	CPI Decimal(5,2),
	Birthdate Datetime
);

--1.
Alter table student
Add city varchar(20) null, Backlog int not null;

--2.
Alter Table student
alter column name varchar(35);

--3.
Alter table Student
alter column CPI int;

--4.
SP_RENAME 'Student.Enrollment_No','ENO';

--5.
Alter table Student
Drop column city;

--6.
SP_RENAME Student,Student_Master;

--7.
Alter table Student_Master
Drop column Backlog;

--8.
Alter Table Student_Master
Alter column name varchar(35)not null;

--9.
SP_RENAME 'Student_Master.Birthdate','BDATE';

--10.
AlTER Table Student_Master
Alter column Eno varchar(12);

