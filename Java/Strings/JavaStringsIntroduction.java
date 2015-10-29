import java.util.Scanner;

/***************************************************************************
* 						º Java Strings Introduction º		 	   		   *
* 														     	   		   *
* Author:    Jair Israel Avilés Eusebio						 	   	       *
* Date:      10/28/2015									    	   		   *
* Language:  Java										     	   		   *
* Twitter:   @yajairo87										 	   		   *
* URL: https://www.hackerrank.com/challenges/java-strings-introduction     *
* 															       		   *
* **************************************************************************/

public class JavaStringsIntroduction {
	//public class Solution {

	public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();

	        System.out.println(A.length() + B.length());
	        System.out.println(A.compareTo(B) > 0 ? "Yes":"No");
	        System.out.println(Character.toUpperCase(A.charAt(0)) + A.substring(1) + " "
	        		 		  + Character.toUpperCase(B.charAt(0)) + B.substring(1));
    	sc.close();
    }
}