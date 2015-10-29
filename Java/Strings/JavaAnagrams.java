import java.util.Arrays;
import java.util.Scanner;

/***************************************************************************
* 						º Java Anagram º					 	   		   *
* 														     	   		   *
* Author:    Jair Israel Avilés Eusebio						 	   	       *
* Date:      10/29/2015									    	   		   *
* Language:  Java										     	   		   *
* Twitter:   @yajairo87										 	   		   *
* URL: https://www.hackerrank.com/challenges/java-strings-introduction     *
* 															       		   *
* **************************************************************************/

public class JavaAnagram {
	//public class Solution {

	static boolean isAnagram(String A, String B) {
		boolean retValue = false;
		   if(A != null && B != null) {
		       char [] arrayA = A.toLowerCase().replaceAll("[\\s]", "").toCharArray();
		       char [] arrayB = B.toLowerCase().replaceAll("[\\s]", "").toCharArray();
		       Arrays.sort(arrayA);
		       Arrays.sort(arrayB);
		       retValue = Arrays.equals(arrayA, arrayB);
		   }
		   return retValue;
	}
	    public static void main(String[] args) {

	        Scanner sc=new Scanner(System.in);
	        String A=sc.next();
	        String B=sc.next();
	        boolean ret=isAnagram(A,B);
	        if(ret)System.out.println("Anagrams");
	        else System.out.println("Not Anagrams");

	    }

}