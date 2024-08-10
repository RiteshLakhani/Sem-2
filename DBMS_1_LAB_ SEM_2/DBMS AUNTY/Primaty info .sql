CREATE DATABASE STUDENT;

CREATE TABLE PERSONAL
(
	rno int,
	sname varchar(20),
	city varchar(20),
	per int
);

Insert into personal values(1,'Ritesh','Rajkot',90),
						   (2,'Sonal','Bombay',60),
						   (3,'Nehal','Ahamdabad',50),
						   (4,'Amardeep','Rajkok',45),
						   (5,'Shubham','Baroda',55),
						   (6,'Miral','Aatkot',30),
						   (7,'Dhara','Rajkot',80)
Insert into personal(rno,sname,per) values(8,'Krish',78);	

Select * from personal;
Select sname,city from personal;
Select * from personal where rno=5;
select city from personal where rno=5;
select * from personal where city='Rajkot';
select rno,sname from personal where per=90;
select * from personal where per>40;
select * from personal where per<40;
select * from personal where per between 50 And 90;
1.select * from personal where city='Baroda' or city='Bombay';
2.select * from personal where city in( 'Baroda','Bombay','Rajkot');
Select sname,per from personal where sname='Ritesh'
select * from personal where sname='Ritesh' And city='Aatkot'
select * from personal where sname like 's%';
select * from personal where city like 'A%';
select * from personal where sname like '%l';
select * from personal where city like '%t';
select * from personal where city like '__m%';
select * from personal where city like '_a%';
select * from personal where city like '%a_';
select * from personal where sname like '%l' OR city like '%y';
select * from personal where sname not like 's%'
select * from personal where sname like '[a,e,i,o,u]%'
select * from personal where city is null







update personal
set city='Rajkot'
where rno=4;

update personal
set sname='Ritesh'
where rno=6;

update personal 
set city='NULL'
where rno=6;
