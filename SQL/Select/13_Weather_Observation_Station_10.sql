/****************************************************************************
* 				º Weather Observation Station 10 º			 	   		    *
* 											        	     	   		    *
* Author:    Jair Israel Avilés Eusebio						 	   	        *
* Date:      07/27/2015									    	   		    *
* Language:  Oracle										     	   		    *
* Twitter:   @javiles87										 	   		    *
* URL: https://www.hackerrank.com/challenges/weather-observation-station-10 *
* 															       		    *
* ***************************************************************************/

-- Solution 1
SELECT DISTINCT City FROM Station WHERE regexp_count(substr(city,length(city),1), '[aeiou]', 1, 'i') <> 1 Order By City;

--Solution 2
SELECT DISTINCT City FROM Station WHERE regexp_count(substr(city,length(city),1), '[aeiou]', 1, 'i') NOT IN (1) Order By City;