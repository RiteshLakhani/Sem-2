Create table Product_Mass
(
	Product varchar(50),
	Company varchar(50),
	QTY int,
	Rate int,
	Cost int
);

Insert into Product_Mass
values ('Item1','Com1',2,10,20),
	   ('Item2','Com2',3,25,75),
	   ('Item3','Com1',2,30,60),
	   ('Item4','Com3',5,10,50),
	   ('Item5','Com2',2,20,40),
	   ('Item6','Cpm1',3,25,75),
	   ('Item7','Com1',5,30,150),
	   ('Item8','Com1',3,10,30),
	   ('Item9','Com2',2,25,50),
	   ('Item10','Com3',4,30,120)

--1.Count unique CompanySelect count(DISTINCT Company) as unique_company_count FROM  Product_Mass;--2.Count products with rate > 20.Select count(Product) as products_countfrom Product_MassWhere rate>20;--3.Company Wise Product CountSelect company, count(product) as product_countfrom Product_MassGroup by Company;--4.Product Wise total cost grater then 500Select Product, sum(Cost) as Cost_Newfrom Product_MassGroup by Producthaving sum(cost)>500;--5.Company Wise Product Wise Max QtySelect Product , Company , Max(QTY) As Maximum_QTYFrom Product_MassGroup by Product , Company;--6.Product Wise Max, Min & Total QtySelect Product , Max(QTY) AS MAXIMUM , MIN(QTY) AS MINIMUM , SUM(QTY) AS TOTALFROM Product_MassGROUP BY Product; --7.Company Wise Average RatesSelect Company , Avg(Rate)from Product_Massgroup by Company;