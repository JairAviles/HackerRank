import java.io.*;
import java.util.*;

/***************************************************************************
* 					º Java Hashset  º						 	   		   *
* 														     	   		   *
* Author:    Jair Israel Avilés Eusebio						 	   	       *
* Date:      11/29/2015									    	   		   *
* Language:  Java										     	   		   *
* Twitter:   @yajairo87										 	   		   *
* URL: https://www.hackerrank.com/challenges/java-hashset/		           *
* 															       		   *
* **************************************************************************/

public class JavaHashSet {
	//public class Solution {

    public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		HashSet<String> set = new HashSet<String>();
		int total = 0;
		int n=in.nextInt();
	    in.nextLine();

	    if(n< 1 || n > 100000) {
	    	n = 1;
	    }

	    for(int i = 0; i < n; i++) {
	    	String line = in.nextLine().toLowerCase();
	    	if(!set.contains(line)) {
	    		set.add(line);
	    		total++;
	    	}
	    	System.out.println(total);
	    }

	    in.close();

    }
}