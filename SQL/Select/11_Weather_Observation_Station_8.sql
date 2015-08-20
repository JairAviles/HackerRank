/****************************************************************************
* 				º Weather Observation Station 8 º			 	   		    *
* 									        			     	   		    *
* Author:    Jair Israel Avilés Eusebio						 	   	        *
* Date:      07/27/2015									    	   		    *
* Language:  Oracle										     	   		    *
* Twitter:   @javiles87										 	   		    *
* URL: https://www.hackerrank.com/challenges/weather-observation-station-8  *
* 															       		    *
* ***************************************************************************/

SELECT DISTINCT City FROM Station WHERE regexp_count(substr(city,1,1), '[AEIOU]', 1, 'i') = 1 AND regexp_count(substr(city,length(city),1), '[aeiou]', 1, 'i') = 1 Order By City;