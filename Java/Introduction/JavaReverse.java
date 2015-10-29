import java.util.Scanner;

/***************************************************************************
* 						º Java Reverse º					 	   		   *
* 														     	   		   *
* Author:    Jair Israel Avilés Eusebio						 	   	       *
* Date:      10/29/2015									    	   		   *
* Language:  Java										     	   		   *
* Twitter:   @yajairo87										 	   		   *
* URL: https://www.hackerrank.com/challenges/java-string-reverse	       *
* 															       		   *
* **************************************************************************/

public class JavaReverse {
	//public class Solution {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
        String A=sc.next();
        boolean flag = true;

        A = A.toLowerCase();
		int left = 0;
	    int right = A.length() - 1;

		if(A.length() > 50) {
            flag = false;
		}
		while(left < right) {
			if (A.charAt(left ++) != A.charAt(right--)) {
                flag = false;
			}
		}
		if(flag) System.out.println("Yes");
        else System.out.println("No");
    }
}
