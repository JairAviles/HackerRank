/***************************************************************
* 				º African Cities º							   *
* 							     						       *
* Author:    Jair Israel Avilés Eusebio						   *
* Date:      07/29/2015									       *
* Language:  Oracle										       *
* Twitter:   @javiles87										   *
* URL: https://www.hackerrank.com/challenges/african-cities    *
* 															   *
* **************************************************************/

SELECT City.Name FROM City INNER JOIN Country ON City.CountryCode = Country.Code WHERE Country.Continent LIKE '%Africa';