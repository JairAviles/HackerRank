/************************************************************************************
*				º Average Population of Each Continent º							*
* 														       						*
* Author:    Jair Israel Avilés Eusebio						   						*
* Date:      07/29/2015									       						*
* Language:  Oracle										       						*
* Twitter:   @javiles87										   						*
* URL: https://www.hackerrank.com/challenges/average-population-of-each-continent   *
* 															  					    *
* ***********************************************************************************/

SELECT Country.Continent, TRUNC(AVG(City.Population)) FROM Country INNER JOIN City ON City.CountryCode = Country.Code GROUP BY Country.Continent;