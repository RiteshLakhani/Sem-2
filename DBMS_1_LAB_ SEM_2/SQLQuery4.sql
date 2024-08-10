Create Table Stud_Mass
(
	StudID Int primary key IDENTITY(1,1) not null,--IDENTITY FOR AUTOINCREAMENT.
	Enrollment_No varchar(20) not null unique ,
	Name varchar(25) not null,
	CPI decimal(5,2) null,
	joiningDate datetime not null,
	CityID int not null,
	Bklog int  not null,
	StateName varchar(50)
);

Create table  Citys_Mass
(
	CityID int primary key IDENTITY(1,1) not null,
	CityName varchar(20) not null unique,
	Pincode varchar(10),
	STDCODE varchar(10)
);

--FORGIEN KEY
Alter table Stud_Mass
Add constraint FK_CityID
Foreign key (CityID) References Citys_Mass(CityID);

--DEFAULT VALUE
Alter table Stud_Mass
Add constraint ck_StateName
DEFAULT 'Gujarat' for Statename;

--FOR DROP CONSTRAINTS 
Alter table Stud_Mass
DROP constraint StateName;

--DEFAULT VALUE
Alter table Stud_Mass
ADD constraint ck_joiningDate
DEFAULT GETDATE() FOR joiningDate;

--FOR DROP CONSTRAINTS 
Alter table Stud_Mass
DROP constraint joiningDate;

--FOR CONSTRAINT WITH VALUE
Alter table Stud_Mass
ADD constraint ck_CPI check (cpi<=10);

--FOR CONSTRAINT WITH VALUE
Alter table Stud_Mass
ADD constraint ck_Bklog check (Bklog>=0);

