/****************************************************************************
* 				º Weather Observation Station 9 º			 	   		    *
* 								        				     	   		    *
* Author:    Jair Israel Avilés Eusebio						 	   	        *
* Date:      07/27/2015									    	   		    *
* Language:  Oracle										     	   		    *
* Twitter:   @javiles87										 	   		    *
* URL: https://www.hackerrank.com/challenges/weather-observation-station-9  *
* 															       		    *
* ***************************************************************************/

SELECT DISTINCT City FROM STATION WHERE SUBSTR(City, 1,1) NOT IN ('a','e','i','o','u','A','E','I','O','U') ORDER BY City;