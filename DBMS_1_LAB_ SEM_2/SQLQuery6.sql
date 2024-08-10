--Lab -6 --Math Function....

--1. Display the result of 5 multiply by 30.
1. Select 5 * 30 as Multi ;

--2. Find out the absolute value of -25, 25, -50 and 50.
2. Select ABS(-25.0),ABS(25.0),ABS(-50.0),ABS(50.0);

--3. Find smallest integer value that is greater than or equal to 25.2, 25.7 and -25.2 .
3. Select CEILING(25.2),CEILING(25.7),CEILING(-25.2);

--4. Find largest integer value that is smaller than or equal to 25.2, 25.7 and -25.2 . 
4. Select FLOOR(25.2),FLOOR(25.7),FLOOR(-25.2);

--5. Find out remainder of 5 divided 2 and 5 divided by 3.
5. Select 5 % 2 , 5 % 3;

--6. Find out value of 3 raised to 2nd power and 4 raised 3rd power.
6. Select POWER(3,2) , POWER(4,3);

--7. Find out the square root of 25, 30 and 50.
7. Select SQRT(25),SQRT(30),SQRT(50);

--8. Find out the square of 5, 15, and 25 .
8. Select SQUARE(5),SQUARE(15),SQUARE(25);

--9. Find out the value of PI.
9. Select PI();

--10. Find out round value of 157.732 for 2, 0 and -2 decimal points.
10. Select Round(157.732,2),Round(157.732,0),Round(157.732,-2);

--11. Find out exponential value of 2 and 3.
11. Select EXP(2),EXP(3);

--12. Find out logarithm having base b having value 10 of 5 and 100.
12. Select log(5,10),log(100,10);

--13. Find sine, cosine and tangent of 3.1415.
13. Select Sin(3.1415),Cos(3.1415),Tan(3.1415);

--14. Find sign of -25, 0 and 25.
14. Select Sign(-25),Sign(0),Sign(25);

--15. Generate random number using function.
15.Select Rand();


--* String Function;

--1. Find the length of following. (i)Null (ii)hello (iii)Blank
1. Select LEN(NULL),LEN('hello'),LEN('');

--2. Display your name In lower & upper case.
2. Select UPPER('ritesh'),LOWER('RITESH');

--3. Display first three characters of your name.
3. Select SUBSTRING('Ritesh Lakhani',1,3);

--4. Display 3rd to 10th character of your name.
4. Select SUBSTRING('Ritesh Lakhani',3,10);

--5. Write a query to convert ‘abc123efg’ to ‘abcXYZefg’ & ‘abcabcabc’ to ‘ab5ab5ab5’ using REPLACE.
5. Select REPLACE('abc123efg','123','xyz'), Replace('abcabcabc','c',5);

--6. Write a query to display ASCII code for ‘a’,’A’,’z’,’Z’, 0, 9.
6. Select ASCII('a'),ASCII('A'),ASCII('z'),ASCII('Z'),ASCII(0),ASCII(9);

--7. Write a query to display character based on number 97, 65,122,90,48,57.
7. select char(97),char(65),char(122),char(90),char(48),char(57);

--8. Write a query to remove spaces from left of a given string ‘hello world   ‘.
8. Select LTRIM('               Hello World      ');

--9. Write a query to remove spaces from right of a given string ‘   hello world   ‘.
9. Select RTRIM('Hello World     ');

--10. Write a query to display first 4 & Last 5 characters of ‘SQL Server’.
10. Select CONCAT(LEFT('SQL Server', 4), RIGHT('SQL Server', 5));
--OR
Select Left('sql Server',4), Right('sql server',5);

--11. Write a query to convert a string ‘1234.56’ to number (Use CAST()).
11. Select CAST('1234.56' As Decimal(10,2));

--12. Write a query to convert a float 10.58 to integer (Use CONVERT()).
12. Select CONVERT(INT,10.58);

--13. Put 10 space before your name using function.
13. Select SPACE(10)+'Ritesh';


--14. Combine two strings (Your name & Surname) using + sign as well as CONCAT ().
14. --USING CONCATE:-
					Select CONCAT('Ritesh',' Lakhani');
	--USING + SIGN:-
					Select 'Ritesh'+'Lakhani';																			

--15. Find reverse of “Darshan”.
15. Select REVERSE('Darshan');

--16. Repeat your name 3 times.
16. Select REPLICATE(' Ritesh',3);

--17. Delete 3 characters from a string, starting in position 1, and then insert "HTML" in position 1. (Use STUFF())
17. Select STUFF('abcdef',1,3,'HTML')

--18. From Data, returns the first non-null value in a list. (Use COALESCE()).
18. Select COALESCE ( null , null , null , 'Ritesh');


--19. Tests whether the expression is numeric. (Use ISNUMERIC()).
SELECT ISNUMERIC('1234') as is_numeric; -- returns 1
SELECT ISNUMERIC('12.34') as is_numeric; -- returns 1
SELECT ISNUMERIC('$12.34') as is_numeric; -- returns 0

--20. Search for "t" in string "Customer", and return its position. (Use CHARINDEX().
Select CHARINDEX('t','Customer');










