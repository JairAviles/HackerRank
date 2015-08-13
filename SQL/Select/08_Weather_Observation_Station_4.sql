/****************************************************************************
* 				º Weather Observation Station 4 º			 	   		    *
* 														     	   		    *
* Author:    Jair Israel Avilés Eusebio						 	   	        *
* Date:      07/27/2015									    	   		    *
* Language:  Oracle										     	   		    *
* Twitter:   @javiles87										 	   		    *
* URL: https://www.hackerrank.com/challenges/weather-observation-station-4  *
* 															       		    *
* ***************************************************************************/

SELECT COUNT(City) - COUNT(DISTINCT City) FROM station;