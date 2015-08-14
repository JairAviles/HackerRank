/****************************************************************************
* 				º Weather Observation Station 6 º			 	   		    *
* 														     	   		    *
* Author:    Jair Israel Avilés Eusebio						 	   	        *
* Date:      07/27/2015									    	   		    *
* Language:  Oracle										     	   		    *
* Twitter:   @javiles87										 	   		    *
* URL: https://www.hackerrank.com/challenges/weather-observation-station-6  *
* 															       		    *
* ***************************************************************************/

SELECT DISTINCT City FROM station WHERE SUBSTR(City,0,1) IN ('a','e','i','o','u','A','E','I','O','U') ORDER BY City;