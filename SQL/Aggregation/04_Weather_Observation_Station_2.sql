/***************************************************************************
* 				º Weather Observation Station 2 º			 	   		   *
* 														     	   		   *
* Author:    Jair Israel Avilés Eusebio						 	   	       *
* Date:      07/27/2015									    	   		   *
* Language:  Oracle										     	   		   *
* Twitter:   @javiles87										 	   		   *
* URL: https://www.hackerrank.com/challenges/weather-observation-station-2 *
* 															       		   *
* **************************************************************************/

SELECT ROUND(SUM(LAT_N), 2) || ' ' || ROUND (SUM(LONG_W), 2) FROM Station;