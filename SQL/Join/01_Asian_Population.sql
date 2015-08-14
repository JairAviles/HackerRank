/***************************************************************
* 				º Asian Population º						   *
* 														       *
* Author:    Jair Israel Avilés Eusebio						   *
* Date:      07/29/2015									       *
* Language:  Oracle										       *
* Twitter:   @javiles87										   *
* URL: https://www.hackerrank.com/challenges/asian-population  *
* 															   *
* **************************************************************/

SELECT SUM(City.Population) FROM City INNER JOIN Country ON City.CountryCode = Country.Code WHERE Country.Region LIKE '%Asia%';