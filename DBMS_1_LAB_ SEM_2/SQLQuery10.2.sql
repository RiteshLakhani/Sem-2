Select * from Village;
Select * from City;

--1.Display all the villages of Rajkot city. 
Select village.CityId , VillageName
from Village
Inner join City
On village.CityId = city.CityID And CityName = 'Rajkot';


Select V.VillageName
FROM City C
FULL OUTER JOIN Village V
ON C.CityID = V.CityID
WHERE C.CityName='Rajkot'
--2.Display city along with their villages & pin code.
Select city.CityId, CityName,Pincode,VillageName
from village
Inner join city
On village.CityId = city.CityID

SELECT C.CityName,C.Pincode,V.VillageName
FROM City C
RIGHT OUTER JOIN Village V
ON C.CityID = V.CityID 

--3.Display the city having more than one village.
Select CityName, COUNT(village.CityID) 
FROM village
INNER JOIN City
ON City.CityID = Village.CityID 
group by City.CityName
having COUNT(village.cityID) > 1;

SELECT City.CityName,COUNT(Village.CityID) AS NoOfVillages
FROM City
LEFT OUTER JOIN Village
ON City.CityID=Village.CityID
GROUP BY City.CityName
HAVING COUNT(Village.CityID)>1

--4.Display the city having no village.
Select cityName, count(village.CityId) As countNo
from village
Right outer join city 
On Village.CityID = city.CityID
group by CityName
having count(village.CityID)=0;

SELECT City.CityName
FROM City
LEFT OUTER JOIN Village
ON City.CityID=Village.CityID
GROUP BY City.CityName
HAVING COUNT(Village.CityID) = 0


--5.Count the total number of villages in each city.
Select CityName , count(Village.CityID) as  villageCount
from village
Right outer join city
On Village.CityID = city.CityID 
group by CityName;

SELECT City.CityName,COUNT(Village.VillageID) As TotalVillages
FROM City
LEFT OUTER JOIN Village
ON City.CityID=Village.CityID
GROUP BY City.CityName

--6.Count the number of cities having more than one village.
Select cityName,count(Village.cityID) as village_COunt
from city
Inner join  Village
On Village.CityID = city.CityID 
Group by cityName
having count(city.cityId)>1;

SELECT COUNT(*) AS COUNT_
FROM
(
SELECT City.[CityName],
 COUNT(Village.VillageID) AS TOTAL
FROM City
LEFT OUTER JOIN Village
ON City.CityID = Village.CityID
GROUP BY City. [CityName]
having count(Village.VillageID)>1
) AS T1
--WHERE TOTAL > 1







 

 