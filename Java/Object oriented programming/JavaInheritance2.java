/********************************************************************************
* 			º Java Inheritance 2  º			   				 	   		   		*
* 														     	   		   		*
* Author:    Jair Israel Avilés Eusebio						 	   	       		*
* Date:      1º/29/2015									    	   		   		*
* Language:  Java										     	   		   		*
* Twitter:   @yajairo87										 	   		  		*
* URL: https://www.hackerrank.com/challenges/java-inheritance-2	  			    *
* 															       		   		*
* ******************************************************************************/

class Arithmetic {
    public String getName(){
        return "Arithmetic";
    }
}

class Adder extends Arithmetic {
    public int add(int a, int b) {
        return a + b;
    }
}