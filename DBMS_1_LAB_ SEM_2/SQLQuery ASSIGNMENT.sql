CREATE TABLE STUDENTu
(
	StuID int,
	Name varchar(20),
	EnrollmentNo decimal(12,0),
	Divison varchar(20),
	Sem int,
	BirthDate date,
	email nvarchar(255),
	ContactNo decimal(10,0)
);

Insert into STUDENTu values(101,'Naimish Patel',090200107051,'BCX-3',3,'12-6-1991','naimishp49@gmail.com',8866566768),
						   (102,'Firoz A. S.',090200107090,'BCY-3',3,'5-3-1994','Firoz.me@gmail.com',8888999922),
						   (103,'Krunal Vyas',090200107101,'BCZ-5',5,'3-1-1984','Krunal.vyas@gmail.com',9999888877),
						   (104,'Vijay Patel',090200107102,'BCX-5',5,'2-15-1985','Vijay.patel123@gmail.com',8787878787),
						   (105,'Vimal Trivedi',090200107103,'BCY-3',3,'1-20-1988','Vimal123@gmailcom',Null)

Select * from STUDENTu where Divison like 'BCX-3';
Select Name from STUDENTu where Sem in (3,5) ;
Select Name from STUDENTu where Name not like 'v%';
Select Top 3 * from STUDENTu;
Select Distinct DIVISON from STUDENTu;
Select top 30percent Name,EnrollmentNo from STUDENTu where ContactNo like '%7';
Select * from STUDENTu where email like '%3@g%' and Divison ='bcz-5'
Select StuID,Name,Email from STUDENTu;  
Select * from STUDENTu where BirthDate>'1-1-1990'
Select Name from STUDENTu where Sem like 3 And EnrollmentNo like '%107%';
Select Name,Divison from STUDENTu Order By Name;
Select * from STUDENTu where ContactNo is Null;
Select DISTINCT Sem AS Semester From STUDENTu; 
Select Name,EnrollmentNo,Sem From STUDENTu where Divison In ('Bcx-3','Bcz-5','Bcy-3') and Birthdate>'3-15-86' 
Select * FROM STUDENTu Order By Birthdate Desc;