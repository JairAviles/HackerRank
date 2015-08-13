/****************************************************************************
* 				º Weather Observation Station 3 º			 	   		    *
* 														     	   		    *
* Author:    Jair Israel Avilés Eusebio						 	   	        *
* Date:      07/27/2015									    	   		    *
* Language:  Oracle										     	   		    *
* Twitter:   @javiles87										 	   		    *
* URL: https://www.hackerrank.com/challenges/weather-observation-station-3  *
* 															       		    *
* ***************************************************************************/

SELECT DISTINCT City FROM station WHERE MOD(ID,2) = 0 ORDER BY City;