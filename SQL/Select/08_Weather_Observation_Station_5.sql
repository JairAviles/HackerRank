/****************************************************************************
* 				º Weather Observation Station 5 º			 	   		    *
* 						            					     	   		    *
* Author:    Jair Israel Avilés Eusebio						 	   	        *
* Date:      07/27/2015									    	   		    *
* Language:  Oracle										     	   		    *
* Twitter:   @javiles87										 	   		    *
* URL: https://www.hackerrank.com/challenges/weather-observation-station-5  *
* 															       		    *
* ***************************************************************************/

SELECT c1, l1 from (Select CITY as c1, LENGTH(CITY) as l1 FROM STATION ORDER BY 2,1) where rownum = 1; 
SELECT c2, l2 from (Select CITY as c2, LENGTH(CITY) as l2 FROM STATION ORDER BY 2 DESC) where rownum = 1;