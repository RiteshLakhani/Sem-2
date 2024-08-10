CREATE TABLE PERSONAL
(
	id int unique,
	name varchar(20),
	age int  check(age>=18) 
)

Insert into personal(id,name) 
values ( 1,'AA')
	
drop table personal;

create table personal 
(

	id int unique,
	name varchar(20) default('Ritesh'),
	city varchar(20) not null 
)

Insert into personal 
values (1,'Ritesh','Rajkot'),
	   (1,'Nehal','Rajkot')


drop table personal;  

Insert into personal(id,city) 
values (1,'Rajkot'),

Insert into personal
values (3,'Nehal','Rajkot')
	   

select * from personal;
s
create table  stud_per
(
	rno int primary key,
	sname varchar(20)
)

create table stud_marks
(
	rno int references stud_per,
	m1 int	
)

drop table stud_marks;

insert into stud_per values(1,'Ritesh')

insert into stud_marks values(1,60)
							 

select * from stud_per;
select * from stud_marks
create table personal
(
	id int unique,
	sname varchar(20),
	city varchar(20)  check(city in('Rajkot','Baroda'))
)

drop table personal;

insert into personal values(2,'Ritesh','baroda')

select * from personal;
	    	


	