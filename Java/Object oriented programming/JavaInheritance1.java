/********************************************************************************
* 			º Java Inheritance 1  º			   				 	   		   		*
* 														     	   		   		*
* Author:    Jair Israel Avilés Eusebio						 	   	       		*
* Date:      10/30/2015									    	   		   		*
* Language:  Java										     	   		   		*
* Twitter:   @yajairo87										 	   		  		*
* URL: https://www.hackerrank.com/challenges/java-inheritance-1	  			    *
* 															       		   		*
* ******************************************************************************/

class Animal{
	   void walk()
	   {
	      System.out.println("I am walking");
	   }
}

class Bird extends Animal
{
   void fly()
   {
      System.out.println("I am flying");
   }
   void sing() {
       System.out.println("I am singing");
   }
}

public class JavaInheritance1 {
	//public class Solution {
	public static void main(String[] args) {
		Bird bird = new Bird();
	    bird.walk();
	    bird.fly();
	    bird.sing();
	}

}