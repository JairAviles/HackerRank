import java.util.Scanner;
import java.util.StringTokenizer;

/***************************************************************************
* 					º Java String Token º					 	   		   *
* 														     	   		   *
* Author:    Jair Israel Avilés Eusebio						 	   	       *
* Date:      10/29/2015									    	   		   *
* Language:  Java										     	   		   *
* Twitter:   @yajairo87										 	   		   *
* URL: https://www.hackerrank.com/challenges/java-string-token		       *
* 															       		   *
* **************************************************************************/

public class JavaStringToken {
	//public class Solution {

	private static final String PATTERN = "[A-Za-z !,?.\\_'@]+";

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
        String s=scan.nextLine();
        StringTokenizer st = new StringTokenizer(s, " !,?.\\_'@");

        if(s.length() > 0 && s.length() < 400000 && s.matches(PATTERN)) {

	        System.out.println(st.countTokens());
	        while(st.hasMoreTokens()) {
	        	System.out.println(st.nextElement().toString());
	        }
        }
        scan.close();
	}
}