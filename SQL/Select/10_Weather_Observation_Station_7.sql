/****************************************************************************
* 				º Weather Observation Station 7 º			 	   		    *
* 						        						     	   		    *
* Author:    Jair Israel Avilés Eusebio						 	   	        *
* Date:      07/27/2015									    	   		    *
* Language:  Oracle										     	   		    *
* Twitter:   @javiles87										 	   		    *
* URL: https://www.hackerrank.com/challenges/weather-observation-station-7  *
* 															       		    *
* ***************************************************************************/

SELECT DISTINCT City FROM STATION WHERE SUBSTR(City, LENGTH(City),1) IN ('a','e','i','o','u','A','E','I','O','U') ORDER BY City;