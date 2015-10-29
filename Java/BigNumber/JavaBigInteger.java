import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/***************************************************************************
* 						º Java Big Integer º				 	   		   *
* 														     	   		   *
* Author:    Jair Israel Avilés Eusebio						 	   	       *
* Date:      10/29/2015									    	   		   *
* Language:  Java										     	   		   *
* Twitter:   @yajairo87										 	   		   *
* URL: https://www.hackerrank.com/challenges/java-biginteger		       *
* 															       		   *
* **************************************************************************/

public class JavaBigInteger {
	//public class Solution {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger b1 = new BigInteger("0");
        BigInteger b2 = new BigInteger("0");
	    	 try{
			        b1 = sc.nextBigInteger();
			        b2 = sc.nextBigInteger();
			        System.out.println(b1.add(b2));
			        System.out.println(b1.multiply(b2));
	    	 } catch (InputMismatchException e){
	    		 e.printStackTrace();
	    	 }
	    sc.close();
	}
}